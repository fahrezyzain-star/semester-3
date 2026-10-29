/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;
/**
 *
 * @author SITI
 */
import javax.swing.JOptionPane;

public class ATMprosedural{
    public static void main(String[] args) {

        // PIN dan saldo awal
        String pinBenar = "1234";
        double saldo = 1000000;

        // Memasukkan PIN
        String pin = JOptionPane.showInputDialog(
                null,
                "Masukkan PIN ATM:",
                "Login ATM",
                JOptionPane.QUESTION_MESSAGE
        );

        // Mengecek PIN
        if (pin == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Program dibatalkan."
            );
            return;
        }

        if (!pin.equals(pinBenar)) {
            JOptionPane.showMessageDialog(
                    null,
                    "PIN salah! Akses ditolak.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // Jika PIN benar
        JOptionPane.showMessageDialog(
                null,
                "PIN benar.\nSelamat datang di ATM!",
                "Login Berhasil",
                JOptionPane.INFORMATION_MESSAGE
        );

        // Menu ATM akan terus muncul
        boolean keluar = false;

        while (!keluar) {

            String[] menu = {
                "Cek Saldo",
                "Tarik Tunai",
                "Setor Tunai",
                "Keluar"
            };

            int pilihan = JOptionPane.showOptionDialog(
                    null,
                    "Silakan pilih menu:",
                    "MENU ATM",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    menu,
                    menu[0]
            );

            switch (pilihan) {

                case 0:
                    // Cek saldo
                    JOptionPane.showMessageDialog(
                            null,
                            "Saldo Anda: Rp " + String.format("%,.0f", saldo),
                            "Cek Saldo",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case 1:
                    // Tarik tunai
                    String inputTarik = JOptionPane.showInputDialog(
                            null,
                            "Masukkan jumlah uang yang ingin ditarik:",
                            "Tarik Tunai",
                            JOptionPane.QUESTION_MESSAGE
                    );

                    if (inputTarik != null) {
                        try {
                            double tarik = Double.parseDouble(inputTarik);

                            if (tarik <= 0) {
                                JOptionPane.showMessageDialog(
                                        null,
                                        "Jumlah penarikan harus lebih dari 0!"
                                );
                            } else if (tarik > saldo) {
                                JOptionPane.showMessageDialog(
                                        null,
                                        "Saldo tidak mencukupi!",
                                        "Gagal",
                                        JOptionPane.ERROR_MESSAGE
                                );
                            } else {
                                saldo -= tarik;

                                JOptionPane.showMessageDialog(
                                        null,
                                        "Penarikan berhasil!\n"
                                        + "Jumlah ditarik: Rp "
                                        + String.format("%,.0f", tarik)
                                        + "\nSisa saldo: Rp "
                                        + String.format("%,.0f", saldo),
                                        "Tarik Tunai",
                                        JOptionPane.INFORMATION_MESSAGE
                                );
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Masukkan angka yang valid!",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE
                            );
                        }
                    }
                    break;

                case 2:
                    // Setor tunai
                    String inputSetor = JOptionPane.showInputDialog(
                            null,
                            "Masukkan jumlah uang yang ingin disetor:",
                            "Setor Tunai",
                            JOptionPane.QUESTION_MESSAGE
                    );

                    if (inputSetor != null) {
                        try {
                            double setor = Double.parseDouble(inputSetor);

                            if (setor <= 0) {
                                JOptionPane.showMessageDialog(
                                        null,
                                        "Jumlah setoran harus lebih dari 0!"
                                );
                            } else {
                                saldo += setor;

                                JOptionPane.showMessageDialog(
                                        null,
                                        "Setoran berhasil!\n"
                                        + "Jumlah disetor: Rp "
                                        + String.format("%,.0f", setor)
                                        + "\nSaldo sekarang: Rp "
                                        + String.format("%,.0f", saldo),
                                        "Setor Tunai",
                                        JOptionPane.INFORMATION_MESSAGE
                                );
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(
                                    null,
                                    "Masukkan angka yang valid!",
                                    "Error",
                                    JOptionPane.ERROR_MESSAGE
                            );
                        }
                    }
                    break;

                case 3:
                case -1:
                    // Keluar atau menutup dialog
                    keluar = true;

                    JOptionPane.showMessageDialog(
                            null,
                            "Terima kasih telah menggunakan ATM.",
                            "Keluar",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
            }
        }
    }
}
