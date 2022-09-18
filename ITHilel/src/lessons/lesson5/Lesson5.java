package lessons.lesson5;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        int[][] iTwoDimArr = new int[3][4];
        iTwoDimArr[0][0] = 5;
        iTwoDimArr[0][1] = 4;
        iTwoDimArr[0][2] = 4;
        iTwoDimArr[0][3] = 4;

        System.out.println(iTwoDimArr[0][1]);

        int[][] iTwoDimArr2 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};

        for (int i = 0; i < iTwoDimArr2.length; i++) {
            for (int j = 0; j < iTwoDimArr2[i].length; j++) {
                System.out.print(" " + iTwoDimArr2[i][j] + " ");
            }
            System.out.println();
        }
        //built-in method to display array
        int[][] iTwoDimArr3 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        System.out.println(Arrays.deepToString(iTwoDimArr3));

        sayHello();
        mySum(5, 6);
        mySum(2, 8);

        int iResult = mySumOut(5, 7);
        System.out.println("result is: " + iResult);

        sayNameAndAge("Pavel", 18);
    }

    //method in JAVA
    static void sayHello() {//method signature with params
        //method body
        System.out.println("Hello");
    }

    //get sum for two numbers
    static void mySum(int a, int b) {
        int iSum = a + b;
        System.out.println("Sum is " + iSum);
    }

    static int mySumOut(int a, int b) {
        int iSumOut = a + b;
        return iSumOut;
    }

    //return age and name
    static void sayNameAndAge(String name, int iAge) {
        System.out.println("Name is " + name + " and " + "my age is " + iAge);
    }
}
