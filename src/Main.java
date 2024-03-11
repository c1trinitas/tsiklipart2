public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Test 1");
        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; ) {
            total = total + total / 100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " итого " + total);
            }
            System.out.println(total);
        }
        System.out.println("Test 2");
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }
        System.out.println("Task 1");
        int forPiggyBank = 15000; // необходимая для внесения сумма (ежемесячно)
        int need = 0;
        int b = 0;
        while (need < 2459000) {
            need = need + forPiggyBank + forPiggyBank / 100;
            b++;
            System.out.println("Месяц " + b + " сумма накоплений " + need);
        }
        System.out.println("Task 2");
        int line = 1;
        while (line <= 10) {
            System.out.print(line + " ");
            line = line + 1;
        }
        System.out.println();
        line = line - 1;
        while (line <= 10 && line >= 1) {
            System.out.print(line + " ");
            line = line - 1;
        }
        System.out.println("Task 3");
        int y = 12000000;
        int birh = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++) {
            int births = birh * y / 1000;
            int deaths = death * y / 1000;
            int result = births - deaths;
            y = y + result;
            System.out.println("Год " + year + " численность населения составляет " + y);

        }
        System.out.println(" ");
        System.out.println("Task 4, 5");
        int deposit = 15000;
        int incomeMonth = 0;
        int month = 0;
        while (incomeMonth <= 12000000) {
            month = month + 1;
            incomeMonth = incomeMonth + (incomeMonth * 7) / 100;
            incomeMonth = incomeMonth + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + incomeMonth);

            }
        }
        System.out.println("Task 6");
        incomeMonth = 0;
        month = 0;
        int months = 9 * 12;
        while (month < months) {
            month = month + 1;
            incomeMonth = incomeMonth + (incomeMonth * 7) / 100;
            incomeMonth = incomeMonth + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + incomeMonth);

            }
        }
        System.out.println("Task 7");
        int fstFriday = 1;
        for (int friday = fstFriday; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница " + friday + "-е число, необходимо подготовить еженедельный отчёт");
        }
        System.out.println("Task 8");
        int currentYear = 2024;
        start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        for (int year = start; year <= end; year ++) {
            if (year % period == 0) {
                System.out.println(year);
            }
        }




    }
}
