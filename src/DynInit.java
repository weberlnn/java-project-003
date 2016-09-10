/**
 * Created by lin on 2016/7/19.
 */
public class DynInit {
    public static void main(String args[]){
        int x,y;
        x = 10;
        y= ++x;
        System.out.println(y);
        //当自增或自减运算符在操作数之前。
        //java会在表达式的其余部分使用操作数之前先对相应的操作数进行运算。
        x = 10;
        y = x++;
        System.out.println(y);
        //当自增或自减运算符在操作数之后，java会先将操作数的值用于表达，然后再进行自增或自减运算。
    }
}
