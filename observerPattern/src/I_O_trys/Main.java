package I_O_trys;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {

    public static void main(String args[]){
        String saluti = "Hello World!";
        //System.out.println(System.getProperty("user.dir"));
        File myFile = new File("./src/I_O_trys/pinco.txt");
        System.out.println(saluti);
        try (PrintStream ps = new PrintStream(myFile)) {
            ps.append(saluti);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
