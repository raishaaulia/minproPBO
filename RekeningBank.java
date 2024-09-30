package bank;

public class RekeningBank {
    private int nomorRekening;
    private String pemilikRekening;
    private double saldo;

    private static int penghitungRekening = 1000;

    public RekeningBank(String pemilikRekening, double saldo) {
        this.nomorRekening = penghitungRekening++;
        this.pemilikRekening = pemilikRekening;
        this.saldo = saldo;
    }

    public void tampilkanInformasiRekening() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Pemilik Rekening: " + pemilikRekening);
        System.out.println("Saldo: Rp" + saldo);
    }
    
    public int getNomorRekening() {
        return nomorRekening;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
