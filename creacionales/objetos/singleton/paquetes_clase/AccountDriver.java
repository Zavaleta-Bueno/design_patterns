package creacionales.objetos.singleton.paquetes_clase;

import javax.swing.JFrame;

public class AccountDriver {
    public static void main (String[] args) {

        Marco marco = new Marco();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setResizable(false);
        marco.setVisible(true);

        System.out.println("\n\nBank Account Number Generation System");

        //crear primera cuenta
        //CreateBankAccount account1 = CreateBankAccount.getNewAccount();

        //crear segunda cuenta cuenta
        //CreateBankAccount account2 = CreateBankAccount.getNewAccount();
    }
}