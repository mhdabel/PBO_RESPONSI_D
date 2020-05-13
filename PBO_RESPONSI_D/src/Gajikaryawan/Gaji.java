package Gajikaryawan;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Gaji {

    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan g = new Karyawan();
        //HomeAdmin g = new HomeAdmin();
    }

}


class Admin extends JFrame {
    String pass="admin";
    final JTextField fuser = new JTextField(10);
    final JPasswordField fpass = new JPasswordField(10);

    JLabel luser = new JLabel(" Username ");
    JLabel lpass = new JLabel(" Password ");
    JButton btnOk = new JButton("Login");
    JButton btnCancel = new JButton("Cancel");

    public Admin() {

        setTitle("LOGIN");
        setDefaultCloseOperation(3);
        setSize(350,200);
        setLocation(500,275);
        setLayout(null);
        add(luser);
        add(fuser);
        add(lpass);
        add(fpass);
        add(btnOk);
        add(btnCancel);
        luser.setBounds(10,15,120,20);
        fuser.setBounds(140,10,150,30);
        lpass.setBounds(10,55,120,20);
        fpass.setBounds(140,50,150,30);
        btnOk.setBounds(130,100,100,30);

        btnCancel.setBounds(235,100,100,30);
//btnCancel.setBackground(new java.awt.Color(255,0,0));

        btnCancel.addActionListener((ActionEvent e) -> {
            Karyawan a = new Karyawan();
            dispose();
        });

        btnOk.addActionListener((ActionEvent e) -> {
            if(fuser.getText().equalsIgnoreCase("admin") && pass.equalsIgnoreCase(fpass.getText()))
            {   JOptionPane.showMessageDialog(null, "Berhasil Login");
                AAdmin g = new AAdmin();

                dispose();}
            else
            {
                JOptionPane.showMessageDialog(null, "username atau password salah");
            }

        });
        setVisible(true);
    }
}
