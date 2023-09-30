package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Завдання 2:
        //Створіть клас підрахунку площі геометричних фігур. Клас повинен надавати функціональність для
        //підрахунку площі трикутника по різних формулах, площі прямокутника, площі квадрата, площі ромба.
        //Методи класу для підрахунку площі повинні бути реалізовані за допомогою статичних методів. Також клас
        //повинен рахувати кількість підрахунків площ і повертати це значення за допомогою статичного методу.
        double triangleArea1 = ShapeAreaCalculator.calculateTriangleArea(4.0, 6.0);
        double triangleArea2 = ShapeAreaCalculator.calculateTriangleArea(5.0, 7.0, 8.0);
        double rectangleArea = ShapeAreaCalculator.calculateRectangleArea(4.0, 6.0);
        double squareArea = ShapeAreaCalculator.calculateSquareArea(5.0);
        double rhombusArea = ShapeAreaCalculator.calculateRhombusArea(8.0, 10.0);

        ShapeAreaCalculator sac = new ShapeAreaCalculator();
        System.out.println("Triangle Area 1: " + triangleArea1);
        System.out.println("Triangle Area 2: " + triangleArea2);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Rhombus Area: " + rhombusArea);
        System.out.println("Number of Area Calculations: " + sac.getNumberOfCalculations());

        //Завдання 3:
        //Створіть клас для підрахунку максимуму із чотирьох аргументів, мінімуму із чотирьох аргументів,
        //середнього арифметичного із чотирьох аргументів, факторіала аргументу. Функціональність потрібно
        //реалізувати в вигляді статичного методу.
        int a = 5, b = 9, c = 3, d = 7;
        int max = MathOperations.maxOfFour(a, b, c, d);
        System.out.println("Maximum: " + max);

        int min = MathOperations.minOfFour(a, b, c, d);
        System.out.println("Minimum: " + min);

        double mean = MathOperations.arithmeticMean(a, b, c, d);
        System.out.println("Arithmetic Mean: " + mean);

        int n = 5;
        long factorialResult = MathOperations.factorial(n);
        System.out.println("Factorial of " + n + ": " + factorialResult);

        //Завдання 4:
        //Створіть клас Human, що буде містити інформацію про людину.
        //За допомогою механізму наслідування, реалізуйте клас Builder (містить інформацію про будівельника),
        //клас Sailor (містить інформацію про моряка), клас Pilot (містить інформацію про пілота).
        //Кожен клас повинен містити необхідні для роботи методи
        Builder builder = new Builder("John Builder", 35, "123 Construction St", "Carpenter");
        Sailor sailor = new Sailor("Sailor Sam", 28, "456 Ocean Ave", "S.S. Voyager");
        Pilot pilot = new Pilot("Captain Pilot", 40, "789 Sky High Rd", "Airbus A320");

        System.out.println(builder);
        System.out.println(sailor);
        System.out.println(pilot);

        builder.build();
        sailor.sail();
        pilot.fly();

        //Завдання 5:
        //Створіть клас Passport (паспорт), що буде містити паспортну інформацію про громадянина заданої
        //країни.
        //За допомогою механізму наслідування, реалізуйте клас ForeignPassport (закордонний паспорт)
        //похідний від Passport.
        //2
        //Нагадаємо, що закордонний паспорт містить окрім паспортних даних, також дані про візи, номер
        //закордонного паспорта.
        //Кожен із класів має містити необхідні методи.
        ForeignPassport foreignPassport = new ForeignPassport(
                "AB123456",
                "John Doe",
                LocalDate.of(1990, 5, 15),
                "US",
                LocalDate.of(2030, 12, 31),
                "FP789012"
        );

        foreignPassport.addVisa(new Visa("Tourist Visa", "France", LocalDate.of(2023, 3, 15)));
        foreignPassport.addVisa(new Visa("Business Visa", "Germany", LocalDate.of(2023, 5, 10)));

        System.out.println("Foreign Passport Information:");
        foreignPassport.displayForeignPassportInfo();

        //Завдання 6:
        //Створіть абстрактний базовий клас Worker (Робітник), з методом Print(). Створіть чотири похідні
        //класи: President, Security, Manager, Engineer. Перевизначте метод Print() для виводу інформації,
        //відповідає кожному типу співробітника
        President president = new President("John Smith", 101, "Executive");
        Security security = new Security("Jane Doe", 201, 3);
        Manager manager = new Manager("Alice Johnson", 301, "Sales");
        Engineer engineer = new Engineer("Bob Brown", 401, "Software Development");

        president.Print();
        System.out.println();
        security.Print();
        System.out.println();
        manager.Print();
        System.out.println();
        engineer.Print();

        //Завдання 7:
        //Створіть абстрактний базовий клас Фігура з абстрактним методом для підрахунку площі. Створіть похідні
        //класи: прямокутник, круг, прямокутний трикутник, трапеція зі своїми реалізаціями методу для підрахунку
        //площі. Для перевірки визначте масив посилань на абстрактний клас, яким надаються адреси різних
        //об’єктів класів-нащадків.
        Figure circle = new Circle(5.0);
        Figure rectangle = new Rectangle(4.0, 6.0);
        Figure triangle = new Triangle(3.0, 7.0);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());

        //Завдання 8:
        //Створіть інтерфейс IShow. В ньому повинно бути два методи void Print() і void Print(String info). Метод
        //Print() відображає інформацію, метод Print(String info) відображає інформацію і те інформаційне
        //повідомлення, що було вказане в параметрі info.
        //Створіть клас Array (масив цілого типу) з необхідними методами. Цей клас повинен імплементувати
        //інтерфейс Ishow.
        //Метод Print() – відображає на екран елементи масиву.
        //Метод Print(String info) – відображає на екран елементи масиву і інформаційне повідомлення, вказане
        //в параметрі info.
        //Напишіть код для тестування отриманого функціоналу
        int[] myArray = { 1, 2, 3, 4, 5 };
        Array arr = new Array(myArray);
        arr.Print();
        arr.Print("This is the array data.");
    }
}