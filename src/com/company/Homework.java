package com.company;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int massSize;
        while (true) {
            System.out.println("Введите размер массива");
            try {
                String input = scanner.nextLine();
                massSize=Integer.parseInt(input);
                break;
            } catch (NumberFormatException exc) {
                System.out.println(exc.getMessage());
            }
        }
        int[] mass=new int[massSize];
        for (int i=0;i<mass.length;i++){
            while (true) {
                System.out.println("Введите значения массива");
                try {
                    String input = scanner.nextLine();
                    mass[i]=Integer.parseInt(input);
                    break;
                } catch (NumberFormatException exception){
                    System.out.println(exception.getMessage());
                }
            }
        }
        while (true) {
            System.out.println("Введите два индекса массива");
            try {
                String input = scanner.nextLine();
                String input2 = scanner.nextLine();
                System.out.println(mass[Integer.parseInt(input)]/mass[Integer.parseInt(input2)]);
                break;
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }
        }}
}
