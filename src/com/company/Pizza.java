package com.company;

public class Pizza {
    public Circle basis;
    public String composition;
    public String name;
    public int cost;

    @Override
    public String toString() {
        return "Наименование Пиццы: " + "Название: " + "<" + name + ">" + "." +
                "   Размер: " + basis + " см. " +
                "   Состав: " + composition + "." +
                "   Цена за 500 гр. = " + cost + " грн." + "\n";
    }


    public Pizza(Circle basis, String composition, String name, int cost) {
        this.basis = basis;
        this.composition = composition;
        this.name = name;
        this.cost = cost;

        Circle diameter = new Circle(4);
    }

    /**
     * @autor: Довженко Денис
     * В классе Pizza создаются поля пиццы, расчитываем диаметр пиццы, а также создаем конструктор.
     * @version Pizza 3.1
     */
    }

//        2 Создание комплексного класса.
//        2.1 Создать класс Pizza. Описать поля:
//        basis – поле типа Circle
//        composition – состав пиццы
//        name – название пиццы
//        cost – цена.
//        2.2 Создать конструктор, который принимает в качестве параметров имя, состав, цену и
//        диаметр пиццы. Внутри конструктора создать объект класса Circle применив диаметр.

