class MyClass
{
    int MyClass()
    {
        return -1;
    }

    MyClass a = new MyClass();

    static public void main(String [] argv){
        MyClass mClass = new MyClass();
        System.out.println(mClass.MyClass());
    }
}