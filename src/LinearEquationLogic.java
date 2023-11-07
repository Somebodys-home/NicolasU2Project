import java.util.Objects;
import java.util.Scanner;
public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);
    boolean repeat = true;
    public void start() {
        startingCoords();
    }
    LinearEquation lquation = new LinearEquation(0,0,0,0);
    public void startingCoords() {
        System.out.println("Welcome to the linear equation calculator!");

        while (repeat) {
            System.out.print("Enter first coordinate pair: ");
            String coord1 = scan.nextLine();
            int x1 = lquation.getX(coord1);
            int y1 = lquation.getY(coord1);
            System.out.print("Enter second coordinate pair: ");
            String coord2 = scan.nextLine();
            int x2 = lquation.getX(coord2);
            int y2 = lquation.getY(coord2);

            lquation = new LinearEquation(x1, y1, x2, y2);

            lquation.lineInfo();

            System.out.print("\nEnter a value for x: ");
            double inputtedXD = scan.nextDouble();
            scan.nextLine();
            System.out.println("\nThe point on the line is: (" + inputtedXD + ", " + lquation.coordinateForX(inputtedXD, lquation.getSlope(), lquation.getYIntercept()) + ")");
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            String repeatYN = scan.nextLine();

            if (Objects.equals(repeatYN, "y")) {
                repeat = true;
            } else {
                repeat = false;
            }
        }
    }
}
