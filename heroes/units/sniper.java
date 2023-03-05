package OOP.heroes.units;

public class sniper extends archer{
    
    public sniper (String name){
        super(15, 12, 10, 9,  32, 15, 12, name);
        

    }
    @Override
    public String getInfo(){
        return "Снайпер " + name;
    }
}
