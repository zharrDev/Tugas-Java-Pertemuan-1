import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Pengguna : ");
        String nama = input.nextLine();

        System.out.print("Suhu (Celsius) : ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9.0 / 5 + 32;
        double kelvin = celsius + 273.15;
        double reamur = celsius * 4.0 / 5;

        System.out.println();
        System.out.println("==========================================");
        System.out.println("           KONVERSI SUHU");
        System.out.println("==========================================");
        System.out.println("Nama Pengguna : " + nama);
        System.out.println("Celsius : " + celsius + " C");
        System.out.println("Fahrenheit : " + fahrenheit + " F");
        System.out.println("Kelvin : " + kelvin + " K");
        System.out.println("Reamur : " + reamur + " R");
        System.out.println("==========================================");

        input.close();
    }
}