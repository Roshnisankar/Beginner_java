import java.util.Scanner;

public class conditions {
    public static void main(String[]args){
        System.out.println("\nDo you agree for our terms?yes or no:");
        Scanner scanner=new Scanner(System.in);
        String userInput=scanner.nextLine();
        scanner.close();
        if(userInput=="Yes")
            System.out.println("User Agreed Enable Signup");

        }
    
}
