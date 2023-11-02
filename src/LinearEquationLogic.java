import java.util.Objects;
import java.util.Scanner;
public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);
    LinearEquation lquation = new LinearEquation();
    boolean repeat = true;
    public void start() {
        startingCoords();
    }
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

            new LinearEquation(x1, y1, x2, y2);

            lquation.lineInfo();

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
