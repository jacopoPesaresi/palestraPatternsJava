package second_steps;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class LoggingListeners implements EventListeners{

    private final File logFile;

    public LoggingListeners(String logFileName){
        logFile = new File("./src/second_steps/" + logFileName);
    }

    @Override
    public void uptade(String eventName, File uptaded) {
        //try (PrintStream ps = new PrintStream(logFile)) {
        //    ps.append()
        //} catch (Exception e) {
        //}

        //try (PrintStream ps = new PrintStream(logFile)) {
        try (FileWriter fw = new FileWriter(logFile)){
            PrintStream ps2 = new PrintStream(new File("./src/second_steps/test.txt"));
            //ps.print("\"" + eventName + "\" has just appened to " + uptaded.getName() + " file");
            //ps.append("\"" + eventName + "\" has just appened to " + uptaded.getName() + " file");
            fw.write("\"" + eventName + "\" has just appened to " + uptaded.getName() + " file");
            ps2.append("A");
            if (eventName.equals("open")) {
                ps2.append("aa");
            }
            ps2.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
    
}
