package management;

import bank.RekeningBank;
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenBank {
    private ArrayList<RekeningBank> daftarRekening = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahRekening() {
        System.out.print("\nMasukkan Nama Pemilik Rekening: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Saldo Awal: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // membersihkan buffer
        RekeningBank rekening = new RekeningBank(nama, saldo);
        daftarRekening.add(rekening);
        System.out.println("Rekening berhasil dibuat!");
    }

    public void tampilkanRekening() {
        if (daftarRekening.isEmpty()) {
            System.out.println("Tidak ada rekening yang tersedia.");
        } else {
            for (RekeningBank rekening : daftarRekening) {
                rekening.tampilkanInformasiRekening();
                System.out.println("-------------------");
            }
        }
    }

    public void hapusRekening() {
        System.out.print("\nMasukkan Nomor Rekening yang akan dihapus: ");
        int nomorRekening = scanner.nextInt();
        boolean dihapus = daftarRekening.removeIf(rekening -> rekening.getNomorRekening()== nomorRekening);
        if (dihapus) {
            System.out.println("Rekening berhasil dihapus!");
        } else {
            System.out.println("Rekening tidak ditemukan.");
        }
    }

    public void perbaruiSaldo() {
        System.out.print("\nMasukkan Nomor Rekening yang akan diperbarui: ");
        int nomorRekening = scanner.nextInt();
        boolean ditemukan = false;
        for (RekeningBank rekening : daftarRekening) {
            if (rekening.getNomorRekening()==(nomorRekening)) {
                System.out.print("Masukkan saldo baru: ");
                double saldoBaru = scanner.nextDouble();
                scanner.nextLine();
                rekening.setSaldo(saldoBaru);
                System.out.println("Saldo berhasil diperbarui!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Rekening tidak ditemukan.");
        }
    }
}
