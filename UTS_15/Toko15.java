import java.util.Scanner;

public class Toko15 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in); // buat string yah

        String nama, produk, tipe;
        char konfirm = 'T', member;
        double kuantitas, harga, diskon, nom_diskon, jum_prod = 0, jum_har,
                subtotal = 0, jum_dis = 0, dis_mem, nom_dis_mem, total;

        System.out.print("Masukkan nama Anda : ");
        nama = sc2.nextLine();

        do {
            System.out.print("Masukkan produk yang akan dibeli : ");
            produk = sc2.nextLine();
            System.out.print("Banyaknya : ");
            kuantitas = sc1.nextDouble();
            jum_prod += kuantitas;
            System.out.print("Harga : ");
            harga = sc1.nextDouble();
            jum_har = kuantitas * harga;
            subtotal += jum_har;
            System.out.print("Diskon (%) : ");
            diskon = sc1.nextDouble() / 100;
            nom_diskon = diskon * jum_har;
            jum_dis += nom_diskon;
            System.out.print("Apakah anda mau menambah produk? (Y/N) : ");
            konfirm = sc1.next().charAt(0);

        } while (konfirm == 'Y' || konfirm == 'y');
        System.out.print("Apakah anda punya kartu member? (Y?N) : ");
        member = sc1.next().charAt(0);

        if (member == 'Y' || member == 'y') {
            tipe = "member";
            if (subtotal >= 200000) {
                dis_mem = 0.1;
            } else {
                dis_mem = 0.05;
            }
        } else {
            tipe = "bukan member";
            dis_mem = 0;
        }
        nom_dis_mem = dis_mem * subtotal;
        total = subtotal - (jum_dis + nom_dis_mem);

        System.out.println("--------------------Total Pembelian--------------------");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Tipe : " + tipe);
        System.out.println("Total barang yang dibeli : " + jum_prod);
        System.out.println("Subtotal                 : " + subtotal);
        System.out.println("Jumlah diskon            : " + (jum_dis + nom_dis_mem));
        System.out.println("Total yang harus dibayar : " + total);

    }
}
