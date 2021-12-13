public class Main {
    public static void main(String[] args) {

//        С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.
        int [][] table = new int[4][3];
        table [0][0] = 1;
        table [0][1] = 2;
        table [0][2] = 3;
        table [1][0] = 4;
        table [1][1] = 5;
        table [1][2] = 6;
        table [2][0] = 7;
        table [2][1] = 1;
        table [2][2] = 2;
        table [3][0] = 3;
        table [3][1] = 5;
        table [3][2] = 6;

        System.out.print("Массив:");
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j]);
            }
        }
//        1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).
        System.out.println("\n" + "Задание 1");
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < table[i].length; j++)
                sum += table[i][j];
            System.out.println("Строка " + i + ": " + sum);
        }

//        2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
        System.out.println("Задание 2");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < table.length; j++)
                sum += table[j][i];
            System.out.println("Колонка " + i + ": " + sum);
        }
//        3.Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.
        System.out.println("Задание 3");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
        }
//        4.Напишите программу, которая для каждой строки находит целое среднее арифметическое и выводит его на экран.
        System.out.println("\n" + "Задание 4");
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            int mean = 0;
            for (int j = 0; j < table[i].length; j++)
                sum += table[i][j];
            mean = sum / 3;
            System.out.println("Строка " + i + ": " + mean);
        }
    }
}
