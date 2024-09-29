package geometric_figures;

public abstract class GeometryFigure {
    private String figureType;
    private double xCoord;
    private double yCoord;
    private double zCoord;
    protected String color;
    protected double volume;
    public double radius;
    public double height;

    public GeometryFigure(String ft, double x, double y, double z, String col){
        figureType = ft;
        xCoord = x;
        yCoord = y;
        zCoord = z;
        color = col;
    }

    public String getType(){
        return figureType;
    }

    public abstract void assignColor(String cl);

    public String getCol(){
        return color;
    }

    public abstract void displayFigInfo();

    public double getVol(){
        return volume;
    }

    public double getcX(){
        return xCoord;
    }

    public double getcY(){
        return yCoord;
    }

    public double getcZ(){
        return zCoord;
    }

    public void setcX(double val){
        xCoord = val;
    }

    public void setcY(double val){
        yCoord = val;
    }

    public void setcZ(double val){
        zCoord = val;
    }

    public double[] getCenter(){
        double[] centerCoord = {xCoord, yCoord, zCoord};
        return centerCoord;
    }

    public void setCenter(double x, double y,double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
}
