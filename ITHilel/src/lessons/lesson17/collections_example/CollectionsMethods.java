package lessons.lesson17.collections_example;/*
Created by Pavel Gryshchenko on 19.09.2022
*/

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class CollectionsMethods {
    public static void main(String[] args) {
        String[] str = {"red", "blue", "green"};
        List<String> list = Arrays.asList(str);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        List<Integer> integerList = Arrays.asList(1,2,3,4,3);
        System.out.println(Collections.max(integerList));
        System.out.println(Collections.min(integerList));


    }
}
