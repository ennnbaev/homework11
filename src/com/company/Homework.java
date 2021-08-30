package com.company;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int massSize;
        System.out.println("Введите размер массива");
        while (true) {
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
            System.out.println("Введите значения массива");
            while (true) {
                try {
                    String input3 = scanner.nextLine();
                    mass[i]=Integer.parseInt(input3);
                    break;
                } catch (NumberFormatException exception){
                    System.out.println(exception.getMessage());
                }
            }
        }
        System.out.println("Введите два индекса массива");
        while (true) {
            try {
                String input = scanner.nextLine();
                String input2 = scanner.nextLine();
                int b=Integer.parseInt(input);
               int g= Integer.parseInt(input2);
                System.out.println(mass[b]/mass[g]);
                break;
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }

        }}
}
