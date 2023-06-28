package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task1");
        System.out.println("Fall seven times \n and \n stand up eight\n");


        System.out.println("Task2");

//        System.out.println("Number 1");
//        boolean isInt1 = scanner.hasNextInt();
//
//
//
//        if (isInt1)
//        {
//
//            int x = scanner.nextInt();
//            System.out.println("Number 2");
//            boolean isInt2=scanner.hasNextInt();
//            if (isInt2)
//            {
//                int y=scanner.nextInt();
//                if (x>0&&y>0)
//                {
//                    int z=x+y;
//                    int d=x-y;
//                    int f=x*y;
//                    System.out.println("x+y " + z);
//                    System.out.println("x-y " + d);
//                    System.out.println("x*y " + f);
//                }
//                else {
//                    System.out.println("Введене число менше нуля");
//                }
//            }
//            else
//            {
//                System.out.println("I do not understand");
//            }
//
//        }
//        else
//        {
//            System.out.println("I do not understand");
//        }
        System.out.println("Task3");
//        System.out.println("Введіть число");
//        boolean isInt3 = scanner.hasNextInt();
//        if (isInt3) {
//            int number = scanner.nextInt();
//            int reversedNumber = 0;
//            while (number != 0) {
//                int digit = number % 10;
//                reversedNumber = reversedNumber * 10 + digit;
//                number /= 10;
//            }
//
//            System.out.println(reversedNumber);
//
//        }
//        else
//        {
//            System.out.println("I do not understand");
//        }
        System.out.println("Task4");

//        System.out.println("Enter time:");
//        boolean isInt3 = scanner.hasNextInt();
//        if (isInt3) {
//            int time = scanner.nextInt();
//
//            if (time > 6 && time < 9) {
//                System.out.println("Good Morning");
//            } else if (time > 9 && time < 18) {
//                System.out.println("Good Day");
//            } else if (time > 18 && time < 21) {
//                System.out.println("Good Evening");
//            } else if (time > 21 && time < 24) {
//                System.out.println("Good Night");
//            }
//        } else {
//            System.out.println("I do not understand");
//        }


        System.out.println("Task5");


//        System.out.print("Введіть шестизначне число: ");
//
//
//        boolean isInt3 = scanner.hasNextInt();
//        if (isInt3) {
//            int number5 = scanner.nextInt();
//            if (isSixDigitNumber(number5)) {
//                boolean isLucky = checkLuckyNumber(number5);
//
//                if (isLucky) {
//                    System.out.println("Введене число - щасливе!");
//                } else {
//                    System.out.println("Введене число не є щасливим.");
//                }
//            } else {
//
//                System.out.println("Введене число - не шестизначне!");
//            }
//
//        } else {
//            System.out.println("I do not understand");
//        }


        System.out.println("Task 6");

//        System.out.print("Введіть число в діапазоні від 1 до 100: ");
//
//        boolean isInt3 = scanner.hasNextInt();
//        if (isInt3) {
//
//            int number6 = scanner.nextInt();
//
//            if (number6 >= 1 && number6 <= 100) {
//                if (number6 % 3 == 0 && number6 % 5 == 0) {
//                    System.out.println("Fizz Buzz");
//                } else if (number6 % 3 == 0) {
//                    System.out.println("Fizz");
//                } else if (number6 % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(number6);
//                }
//            } else {
//                System.out.println("Помилка: Введене число не в діапазоні від 1 до 100.");
//            }
//        } else {
//            System.out.println("I do not understand");
//        }

        System.out.println("Task 7");

//        System.out.print("Enter your number: ");
//        boolean isInt3 = scanner.hasNextInt();
//        if (isInt3) {
//            int number7 = scanner.nextInt();
//
//            if (number7 >= 0) {
//                long factorial = 1;
//
//                for (int i = 1; i <= number7; i++) {
//                    factorial *= i;
//                }
//                System.out.println("Факторіал числа " + number7 + " = " + factorial);
//            } else {
//                System.out.println("Error: Введене число має бути більше 0.");
//            }
//        } else {
//            System.out.println("I do not understand");
//        }


        System.out.println("Task 8");
//        boolean isInt3 = scanner.hasNextInt();
//
//        if (isInt3) {
//
//            System.out.print("Введіть перше число: ");
//            int start = scanner.nextInt();
//            boolean isInt4 = scanner.hasNextInt();
//            if (isInt4) {
//                System.out.print("Введіть друге число: ");
//                int end = scanner.nextInt();
//
//                System.out.println("Prime numbers:");
//                for (int i = start; i < end; i++) {
//                    if (isPrime(i)) {
//                        System.out.print(i + ", ");
//                    }
//
//                }
//            } else {
//                System.out.println("I do not understand");
//            }
//        } else {
//            System.out.println("I do not understand");
//        }


        System.out.println("\nTask 9");

