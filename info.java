import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Name: ");
       String name= sc.nextLine();
       System.out.println("Enter Address: ");
       String address= sc.nextLine();
       System.out.println("Enter department: ");
       String department= sc.nextLine();
       System.out.println("Enter favorite game: ");
       String game= sc.nextLine();
       
       System.out.println("Name :"+name);
       System.out.println("Address :"+address);
       System.out.println("Department :"+department);
       System.out.println("Favorite game :"+game);
    }
}
