public class MethodOverload2 {
    public static void main(String[] args){
        Addition ad = new Addition();
        ad.add(10, 20);
        ad.add(10, 20.5f);
        ad.add(10,20,30);
    }
    
}

class Addition
{
    void add(int a, float b)
    {
        float res=a+b;
        System.out.println(res);
    }
    float add(int a,int b)
    {
        float res=a+b;
        System.out.println(res);
        return res;
    }
    void add(int a, float b, int c)
    {
        float res=a+b+c;
        System.out.println(res);
    }
}
