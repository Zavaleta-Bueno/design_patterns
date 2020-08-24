package creacionales.objetos.actract_factory.TypeC;

import creacionales.objetos.actract_factory.interfaces.Engine;
import creacionales.objetos.actract_factory.interfaces.Frame;
import creacionales.objetos.actract_factory.interfaces.Kitchen;
import creacionales.objetos.actract_factory.interfaces.Style;
import creacionales.objetos.actract_factory.paquete_clases.MotorHomeAbstractFactory;

public class TypeCFactory extends MotorHomeAbstractFactory {

    @Override
    public Frame createFrame() {
        // TODO Auto-generated method stub
        return new TypeCFrame();
    }

    @Override
    public Style createStyle() {
        // TODO Auto-generated method stub
        return new TypeCStyle();
    }

    @Override
    public Engine createEngine() {
        // TODO Auto-generated method stub
        return new TypeCEngine();
    }

    @Override
    public Kitchen createKitchen() {
        // TODO Auto-generated method stub
        return new TypeCKitchen();
    }
    
}