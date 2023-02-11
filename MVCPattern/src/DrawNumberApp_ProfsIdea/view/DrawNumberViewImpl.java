package DrawNumberApp_ProfsIdea.view;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

import DrawNumberApp_ProfsIdea.control.DrawNumberViewObserver;
import DrawNumberApp_ProfsIdea.utility.DrawResult;

public class DrawNumberViewImpl implements DrawNumberView{

    //private final static int AMOUNT_ATTEMPS = 7;
    //private int attemps = 0;

    private DrawNumberViewObserver control;

    private final JFrame jf = new JFrame();
    private final JTextField text = new JTextField(5);

    public DrawNumberViewImpl() {
        start();
    }

    @Override
    public void setObserver(DrawNumberViewObserver toSet) {
        control = toSet;
    }

    @Override
    public void start() {
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 200);
        jf.getContentPane().setLayout(new BorderLayout());
        
        JPanel cols = new JPanel();
        cols.setLayout(new BoxLayout(cols, BoxLayout.Y_AXIS));
        JPanel input = new JPanel(new FlowLayout());
        JPanel buttons = new JPanel(new FlowLayout());

        JButton invoke = new JButton("try");
        JButton exit = new JButton("reset");
        
        //JLabel label = new JLabel();  
        exit.addActionListener(e -> {
            control.resetGame();
            JOptionPane.showConfirmDialog(jf, "Gioco resettato");
        });      

        invoke.addActionListener(e -> {
            control.newAttempt(Integer.parseInt(text.getText()));
            //result(control.newAttempt(Integer.parseInt(text.getText())));
        });
        
        input.add(text);
        buttons.add(invoke);
        buttons.add(exit);

        cols.add(input);
        cols.add(buttons);
        
        jf.getContentPane().add(cols,BorderLayout.CENTER);
        
        jf.setVisible(true);
        
    }

    @Override
    public void numberIncorrect() {
        JOptionPane.showConfirmDialog(jf, "Il numero non è nei limiti del gioco [0,100]");
    }

    @Override
    public void limitsReached() {
        JOptionPane.showConfirmDialog(jf, "Hai perso");
    }

    @Override
    public void result(DrawResult toDraw) {
        /*estraggo numero */
        //int tried = 5;
        
        //if(tried < 0 || tried > 100){
        //    numberIncorrect();
        //    return;
        //}
        
        //attemps++;
        
        //if(attemps==AMOUNT_ATTEMPS){
        //    limitsReached();
        //    return;
        //}
        if(toDraw.equals(DrawResult.NOT_OK)){
            numberIncorrect();
        } else if (toDraw.equals(DrawResult.LOSE)){
            limitsReached();
        } else if(toDraw.equals(DrawResult.WON)){
            JOptionPane.showConfirmDialog(jf, "Hai vinto");
            JOptionPane.showConfirmDialog(jf, "Il gioco verrà resettato");
            control.resetGame();
        } else if (toDraw.equals(DrawResult.HIGTER)){
            JOptionPane.showConfirmDialog(jf, "Numero troppo alto");
        } else if (toDraw.equals(DrawResult.LOWER)){
            JOptionPane.showConfirmDialog(jf,"Numero troppo basso");
        }
        
    }


    
}
