package code5.cache;

import code5.service.Shape;
import code5.service.impl.Circle;
import code5.service.impl.Rectangle;
import code5.service.impl.Square;

import java.util.Hashtable;

/**
 * @className: ShapeCache
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
