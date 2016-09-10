/**
 * Created by lin on 2016/7/26.
 */
public class Example2 {
    public static void main(String args[]) {
        int sum=0;
        for(int i=1; i<=5; i++){
            if(i % 2 == 1){
                System.out.println(i);
                sum += i * i;
            }
        }
        System.out.println(sum);
    }
}
