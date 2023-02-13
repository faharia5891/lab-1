import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter radius of a circle: ");
       double r= sc.nextDouble();
       double area= 3.1416*r*r;
       
       DecimalFormat df = new DecimalFormat("#.##");
       System.out.println("Area of the circle : "+df.format(area));
       
    }
}
