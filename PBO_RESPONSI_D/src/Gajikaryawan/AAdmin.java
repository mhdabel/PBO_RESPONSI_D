package Gajikaryawan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AAdmin extends JFrame{


    JButton btnHome = new JButton("Home");
    JButton btnTambah = new JButton("Tambah");
    JButton btnData = new JButton("Data");
    JButton btnPetunjuk= new JButton("Petunjuk");
    JButton btnKaryawan = new JButton("karyawan");
    JTextArea teks = new JTextArea(" Selamat Datang ADMIN,\n Silahkan masuk ke menu tambah untuk memasukan data baru.\n Jika mengalami kesulitan klik menu petunjuk");
    JLabel Footer = new JLabel("APLIKASI PERHITUNGAN GAJI PT. OK");

    public AAdmin(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(850,580);
        setLocation(225,75);

        add(btnHome);
        btnHome.setBounds(10,20,120,70);
        add(btnTambah);
        btnTambah.setBounds(10,100,120,70);
        add(btnData);
        btnData.setBounds(10,180,120,70);
        add(btnPetunjuk);
        btnPetunjuk.setBounds(10,260,120,70);
        add(btnKaryawan);
        btnKaryawan.setBounds(700,20,120,70);
        add(teks);
        teks.setBounds(150, 100, 600, 300);
        teks.setLineWrap(true);
        teks.setWrapStyleWord(true);
        teks.setFont(new Font("Arial", Font.BOLD, 18));
        add(Footer);
        Footer.setBounds(250, 500, 600, 50);
        Footer.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));


        btnHome.addActionListener((ActionEvent e) -> {
            AAdmin a = new AAdmin();
            dispose();
        });
        btnTambah.addActionListener((ActionEvent e) -> {
            Tambah b = new Tambah();
            dispose();
        });
        btnData.addActionListener((ActionEvent e) -> {
            AAdmin c = new AAdmin();
            dispose();
        });
        btnPetunjuk.addActionListener((ActionEvent e) -> {
            Petunad d = new Petunad();
            dispose();
        });
        btnKaryawan.addActionListener((ActionEvent e) -> {
            Karyawan d = new Karyawan();
            dispose();
        });

    }


}
