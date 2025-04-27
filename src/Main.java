import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] number = new int[]{1, 2, 3};
        float[] fraction = {1.57f, 7.654f, 9.986f};
        int[] number2 = new int[10];

        System.out.println("Задача 2 ");
        for (int i = 0; i < number.length; i++) {
            if (i > 0) {
                System.out.println(" ,");
            }
            System.out.print(number[i]);
        }
        System.out.println();
        for (int i = 0; i < fraction.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(fraction[i]);
        }
        System.out.println();
        for (int i = 0; i < number2.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(number[i]);
        }
        System.out.println();

        System.out.println("Задача 3");
        int[] runArr = {1, 2, 3};
        for (int e = runArr.length - 1; e >= 0; e--)
        {
            System.out.print(runArr[e]);
            if (e != 0) {
                System.out.print(",");
            }
            double[] startArr = {1.57, 7.654, 9.986};
            for (int o = startArr.length - 1; o >= 0; o--) {
                System.out.print(startArr[o]);
                if (o != 0) {
                    System.out.print(",");
                }
                int[] blackArr = {58, 61, 65};
                for (int ma = blackArr.length - 1; ma>=0 ; ma--) {
                    System.out.print(blackArr[ma]);
                    if (ma != 0) {
                        System.out.print(" ,");
                    }
                    System.out.println("ЗАдаяа 4");

                    int[] first = new int[] {1,2,3};
                    for (int i= 0;i<first.length;i++){
                        if (first [i] %2 !=0){
                            first[1] +=1;
                        }
                    }
                    System.out.println(Arrays.toString((first)));

                }

            }

        }
    }}