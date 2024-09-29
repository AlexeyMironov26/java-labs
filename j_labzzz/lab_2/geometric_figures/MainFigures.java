package geometric_figures;

import java.util.Scanner;

public class MainFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the type of figure to obtain information");
        String figure = scanner.nextLine();

        if (figure.equals("Parallelepiped")){
            Parallelepiped paral = new Parallelepiped();
            paral.assignColor("Yellow");
            paral.setCenter(2, 5, 3);
            paral.width = 4;
            paral.height = 3;
            paral.length = 6;
            paral.displayFigInfo();
        }
        else if (figure.equals("Cyllinder")){
            Cyllinder cyl = new Cyllinder();
            cyl.assignColor("Blue");
            cyl.setCenter(1, 8, 3);
            cyl.height = 7;
            cyl.radius = 4;
            cyl.displayFigInfo();
        }
        else if (figure.equals("Sphere")){
            Sphere orb = new Sphere(1,2,3,"Purple",4);
            orb.assignColor("Pink");
            orb.setCenter(5, 3, 17);
            orb.radius = 2;
            orb.displayFigInfo();
            // System.out.println(orb.getcX()+" , "+orb.getcY()+" , "+orb.getcZ());
            // System.out.println(orb.getCol());
        }
        else {
            System.out.println("You either wrongfully entered the type of figure or my script unable to identify your figure yet. Pls relaunch the program and try again");
        }
        scanner.close();
    }
    
}
