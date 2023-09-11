package com.example.proxy;

/**
 * @author jackwu
 */
public class ProxyPatternDemo {
   
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
 
      // 图像将从磁盘加载
      image.display(); 
      // 图像不需要从磁盘加载
      image.display();  
   }
}
