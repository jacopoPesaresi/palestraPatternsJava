package second_steps;

import java.io.File;
import java.util.List;

public class Editor {

    public final EventManager events;
    private File mFile;
    private String name;

    public Editor(){
        this.events = new EventManager(List.of("open","save"));
    }

    public void openFile(String fP){
        try{
            if(mFile == null){
                this.mFile = new File(fP);
                events.notify("open", mFile);
            } else throw new Error();
        } catch (Error e){
            System.out.println("File non aperto correttamente");
        }
    }

    public void saveFile(){
        try{
            if(mFile != null){
                events.notify("save", mFile);
                /* operazioni di salvataggio */
                //this.mFile = new File(fP);
            } else throw new Error();
        } catch (Error e) {
            System.out.println("Nessun file è stato aperto");
        }
    }

    
    
}
