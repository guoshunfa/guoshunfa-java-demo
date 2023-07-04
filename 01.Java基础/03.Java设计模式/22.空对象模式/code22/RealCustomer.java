package code22;

/**
 * @className: RealCustomer
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
