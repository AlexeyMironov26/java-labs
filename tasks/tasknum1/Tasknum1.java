package tasknum1;

public class Tasknum1{
	public static void main(String[] args){

        double[] gallonsAmount = {5, 3, 8}; 
        System.out.println("PartNum 1");
        for (int i = 0; i < gallonsAmount.length; i++) { 
            double gallons = gallonsAmount[i];
            double liters = converting(gallons);
            System.out.println("Gallons" + gallons + "| Liters" + liters);
        }

        System.out.println("PartNum 2");
        System.out.println("fitCalc(15, 1) -> " + fitCalc(15, 1));
        System.out.println("fitCalc(24, 2) -> " + fitCalc(24, 2));
        System.out.println("fitCalc(41, 3) -> " + fitCalc(41, 3));

        System.out.println("PartNum 3");
        System.out.println("containers(3, 4, 2) -> " + containers(3, 4, 2));
        System.out.println("containers(5, 0, 2) -> " + containers(5, 0, 2));
        System.out.println("containers(4, 1, 4) -> " + containers(4, 1, 4));
        
        System.out.println("PartNum 4");
        System.out.println("triangleType(5, 5, 5) -> " + triangleType(5, 5, 5));
        System.out.println("triangleType(5, 4, 5) -> " + triangleType(5, 4, 5));
        System.out.println("triangleType(3, 4, 5) -> " + triangleType(3, 4, 5));
        System.out.println("triangleType(5, 1, 1) -> " + triangleType(5, 1, 1));
    
        System.out.println("PartNum 5");
        System.out.println("ternaryEvaluation(8, 4) -> " + ternaryEvaluation(8, 4));
        System.out.println("ternaryEvaluation(1, 11) -> " + ternaryEvaluation(1, 11));
        System.out.println("ternaryEvaluation(5, 9) -> " + ternaryEvaluation(5, 9));

        System.out.println("PartNum 6");
        System.out.println("howManyItems(22, 1.4, 2) -> " + howManyItems(22, 1.4, 2));
        System.out.println("howManyItems(45, 1.8, 1.9) -> " + howManyItems(45, 1.8, 1.9));
        System.out.println("howManyItems(100, 2, 2) -> " + howManyItems(100, 2, 2));
        
        System.out.println("PartNum 7");
        System.out.println("factorial(3) -> " + factorial(3));
        System.out.println("factorial(5) -> " + factorial(5));
        System.out.println("factorial(7) -> " + factorial(7));

        System.out.println("PartNum 8");
        System.out.println("gcd(48, 18) -> " + gcd(48, 18));
        System.out.println("gcd(52, 8) -> " + gcd(52, 8));
        System.out.println("gcd(259, 28) -> " + gcd(259, 28));

        System.out.println("PartNum 9");
        System.out.println("ticketSaler(70, 1500) -> " + ticketSaler(70, 1500));
        System.out.println("ticketSaler(24, 950) -> " + ticketSaler(24, 950));
        System.out.println("ticketSaler(53, 1250) -> " + ticketSaler(53, 1250));

        System.out.println("PartNum 10");
        System.out.println("tables(5, 2) -> " + tables(5, 2));
        System.out.println("tables(31, 20) -> " + tables(31, 20));
        System.out.println("tables(123, 58) -> " + tables(123, 58));
    }

    public static int containers(int boxes, int sacks, int barrels) {
        return boxes * 20 + sacks * 50 + barrels * 100;
    }

    public static String triangleType(int x, int y, int z) {
        if (x <= 0 || y <= 0 || z <= 0) {
            return "not a triangle";
        } else if (x == y && y == z) {
            return "equilateral";
        } else if (x == y || x == z || y == z) {
            return "isosceles";
        } else if (x != y && x != z && y != z) {
            return "different-sided";
        } else {
            return "not a triangle";
        }
    }

    public static int ternaryEvaluation(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int howManyItems(int fabricLength, double width, double height) {
        int items = 0;
        double fabricArea = fabricLength * 2;
        double itemArea = width * height;
        while (fabricArea >= itemArea) {
            fabricArea -= itemArea;
            items++;
        }
        return items;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int ticketSaler(int tickets, int price) {
        return tickets * price;
    }

    public static int tables(int students, int desks) {
        return (students / 2) - desks;
    }

    public static int fitCalc(int minutes, int intensity) {
       
        int caloriesPerMinute = 0;
        switch (intensity) {
            case 1: 
                caloriesPerMinute = 1;
                break;
            case 2: 
                caloriesPerMinute = 2;
                break;
            case 3: 
                caloriesPerMinute = 3;
                break;
            default: 
                System.out.println("Not correct level of intensity. Use 1, 2 or 3 instead");
                return 0; 
        }

        
        int totalCalories = minutes * caloriesPerMinute;
        return totalCalories;
    }


    public static double converting(double gallons) {
        return gallons * 3.78541;
    }


}