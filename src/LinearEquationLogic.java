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
        String x2 = cord1.substring(1, commaLocation);
        int x2Int = Integer.parseInt(x2);
        endParenthesis = cord2.indexOf(")");
        String y2 = cord1.substring((commaLocation + 2), endParenthesis);
        int y2Int = Integer.parseInt(y2);


        linearEquation = new LinearEquation(cord1, cord2);
    }
}
