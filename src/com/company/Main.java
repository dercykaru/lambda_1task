package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 2);
        int c = calc.devide.apply(a, b);

        int dd = calc.multyply.apply(2, 2);

        int ppp = calc.pow.apply(3);
        int absolut = calc.abs.apply(-5);

        boolean pred = calc.isPositive.test(-10);

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(dd);
        calc.println.accept(ppp);
        calc.println.accept(absolut);
        //calc.println.accept(pred); - не сработает.

        //Так как выражение println ждет на вход перемнную типа  int, то простейший способ
        // для вывода в консоль логическиого выражения - создать для этого отдельный оператор.
        calc.printlnBool.accept(pred);

    }
}