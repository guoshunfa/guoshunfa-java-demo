package code25;

/**
 * @className: ComputerPart
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
