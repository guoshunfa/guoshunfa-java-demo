package code25;

/**
 * @className: ComputerPartVisitor
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}

