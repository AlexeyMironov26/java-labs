package geometric_figures;

public class Cyllinder extends GeometryFigure{

    public Cyllinder(double x, double y, double z, String clr, double rad, double ht){
        super("Cyllinder", x, y, z, clr);
        radius = rad;
        height = ht;
        volume = Math.PI*Math.pow(radius, 2)*height;
    
}
    public Cyllinder(){
        this(0, 0, 0, "Black", 1, 2);
    }

    @Override
    public void assignColor(String cl){
        color = cl;
    }

    @Override
    public void displayFigInfo(){
        volume = Math.PI*Math.pow(radius, 2)*height;
        System.out.println("The type of figure: " + getType() + "; Coordinates of center spot: " + getcX()+" , "+getcY()+" , "+getcZ() + "; The color of figure: " + getCol() + "; The volume of figure: " + volume);

}
}
