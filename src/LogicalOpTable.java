/**
 * Created by lin on 2016/7/22.
 */
public class LogicalOpTable {
    public static void main(String args[]) {

        boolean p, q;
        //一个"\t"表示8个空格。
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT\n");

        p = true; q = true;//"?:"三元运算，条件判断。
        System.out.println((p?1:0)+"\t"+(q?1:0)+"\t"+(p&q?1:0)+"\t"+(p|q?1:0)+"\t"+(p^q?1:0)+"\t"+(!p?1:0)+"\n");

        p = true; q = false;
        System.out.println((p?1:0)+"\t"+(q?1:0)+"\t"+(p&q?1:0)+"\t"+(p|q?1:0)+"\t"+(p^q?1:0)+"\t"+(!p?1:0)+"\n");

        p = false; q = true;
        System.out.println((p?1:0)+"\t"+(q?1:0)+"\t"+(p&q?1:0)+"\t"+(p|q?1:0)+"\t"+(p^q?1:0)+"\t"+(!p?1:0)+"\n");

        p = false; q = false;
        System.out.println((p?1:0) +"\t"+(q?1:0)+"\t"+(p&q?1:0)+"\t"+(p|q?1:0)+"\t"+(p^q?1:0)+"\t"+(!p?1:0)+"\n");

    }
}
