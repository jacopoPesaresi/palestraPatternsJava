package second_steps;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    @org.junit.Test
    public void test() throws FileNotFoundException {

        File test = new File("./src/second_steps/test.txt");
        System.out.println(System.getProperty("user.dir"));
        System.out.println(test.getName());
        Scanner s = new Scanner(test);

        Editor myEditor = new Editor();

        myEditor.events.subscribe("open", new LoggingListeners("myLogFile.txt"));
        myEditor.openFile("./src/second_steps/myFile.txt");
        assertEquals(s.next(), "A");

        s = new Scanner(test);
        myEditor.events.subscribe("save", new LoggingListeners("myLogFile.txt"));
        myEditor.saveFile();
        assertEquals(s.next(), "AA");
    }
    
}
