import java.util.Scanner;




public class LinearEquationLogic {


    private LinearEquation linearEquation;
    private Scanner myScanner;




    public LinearEquationLogic() {
        linearEquation = null;
        myScanner = new Scanner(System.in);
    }




    public void start() {
        getLinearEquation();
    }


    private void getLinearEquation() {
        System.out.println("Welcome to the linear equation calculator");
        System.out.println("Enter coordinate 1: ");
        String cord1 = myScanner.nextLine();
        int commaLocation = cord1.indexOf(",");
        String x1 = cord1.substring(1, commaLocation);
        int x1Int = Integer.parseInt(x1);
        int endParenthesis= cord1.indexOf(")");
        String y1 = cord1.substring((commaLocation + 2), endParenthesis);
        int y1Int = Integer.parseInt(y1);
        System.out.println("Enter coordinate 2: ");
        String cord2 = myScanner.nextLine();
        commaLocation = cord2.indexOf(",");
        String x2 = cord2.substring(1, commaLocation);
        int x2Int = Integer.parseInt(x2);
        endParenthesis = cord2.indexOf(")");
        String y2 = cord2.substring((commaLocation + 2), endParenthesis);
        int y2Int = Integer.parseInt(y2);

        linearEquation = new LinearEquation(x1Int, y1Int, x2Int, y2Int);

        System.out.println(linearEquation.lineInfo());

        System.out.println("Enter an x value: ");
        double x = myScanner.nextDouble();

        System.out.println(linearEquation.coordinateForX(x));

        System.out.println("Do you want to repeat(y/n): ");
        String ans = myScanner.nextLine();
        while (ans == "y") {
            System.out.println("Welcome to the linear equation calculator");
            System.out.println("Enter coordinate 1: ");
            cord1 = myScanner.nextLine();
            commaLocation = cord1.indexOf(",");
            x1 = cord1.substring(1, commaLocation);
            x1Int = Integer.parseInt(x1);
            endParenthesis = cord1.indexOf(")");
            y1 = cord1.substring((commaLocation + 2), endParenthesis);
            y1Int = Integer.parseInt(y1);
            System.out.println("Enter coordinate 2: ");
            cord2 = myScanner.nextLine();
            commaLocation = cord2.indexOf(",");
            x2 = cord2.substring(1, commaLocation);
            x2Int = Integer.parseInt(x2);
            endParenthesis = cord2.indexOf(")");
            y2 = cord2.substring((commaLocation + 2), endParenthesis);
            y2Int = Integer.parseInt(y2);

            linearEquation = new LinearEquation(x1Int, y1Int, x2Int, y2Int);

            if (x2Int == x1Int) {
                System.out.println("Equation is undefined because the points fall on a vertical line");
            }

            System.out.println(linearEquation.lineInfo());

            System.out.println("Enter an x value: ");
            x = myScanner.nextDouble();

            System.out.println(linearEquation.coordinateForX(x));
            System.out.println("Do you want to repeat(y/n): ");
            ans = myScanner.nextLine();
        }

        System.out.println("End");

    }
}
