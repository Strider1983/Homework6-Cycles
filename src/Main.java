public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы. Урок №1");
        System.out.println("__________________");
        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("__________________");
        System.out.println("Задача №2");
        for (int g = 10; g > 0; g = g - 1) {
            System.out.println(g);
        }
        System.out.println("__________________");
        System.out.println("Задача №3");
        for (int a = 0; a < 17; a = a + 2) {
            System.out.println(a);
        }
        System.out.println("__________________");
        System.out.println("Задача №4");
        for (int q = 10; q >= -10; q = q - 1) {
            System.out.println(q);
        }
        System.out.println("__________________");
        System.out.println("Задача №5");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }
        System.out.println("__________________");
        System.out.println("Задача №6");
        for (int x = 7; x <= 98; x = x + 7) {
            System.out.println(x);
        }
        System.out.println("__________________");
        System.out.println("Задача №7");
        for (int y = 1; y <= 512; y = y * 2) {
            System.out.println(y);
        }
        System.out.println("__________________");
        System.out.println("Задача №8");
        int save = 29000;
        int accum = 0;
        for (int z = 1; z <= 12; z = z + 1) {
            accum = accum + save;
            System.out.println("Месяц " + z + " сумма накоплений равна " + accum + " рублей.");
        }
        System.out.println("__________________");
        System.out.println("Задача №9");
        int saving = 29000;
        int accumulation = 0;
        for (int z = 1; z <= 12; z = z + 1) {
            accumulation = accumulation + accumulation / 100;
            accumulation = accumulation + saving;
            System.out.println("Месяц " + z + " сумма накоплений равна " + accumulation + " рублей.");
        }
        System.out.println("__________________");
        System.out.println("Задача №10");
        int o = 1;
        int l = 2;
        for (int c = 1; c <=10; c = c + 1) {
            o = l * c;
            System.out.println(l + "x" + c + "=" + o);
        }
    }
}