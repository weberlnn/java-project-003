/**
 * Created by lin on 2016/7/19.
 */
//下面的程序用来证明关系和逻辑运算符。
public class RelLogOps {
    public static void main(String args[]) {
        int i, j;
        boolean b1,b2;

        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j"); //10小于11，结果为真。
        if(i <= j) System.out.println("i <= j"); //10小于等于11，结果为真。
        if(i != j) System.out.println("i != j"); //10不等于11，结果为真。
        if(i == j) System.out.println("i == j"); //10等于11，为假，所以不执行。
        if(i >= j) System.out.println("i >= j"); //10大于等于11，为假，所以不执行。
        if(i > j) System.out.println("i > j"); //10大于11，为假，所以不执行。
      //布尔变量的值本身就可以控制if语句。
        b1 = true;
        b2 = false;
        if(b1 & b2 ) System.out.println("b1 & b2 is true"); //只要有一个为假，那么都为假。
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true" );//非：因为不是假，所以为真。
        if(b1 | b2) System.out.println("b1 | b2 is true ");//只要有一个为真，那么都为真。
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true ");//一真一假或一假一真时，都为真。

    }
}
