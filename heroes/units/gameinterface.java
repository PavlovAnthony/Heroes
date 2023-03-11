package OOP.heroes.units;

import java.util.ArrayList;

public interface gameinterface {

    void step(ArrayList<human> team1, ArrayList<human> team2);

    String getInfo();
}
