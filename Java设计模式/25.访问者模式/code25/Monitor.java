package code25;

/**
 * @className: Monitor
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
