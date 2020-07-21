import exceptions.OutOfMapException;
import model.Coordinate;
import model.LocalMap;
import model.Pirate;
import services.GameManager;

import java.util.*;

public class Application {
    public static void main(String[] args)  {
        GameManager game = new GameManager();
        game.run();
    }
}
