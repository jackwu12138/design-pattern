package com.example.proxy;

/**
 * @author jackwu
 */
public class RealImage implements Image {

    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("display::" + filename);
    }

    public void loadFromDisk(){
        System.out.println("loading::"+filename);
    }
}
