package feb25;
import java.sql.SQLOutput;
import java.util.Scanner;
public class printfTrial {
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        int number;
        String text;
        for(int i=1; i<4; i++){
            System.out.println("Enter text"+i);

            text=x.nextLine();
            System.out.println("enter number"+i);
            number=x.nextInt();
            x.nextLine();
            System.out.printf("%-4s %03d\n", text, number);

        }
    }
}
