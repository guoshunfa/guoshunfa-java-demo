package code25;

/**
 * @className: Mouse
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
