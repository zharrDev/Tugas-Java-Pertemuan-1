import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KonversiWaktu {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nama Kegiatan : ");
        String kegiatan = input.readLine();

        System.out.print("Durasi (detik): ");
        String durasiInput = input.readLine();

        int totalDetik = Integer.parseInt(durasiInput);

        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        int totalMenit = totalDetik / 60;

        System.out.println();
        System.out.println("==========================================");
        System.out.println("           KONVERSI WAKTU");
        System.out.println("==========================================");
        System.out.println("Kegiatan : " + kegiatan);
        System.out.println("Total Detik : " + totalDetik);
        System.out.println("------------------------------------------");
        System.out.println("HASIL KONVERSI");
        System.out.println("------------------------------------------");
        System.out.println("Jam : " + jam);
        System.out.println("Menit : " + menit);
        System.out.println("Detik : " + detik);
        System.out.println("Total Menit : " + totalMenit);
        System.out.println("Durasi : " + jam + " jam " + menit + " menit " + detik + " detik");
        System.out.println("==========================================");
    }
}