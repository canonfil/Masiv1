
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] number = new int[]{1, 2, 3};
        double[] fraction = new double[]{1.57, 7.654, 9.986};
        boolean[] number2 = new boolean[]{true, false};

        System.out.println("Задача 2 ");
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.print(number[i]);
                break;
            }
            System.out.println(number[i] + ",");

        }

        for (int a = 0; a< fraction.length; a++) {
            if (a == fraction.length - 1) {
                System.out.print(fraction[a]);
                break;
            }
            System.out.print(fraction[a] + ",");
        }

   /// Task 3
        System.out.println("  Задание 3 ");
        for (int i = number.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(number[i] + ",");
                break;
            }
            for (int f = fraction.length - 1; f >= 0; f--) {
                if (f == 0) {
                    System.out.print(fraction[f] + ",");
                    break;
                }
            }




///        Task 4
        System.out.println(" Задание 4");

        for (i = 0; i < number.length; i++);{
            if (number[i]% 2 != 0) {
                number[i]++;
            }
            if ( i == number.length -1) {
                System.out.print(number[i]);
                break;}

                System.out.println(number[i] + ",");

                            for (i = 0; i < fraction.length; i++);{
                            if (fraction[i] % 2 != 0) {
                                fraction[i]++;
                            }
                            if (i == fraction.length - 1) {
                                System.out.print(fraction[i]);
                                break;}

                                System.out.println(number[i] + ",");
                            }}

                        }}}