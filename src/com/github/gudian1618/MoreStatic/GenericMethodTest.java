package com.github.gudian1618.MoreStatic;

/**
 * @param
 * @author gudian1618
 * @version v1.0
 * @date 2019/7/27 10:44
 * @description
 */
public class GenericMethodTest {
    
    public static <E> void printArray(E[] inputArray) {
        for (E element: inputArray) {
            System.out.printf("%s",element);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','J','K','U','P'};
        System.out.println("\n双精度");
    }
}
