package chapter1.practice1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author young
 * @Date 2020/5/20 14:47
 * @Desc 1.1.3
 **/
public class Exec3 {
    /**
     * 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印 equal，否则打印 not equal。
     */

    public static void main(String[] args) {
        int num = 0;
        int len = 3;
        int[] ints = new int[len];
        Scanner scanner = new Scanner(System.in);
        while (num < len) {
            System.out.println("请输入第" + (num + 1) + "个整数: ");
            ints[num] = scanner.nextInt();
            num++;
        }
        Set set = new HashSet();
        System.out.println("输入的数字分别为: ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
            set.add(ints[i]);
        }
        System.out.println();
        if (set.size() > 1) {
            System.out.println("not equal");
        } else {
            System.out.println("equal");
        }

    }
}
