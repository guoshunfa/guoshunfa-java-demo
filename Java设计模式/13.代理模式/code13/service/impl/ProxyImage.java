package code13.service.impl;

import code13.service.Image;

/**
 * @className: ProxyImage
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
