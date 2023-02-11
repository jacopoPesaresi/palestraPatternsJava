package DrawNumberApp_ProfsIdea;

import DrawNumberApp_ProfsIdea.control.DrawNumberViewObserver;
import DrawNumberApp_ProfsIdea.logic.DrawNumber;
import DrawNumberApp_ProfsIdea.logic.DrawNumberImpl;
import DrawNumberApp_ProfsIdea.view.DrawNumberView;
import DrawNumberApp_ProfsIdea.view.DrawNumberViewCUI;
import DrawNumberApp_ProfsIdea.view.DrawNumberViewImpl;

public class DrawNumberApp implements DrawNumberViewObserver{

    private final DrawNumber logic;
    private final DrawNumberView view;

    public DrawNumberApp(){
        
        logic = new DrawNumberImpl(25,0,100);
        //logic = new DrawNumberImpl(r.nextInt(0,101), 0, 100);
        view = new DrawNumberViewImpl();
        //view = new DrawNumberViewCUI();
        view.setObserver(this);
        view.start();
        
    }

    public void newAttempt(int tried) {
        view.result(logic.attempt(tried));
    }

    public void resetGame(){
        logic.reset();
        //logic = new DrawNumberImpl(r.nextInt(0,101), 0, 100);
    }

    public void quit(){
        System.exit(0);
    }

    public static void main(String args[]){
        //System.out.println("Hello World!");
        //DrawNumberApp dna = new DrawNumberApp();
        new DrawNumberApp();
    }

}