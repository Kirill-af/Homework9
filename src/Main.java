import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray){
            salarySum += salary;
        }
        System.out.println("Сумма трат за месяц составил " + salarySum + " рублей");

        System.out.println("Задача 2");

        salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));


        int  minExpenses = salaryArray[0];
        int  maxExpenses = salaryArray[0];

        for (int salary : salaryArray){
            if (salary < minExpenses){
                minExpenses = salary;
            }
            if (salary > maxExpenses) {
                maxExpenses = salary;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составил " + minExpenses + " рублей");
        System.out.println("Максимальная сумма трат за месяц составил " + maxExpenses + " рублей");

        System.out.println("Задача 3");

        salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        salarySum = 0;

        for (int salary : salaryArray){
            salarySum += salary;
        }
        System.out.println("Средняя трат за месяц составила " + salarySum / salaryArray.length + " рублей");

        //Задание 4
        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i<reverseFullName.length / 2; i++){
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 -i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(reverseFullName));
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_00) + 100_000;
        }
        return arr;
    }
}