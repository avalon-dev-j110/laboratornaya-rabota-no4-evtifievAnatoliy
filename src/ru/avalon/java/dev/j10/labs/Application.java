package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.classes.*;  

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        
        for(String str : strings)
            System.out.println("String: " + str);
	/*
	 * TODO(Студент): Проинициализируйте массив persons
	 *
	 * 1. Создайте класс, реализующий интерфейс Person.
	 *
	 * 2. Проинициализируйте массив persons 20
	 *    экземплярыми созданного класса.
	 */
	ClassPerson[] persons = new ClassPerson[20];
        persons[0] = new ClassPerson("Иванов Иван Иванович", "15.01.1984");
        persons[1] = new ClassPerson("Иванов Иван Иванович", "15.05.1984");
        persons[2] = new ClassPerson("Иванов Петр Иванович", "15.01.1984");
        persons[3] = new ClassPerson("Сидоров Иван Иванович", "15.01.1984");
        persons[4] = new ClassPerson("Крикунов Иван Иванович", "15.01.1984");
        persons[5] = new ClassPerson("Евтифьев Иван Иванович", "15.01.1984");
        persons[6] = new ClassPerson("Петров Иван Иванович", "15.01.1984");
        persons[7] = new ClassPerson("Иванов Иван Иванович", "15.01.1984");
        persons[8] = new ClassPerson("Иванов Петр Иванович", "15.01.1984");
        persons[9] = new ClassPerson("Иванов Петр Петрович", "15.01.1985");
        persons[10] = new ClassPerson("Иванов Петр Петрович", "15.01.1984");
        persons[11] = new ClassPerson("Иванов Иван Иванович", "15.01.1984");
        persons[12] = new ClassPerson("Иванов Иван Иванович", "15.06.1965");
        persons[13] = new ClassPerson("Иванов Иван Сергеевич", "15.01.1984");
        persons[14] = new ClassPerson("Иванов Иван Петрович", "16.01.1984");
        persons[15] = new ClassPerson("Иванов Иван Иванович", "15.02.1974");
        persons[16] = new ClassPerson("Сидоров Иван Иванович", "15.01.1984");
        persons[17] = new ClassPerson("Иванов Василий Иванович", "15.01.1984");
        persons[18] = new ClassPerson("Васельков Иван Иванович", "15.01.1984");
        persons[19] = new ClassPerson("Иванов Иван Иванович", "15.02.1984");
         
        int i=0;
        for(ClassPerson person : persons){    
            System.out.println("Person " + i + " : " + person.toString());
            i++;
        }
    

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
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void sort(Comparable[] array) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void sort(Object[] array, Comparator comparator) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        Comparator comparator = null;

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
        sort.sort(persons);

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
        sort.sort(strings);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        
    }
}
