package chapter1.practice1;

/**
 * @Author young
 * @Date 2020/5/20 14:40
 * @Desc 1.1.1
 **/
public class Exec1 {
    /*
    给出以下表达式的值：
    a. ( 0 + 15 ) / 2
    b. 2.0e-6 * 100000000.1
    c. true && false || true && true
    */

    public static void main(String[] args) {
        int a = (0 + 15) / 2;  // 7
        double b = 2.0e-6 * 100000000.1; // 200.0000002
        boolean c = true && false || true && true; // true
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
