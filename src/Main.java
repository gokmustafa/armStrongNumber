import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int tempNumber;
        int countNumber = 0;
        int result = 0;
        int modNumber;
        int powNumber;

        tempNumber = number;
        while (tempNumber != 0){
            tempNumber /=10;
            countNumber++;
        }
        System.out.println(countNumber);

        tempNumber = number;
        while (tempNumber != 0){
            modNumber = tempNumber %10;
            powNumber =1;
            for (int i=1; i<=countNumber; i++){
                powNumber *=modNumber;

            }
            result +=powNumber;
            tempNumber /=10;
        }

        System.out.println("sonuc "+result);

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}
