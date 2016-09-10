/**
 * Created by lin on 2016/7/18.
 */
//展示块范围。
public class ScopeDemo {
    public static void main(String args[]) {
        int x;// x在所有范围都可见。

        x = 10;//外层作用域定义对象对内层作用域的代码是可见的。
        if(x == 10) {
            int y =20; //内层作用域定义的对象对于外层作用域中的代码是不可见的。

            System.out.println("x and y: " + x + " " +y);//x和y都可见。
            x = y * 2;
        }

        System.out.println("x 是 "+ x); //x仍然是已知的。
    }
}
