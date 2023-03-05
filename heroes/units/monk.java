package OOP.heroes.units;

public class monk extends magician{
    public monk (String name){
        super(30, 12, 7, 5, 1, -4, -4, name);
    }
    @Override
    public String getInfo(){
        return "Монах " + name;
    }
    
}
