package Lesson1;

import com.sun.javafx.image.BytePixelSetter;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -5, b = -3, c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void  printColor() {
        int Value = 100;
        if (Value<=0) {
            System.out.println("Красный");
        }
        if (Value>0 && Value <= 100) {
            System.out.println("Желтый");
        }
        if (Value>100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 2, b = 5;
        if (a>=b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}