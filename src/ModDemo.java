/**
 * Created by lin on 2016/7/19.
 */
//下面的程序证明了%（求余）运算符。
public class ModDemo {
    public static void main(String args[]){
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3; // 10/3的结果为3。
        irem = 10 % 3; //余数是1。

        dresult = 10.0 / 3.0; //因为使用了双精度浮点，所以结果更详细为3.3333333333333335。
        drem = 10.0 % 3.0; //余数同样是1。

        System.out.println("10/3的结果和剩余的部分是：" + iresult + " " + irem);
        System.out.println("10/3的结果和剩余的部分是：" + dresult + " " + drem);
        //对于整数类型和浮点类型操作，“%”都得到了余数1。
    }
}