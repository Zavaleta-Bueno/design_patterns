package creacionales.objetos.actract_factory.paquete_clases;

import creacionales.objetos.actract_factory.TypeA.TypeAFactory;
import creacionales.objetos.actract_factory.TypeA.TypeAFrame;
import creacionales.objetos.actract_factory.TypeB.TypeBFactory;
import creacionales.objetos.actract_factory.TypeC.TypeCFactory;
import creacionales.objetos.actract_factory.interfaces.Engine;
import creacionales.objetos.actract_factory.interfaces.Frame;
import creacionales.objetos.actract_factory.interfaces.Kitchen;
import creacionales.objetos.actract_factory.interfaces.Style;


public class MotorHomeDriver   {
    public static void main(String[] args){
        MotorHomeAbstractFactory mhFactory = null;

        String nextMotorHome = "TypeA"; // entrada de usuario simulada
        if (nextMotorHome.equals("TypeA")){
            System.out.println("\nType A motor home selected");
            mhFactory = new TypeAFactory();
        }  else if (nextMotorHome.equals("TypeB")) {
            System.out.println("\nType B motor home selected");
            mhFactory = new TypeBFactory();
        }  else if (nextMotorHome.equals("TypeC")) {
            System.out.println("\nType C motor home selected");
            mhFactory = new TypeCFactory();
        } else {
            System.out.println("Invalid motor home type entered.");
        }

        // Crear componentes para autocaravanas
        Style mhStyle = mhFactory.createStyle();
        Frame mhFrame = mhFactory.createFrame();
        Engine mhEngine = mhFactory.createEngine();
        Kitchen mhKitchen = mhFactory.createKitchen();

        //salida
        System.out.println("\nComponent list for " + nextMotorHome
        + " motor home");

        System.out.println(mhStyle.getStyle());
        System.out.println(mhFrame.getFrame());
        System.out.println(mhEngine.getEngine()); 
        System.out.println(mhKitchen.getKitchen());

    }
}