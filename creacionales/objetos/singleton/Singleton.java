package creacionales.objetos.singleton;


import javax.swing.JFrame;
public class Singleton{
    public static  void main(String[] args) {
        System.out.println("EE");
        Marco marco = new Marco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setResizable(false);
        marco.setVisible(true);
    }
}