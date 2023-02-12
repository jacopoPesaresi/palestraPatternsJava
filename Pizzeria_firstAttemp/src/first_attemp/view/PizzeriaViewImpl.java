package first_attemp.view;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

import first_attemp.OrderLabel;
import first_attemp.Pair;
import first_attemp.control.PizzeriaViewObserver;

public class PizzeriaViewImpl implements PizzeriaView {

    private boolean isOpen = true;
    private PizzeriaViewObserver control;
    private final int amountSits;
    private final int cols;

    private final JFrame jf = new JFrame();
    private final JButton newOrderButton = new JButton("Add order");
    private final JButton openPizzeria = new JButton("Open/Close");
    private final List<LabeledOrder> ordersHistory = new LinkedList<>();
    private final JPanel left = new JPanel();

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
        //jf.getContentPane().setLayout(new BorderLayout());
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        //cols.setLayout(new BoxLayout(cols, BoxLayout.Y_AXIS));
        //JPanel input = new JPanel(new FlowLayout());
        //JPanel buttons = new JPanel(new FlowLayout());
        //JPanel left = new JPanel();
        
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));

        JPanel right = new JPanel();
        right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(amountSits/cols,cols));
        tables.forEach( (b,p) -> center.add(b));
        
        newOrderButton.addActionListener(e -> {
            /*richiedi il nome */
            control.newOrder(Math.random() + "");
        });

        openPizzeria.addActionListener(e -> {
            isOpen = !isOpen;
            uptadeView();
        });

        left.add(openPizzeria);
        left.add(newOrderButton);

        
        // //JLabel label = new JLabel();  
        // exit.addActionListener(e -> {
            
        //     JOptionPane.showConfirmDialog(jf, "Gioco resettato");
        // });      

        // invoke.addActionListener(e -> {
        //     control.newAttempt(Integer.parseInt(text.getText()));
        //     //result(control.newAttempt(Integer.parseInt(text.getText())));
        // });
        
        // input.add(text);
        // buttons.add(invoke);
        // buttons.add(exit);

        // cols.add(input);
        // cols.add(buttons);
        
        //jf.getContentPane().add(cols,BorderLayout.CENTER);

        mainPanel.add(left,BorderLayout.WEST);
        mainPanel.add(right,BorderLayout.EAST);
        mainPanel.add(center,BorderLayout.CENTER);

        jf.getContentPane().add(mainPanel);
        jf.setVisible(true);
        
    }

    @Override
    public void newOrder(OrderLabel orderAdded) {
        LabeledOrder lo = new LabeledOrder(orderAdded);
        ordersHistory.add(lo);
        left.removeAll();
        ordersHistory.forEach(order -> left.add(order));
        
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
