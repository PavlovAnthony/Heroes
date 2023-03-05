package OOP.heroes.units;

public class outlaw extends human{
    protected String name;

    public outlaw (String name){
        super(10, 8, 3, 6, 4, 2);
        this.name = name; 
    }
    @Override
    public String getInfo(){
        return "Разбойник " + name;
    }
    
}
