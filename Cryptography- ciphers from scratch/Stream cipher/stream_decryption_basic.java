import java.util.Scanner;
public class stream_decryption_basic {
    public static void main(String[] args){
        System.out.println("*************** Stream Cipher decryption **************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key used :");
        int key= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter size of string:");
        int size=scanner.nextInt();
        scanner.nextLine();
        int [] encrypted_code=new int[size];
        System.out.println("Input the encrypted code in order-");
        for(int i=0;i<size;i++){
            System.out.println("encrypted code["+i+"]:");
            encrypted_code[i]=scanner.nextInt();
            scanner.nextLine();
        }
        StringBuilder decrypted_word = new StringBuilder();
        char ch;
        int dc;
        for(int i=0;i<size;i++){
             dc =encrypted_code[i] ^ key ;
             ch= (char) dc;
             decrypted_word.append(ch);
        }

        System.out.println("Decrypted word : "+decrypted_word);
        System.out.println("********************************************************");

    }

}
