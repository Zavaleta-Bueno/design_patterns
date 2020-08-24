package creacionales.objetos.actract_factory.paquete_clases;
import creacionales.objetos.actract_factory.interfaces.*;

public abstract class MotorHomeAbstractFactory {
    public abstract Frame createFrame();
    public abstract Style createStyle();
    public abstract Engine createEngine();
    public abstract Kitchen createKitchen();
    
}