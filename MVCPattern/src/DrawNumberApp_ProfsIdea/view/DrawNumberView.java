package DrawNumberApp_ProfsIdea.view;

import DrawNumberApp_ProfsIdea.control.DrawNumberViewObserver;
import DrawNumberApp_ProfsIdea.utility.DrawResult;

public interface DrawNumberView {
    void setObserver(DrawNumberViewObserver toSet);
    void start();
    void numberIncorrect();
    void limitsReached();
    void result(DrawResult toDraw);
}
