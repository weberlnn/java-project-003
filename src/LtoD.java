/**
 * Created by lin on 2016/7/20.
 */
//演示自动转换形式。
public class LtoD {
    public static void main(String args[]) {
        long L;
        double D;
        //自动类型转换发生的条件是：两种类型兼容。目标类型比源类型大。
        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " +D);
    }
}
