package ru.spbstu.telematics.java;

public class App 
{
    public static void main(String[] args) {
        int[] vectorA = {1, 2, -3, 7};
        int[] vectorB = {4, -2, 6};

        System.out.print("Вектор A: ");
        printVector(vectorA);
        System.out.print("Вектор B: ");
        printVector(vectorB);
    
        try {
            int scalarProduct = calculateScalarProduct(vectorA, vectorB);
            System.out.println("Скалярное произведение: " + scalarProduct);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void printVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static int calculateScalarProduct(int[] vectorA, int[] vectorB) throws IllegalArgumentException
    {
        if (vectorA.length != vectorB.length) {
            throw new IllegalArgumentException("Исключение: векторы должны иметь одинаковую длину!");
        }
        if (vectorA.length == 0) {
            throw new IllegalArgumentException("Исключение: векторы не могут быть пустыми!");
        }
        int scalarProduct = 0;
        for (int i = 0; i < vectorA.length; i++) {
            scalarProduct += vectorA[i] * vectorB[i];
        }
        return scalarProduct;
    }  
}
