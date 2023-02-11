package second_steps;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private Map<String, List<EventListeners>> listeners = new HashMap<>();

    public EventManager(List<String> events){
        for(String ev : events){
            listeners.put(ev, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListeners listener){
        if (listeners.containsKey(eventType)) {
            listeners.get(eventType).add(listener);
        } else {
            List<EventListeners> myList = new ArrayList<>(List.of(listener));
            listeners.put(eventType, myList);
        }
    }

    public void unsubscribe(String eventType, EventListeners listener){
        if(listeners.get(eventType) !=null){
            listeners.get(eventType).remove(listener);
            if(listeners.get(eventType).isEmpty()){
                listeners.remove(eventType);
            }
        }
    }

    public void notify(String eventType, File file){
        for(EventListeners el : listeners.get(eventType)){
            el.uptade(eventType, file);
        }
    }
    
}
