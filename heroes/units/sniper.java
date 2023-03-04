package OOP.heroes.units;

public class sniper extends archer{
    
    public sniper (String name){
        super(100, 120, 4, 4,  5, 12, name);
        

    }
    @Override
    public String getInfo(){
        return "Снайпер " + name;
    }
}
