//import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        double[] numbers = {8.0, 5.5, -2.1, -4.0, 2.0, 3.0, 6.0, -7.0, 1.5, 2.5, -3.5, 4.5, 0.5, -1.0, -6.0};
//        double sumPositive = 15;
//        int numPositive = 0;
//        int conPositive = 0;
//        boolean fountNegative = false;
//        for (double number: numbers){
//            if (numPositive < 0) {
//                fountNegative = true;
//                sumPositive ++ ;
//                System.out.println("Положительное число: ");
//            }
//            if (conPositive > 0){
//                fountNegative = false;
//                sumPositive -- ;
//                System.out.println("Отрицательное число: ");
//            }
//            if (fountNegative){
//                sumPositive += conPositive;
//                conPositive = 0 ;
//                System.out.println("Среднее число: ");
//            }
//        }
//        double average = sumPositive / conPositive;
//        System.out.println("");

        //Задание номер 1.
        double[] numbers = {8.0, 5.5, -2.1, -4.0, 2.0, 3.0, 6.0, -7.0, 1.5, 2.5, -3.5, 4.5, 0.5, -1.0, -6.0};
        double sumPositive = 0;
        int numPositive = 0;
        boolean foundNegative = false;

        for (double number : numbers) {
            if (number > 0) {
                numPositive++;
                if (foundNegative) {
                    sumPositive += number;
                }
            } else {
                foundNegative = true;
            }
        }

        double average = sumPositive / numPositive;
        System.out.println("Среднее число: " + average);

        //Задание номер 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = scanner.nextLine();
//        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
//        boolean isPalindrome = true;
//
//        for (int i = 0; i < cleanInput.length() / 2; i++) {
//            if (cleanInput.charAt(i) != cleanInput.charAt(cleanInput.length() - 1 - i)) {
//                isPalindrome = false;
//                break;
//                }
            }
        }
