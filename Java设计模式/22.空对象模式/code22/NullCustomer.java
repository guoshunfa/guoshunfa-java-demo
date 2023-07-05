package code22;

/**
 * @className: NullCustomer
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
