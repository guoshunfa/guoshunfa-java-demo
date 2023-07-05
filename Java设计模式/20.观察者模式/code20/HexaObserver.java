package code20;

/**
 * @className: HexaObserver
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
