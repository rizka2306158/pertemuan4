import java.util.Scanner;

public class PecahBilangan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan (maksimal 9999): ");
        int bilangan = myObj.nextInt();

        if (bilangan < 0 || bilangan > 9999) {
            System.out.println("Input harus antara 0 hingga 9999.");
            return;
        }

        int posisiDigit = 1;
        while (bilangan > 0) {
            int sisaDigit = bilangan % 10;
            if (sisaDigit > 0) {
                switch (posisiDigit) {
                    case 1:
                        System.out.println(sisaDigit + " adalah satuan");
                        break;
                    case 2:
                        System.out.println(sisaDigit + " adalah puluhan");
                        break;
                    case 3:
                        System.out.println(sisaDigit + " adalah ratusan");
                        break;
                    case 4:
                        System.out.println(sisaDigit + " adalah ribuan");
                        break;
                }
            }
            bilangan /= 10;
            posisiDigit++;
        }

        myObj.close();
    }
}
