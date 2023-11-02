public class LinearEquation {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public LinearEquation(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX(String coords) {
        String xValue = coords.substring(coords.indexOf("(") + 1, coords.indexOf(","));

        if ((coords.substring(coords.indexOf("("),coords.indexOf("(") + 1 )) == "-") {
            xValue = "-" + coords.substring(coords.indexOf("(") + 1, coords.indexOf("(") + 2);
        }

        return Integer.parseInt(xValue);
    }

    public int getY(String coords) {
        String yValue = coords.substring(coords.indexOf(" ") + 1,coords.indexOf(")"));

        if (coords.substring(coords.indexOf(")") - 1,coords.indexOf(")")) == "-") {
            yValue = coords.substring(coords.indexOf(")") - 2,coords.indexOf(")") - 1);
        }

        return Integer.parseInt(yValue);
    }
    public double getSlope() {
        return Math.round((((y2 - y1) / (x2 - x1))) * 100) / 100.0 ;
    }
    public double getYIntercept() {
        return Math.round((y1 - (getSlope() * x1)) * 100) / 100.0;
    }
    public double getDistance() {
        return Math.round((Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))) * 100) / 100.0;
    }
    public String actualLinearEquation () {
        String slopeFraction = (int) (y2 - y1) + "/" + (int) (x2 - x1);
        if (y1 != y2) {
            return "y = " + slopeFraction + "x + " + getYIntercept();
        } else {
            return "y = " + y1;
        }
    }
    public double coordinateForX (double x, double slope, double yintercept) {
        return (slope * x) + yintercept;
    }
    public String lineInfo() {
        if (x1 == x2) {
            System.out.println("Because these two points have the same x value, " + x1 + ", these points are on the vertical line x = " + x1);
        } else {
            System.out.println("\nThe two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")");
            System.out.println("The equation between these two lines are: " + actualLinearEquation());
            System.out.println("The slope of the line is: " + getSlope());
            System.out.println("The y-intercept of the line is: " + getYIntercept());
            System.out.println("The distance between the new points is: " + getDistance());

            System.out.print("\nEnter a value for x: ");
            double inputtedXD = scan.nextDouble();
            scan.nextLine();
            System.out.println("\nThe point on the line is: (" + inputtedXD + ", " + coordinateForX(inputtedXD, getSlope(), getYIntercept()) + ")");

        }

    }
}
