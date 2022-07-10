package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2, 2);


        int dd = calc.multyply.apply(2, 2);

        int ppp = calc.pow.apply(3);
        int absolut = calc.abs.apply(-5);

        boolean pred = calc.isPositive.test(-10);

        System.out.print("plus: 1 + 2 = ... ");
        calc.println.accept(a);

        System.out.print("minus: 1 - 2 = ... ");
        calc.println.accept(b);

        try {
            int c = calc.devide.apply(a, b);
            System.out.print("devide: " + a + " / " + b + " = ... ");
            calc.println.accept(c);
        } catch (RuntimeException ex) {
            System.out.println("НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ!");
        }

        System.out.print("multiply: 2 * 2 = ... ");
        calc.println.accept(dd);

        System.out.print("pow: 3 * 3 = ... ");
        calc.println.accept(ppp);

        System.out.print("abs: |-5| = ... ");
        calc.println.accept(absolut);
        //calc.println.accept(pred); - не сработает.

        //Так как выражение println ждет на вход переменную типа  int, то простейший способ
        // для вывода в консоль логическиого выражения - создать для этого отдельный оператор.
        System.out.print("isPositive: -10 = ... ");
        calc.printlnBool.accept(pred);

    }
}