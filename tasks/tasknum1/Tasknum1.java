public class Tasknum1{
	public static void main(String[] args){

        double[] gallonsAmount = {5, 3, 8}; 
        System.out.println("PartNum 1");
        for (int i = 0; i < gallonsAmount.length; i++) { 
            double gallons = gallonsAmount[i];
            double liters = converting(gallons);
            System.out.println("Gallons: " + gallons + "| Liters: " + liters);
        }

        int[] ini_minutes = {15, 24, 41}; // [] здесь нужны, чтобы объявить не одну переменную типа int, а массив переменных
        int[] ini_temp = {1, 2, 3};
        System.out.println("PartNum 2");
        for (int i=0; i<ini_minutes.length; i++) {
            int minutes = ini_minutes[i];
            int temp = ini_temp[i];
            int burned_cal = CountCal(minutes, temp);
            System.out.println("If time is " + minutes + 
            " and intensity is " + temp +
             " amount of burned calories = " + burned_cal);
        }
  
        int[] ini_boxes = {3, 5, 4};
        int[] ini_bags = {4, 0, 1};
        int[] ini_barrels = {2, 2, 4};
        System.out.println("PartNum 3");
        for (int i=0; i<ini_boxes.length; i++){
            int boxes = ini_boxes[i];
            int bags = ini_bags[i];
            int barrels = ini_barrels[i];
            int general_amount = GenMerch(boxes, bags, barrels);
            System.out.println("We have " + boxes + " boxes, " +
            bags + " bags and " + barrels + " barrels, therefore general amount of merchandise is " + general_amount);
        }
        
        int[] side_x = {5, 5, 3, 5};
        int[] side_y = {5, 4, 4, 1};
        int[] side_z = {5, 5, 5, 1};
        System.out.println("PartNum 4");
        for (int i = 0; i < side_x.length; i++){
            int x = side_x[i];
            int y = side_y[i];
            int z = side_z[i];
            String typeOfT = triangleType(x, y, z);
            System.out.println("SideX: " + x 
            + ", SideY: " + y + ", SideZ: " + z + ". Type of triangle is " + typeOfT );
        }
        
        int[] ini_a = {8, 1, 5};
        int[] ini_b = {4, 11, 9};
        System.out.println("PartNum 5");
        for (int i = 0; i < ini_a.length; i++){
            int a = ini_a[i];
            int b = ini_b[i];
            int ternop = ternarOperator(a, b);
            System.out.println("a: " + a + "; b: " + b + ". Max: " + ternop);
        }

        double[] clothLen = {22.0, 45.0, 100.0};
        double[] Iwidth = {1.4, 1.8, 2.0};
        double[] Ilen = {2.0, 1.9, 2.0};
        System.out.println("PartNum 6");
        for (int i = 0; i < clothLen.length; i++){
            double n = clothLen[i];
            double w = Iwidth[i];
            double h = Ilen[i];
            int Iamount = amOfI(n, w, h);
            System.out.println("Cloth Length: " + n +
             "; Item width: " + w + "; Item Length: " + h +
             "; Amount of items: " + Iamount);
        }
        
        int[] ini_num = {3, 5, 7};
        System.out.println("PartNum 7");
        for (int i = 0; i < ini_num.length; i++){
            int num = ini_num[i];
            int factorial = facFunc(num);
            System.out.println("initial number: " + num +
            "; factoril of it: " + factorial);
        }

        int[] num1 = {48, 52, 259};
        int[] num2 = {18, 8, 28};
        System.out.println("PartNum 8");
        for (int i = 0; i < num1.length; i++){
            int a = num1[i];
            int b = num2[i];
            int bcd = bcdFunc(a, b);
            System.out.println("num1: " + a + "; num2: " + b 
            + "; Biggest common divider equels " + bcd);
        }

        int[] am_tickets = {70, 24, 53};
        int[] price_tick = {1500, 950, 1250};
        System.out.println("PartNum 9");
        for (int i = 0; i < am_tickets.length; i++){
            int amotick = am_tickets[i];
            int tprice = price_tick[i];
            double withoutfee = 0.72;
            int income = earnings(amotick, tprice, withoutfee);
            System.out.println("amount of tickets: " + amotick +
             "; price for one: " + tprice + "; without additional fee: " + withoutfee 
             + "; Earned money: " + income);

        }

        int[] am_students = {5, 31, 123};
        int[] am_tabels = {2, 20, 58};
        System.out.println("PartNum 10");
        for (int i = 0; i < am_students.length; i++){
            int students = am_students[i];
            int tabels = am_tabels[i];
            int notenough = tNotEnough(students, tabels);
            System.out.println("students: " + students + "; tabels: " + tabels + 
            "; not enought of tabels: " + notenough);
        }


    }

    public static int GenMerch(int boxes, int bags, int barrels) {
        return boxes * 20 + bags * 50 + barrels * 100;
    }

    public static String triangleType(int x, int y, int z) {
        if ((x <= 0 || y <= 0 || z <= 0) || !((x + y > z) && (x + z > y) && (z + y > x))) {
            return "not a triangle";
        } else if (x == y && y == z) {
            return "isosceles";
        } else if (x == y || x == z || y == z) {
            return "equilateral";
        } else if (x != y && x != z && y != z) {
            return "different-sided";
        } else {
            return "not a triangle";
        }
    }

    public static int ternarOperator(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int amOfI(double clothLength, double width, double length) {
        int items = 0;
        double clothArea = clothLength/2;
        double itemArea = width * length;
        while (clothArea >= itemArea) {
            clothArea -= itemArea;
            items++;
        }
        return items;
    }

    public static int facFunc(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * facFunc(n - 1); //рекурсивная функция вызывает саму себя пока не дойдёт до 0 и не вернёт 1, а потом все эти вызовы функции раскрываются, возвращая уже реальные числа и мы получаем факториал числа
        }
    }

    public static int bcdFunc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return bcdFunc(b, a % b);//для нахождения нод используем алгоритм евклида, который заключается в приравнивании первого числа ко второму, а второго к остатку от деления первого на второе до тех пор пока второе число не превратится в 0. Когда это случится нод этих двух чисел будет равен первому числу.
        }
    }

    public static int earnings(int tickets, int price, double withoutfee) {
        return (int) (tickets * withoutfee * price);
    }

    public static int tNotEnough(int students, int tabels) {
        int tabelsreq = 0;
        if ((students%2 == 0) && (students/2 >= tabels)){
            tabelsreq = students/2 - tabels;
        } else if ((students%2 != 0) && (students/2 >= tabels)){
            tabelsreq = (students/2)+1 - tabels;
        } else {
            tabelsreq = 0;
        }
        return tabelsreq;
    }

    public static int CountCal(int minutes, int intensity) { //int calriesPerMinute будет хранить количество калорий, сжигаемых за минуту тренировки
       
        int caloriesPerMinute = 0;
        switch (intensity) { // оператор switch позволяет выбрать определённый блок кода для выполнения в зависимости от значения переменной intensity
            case 1: 
                caloriesPerMinute = 1; //например если intensity равняется 1 (case 1), то присваиваем caloriesPerMinutes 1 и т д
                break; //break выходит из блока switch, чтобы код не продолжал выполнение следующих case
            case 2: 
                caloriesPerMinute = 2;
                break;
            case 3: 
                caloriesPerMinute = 3;
                break;
            default: //default выполняется, если intensity не равно ни одному из case
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