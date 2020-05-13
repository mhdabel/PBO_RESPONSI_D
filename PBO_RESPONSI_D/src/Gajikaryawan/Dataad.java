package Gajikaryawan;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Dataad extends JFrame{

    Connection koneksi;
    Statement statement;

    JButton btnHome = new JButton("Home");
    JButton btnTambah = new JButton("Tambah");
    JButton btnData = new JButton("Data");
    JButton btnPetunjuk= new JButton("Petunjuk");
    JButton btnKaryawan = new JButton("karyawan");

    JButton btnShow = new JButton("Show");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");

    JLabel Footer = new JLabel("APLIKASI PERHITUNGAN GAJI PT. OK");

    JTable tabel;
    DefaultTableModel tabelModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID","Nama","Alamat","No hp","Posisi","Gaji"};

    public Dataad(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/responsi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            koneksi = DriverManager.getConnection(url, "root", "");
            statement = koneksi.createStatement();
            System.out.println("Koneksi Berhasil");
        }catch(ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setSize(850,580);
        setLocation(225,75);

        tabelModel = new DefaultTableModel (namaKolom,0);
        tabel = new JTable(tabelModel);
        scrollPane = new JScrollPane(tabel);

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
        add(btnUpdate);
        btnUpdate.setBounds(200,400,120,70);
        add(btnShow);
        btnShow.setBounds(350,400,120,70);
        add(btnDelete);
        btnDelete.setBounds(500,400,120,70);

        add(Footer);
        Footer.setBounds(250, 500, 600, 50);
        Footer.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));

        add(scrollPane);
        scrollPane.setBounds(150,100,600,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        btnHome.addActionListener((ActionEvent e) -> {
            Admin a = new Admin();
            dispose();
        });
        btnTambah.addActionListener((ActionEvent e) -> {
            Tambah b = new Tambah();
            dispose();
        });
        btnData.addActionListener((ActionEvent e) -> {
            Dataad c = new Dataad();
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

        btnShow.addActionListener((ActionEvent e) -> {
            String[][] dataAdmin = this.readAdmin();
            tabel.setModel(new JTable(dataAdmin,namaKolom).getModel());
        });

        tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                int baris = tabel.getSelectedRow();
                int kolom = tabel.getSelectedColumn();
                String dataterpilih = tabel.getValueAt(baris, 0).toString();
                btnDelete.addActionListener((ActionEvent f) -> {
                    deleteKaryawan(dataterpilih);

                });
                btnUpdate.addActionListener((ActionEvent f) -> {
                    Update b = new Update(dataterpilih);

                });
            }
        });

    }
    int getBanyakData() {
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "SELECT * from `admin`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL error");
            return 0;
        }
    }

    String[][] readAdmin() {
        try{
            int jmlData = 0;
            String data[][]=new String[getBanyakData()][6];
            String query = "Select * from `admin` ";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                data[jmlData][0] = resultSet.getString("ID_A");
                data[jmlData][1] = resultSet.getString("Nama_A");
                data[jmlData][2] = resultSet.getString("Alamat_A");
                data[jmlData][3] = resultSet.getString("No_hp_A");
                data[jmlData][4] = resultSet.getString("Posisi_A");
                data[jmlData][5] = resultSet.getString("Gaji_A");

                jmlData++;
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL error");
            return null;
        }
    }

    void deleteKaryawan(String id) {
        try{
            String query = "DELETE FROM `admin` WHERE `ID_A` = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "berhasil dihapus" );
        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }

}
