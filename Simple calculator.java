import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter a number :");
       double num1 = sc.nextDouble();
       System.out.println("Enter another number :");
       double num2 = sc.nextDouble();
       sc.nextLine();
       System.out.println("Enter sign :");
       String s= sc.nextLine();
       
       switch(s){
           case "+":
               double sum = num1+num2;
               System.out.println("Summation of"+num1+"and"+num2+"is :"+sum);
               break;
           case "-":
               double min = num1-num2;
               System.out.println("Minus of"+num1+"and"+num2+"is :"+min);
               break;
           case "*":
               double mul = num1*num2;
               System.out.println("Multiplication of"+num1+"and"+num2+"is :"+mul);
               break;
            case "/":
               double div = num1/num2;
               System.out.println("Divition of"+num1+"and"+num2+"is :"+div);
               break;   
       }
