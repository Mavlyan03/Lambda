package com.company;

import java.util.Scanner;
import java.util.function.UnaryOperator;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextInt();

        System.out.println(sqrt(number));
    }

    public static UnaryOperator<Double> sqrt = number -> Math.sqrt(number);
}
