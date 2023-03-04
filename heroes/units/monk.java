package OOP.heroes.units;

public class monk extends magician{
    public monk (String name){
        super(100, 120, 4, 4, 12, name);
    }
    @Override
    public String getInfo(){
        return "Монах " + name;
    }
    
}
