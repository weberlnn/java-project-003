/**
 * Created by lin on 2016/7/22.
 */
public class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b*b;//不比强制类型转换，因为结果已经运算为int。
        //int类型足以包含所以有效的byte值，而且int和byte都是整数类型。
        b=10;
        b=(byte) (b*b);//需要强制类型转换，把int赋值给byte。

        System.out.println("i and b: " + i + " " +b );
    }
}
