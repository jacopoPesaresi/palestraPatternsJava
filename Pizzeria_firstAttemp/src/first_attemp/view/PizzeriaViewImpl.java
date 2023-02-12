package first_attemp.view;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.*;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Stream;

import first_attemp.OrderLabel;
import first_attemp.Pair;
import first_attemp.control.PizzeriaViewObserver;

public class PizzeriaViewImpl implements PizzeriaView {

    private boolean isOpen = true;
    private PizzeriaViewObserver control;
    private final int amountSits;
    private final int cols;
    private final Deque<LabeledOrder> ordersHistory = new LinkedList<>();

    private final JFrame jf = new JFrame();
    private final JButton newOrderButton = new JButton("Add order");
    private final JButton openPizzeria = new JButton("Open/Close");
    private final JScrollBar jSB = new JScrollBar();
    

    private final Map<JButton,Pair<Integer,Integer>> tables = new HashMap<>();
    //private final JButton newOrderButton = new JButton();
    

    public PizzeriaViewImpl(int dim) {
        amountSits = dim*dim;
        cols = dim;
        for(int i=0; i<dim;i++){
            for(int j=0; j<dim; j++){
                Pair<Integer,Integer> p = new Pair<Integer,Integer>(i, j);
                JButton b = new JButton();
                tables.put(b, p);
            }
        }
        start();

    }

    private void uptadeView(){
        newOrderButton.setEnabled(isOpen);
        tables.forEach( (b,p) -> b.setEnabled(isOpen));
    }

    @Override
    public void setObserver(PizzeriaViewObserver toSet) {
        control = toSet;
    }

    @Override
    public void start() {
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(700, 400);
        Dimension minimumSize = new Dimension(700, 400);
        jf.setMinimumSize(minimumSize);
        
        //jf.getContentPane().setLayout(new BorderLayout());
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        JPanel left = new JPanel();
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        JPanel right = new JPanel();
        right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(amountSits/cols,cols));
        tables.forEach( (b,p) -> center.add(b));
        
        newOrderButton.addActionListener(e -> {
            /*richiedi il nome */
            control.newOrder((((int)(Math.random()*10000))+"") + "");
            //Stream.generate(() -> ((int)(Math.random()*10000))+"").limit(5).forEach(a -> System.out.println(a));
        });

        openPizzeria.addActionListener(e -> {
            isOpen = !isOpen;
            uptadeView();
        });

        left.add(openPizzeria);
        left.add(newOrderButton);
        right.add(jSB);

        mainPanel.add(left,BorderLayout.WEST);
        mainPanel.add(right,BorderLayout.EAST);
        mainPanel.add(center,BorderLayout.CENTER);

        jf.getContentPane().add(mainPanel);
        jf.setVisible(true);
        
    }

    @Override
    public void newOrder(OrderLabel orderAdded) {
        LabeledOrder lo = new LabeledOrder(orderAdded);
        
        lo.setText(orderAdded.getNameAboutOrder());
        System.out.println(lo.getText());
        ordersHistory.addFirst(lo);

        
        //right.removeAll();
        //ordersHistory.forEach(order -> right.add(order));
        jSB.removeAll();
        ordersHistory.forEach(order -> jSB.add(order));
        jf.pack();
        
    }

    @Override
    public void completeOrder(String orderName) {
        control.completeOrder(orderName);
    }





    @Override
    public void openPizzeria() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void closePizzeria() {
        // TODO Auto-generated method stub
        
    }
    
}
