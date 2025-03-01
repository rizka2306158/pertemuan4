import java.util.Scanner;

public class periksaRibuan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            System.out.print("Masukkan bilangan (maksimal 9999): ");
            int bilangan = myObj.nextInt();

            if(bilangan < 0 || bilangan > 9999){
                System.out.println("Input harus antara angka 0 sampai 9999");
                continue;
            }

            int bagi = 1000; //mulai dari ribuan
            int temp = 4; //posisi ribuan

            while (bagi > 0) {
                int digit = bilangan / bagi; //digit paling kiri
                if(digit > 0){
                    switch (temp) {
                        case 4:
                            System.out.println(digit + " adalah bilangan ribuan");
                            break;
                        
                        case 3:
                            System.out.println(digit + " adalah bilangan ratusan");
                            break;

                        case 2: 
                            System.out.println(digit + " adalah bilangan puluhan");
                            break;

                        case 1:
                            System.out.println(digit + " adalah bilangan satuan");
                    }
                }

                bilangan %= bagi;
                bagi /= 10;
                temp --;
            }
        }
        myObj.close();
    }
}