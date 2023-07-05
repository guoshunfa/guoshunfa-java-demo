package code2.factory;

/**
 * @className: FactoryProducer
 * @author: GuoShunFa
 * @date: 2022/12/7
 **/
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
