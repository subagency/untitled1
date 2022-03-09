import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileScanner{
    public static void main(String []args){

    Scanner in = new Scanner(System.in);

        System.out.println("Сколько денег надо накопить? ");
        double finalSumm = in.nextDouble();
        System.out.println("Сколько денег есть сейчас?");
        double cash = in.nextDouble();
        System.out.println("Сколько денег можешь пополнять в месяц??");
        double montPay = in.nextDouble();
        System.out.println("А какую ставку дает банк в год?");
        double procent = in.nextDouble();
        int mont = 0;

        while (cash < finalSumm) {

            cash += montPay;
            cash += montPay * ((procent / 100) / 12);
            mont++;
        }
        System.out.println("Ты накопишь нужную сумму за " + mont + " месяцев или " + mont / 12  + " года. И твоя сумма будет " + cash);




    }
}