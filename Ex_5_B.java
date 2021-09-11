

/*
Write a java program to implement multiple inheritance
*/
interface p1
{
    default void show(){
        System.out.println("INTERFACE 1");
    }
}
interface p2
{
    default void show()
    {
        System.out.println("INTERFACE 2");
    }
}
class Ex_5_B implements p1,p2{
    public void show(){
        p1.super.show();
        p2.super.show();
    }
    public static void main(String[] args) {
        Ex_5_B obj = new Ex_5_B();
        obj.show();
    }
}
