package second_steps;

import java.io.File;

public class EmailAlertListener implements EventListeners{

    private final String email;

    public EmailAlertListener(String emailToNotify){
        email = emailToNotify;
    }

    @Override
    public void uptade(String eventName, File uptaded) {
       System.out.println("Email to: " + email + "; \"" + eventName + "\" appened to " + uptaded.getName()+ " file!");
        
    }

}