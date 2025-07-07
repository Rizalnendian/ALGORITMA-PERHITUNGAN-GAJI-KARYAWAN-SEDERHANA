
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] gaji = {5000000, 6500000, 9500000};
        int[] lembur = {30, 32, 34, 36,38};

        System.out.println("Input Golongan (A, B, C) :");
        String golongan = input.next().toUpperCase();

        System.out.println("Input Jam Lembur:");
        int jamLembur = input.nextInt();

        int gajiPokok = 0;
        int indexGolongan = -1;

        if (golongan.equals("A")){
            indexGolongan = 0;
        } else if (golongan.equals("B")) {
            indexGolongan = 1;
        } else if (golongan.equals("C")) {
            indexGolongan = 2;
        } else {
            System.out.println("Golongan tidak tersedia");
            return;
        }

        gajiPokok = gaji[indexGolongan];

        int persenanLembur = 0;
        if (jamLembur== 1){
            persenanLembur = lembur[0];
        }else if (jamLembur== 2){
            persenanLembur = lembur[1];
        }else if (jamLembur== 3){
            persenanLembur = lembur[2];
        }else if (jamLembur== 4){
            persenanLembur = lembur[3];
        }else if (jamLembur>= 5){
            persenanLembur = lembur[4];
        }


        double gajiLembur = (persenanLembur/100) * gajiPokok;

        double gajiBersih = gajiPokok + gajiLembur;

        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Gaji lembut: Rp " + (int) gajiLembur);
        System.out.println("Total gaji: RP " + (int) gajiBersih );





    }
}