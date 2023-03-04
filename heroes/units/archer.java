package OOP.heroes.units;

    public abstract class  archer extends human {

        int shots, maxShots;
        protected String name;
        public archer (int hp, int maxHP, int att, int def, int shots, int maxShots, String name){
            super(hp, maxHP, att, def);
            this.shots = shots;
            this.maxShots = maxShots;
            this.name = name; 
        }
        
        
        public int getAtt(){
            return super.att;
        }
    }

