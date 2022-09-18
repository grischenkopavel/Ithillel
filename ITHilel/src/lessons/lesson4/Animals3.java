package lessons.lesson4;

/*
Mentor lecture
в) Порахувати кількість ніг у кожного із наборів із розрахунку, що гуска має 2 ноги, а вівця чотири
Доповнити висновок на консоль:
“В хатинці є 1 гуска та 4 вівці. Кількість ніг = 18”
     “В хатинці є 2 гуски та 3 вівці. Кількість ніг = 16”
 */
public class Animals3 {
    public static void main(String[] args) {
        int shipCount = 4;
        int duckLeg = 2;
        int sheepLeg = 4;
        for (int i = 1; i < 5; i++) {
            String duckOne = "duck";
            String sheepOne = "sheep";
            if (i > 1) {
                duckOne = "ducks";
            }
            if (shipCount > 1) {
                sheepOne = "sheeps";
            }
            System.out.println("In building we have " + i + " " + duckOne + " " + shipCount + " " + sheepOne + " Number of legs " + (i * duckLeg + shipCount * sheepLeg));
            shipCount--;
        }
    }
}
