import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner dat = new Scanner(System.in );
        System.out.println("Enter a number= ");//get number from user
        int num= dat.nextInt();

        isPalindrom(num);//method call
    }

    static void isPalindrom(int num) {//void method
        int temp=num, reverseNum=0, lastDigit;//need 3 different int

        while(temp!=0){//while loop for get all digits step by step
            lastDigit=temp%10;//get first digit number that is last one
            reverseNum=(reverseNum*10)+lastDigit;//assign last digit number
            temp/=10;//delete last digit number
        }

       if(num==reverseNum) System.out.println("Palindrom number!");
       else System.out.println("it is NOT Palindrom number...");
    }

}
