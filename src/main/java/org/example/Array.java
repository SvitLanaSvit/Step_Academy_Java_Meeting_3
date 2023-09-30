package org.example;

public class Array implements IShow{
    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void Print() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    @Override
    public void Print(String info) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nInfo: " + info);
    }
}
