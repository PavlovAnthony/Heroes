package OOP.heroes.units;

import java.util.ArrayList;

public class peasant extends human{
    protected String name;
    protected int delivery;
    public peasant (String name, int side, point2D startPoint){
        super(side, 1, 1,  1, 1, 3,  startPoint, 1, 1, "Stand");
        this.name = name; 
        this.delivery = 1;
    }
    @Override
    public String getInfo(){
        return "Крестьянин " + name;
    }
    
    @Override
    public void step(ArrayList<human> team1, ArrayList<human> team2){

    
    if (!state.equals("die")){
        state = "Stand";
        

    }
}
}
