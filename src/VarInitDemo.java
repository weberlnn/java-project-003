/**
 * Created by lin on 2016/7/18.
 */
//有使用期的一个变量，变量在进入作用域时被创建，在离开时被销毁，变量一旦离开作用域就不会存储原来的值。
public class VarInitDemo {
    public static void main(String args[]) {
        int x; //如果变量声明包含初始化值，那么每次进入声明代码块时都会被重新初始化。
        for(x = 0; x < 3; x++) {
            int y = -1; //y每次初始化成批输入。
            System.out.println("y 是: " +y); //每次输入-1。
            y = 100;
            System.out.println("y 现在是: " + y); //每次输入100。
            y = 10;
             System.out.println("y 现在是： " +y);//每次输入10。
        }
    }
}
