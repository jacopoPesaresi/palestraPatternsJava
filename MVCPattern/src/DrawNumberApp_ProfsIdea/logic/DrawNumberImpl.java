package DrawNumberApp_ProfsIdea.logic;

import java.util.Random;

import DrawNumberApp_ProfsIdea.utility.DrawResult;

public class DrawNumberImpl implements DrawNumber{

    private final static int AMOUNT_ATTEMPS = 7;
    private final Random r = new Random();
    private int amountAttemps;
    private int attemps;
    private int lower;
    private int highter;
    private int correct;

    public DrawNumberImpl(int correctNumber, int lowerBound, int highterBound){
        lower = lowerBound;
        highter = highterBound;
        amountAttemps = ((int) (Math.log(highterBound-lowerBound)/Math.log(2)) + 1) ;
        reset();
        //amountAttemps = highterBound-lowerBound
    }

    @Override
    public void reset() {
        attemps = 0;
        //lower = 0;
        //highter = 100;
        correct = r.nextInt(lower,highter+1);
        System.out.println(correct);
    }

    @Override
    public DrawResult attempt(int tried) {
        if(tried < lower || tried > highter){
            return DrawResult.NOT_OK;
        }

        //if(attemps == AMOUNT_ATTEMPS){
        if(attemps == amountAttemps){
            return DrawResult.LOSE;
        }

        attemps++;

        if(tried == correct){
            return DrawResult.WON;
        } else if (tried < correct){
            //lower = tried;
            return DrawResult.LOWER;
        } else {
            //highter = tried;
            return DrawResult.HIGTER;
        }        
    }
    
}
