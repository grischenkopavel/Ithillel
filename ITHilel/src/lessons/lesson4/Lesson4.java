package lessons.lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        //switch example
//        System.out.println("Input num 12, 24 or 35");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        switch (number){
//            case 12:
//                System.out.println("Your number is 12");
//                break;
//            case 24:
//                System.out.println("Your number is 24");
//                break;
//            case 35:
//                System.out.println("Your number is 35");
//                break;
//            default:
//                System.out.println("Your number is wrong");
//        }
        //Arrays
        //int array
//        int[] arrayInt = {1, 2, 3, 4};
//
//        int arrayIntLength = arrayInt.length;
//        System.out.println("Array arrayIntLength Lenght is: " + arrayIntLength);
//
//        System.out.println("Array element is " + arrayInt[1]);

        //String[] arrayStr = {"Hello", "World"};

        //empty array
//        int[] arrayEmpty = new int[3];
//        arrayEmpty[0] = 5;
//        arrayEmpty[1] = 66;
//        arrayEmpty[2] = 58;
//        System.out.println("Array element is: " + arrayEmpty[0]);

        //by default new array will be initialied as
        //int[] = 0
        //String[] = null
        //boolean = false
        //float, double = 0.0

        //cycles "while"
//        int i = 1;
//        while (i < 8) {
//            System.out.println("i is " + i);
//        i++;
//        }
//        //int[] arrayInt = {1, 2, 3, 4};
//        int i = 100;
//        while (i >= 10) {
//            System.out.println("reverce cycle " + i);
//            i -= 10;
//        }
        //cycles "do-while"
//        int iIn = 1;
//        do {
//            iIn++;
//            System.out.println(iIn);
//        }while (iIn < 0);
        //cycle "for"
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Pavel" + i);
//        }

//        for (int i = 3; i >= -5; i--) {
//            System.out.println("Pavel" + i);
//        }

        int[] arrayIntNum = {2, 3, 4};
//        for (int i = 0; i < arrayIntNum.length; i++){
//            System.out.println("Array element " + arrayIntNum[i]);
        //cycle "for each"
        for (int tmp : arrayIntNum) {
            System.out.println(tmp);
        }
    }
}

