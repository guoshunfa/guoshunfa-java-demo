package code24;

/**
 * @className: TemplatePatternDemo
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
