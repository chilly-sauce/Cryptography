import java.util.Scanner;
import java.util.Random;
public class stream_encryption_basic {
    public static void main(String[] args){
        System.out.println("*************** Stream Cipher encryption **************");
        Scanner scanner =new Scanner (System.in);
        Random random = new Random();
        System.out.println("Enter the word:");
        String word=scanner.nextLine();

        int size=word.length();
        int[] array = new int[size];
        int ascii;
        int key = random.nextInt(64,129);


        int[] cipher_int = new int[size];
        for(int i=0;i<size;i++){
            ascii = (int) word.charAt(i);
            cipher_int[i]=ascii ^ key ;
        }

        System.out.println("Cipher code: ");
        for(int i=0;i<size;i++){
            System.out.print(cipher_int[i]+",");
        }
        System.out.println("\nkey used:"+key);

        System.out.println("********************************************************");

        scanner.close();
    }
}
