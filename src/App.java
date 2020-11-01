import java.util.Scanner;

/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {

        int banyakMahasiswa;
        double nilaiMahasiswa;
        double jumlahNilai = 0;

        Scanner bm = new Scanner(System.in);
        Scanner nm = new Scanner(System.in);

        System.out.print("Masukan Banyaknya Mahasiswa : ");
        banyakMahasiswa = bm.nextInt();

        for (int i = 1; i <= banyakMahasiswa; i++) {
            
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilaiMahasiswa = nm.nextInt();
            jumlahNilai = (jumlahNilai + nilaiMahasiswa);
        }
        
        System.out.println("Maka, Rata-rata Nilainya Adalah " + (jumlahNilai/banyakMahasiswa));
    }
}
