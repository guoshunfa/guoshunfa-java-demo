package code28;

/**
 * @className: CompositeEntity
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
