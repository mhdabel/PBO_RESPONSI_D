package Gajikaryawan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Karyawan extends JFrame{


    JButton btnHome = new JButton("Home");
    JButton btnGaji = new JButton("Gaji");
    JButton btnData = new JButton("Data");
    JButton btnPetunjuk= new JButton("Petunjuk");
    JButton btnAdmin = new JButton("Admin");
    JTextArea teks = new JTextArea(" Selamat Datang\n Silahkan masuk ke menu gaji untuk perhitungan gaji.\n Jika mengalami kesulitan klik menu petunjuk");
    JLabel Footer = new JLabel("APLIKASI PERHITUNGAN GAJI PT. OK");

    public Karyawan(){
        super("window");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(850,580);
        setLocation(225,75);



        add(btnHome);
        btnHome.setBounds(10,20,120,70);
        add(btnGaji);
        btnGaji.setBounds(10,100,120,70);
        add(btnData);
        btnData.setBounds(10,180,120,70);
        add(btnPetunjuk);
        btnPetunjuk.setBounds(10,260,120,70);
        add(btnAdmin);
        btnAdmin.setBounds(700,20,120,70);
        add(teks);
        teks.setBounds(150, 100, 600, 300);
        teks.setLineWrap(true);
        teks.setWrapStyleWord(true);
        teks.setFont(new Font("Arial", Font.BOLD, 18));
        add(Footer);
        Footer.setBounds(250, 500, 600, 50);
        Footer.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));


        btnHome.addActionListener((ActionEvent e) -> {
            Karyawan a = new Karyawan();
            dispose();
        });
        btnGaji.addActionListener((ActionEvent e) -> {
            Gajika b = new Gajika();
            dispose();
        });
        btnData.addActionListener((ActionEvent e) -> {
            Dataka c = new Dataka();
            dispose();
        });
        btnPetunjuk.addActionListener((ActionEvent e) -> {
            Petunka d = new Petunka();
            dispose();
        });
        btnAdmin.addActionListener((ActionEvent e) -> {
            AAdmin d = new AAdmin();
            dispose();
        });

    }


}
