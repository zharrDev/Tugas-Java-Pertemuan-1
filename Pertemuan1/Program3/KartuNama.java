import java.util.Scanner;

public class KartuNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Depan : ");
        String namaDepan = input.nextLine();

        System.out.print("Nama Belakang : ");
        String namaBelakang = input.nextLine();

        System.out.print("Hobi : ");
        String hobi = input.nextLine();

        System.out.print("Umur : ");
        int umur = input.nextInt();

        String namaLengkap = namaDepan + " " + namaBelakang;
        String namaKapital = namaLengkap.toUpperCase();
        String namaKecil = namaLengkap.toLowerCase();
        int panjangNama = namaLengkap.length();
        char hurufAwal = namaLengkap.charAt(0);
        int umurLimaTahunLagi = umur + 5;

        System.out.println();
        System.out.println("==========================================");
        System.out.println("           KARTU NAMA DIGITAL");
        System.out.println("==========================================");
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("Nama Kapital : " + namaKapital);
        System.out.println("Nama Kecil : " + namaKecil);
        System.out.println("Panjang Nama : " + panjangNama + " karakter");
        System.out.println("Huruf Awal : " + hurufAwal);
        System.out.println("Hobi : " + hobi);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Umur 5 Th Lagi: " + umurLimaTahunLagi + " tahun");
        System.out.println("------------------------------------------");
        System.out.println("PERKENALAN");
        System.out.println("------------------------------------------");
        System.out.println("Halo, nama saya " + namaLengkap + ".");
        System.out.println("Saya berumur " + umur + " tahun dan hobi saya " + hobi + ".");
        System.out.println("==========================================");

        input.close();
    }
}