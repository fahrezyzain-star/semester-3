/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author SITI
 */

public class Rekening {
    private String nomorRekening;
    private double saldo;

    public Rekening(String nomorRekening, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldoAwal;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor berhasil.");
        } else {
            System.out.println("Jumlah setor harus lebih dari 0.");
        }
    }

    public boolean tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0.");
            return false;
        }

        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
            return false;
        }

        saldo -= jumlah;
        System.out.println("Penarikan berhasil.");
        return true;
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo Anda: Rp" + saldo);
    }
}