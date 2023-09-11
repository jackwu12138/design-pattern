package com.example.iterator;

/**
 * @author jackwu
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        String[] names = new String[]{
                "jack", "tom", "dany", "why"
        };
        NameRepository<String> ns = new NameRepository<>(names);

        for (var itor = ns.getIterator(); itor.hasNext(); ) {
            System.out.println(itor.next());
        }
    }
}
