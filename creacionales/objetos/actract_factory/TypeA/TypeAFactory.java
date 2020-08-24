package creacionales.objetos.actract_factory.TypeA;

import creacionales.objetos.actract_factory.interfaces.*;

import creacionales.objetos.actract_factory.paquete_clases.*;

public class TypeAFactory extends MotorHomeAbstractFactory{

    @Override
    public Frame createFrame() {
        // TODO Auto-generated method stub
        return new TypeAFrame();

    }

    @Override
    public Style createStyle() {
        // TODO Auto-generated method stub
        return new TypeAStyle();
    }

    @Override
    public Engine createEngine() {
        // TODO Auto-generated method stub
        return new TypeAEngine();
    }

    @Override
    public Kitchen createKitchen() {
        // TODO Auto-generated method stub
        return new TypeAKitchen();
    }
    
}