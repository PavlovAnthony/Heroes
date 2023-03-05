package OOP.heroes.units;

    public abstract class  archer extends human {

        protected int shots;
        protected String name;
        public archer (int hp, int att, int def, int speed, int shots, int maxDamage, int minDamage, String name){
            super(hp, att, def, speed, maxDamage, minDamage);
            this.shots = shots;
            this.name = name; 
        }
        
        
        public int getAtt(){
            return super.att;
        }
    }

