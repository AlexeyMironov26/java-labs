package points;
// package points;
// import points.Point2d;

public class Point3d extends Point2d {
   private double zCoord;
      
      public Point3d(double x, double y, double z) {
            super(x, y);
            this.zCoord = z;
         }
      
         public Point3d() {
            this(0.0, 0.0, 0.0);
         }
      
         public double getZ() {
            return this.zCoord;
         }
      
         public void setZ(double val) {
            this.zCoord = val;
         }
      }
    

