/**
 * Created by lin on 2016/7/19.
 */
//演示短路运算符。
public class SCops {
    public static void main(String args[]) {
        int n, d;
        n = 10;
        d =2;
        if(d != 0 && (n % d) == 0) //短路AND是防止除以0的操作。
            System.out.println(d + "是一个因素的 " +n);

        d = 0; //现在d设置为0。
        //if语句首先会检查d是否等于0，如果等于0，短路AND运算结束，不执行求余运算。
        if(d != 0 && (n % d) == 0)
            System.out.println(d + "是一个因素的 " + n);

        //现在试一试没有短路操作符相同的事情。

        //if(d != 0 & (n % d) == 0)
            //System.out.println(d + "是一个因素的 " +n);
        //这将会导致除法的错误。
        //这样会计算两个操作数，在除以0是会导致运行错误发生。


    }
}
