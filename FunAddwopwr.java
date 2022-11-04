import java.beans.VetoableChangeListenerProxy;

public class FunAddwopwr {
    static int add()
    {
        int a=10;
        int b=20;
        int sum=a+b;
        return sum;
            }
    public static void main(String[] args) {
        int res=add();
        System.out.println(res);
    }
}
