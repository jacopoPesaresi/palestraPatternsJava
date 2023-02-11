package DrawNumberApp_ProfsIdea.view;

import java.util.Scanner;

import DrawNumberApp_ProfsIdea.control.DrawNumberViewObserver;
import DrawNumberApp_ProfsIdea.utility.DrawResult;

public class DrawNumberViewCUI implements DrawNumberView{

    private final static Scanner s = new Scanner(System.in);
    private DrawNumberViewObserver control;

    public DrawNumberViewCUI(){
        //start();
    }

    @Override
    public void setObserver(DrawNumberViewObserver toSet) {
        control = toSet;        
    }

    @Override
    public void start() {
        System.out.println("Indovina il numero! [R] per resettare");
        while(true){
            String tmp = s.nextLine();
            if(tmp.equals("R")){
                control.resetGame();
            } else {
                try {
                    int number = Integer.parseInt(tmp);
                    control.newAttempt(number);
                } catch (NumberFormatException e){
                    System.out.println("Valore non accettato, desidero o un numero o una \"R\"");
                }
            }
        }
    }

    @Override
    public void numberIncorrect() {
        System.out.println("Il numero non sta nell'intervallo [0,100]");
    }

    @Override
    public void limitsReached() {
        System.out.println("Il numero non sta nell'intervallo [0,100]");
    }

    @Override
    public void result(DrawResult toDraw) {
        if(toDraw.equals(DrawResult.NOT_OK)){
            numberIncorrect();
        } else if (toDraw.equals(DrawResult.LOSE)){
            limitsReached();
        } else if(toDraw.equals(DrawResult.WON)){
            System.out.println("Hai vinto");
        } else if (toDraw.equals(DrawResult.HIGTER)){
            System.out.println("Numero troppo alto");
        } else if (toDraw.equals(DrawResult.LOWER)){
            System.out.println("Numero troppo basso");
        }
        
    }
    
}
