package com.example.proxy;

/**
 * @author jackwu
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private final String filename;


    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (this.realImage == null) {
            this.realImage = new RealImage(this.filename);
        }
        this.realImage.display();
    }
}
