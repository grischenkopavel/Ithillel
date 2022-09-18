package lessons.mentor2;/*
Created by Pavel Gryshchenko on 08.08.2022
*/

public class Task2 {
    /**
     * Каждый смайлик должен содержать допустимую пару глаз. Глаза можно обозначить как : или ;
     * У смайлика может быть нос, но это не обязательно.
     * Допустимые символы для носа - или ~
     * У каждого улыбающегося лица должен быть улыбающийся рот, который должен быть отмечен либо ), либо D
     * Использование дополнительных символов не допускается, кроме упомянутых.
     * <p>
     * Примеры валидных смайлов:   :) :D ;-D :~)
     * Примеры невалидных смайлов: ;( :> :} :]
     * <p>
     * Пример
     * countSmileys ([":)", "; (", ";}", ":-D"]); // должен вернуть 2;
     * countSmileys (["; D", ":-(", ":-)", "; ~)"]); // должен вернуть 1;
     * countSmileys ([";]", ": [", "; *", ": $", ";-D"]); // должен вернуть 1;
     * Примечание
     * В случае пустого массива возвратите 0.
     * Порядок элементов лица (глаза, нос, рот) всегда будет одинаковым.
     */

    public static void main(String[] args) {
        //System.out.println(countSmileys(new String[]{":)", "; (", ";}", ":-D"}));
        String[] arr1 = {":)", "; (", ";}", ":-D"};
        String[] arr2 = {"; D", ":-(", ":-)", "; ~)"};
        String[] arr3 = {";]", ": [", "; *", ": $", ";-D"};
        String[] arr4 = {};
        System.out.println(countSmileys(arr1));
        System.out.println(countSmileys(arr2));
        System.out.println(countSmileys(arr3));
        System.out.println(countSmileys(arr4));


    }

    public static int countSmileys(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == ':' || arr[i].charAt(0) == ';') {
                if ((arr[i].charAt(1) == '-' || arr[i].charAt(1) == '~') && (arr[i].charAt(2) == ')' || arr[i].charAt(2) == 'D')) {
                    count++;
                } else if (arr[i].charAt(1) == ')' || arr[i].charAt(1) == 'D') {
                    count++;
                }
            }
        }
        return count;
    }
}
