package code20;

/**
 * @className: OctalObserver
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
