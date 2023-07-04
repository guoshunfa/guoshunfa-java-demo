package code20;

/**
 * @className: BinaryObserver
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
