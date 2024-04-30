public class Inheritance {
    public static void main(String[] args)
    {
        Base obj = new Base("Test1",14);
        System.out.println(obj.toString());
        Derived obj2 = new Derived("Test2",12,"Pokemon-Trainer");
        System.out.println(obj2.toString());
    }
}

public class Base
{
    public String name;
    public int age;   
    public Base(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return("Name is " + name + "\nAge is " + age);
    }    
}    

public class Derived extends Base
{
    public String job;
    public Derived(String name,int age,String job)
    {
        super(name,age);
        this.job = job;
    }
    @Override
    public String toString()
    {
        return (super.toString() + "\nJob is " + job);
    }
}    

