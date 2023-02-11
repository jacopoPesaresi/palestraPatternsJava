package second_steps;

//import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException{
        
        File test = new File("./src/second_steps/test.txt");
        
        //System.out.println(System.getProperty("user.dir"));
        //System.out.println(test.getName());
        //FileReader fr = new FileReader(test);
        Scanner s = new Scanner(test);

        Editor myEditor = new Editor();

        myEditor.events.subscribe("open", new LoggingListeners("myLogFile.txt"));
        myEditor.openFile("./src/second_steps/myFile.txt");
        //System.out.println("////" + fr.read());
        System.out.println(1 + s.nextLine());
        //assertEquals(s.next(), "A");

        s = new Scanner(test);
        myEditor.events.subscribe("save", new LoggingListeners("myLogFile.txt"));
        myEditor.saveFile();
        System.out.println(2 + s.nextLine());
        //assertEquals(s.next(), "AA");

    }
    
}
