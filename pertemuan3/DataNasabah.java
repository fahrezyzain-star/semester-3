/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author SITI
 */

import java.util.ArrayList;

public class DataNasabah {
    private ArrayList<Nasabah> daftarNasabah;

    public DataNasabah() {
        daftarNasabah = new ArrayList<>();
    }

    public void tambahNasabah(String nama, String nomorRekening, double saldoAwal) {
        Rekening rekening = new Rekening(nomorRekening, saldoAwal);
        Nasabah nasabah = new Nasabah(nama, rekening);

        daftarNasabah.add(nasabah);

        System.out.println("Nasabah berhasil ditambahkan.");
    }

    public Nasabah cariNasabah(String nomorRekening) {
        for (Nasabah nasabah : daftarNasabah) {
            if (nasabah.getRekening().getNomorRekening().equals(nomorRekening)) {
                return nasabah;
            }
        }

        return null;
    }

    public void tampilkanSemuaNasabah() {
        System.out.println("\n=== DATA NASABAH ===");

        if (daftarNasabah.isEmpty()) {
            System.out.println("Belum ada data nasabah.");
            return;
        }

        for (Nasabah nasabah : daftarNasabah) {
            System.out.println("Nama           : " + nasabah.getNama());
            System.out.println("No. Rekening   : "
                    + nasabah.getRekening().getNomorRekening());
            System.out.println("Saldo          : Rp"
                    + nasabah.getRekening().getSaldo());
            System.out.println("-------------------------");
        }
    }
}
class Nasabah {
    private String nama;
    private Rekening rekening;

    public Nasabah(String nama, Rekening rekening) {
        this.nama = nama;
        this.rekening = rekening;
    }

    public String getNama() {
        return nama;
    }

    public Rekening getRekening() {
        return rekening;
    }
}