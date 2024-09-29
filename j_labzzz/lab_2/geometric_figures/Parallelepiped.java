package geometric_figures;

public class Parallelepiped extends GeometryFigure {
    public double length;
    public double width;
    
    public Parallelepiped(double x, double y, double z, String clr, double ht, double len, double wd){
        super("Parallelepiped", x, y, z, clr);
        height = ht;
        length = len;
        width = wd;
        volume = height*length*width;
    
}
    public Parallelepiped(){
        this(0, 0, 0, "Red", 1, 3, 2);
    }

    @Override
    public void assignColor(String cl){
        color = cl;
    }

    @Override
    public void displayFigInfo(){
        volume = height*length*width;
        System.out.println("The type of figure: " + getType() + "; Coordinates of center spot: " + getcX()+" , "+getcY()+" , "+getcZ() + "; The color of figure: " + getCol() + "; The volume of figure: " + volume);
    
    }
}
