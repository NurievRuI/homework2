package com.company.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        //Дата рождения
        //
        //Вывести на экран дату своего рождения в виде: MAY 1 2012
        System.out.println("MAY 1 2012");
        //4 скобки
        //
        //Расставить правильно (по другому) скобки, чтобы на экран вывелось число 850
        System.out.println(850);
        //StarCraft
        //
        //Создать 10 зергов, 5 протосов и 12 терран.
        //Дать им всем уникальные имена.
        Zerg zerg1 = new Zerg("Zerg1");
        Zerg zerg2 = new Zerg("Zerg2");
        Zerg zerg3 = new Zerg("Zerg3");
        Zerg zerg4 = new Zerg("Zerg4");
        Zerg zerg5 = new Zerg("Zerg5");
        Zerg zerg6 = new Zerg("Zerg6");
        Zerg zerg7 = new Zerg("Zerg7");
        Zerg zerg8 = new Zerg("Zerg8");
        Zerg zerg9 = new Zerg("Zerg9");
        Zerg zerg10 = new Zerg("Zerg10");

        Protos protos1 = new Protos("Protos1");
        Protos protos2 = new Protos("Protos2");
        Protos protos3 = new Protos("Protos3");
        Protos protos4 = new Protos("Protos4");
        Protos protos5 = new Protos("Protos5");

        Terran terran1 = new Terran("Terran1");
        Terran terran2 = new Terran("Terran2");
        Terran terran3 = new Terran("Terran3");
        Terran terran4 = new Terran("Terran4");
        Terran terran5 = new Terran("Terran5");
        Terran terran6 = new Terran("Terran6");
        Terran terran7 = new Terran("Terran7");
        Terran terran8 = new Terran("Terran8");
        Terran terran9 = new Terran("Terran9");
        Terran terran10 = new Terran("Terran10");
        Terran terran11 = new Terran("Terran11");
        Terran terran12 = new Terran("Terran12");
        //Произведение 10 чисел
        //
        //Вывести на экран произведение чисел от 1 до 10.
        //Подсказка: будет три миллиона с хвостиком
        System.out.println(1*2*3*4*5*6*7*8*9*10);
        //Сумма 10 чисел
        //
        //Вывести на экран сумму чисел от 1 до 10 построчно:
        System.out.println(1);
        System.out.println(1 + 2);
        System.out.println(1 + 2 + 3);
        System.out.println(1 + 2 + 3 + 4);
        System.out.println(1 + 2 + 3 + 4 + 5);
        System.out.println(1 + 2 + 3 + 4 + 5 + 6);
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7);
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8);
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
        //Мама мыла раму
        //
        //Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
        //Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.
        System.out.println("МамаМылаРаму");
        System.out.println("МамаРамуМыла");
        System.out.println("МылаРамуМама");
        System.out.println("МылаМамаРаму");
        System.out.println("РамуМылаМама");
        System.out.println("РамуМамаМыла");
        //Таблица умножения
        //
        //Выведи на экран таблицу умножения 10 на 10 в следующем виде:
        int i=1;
        while (i<=10){
            int a=0;
            while(a<=9){
                a++;
                System.out.print(a*i + " ");
            }
            i++;
            System.out.println();
        }
        //Семь цветов радуги
        //
        //Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
        //Каждый объект при создании выводит на экран определенный цвет.
        Red red= new Red();

        Orange orange= new Orange();

        Yellow yellow= new Yellow();

        Green green= new Green();

        Blue blue= new Blue();

        Indigo indigo= new Indigo();

        Violet violet= new Violet();
        //Экранирование символов
        //
        //Про экранирование символов в Java читайте в дополнительном материале к лекции. Вывести на экран следующий текст - две строки:
        //It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        //It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
        String a = "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        System.out.println(a);

        String b = "It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
        System.out.println(b);
        //Изучаем японский
        //
        //Выведи на экран 日本語
        System.out.println("\u65E5\u672C\u8A9E");
        //Как захватить мир
        //
        //Ввести с клавиатуры число и имя, вывести на экран строку:
        //«имя» захватит мир через «число» лет. Му-ха-ха!
        //( Последовательность вводимых данных имеет большое значение.)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String time = reader.readLine();
            String name = reader.readLine();
            System.out.println(name + " захватит мир через " + time + " лет. Му-ха-ха!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Зарплата через 5 лет
        //
        //Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            try {
                String name = bufferedReader.readLine();
                String money = bufferedReader.readLine();
                String age = bufferedReader.readLine();
                System.out.println(name + " получает " + money +  " через " + age +  " лет.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        //Скромность украшает человека
        //
        //Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader1.readLine();
            System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Спонсор - это звучит гордо
        //
        //Ввести с клавиатуры два имени и вывести надпись:
        //name1 проспонсировал name2, и она стала известной певицей.
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name1 = reader2.readLine();
            String name2 = reader2.readLine();
            System.out.println(name1 + " проспонсировал " + name2 + ", и она стала известной певицей.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Чистая любовь
        //
        //Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name1 = reader3.readLine();
            String name2 = reader3.readLine();
            String name3 = reader3.readLine();
            System.out.println(name1 + " + " + name2 + " + " + name3 + " = " + " Чистая любовь, да-да!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Жить хорошо, а хорошо жить еще лучше");

        for (int j = 0; j < 10; j++) {
            System.out.println("Я не хочу изучать Java, я хочу большую зарплату");
        }

        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        try {
            String n = reader4.readLine();
            System.out.println("Я буду зарабатывать $" + n + " в час");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                reader.close();
                reader1.close();
                reader2.close();
                reader3.close();
                reader4.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
