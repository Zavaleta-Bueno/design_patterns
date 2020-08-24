package design.singleton;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author AsistenteBI
 */
public class Marco extends JFrame implements ActionListener {
    public static int ANCHURA=500;
    public static int ALTURA=500;
    public static String TITULO = "Singleton";
    private int contador=0;
    //private List<Sesion> usuario;
    
    
    private EventListener listener;
    private JTextField conteo;  
    private JButton abrir;
    private JButton cerrar;
    
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
        
        abrir =new JButton("Aceptar");
        abrir.setBounds(10,80,100,30);
        add(abrir);
        abrir.addActionListener(this);
        
        cerrar =new JButton("Cerrar");
        cerrar.setBounds(160,80,100,30);
        add(cerrar);        
        cerrar.addActionListener(this);
    }

    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
              
        if(e.getSource()==abrir){
            contador++;
            conteo.setText(String.valueOf(contador));
                       
        }
        
        if(e.getSource()==cerrar){
            contador--;
            conteo.setText(String.valueOf(contador));
                      
        }
        
        
    }
    
    
    
}
