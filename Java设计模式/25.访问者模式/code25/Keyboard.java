package code25;

/**
 * @className: Keyboard
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
