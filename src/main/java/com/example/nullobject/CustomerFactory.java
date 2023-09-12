package com.example.nullobject;

/**
 * @author jackwu
 */
public class CustomerFactory {

    public static final String[] names = new String[]{"tom", "dany", "jack"};

    public static AbstractCustomer getCustomer(String name){
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer(name);
    }

}
