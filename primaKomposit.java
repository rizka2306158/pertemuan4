import java.util.Scanner;

public class primaKomposit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = myObj.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = myObj.nextInt();

        boolean prima = true;

        System.out.print("Bilangan prima dari " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            prima = true;

            if (i > 1){
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        prima = false;
                        break;
                    }
                }
                if (prima) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();
        System.out.print("Bilangan komposit dari " + batasAwal + " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0){
                    prima = false;
                    System.out.print(i + " ");
                    break;
                }
            }
        }

        myObj.close();
    }
}
