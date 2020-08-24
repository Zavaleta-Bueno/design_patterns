package creacionales.objetos.singleton.paquetes_clase;

import java.util.EventListener;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;


public class Marco extends JFrame implements ActionListener {

    /**
	 *
	 */
	//private static final long serialVersionUID = 1L;
	public static int ANCHURA=500;
    public static int ALTURA=500;
    public static String TITULO = "Singleton";


    private final JTextField conteo;
    private final JButton crear_cuenta;
    private final JButton cerrar_cuenta;
    private int contador = 0;

    private CreateBankAccount account ;

    private EventListener listener;

    // constructor

    public Marco(){
        setSize(ANCHURA,ALTURA);
        setTitle(TITULO);
        
        //setLayout(new BorderLayout(24, 24));
        /*
        JLabel titulo = new JLabel(TITULO);
        titulo.setFont(new Font("TimesRoman",Font.BOLD,60));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        add(titulo,BorderLayout.CENTER);*/
        
        /*
        conteo= new JTextField();
        conteo.setBounds(120,10,150,20); 
        add(conteo);*/
        
        setLayout(null);
        conteo=new JTextField();
        conteo.setBounds(10,10,200,30);
        conteo.setText(String.valueOf(contador));
        add(conteo);
        
        crear_cuenta =new JButton("Aceptar");
        crear_cuenta.setBounds(10,80,100,30);
        add(crear_cuenta);
        crear_cuenta.addActionListener(this);
        
        cerrar_cuenta =new JButton("Cerrar");
        cerrar_cuenta.setBounds(160,80,100,30);
        add(cerrar_cuenta);        
        add(cerrar_cuenta);        
        cerrar_cuenta.addActionListener(this);
    }

    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
              
        if(e.getSource()==crear_cuenta){
            
            
            account= CreateBankAccount.getNewAccount();
            conteo.setText(String.valueOf(account.num_Account));
                       
        }
        
        if(e.getSource()==cerrar_cuenta){
            
            account.deleteAccount();
            
            conteo.setText(String.valueOf(account.num_Account));
                      
        }
        
        
    }
    
}