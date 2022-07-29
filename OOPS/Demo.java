public class Demo{
    public static void main(String args[]){
        Laptop obj = new Laptop();
        obj.ram=16;
        obj.doSomething();
    }
}

class Laptop{
    // knows (properties) - Variables
    // does (Behaviour) - Methods

    String cpu;
    int ram;
    int hdd;

    public void doSomething(){
        System.out.println("Compiling");
        System.out.println(ram);
    }
}
