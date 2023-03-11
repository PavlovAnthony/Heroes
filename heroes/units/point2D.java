package OOP.heroes.units;

public class point2D {
    protected int x , y;
    public point2D (int x, int y){

        this.x=x;
        this.x=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected double getDistance(point2D enemie ){
        return Math.sqrt(Math.pow(x - enemie.x,2) + Math.pow(y - enemie.y,2));
        // return Math.hypot(Math.abs(enemie.y- y), Math.abs(enemie.x - x));

    }



}
