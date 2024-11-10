public class LinearEquation {




    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private String yIntercept;
    private String distance;


    public LinearEquation(int x1, int y1, int x2, int y2) {
       this.x1 = x1;
       this.y1 = y1;
       this.x2 = x2;
       this.y2 = y2;
       slope = ((double) y2 - y1) / ((double) x2 - x1);
    }





    public void distance() {
        int a = x2 - x1;
        int b = y2 - y1;
        double c = Math.sqrt((a * a) + (b * b));
    }

    public void yIntercept() {
        double slope = (y2 - y1) / (x2 - x1);
        double val = y1 * slope;
        if (val < 0) {
            double yIntercept = y2 + (val + (val * -2));
        } else {
            double yIntercept = y2 + (val - (val * 2));
        }
    }

    public void slope() {
        double slope = (y2 - y1) / (x2 - x1);

    }

    public void equation() {
        String equation  = "y = " + slope + "x" + yIntercept;
    }

    public String coordinateForX(double x) {
        String y = (slope * x) + yIntercept;
        return "Coordinate for x: (" + x + "," + y + ")";
    }

    public String lineInfo() {
        System.out.println("The two points are: (" +x1+", "+ y1 + ") and " + "(" + x2 + ", " + y2 + ")");
        if (slope == 0) {
            System.out.println("The equation of the line between these points is: y = " + yIntercept);
        } else {
            System.out.println("The equation of the line between these points is: y = " + slope + "x " + "+ " + yIntercept);
        }
        System.out.println("The equation of a line is: " + yIntercept);
        System.out.println("The slope of the line is: " + slope);
        System.out.println("The distance between these points is " + distance);
        return "";



    }
}
