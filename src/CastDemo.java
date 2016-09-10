/**
 * Created by lin on 2016/7/22.
 */
public class CastDemo {
    public static void main(String args[]) {
        double x ,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        //该转换中将丢失小数点后的数字。
        i = (int) (x / y);//计算双精度浮点到int。
        System.out.println("整数的结果 x / y: " +i);

        i = 100;
        b = (byte) i;//因为byte类型可以存储100，所以当把值100赋给b时就不会发生信息丢失。
        System.out.println("b 的值: " +b);

        i = 257;//当试图将值257赋给b时，信息丢失就会发生，因为257超过了byte类型的最大值。
        b = (byte) i;//将会丢失信息，byte不能存储257。
        System.out.println("b 的值：" +b);

        b = 88;
        ch = (char) b;//不兼容类型间的强制转换。
        System.out.println("ch: " + ch);//在ASCII中X是88。
    }
}
