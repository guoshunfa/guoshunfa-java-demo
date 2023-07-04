package code13.service.impl;

import code13.service.Image;

/**
 * @className: RealImage
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
