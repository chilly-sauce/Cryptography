import java.util.Scanner;
public class Main{
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many bits output you want :");
        int bits= scanner.nextInt();
        scanner.nextLine();


        int n_lfsr= 8;

        // letting initial value of flip-flop be like first one be some 1 others 0
        int[] system = new int[n_lfsr];
        long time=System.currentTimeMillis();
        for(int i=0 ;i<n_lfsr;i++){
            system[i]= (int) ((time>>i)&1);
        }
        system[0]=1;

        int[] p = new int[n_lfsr];
        p[1]=1;
        p[2]=1;
        p[3]=1;
        p[7]=1;

        int[] output = new int[bits];
        for(int j=0;j<bits;j++) {
            // calculating ip for last flip-flop
            int ip = 0;
            for (int i = 0; i < n_lfsr; i++) {
                ip += p[i] * system[i];
            }
            ip = ip % 2;

            output[j]=system[0];

            // flip-flop storing input value
            for (int i = 0; i < n_lfsr - 1; i++) {
                system[i] = system[i + 1];
            }
            system[n_lfsr - 1] = ip;
        }

        int num=0;
        for(int i=0;i<bits;i++){
            num=num + output[i] * (1<<i);
        }

        System.out.println("Number generated is :"+ num);
        scanner.close();
    }
}