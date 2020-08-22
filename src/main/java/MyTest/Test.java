package MyTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.junit.experimental.max.CouldNotReadCoreException;

class Test implements Serializable {

    public static void main(String[] args) throws Exception {
        List<String> array = new ArrayList<String>();
        array.add("a1");
        array.add("a2");
        array.add("a3");
        array.add("a4");
//        System.out.println(array);
//        System.out.println(array);
//
        array.forEach(str -> {System.out.println(str);});
//        array = array.stream().map(a -> a = a + "b").collect(Collectors.toList());
//        System.out.println(array);
        
        for(int i = 0; i < array.size(); i++) {
            Consumer<String> str = new Consumer<String>() {
                @Override
                public void accept(String t) {
                    System.out.println(t);
                }
            };
            str.accept(array.get(i));
        }
    }

}
