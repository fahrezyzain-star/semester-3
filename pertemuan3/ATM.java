/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author SITI
 */

    import java.util.Scanner;
//import pertemuan3.rekening;

import java.util.Scanner;

public class ATM {
    private Scanner input;
    private DataNasabah dataNasabah;

    public ATM(DataNasabah dataNasabah) {
        this.dataNasabah = dataNasabah;
        input = new Scanner(System.in);
    }

    public void mulai() {
        int pilihan;

        do {
            System.out.println("\n======================");
            System.out.println("       ATM JAVA");
            System.out.println("======================");
            System.out.println("1. Login Nasabah");
            System.out.println("2. Tambah Nasabah");
            System.out.println("3. Lihat Data Nasabah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    login();
                    break;

                case 2:
                    tambahNasabah();
                    break;

                case 3:
                    dataNasabah.tampilkanSemuaNasabah();
                    break;

                case 4:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);
    }

    private void tambahNasabah() {
        System.out.println("\n=== TAMBAH NASABAH ===");

        System.out.print("Nama nasabah: ");
        String nama = input.nextLine();

        System.out.print("Nomor rekening: ");
        String nomorRekening = input.nextLine();

        System.out.print("Saldo awal: Rp");
        double saldoAwal = input.nextDouble();
        input.nextLine();

        dataNasabah.tambahNasabah(nama, nomorRekening, saldoAwal);
    }

    private void login() {
        System.out.println("\n=== LOGIN NASABAH ===");

        System.out.print("Masukkan nomor rekening: ");
        String nomorRekening = input.nextLine();

        Nasabah nasabah = dataNasabah.cariNasabah(nomorRekening);

        if (nasabah == null) {
            System.out.println("Nasabah tidak ditemukan.");
            return;
        }

        System.out.println("Selamat datang, " + nasabah.getNama());

        int pilihan;

        do {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Logout");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    nasabah.getRekening().tampilkanSaldo();
                    break;

                case 2:
                    System.out.print("Jumlah setor: Rp");
                    double setor = input.nextDouble();
                    nasabah.getRekening().setor(setor);
                    break;

                case 3:
                    System.out.print("Jumlah tarik: Rp");
                    double tarik = input.nextDouble();
                    nasabah.getRekening().tarik(tarik);
                    break;

                case 4:
                    System.out.println("Logout berhasil.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 4);
    }
}