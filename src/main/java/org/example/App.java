package org.example;

import org.apache.log4j.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args ) {
        logger.info("Приложение запущено!");

        try {
            for (int i = 0; i < 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i + ": Fizz");
                } else if (i % 5 == 0) {
                    System.out.println(i + ": Buzz");
                } else if (i % 15 == 0) {
                    System.out.println(i + ": FizzBuzz");
                }
            }
            //throw new Exception("Тест фатальной ошибки...");
        } catch (Throwable t) {
            logger.fatal(t);
        }

        logger.info("Работа приложения завершена!");
    }
}
