package OOP.heroes.units;

public class wizard extends magician{
    public wizard (String name){
        super(100, 120, 4, 4, 12, name);
    }
    @Override
    public String getInfo(){
        return "Волшебник " + name;
    }
    
}
