package chapter1;

import java.util.Arrays;

/**
 * @Author young
 * @Date 2020/5/20 14:08
 * @Desc 二分查找法
 **/
public class BinarySearch {

    public static int search(int target) {
        int len = 100000000;
        int[] ints = new int[len];
        for (int i = 0; i < len; i++){
            ints[i] = i;
        }
        Arrays.sort(ints);
        int low = 0;
        int high = ints.length - 1;
        int mid;
        int num = 0;
        while (low <= high) {
            num++;
            mid = low + (high - low) / 2;
            if (target < ints[mid]) {
                high = mid - 1;
            } else if (target > ints[mid]) {
                low = mid + 1;
            } else {
                System.out.println("num: " + num);
                return mid;
            }
        }
        System.out.println("num: " + num);
        return -1;
    }

    public static void main(String[] args) {
//        int target = 1534;
//        System.out.println(target + "所在位置索引为: " + search(target));
        System.out.println('b' + 'c');
    }

}
