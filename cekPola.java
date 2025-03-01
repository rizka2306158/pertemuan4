import java.util.Scanner;

public class cekPola {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = myObj.nextInt();

        for(int i = 0; i <= angka; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        myObj.close();
    }
}
