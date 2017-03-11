class Runner
{
    public static void main(String[] args)
    {
        Test obj1 = new Test();
        Test obj2 = obj1;
        System.out.println("obj1, a - " + obj1.a + " b - " + obj1.b);
        System.out.println("obj2, a - " + obj2.a + " b - " + obj2.b);

        obj1.a += 1;
        obj1.b += 1;
        System.out.println("obj1, a - " + obj1.a + " b - " + obj1.b);
        System.out.println("obj2, a - " + obj2.a + " b - " + obj2.b);

        obj2.a += 1;
        obj2.b += 1;

        System.out.println("obj1, a - " + obj1.a + " b - " + obj1.b);
        System.out.println("obj2, a - " + obj2.a + " b - " + obj2.b);
    }
}