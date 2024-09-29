package points;
// package points;
public class Point2d{

    // public static void main(String[] args){
    //     Point2d myPoint = new Point2d();
    //     Point2d anPoint = new Point2d(2,3);
    //     System.out.println(anPoint.getX());
    //     System.out.println(myPoint.getX());
    // }

    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y){
        this.xCoord = x;
        this.yCoord = y;
    }

    public Point2d(){
        this(0,0);
    }

    public double getX(){
        return xCoord;
    }
    
    public double getY(){
        return yCoord;
    }

    public void setX(double val){
        this.xCoord = val;
    }

    public void setY(double val){
        this.yCoord = val;
    }
}