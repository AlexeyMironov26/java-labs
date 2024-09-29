package geometric_figures;

public class Sphere extends GeometryFigure {

    public static double counter = 0;

    public Sphere(double x, double y, double z, String clr, double rad){
        super("Sphere", x, y, z, clr);
        radius = rad;
        counter++;
        volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);

    }

    public Sphere(){
       this(0, 0, 0, "White", 1); 
    }
    
    @Override
    public void assignColor(String cl){
        color = cl;
    }

    @Override
    public void displayFigInfo(){
        volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.println("The type of figure: " + this.getType() + "; Coordinates of center spot: " + getcX()+" , "+getcY()+" , "+getcZ() + "; The color of figure: " + this.getCol() + "; The volume of figure: " + volume);
        System.out.println("The amount of created objects: " + Sphere.counter);
    }

}
