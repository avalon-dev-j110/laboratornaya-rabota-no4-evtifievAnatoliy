package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.classes.*;  

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	String[] strings = {"Summer", "Winter", "Petia", "Name", "Tolic", 
            "Russian", "USA", "England", "Football", "BasketBall", 
            "Elefant", "Pig", "Cow", "Cat", "Dog",
            "Anything", "Hello", "Goodbay", "Document", "Person"};
              
	/*
	 * TODO(Студент): Проинициализируйте массив persons
	 *
	 * 1. Создайте класс, реализующий интерфейс Person.
	 *
	 * 2. Проинициализируйте массив persons 20
	 *    экземплярыми созданного класса.
	 */
        
	ClassPerson[] persons = {
        new ClassPerson("Иванов Иван Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Иван Иванович", new Date(1984, 05, 15)),
        new ClassPerson("Иванов Петр Иванович", new Date(1984, 00, 15)),
        new ClassPerson("Сидоров Иван Иванович", new Date(1984, 02, 15)),
        new ClassPerson("Крикунов Иван Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Евтифьев Иван Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Петров Иван Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Иван Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Петр Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Петр Петрович", new Date(1985, 00, 15)),
        new ClassPerson("Иванов Петр Петрович", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Иван Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Иван Иванович", new Date(1965, 06, 15)),
        new ClassPerson("Иванов Иван Сергеевич", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Иван Петрович", new Date(1984, 01, 16)),
        new ClassPerson("Иванов Иван Иванович", new Date(1974, 02, 15)),
        new ClassPerson("Сидоров Иван Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Василий Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Васельков Иван Иванович", new Date(1984, 01, 15)),
        new ClassPerson("Иванов Иван Иванович", new Date(1984, 02, 15))};
     
                
    

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new Sort(){
            @Override
            public void sort(Object[] array) {
                Arrays.sort(array);
            }

            @Override
            public void sort(Comparable[] array) {
                Arrays.sort(array);
            }

            @Override
            public void sort(Object[] array, Comparator comparator) {
                Arrays.sort(array, comparator);
            }
            
        };

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator <String> comparator = new StringComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        System.out.println("-----------------------------------------");
        System.out.println("persons before sort:");
        
        for(int i=0; i<persons.length; i++)    
            System.out.println("Person " + i + " : " + persons[i]);
            
        System.out.println("persons after sort:");
        sort.sort(persons);
        for(int i=0; i<persons.length; i++)    
            System.out.println("Person " + i + " : " + persons[i]);
        
        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        System.out.println("-----------------------------------------");
        System.out.println("String before sort: " + String.join(", ", strings));
        
        sort.sort(strings);
        System.out.println("String after  sort: " + String.join(", ", strings));

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        
        System.out.println("-----------------------------------------");
        System.out.println("String before sort: " + String.join(", ", strings));
        
        sort.sort(strings, comparator);
        System.out.println("String after  sort: " + String.join(", ", strings));
    }
}
