package management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenBank manajemen = new ManajemenBank();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Bank ===");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Tampilkan Rekening");
            System.out.println("3. Perbarui Saldo");
            System.out.println("4. Hapus Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    manajemen.tambahRekening();
                    break;
                case 2:
                    manajemen.tampilkanRekening();
                    break;
                case 3:
                    manajemen.perbaruiSaldo();
                    break;
                case 4:
                    manajemen.hapusRekening();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
