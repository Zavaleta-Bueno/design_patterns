package creacionales.objetos.actract_factory.TypeB;

import creacionales.objetos.actract_factory.interfaces.Engine;
import creacionales.objetos.actract_factory.interfaces.Frame;
import creacionales.objetos.actract_factory.interfaces.Kitchen;
import creacionales.objetos.actract_factory.interfaces.Style;
import creacionales.objetos.actract_factory.paquete_clases.MotorHomeAbstractFactory;

public class TypeBFactory extends MotorHomeAbstractFactory {

    @Override
    public Frame createFrame() {
        // TODO Auto-generated method stub
        return new TypeBFrame();
    }

    @Override
    public Style createStyle() {
        // TODO Auto-generated method stub
        return new TypeBStyle();
    }

    @Override
    public Engine createEngine() {
        // TODO Auto-generated method stub
        return new TypeBEngine();
    }

    @Override
    public Kitchen createKitchen() {
        // TODO Auto-generated method stub
        return new TypeBKitchen();
    }
    
}