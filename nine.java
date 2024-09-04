import java.util.Scanner;
public static void main(String[]args){
    System.out.println("\n Enter the number 01:");
    Scanner scanner=new Scanner(System.in);
    var num1=scanner.nextLine();
    int number1=Integer.parseInt(num1);
    System.out.println("\nEnter the number 02:");
    var num2 =scanner.nextLine();
    int number2=Integer.parseInt(num2);
    scanner.close();
    var stringTotal=number1+number2;
    System.out.println("\n String Total:"+stringTotal);
}
