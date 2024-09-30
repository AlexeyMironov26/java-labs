package points;
// import points.Point2d;
// import points.Point3d;
public class MainPoint {
    public static void main(String[] args) {
        Point3d myanpoint = new Point3d(3.0, 3.0, 3.0);
        System.out.println(myanpoint.getZ());
        myanpoint.setZ(5.0);
        System.out.println(myanpoint.getX() + ", " + myanpoint.getY() + ", " + myanpoint.getZ());
    }
    
}
