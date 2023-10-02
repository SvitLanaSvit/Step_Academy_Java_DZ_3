package org.example;

import org.example.array.Array;
import org.example.device.*;
import org.example.human.*;
import org.example.animal.*;
import org.example.money.*;
import org.example.musicalInstrument.*;

public class Main {
    public static void main(String[] args) {
        //Завдання 1:
        //Створити клас Human, що буде містити інформацію про людину.
        //За допомогою механізму наслідування, реалізувати клас Builder (містить інформацію про
        //будівельника), клас Sailor (містить інформацію про моряка), клас Pilot (містить інформацію про
        //льотчика).
        //Кожен з класів має містити необхідні методи для роботи.
        Builder builder = new Builder("John Builder", 35, "123 Construction St", "Carpenter");
        Sailor sailor = new Sailor("Sailor Sam", 28, "456 Ocean Ave", "S.S. Voyager");
        Pilot pilot = new Pilot("Captain Pilot", 40, "789 Sky High Rd", "Airbus A320");

        System.out.println(builder);
        System.out.println(sailor);
        System.out.println(pilot);

        builder.build();
        sailor.sail();
        pilot.fly();

        //Завдання 2:
        //Створити базовий клас “Тварина” і похідні класи “Тигр”, “Крокодил”, “Кенгуру”. За допомогою
        //конструктора встановити ім’я для кожної тварини і її характеристики.
        //Створити для кожного класу необхідні методи і поля.
        Tiger tiger = new Tiger("Simba", 5);
        Crocodile crocodile = new Crocodile("Snappy", 10);
        Kangaroo kangaroo = new Kangaroo("Jumpster", 3);

        System.out.println(tiger);;
        tiger.makeSound();
        tiger.eat();
        tiger.sleep();

        System.out.println();

        System.out.println(crocodile);;
        crocodile.makeSound();
        crocodile.eat();
        crocodile.sleep();

        System.out.println();

        System.out.println(kangaroo);;
        kangaroo.makeSound();
        kangaroo.eat();
        kangaroo.sleep();

        //Завдання 3:
        //Запрограмуйте клас Money (об’єкт класу оперує однією валютою) для роботи з грошима.
        //В класі має бути передбачене поле для зберігання цілої частини грошей(долари, євро, гривні) і поле для
        //зберігання копійок (центи, євроценти, копійки і т. д.)
        //Реалізувати методи для виводу суми на екран, заданих значень на для частин.
        //На базі класу Money створити клас Product для роботи з продуктом чи товаром. Реалізувати метод, що
        //дозволяє зменшити ціну на задане число.
        //Для кожного класу реалізувати необхідні методи і поля.
        Money initialMoney = new Money(20, 50);
        Money reduction = new Money(5, 75);
        Product product = new Product("Example Product", initialMoney);
        System.out.println(product);
        product.reducePrice(reduction.getDollars(), reduction.getCents());
        System.out.println("\nAfter Price Reduction:");
        System.out.println(product);

        //Завдання 4:
        //Створити базовий клас «Пристрій» і похідні класи «Чайник», «Мікрохвильовка», «Автомобіль»,
        //«Пароплав». За допомогою конструктора встановити ім’я кожного пристрою і його характеристики.
        //Реалізуйте для кожного з класів методи:
        // Sound – видає звук пристрою (пишемо текстом в консоль)
        // Show – відображає назву пристрою
        // Desc – відображає опис пристрою
        Kettle kettle = new Kettle();
        Microwave microwave = new Microwave();
        Car car = new Car();
        Steamer steamer = new Steamer();

        kettle.show();
        kettle.makeSound();
        kettle.getDesc();
        System.out.println();

        microwave.show();
        microwave.makeSound();
        microwave.getDesc();
        System.out.println();

        car.show();
        car.makeSound();
        car.getDesc();
        System.out.println();

        steamer.show();
        steamer.makeSound();
        steamer.getDesc();

        //Завдання 5:
        //Створіть базовий клас “Музичний інструмент” і похідні класи “Скрипка”, “Тромбон”, “Укулеле”,
        //“Віолончель”. З допомогою конструктора встановити ім’я кожного музичного інструменту і його
        //характеристики.
        //Реалізуйте для кожного з класів методи:
        // Sound – видає звук музичного інструменту (пишемо текстом в консоль)
        // Show – відображає назву музичного інструмента
        // Desc – відображає опис музичного інструмента
        // History – відображає історію створення музичного інструмента
        Violin violin = new Violin();
        Trombone trombone = new Trombone();
        Ukulele ukulele = new Ukulele();
        Cello cello = new Cello();

        violin.show();
        violin.makeSound();
        violin.getDesc();
        violin.getHistory();
        System.out.println();

        trombone.show();
        trombone.makeSound();
        trombone.getDesc();
        trombone.getHistory();
        System.out.println();

        ukulele.show();
        ukulele.makeSound();
        ukulele.getDesc();
        ukulele.getHistory();
        System.out.println();

        cello.show();
        cello.makeSound();
        cello.getDesc();
        cello.getHistory();
        System.out.println();

        //Завдання 6:
        //Створіть інтерфейс IMath. В ньому має бути три методи:
        // int Max() – повертає максимум
        // int Min() – повертає мінімум
        // float Avg() – повертає середнє арифметичне
        //Клас Array, створений раніше, повинен імплементувати інтерфейс IMath.
        //Метод Max – повертає максимум серед елементів масиву.
        //Метод Min – повертає мінімум серед елементів масив.
        //Метод Avg – повертає середнє арифметичне серед елементів масиву.
        //Напишіть код для тестування отриманого функціоналу.
        int[] myArray = { 1, 2, 3, 4, 5 };
        Array array = new Array(myArray);
        array.Print();
        System.out.println("Max: " + array.Max());
        System.out.println("Min: " + array.Min());
        System.out.println("Average: " + array.Avg());

        //Завдання 7:
        //Створіть інтерфейс ISort. В ньому мають бути два методи
        // void SortAsc() – сортування по зростанню
        // void SortDesc() – сортування по спаданню
        //Клас Array, створений раніше, повинен імплементувати інтерфейс ISort.
        //Метод SortAsc – сортує масив по зростанню.
        //Метод SortDesc – сортує масив по спаданню.
        //Напишіть код для тестування отриманої функціональності
        int[] myArray2 = { 1, 2, 5, 4, 3 };
        Array array2 = new Array(myArray2);
        array2.Print();

        array2.SortAsc();
        array2.Print();
        array2.SortDesc();
        array2.Print();
    }
}