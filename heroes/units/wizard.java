package OOP.heroes.units;

public class wizard extends magician{
    public wizard (String name){
        super(30, 17, 12, 9, 1, -5, -5, name);
    }
    @Override
    public String getInfo(){
        return "Волшебник " + name;
    }
    
}
