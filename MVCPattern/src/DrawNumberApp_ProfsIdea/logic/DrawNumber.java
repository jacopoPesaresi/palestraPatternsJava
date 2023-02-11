package DrawNumberApp_ProfsIdea.logic;

import DrawNumberApp_ProfsIdea.utility.DrawResult;

public interface DrawNumber {
    void reset();
    DrawResult attempt(int tried);
}
