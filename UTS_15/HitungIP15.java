import java.util.Scanner;

public class HitungIP15 {
    public static void main(String[] args) {
        double konv_nilai = 0, ip, remed = 0, counter = 0, sks, jum_sks = 0, jum_nilai, jum_nilai_2 = 0;
        char konfirmasi = 'T';
        Scanner input15 = new Scanner(System.in);
        Scanner input152 = new Scanner(System.in); // untuk string
        System.out.print("Masukkan Nama : ");
        String nama = input152.nextLine();
        do {
            System.out.print("Nama mata kuliah : ");
            String matkul = input152.nextLine();
            System.out.print("Nilai (A, B+, B, C+, C, D, E) : ");
            String nilai = input152.nextLine();
            System.out.print("Masukkan jumlah SKS : ");
            sks = input15.nextDouble();

            if (nilai.equalsIgnoreCase("a")) {
                konv_nilai = 4.0;
            } else if (nilai.equalsIgnoreCase("b+")) {
                konv_nilai = 3.5;
            } else if (nilai.equalsIgnoreCase("b")) {
                konv_nilai = 3.0;
            } else if (nilai.equalsIgnoreCase("c+")) {
                konv_nilai = 2.5;
            } else if (nilai.equalsIgnoreCase("c")) {
                konv_nilai = 2.0;
            } else if (nilai.equalsIgnoreCase("d")) {
                konv_nilai = 1.0;
                remed++;
            } else if (nilai.equalsIgnoreCase("e")) {
                konv_nilai = 0.0;
                remed++;
            } else {
                System.out.println("Salah input nilai");
            }

            System.out.print("Apakah lanjut input nilai? (Y/N) : ");
            konfirmasi = input15.next().charAt(0);
            jum_nilai = konv_nilai * sks;
            jum_nilai_2 += jum_nilai;
            jum_sks += sks;
            counter++;
        } while (konfirmasi == 'y' || konfirmasi == 'Y');
        ip = (counter * jum_nilai_2) / (counter * jum_sks);

        System.out.println("==========================================");
        System.out.println("Nama : " + nama);
        System.out.println("Indeks Prestasi (IP ) : " + ip);
        System.out.println("Jumlah mata kuliah : " + counter);
        System.out.println("Jumlah sks : " + jum_sks);
        System.out.println("Jumlah MK yang harus diperbaiki : " + remed);
    }
}
