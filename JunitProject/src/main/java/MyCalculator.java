public class MyCalculator {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int multi(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b) throws Exception {
        if(a==0 || b==0){
            throw new Exception("Divide by zero Exception");
        }
        return a/b;
    }
}
