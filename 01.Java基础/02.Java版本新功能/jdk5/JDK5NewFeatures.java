import java.util.ArrayList;
// static import 静态引入，可以直接使用Math下所有的静态方法和属性。
import static java.lang.Math.*;

/**
 * @className: JDK5NewFeatures
 * @author: GuoShunFa
 * @date: 2022/12/8
 * @description: jdk5新特性
 **/
public class JDK5NewFeatures {

    public void newFeature1() {
        // 泛型 ----- 原来的写法 ArrayList list=new ArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
    }

    public void newFeature2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // 自动装箱/拆箱 ----- 原来的写法 int i=list.get(0).parseInt();
        int i = list.get(0);
    }

    public void newFeature3() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for-each(增强for) ----- 原来的写法 for( i=0;i<list.size();i++){......}
        for (Integer integer : list) {}
    }

    public void newFeature4() {
        // static import 静态引入
        sqrt(1d);
    }

}
