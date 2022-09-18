package lessons.lesson4;

/*
mentor lecture
Ми маємо хатинку в Карпатах і 5 домашніх тварин: гуски та вівці.
Кількість гусок та овець з цих 5ти тварин невідомо.
Вивести усі комбінації гусок та овець із 5ти тварин, за умовою, що мінімальна
кількість гусок та овець у кожному наборі дорівнює одному. Треба вирішити задачу за допомогою циклів.
Наприклад:
“У хатинці маємо 1 гуску та 4 вівці”
“У хатинці маємо 2 гуски та 3 вівці”
  a) закінчення в словах змінюється в залежності від
   кількості гусок та вівців
 */
public class Animals2 {
    public static void main(String[] args) {
        int shipCount = 4;
        for (int i = 1; i < 5; i++) {
            String duckOne = "duck";
            String sheepOne = "sheep";
            if (i > 1) {
                duckOne = "ducks";
            }
            if (shipCount > 1) {
                sheepOne = "sheeps";
            }
            System.out.println("In building we have " + i + " " + duckOne + " " + shipCount-- + " " + sheepOne);
        }
    }
}
