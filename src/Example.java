/**
 * Created by lin on 2016/7/19.
 */
public class Example {
    public static void main(String args[]) {
        int a, b;
        for(a=2;a<=10;a++){
            for(b=2;b<a;b++){
                if(a%b == 0)
                    break;
            }
            if(b == a) {
                System.out.println(a);
            }
        }
    }
}
