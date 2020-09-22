package com.company;

import java.util.Arrays;

public class Pizzeria {

    public static void main(String[] args) {
        Circle basis = new Circle (30);
        Pizza meat = new Pizza(30, "Мясо, сыр, помидор", "Мясная", 101);
        Pizza chicken = new Pizza(20, "Курица, грибы, огурец", "Куриная", 120);
        Pizza vegetable = new Pizza(15, "Ананас, огурец, помидор, грибы", "Овощная", 88);
        Pizza[] pizza = {meat, chicken, vegetable};
        for (Pizza p : pizza);

        System.out.println(java.util.Arrays.toString(pizza).replace("[", "").replace("]", "").replace(",", " - "));
    /**
     * @author Довженко Денис
     * В классе Pizzeria создаем массив из 3-х пицц. Затем выводим в цикл информацию о каждой пицце.
     * @version Pizzeria 4.1
     */
    }
}

//        2.3 Создать класс Pizzeria c методом main в котором создать массив из разных пицц.
//        2.4 Вывести в цикле информацию о каждой пицце.
//        2.5 Написать JavaDoc для всех классов.