//        System.out.print("Введіть кількість елементів масиву: ");
//
//        boolean isInt3 = scanner.hasNextInt();
//
//        if (isInt3) {
//            int length = scanner.nextInt();
//
//            int[] array = new int[length];
//
//            System.out.println("Введіть елементи масиву:");
//            for (int i = 0; i < length; i++) {
//                System.out.print("Елемент " + (i + 1) + ": ");
//                array[i] = scanner.nextInt();
//            }
//
//            int summ = 0;
//            for (int i = 0; i < length; i++) {
//                summ += array[i];
//            }
//
//            double average = (double) summ / length;
//
//            System.out.println("Сума елементів масиву: " + summ);
//            System.out.println("Середнє арифметичне елементів масиву: " + average);
//            System.out.println("Елементи масиву:");
//
//            for (int i = 0; i < length; i++) {
//                System.out.print(array[i] + " ");
//            }
//        } else {
//            System.out.println("I do not understand");
//        }

        System.out.println("\nTask 10");
//        System.out.print("Введіть кількість елементів масиву: ");
//        boolean isInt3 = scanner.hasNextInt();
//
//        if (isInt3) {
//
//
//            int length2 = scanner.nextInt();
//
//            int[] array2 = new int[length2];
//
//            System.out.println("Введіть елементи масиву:");
//            for (int i = 0; i < length2; i++) {
//                System.out.print("Елемент " + (i + 1) + ": ");
//                array2[i] = scanner.nextInt();
//            }
//
//            System.out.print("Введіть число для пошуку: ");
//            int searchNumber = scanner.nextInt();
//
//            int count = countOccurrences(array2, searchNumber);
//
//            System.out.println("Кількість входжень числа " + searchNumber + " у масиві: " + count);
//        } else {
//            System.out.println("I do not understand");
//        }

        System.out.println("Task 11");
//        boolean isInt3 = scanner.hasNextInt();
//        boolean isInt4 = scanner.hasNextInt();
//
//        if (isInt3) {
//            System.out.print("Введіть перше число діапазону: ");
//            int start2 = scanner.nextInt();
//            if (isInt4) {
//                System.out.print("Введіть друге число діапазону: ");
//                int end2 = scanner.nextInt();
//
//                int result = summNumbers(start2, end2);
//
//                System.out.println("Сума чисел в заданому діапазоні включно = " + result);
//            }
//            else {
//                System.out.println("I do not understand");
//            }
//        } else {
//            System.out.println("I do not understand");
//        }


        System.out.println("Task 12");
//        Написати метод, що підраховує факторіал кожного елемента масиву. Метод повертає новий
//        масив, що містить отримані факторіали.
        boolean isInt3 = scanner.hasNextInt();


        if (isInt3) {
            System.out.print("Введіть кількість елементів масиву: ");
            int length12 = scanner.nextInt();

            int[] array12 = new int[length12];

            long[] farray = new long[length12];

            System.out.println("Введіть елементи масиву:");
            for (int i = 0; i < length12; i++) {
                System.out.print("Елемент " + (i + 1) + ": ");
                array12[i] = scanner.nextInt();
                farray[i] = factorial(array12[i]);
            }

            for (int i = 0; i < length12; i++) {
                //System.out.print("Елемент " + (i + 1) + ": ");
                System.out.println(farray[i]);

            }
        } else {
            System.out.println("I do not understand");
        }
    }

    public static boolean checkLuckyNumber(int number5) {
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        // Розбиваємо число на першу та другу половини
        int divisor = 100000;
        for (int i = 0; i < 3; i++) {
            sumFirstHalf += number5 / divisor;
            number5 %= divisor;
            divisor /= 10;
        }
        divisor = 1000;
        for (int i = 0; i < 3; i++) {
            sumSecondHalf += number5 / divisor;
            number5 %= divisor;
            divisor /= 10;
        }

        return sumFirstHalf == sumSecondHalf;
    }

    public static boolean isSixDigitNumber(int number) {
        return number >= 100000 && number <= 999999;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countOccurrences(int[] array, int searchNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                count++;
            }
        }
        return count;
    }

    public static int summNumbers(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }

    public static long factorial(int num) {
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
