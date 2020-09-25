package Lab_4;

import java.util.ArrayList;

class Dog
{
    String name;
    int age;



    Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void SetName(String name)
    {
        this.name = name;
    }
    String GetName()
    {
        return name;
    }
    public int getAge ()
    {
        return age;
    }

    public void setAge ( int age)
    {
        this.age = age;
    }
    int ageHuman()
    {
        return age*7;
    }
    public String ToString()
     {
         return "Name "+name+",Age"+age;
     }
}

class Dog_Kennel
{
    static ArrayList<Dog> dogs = new ArrayList<>();
    public static void main(String[] args)
    {
        dogs.add(new Dog("Sharik",7));
        dogs.add(new Dog( "Hart",10));


        System.out.println(dogs.get(0));
        System.out.println(dogs.get(1));
    }
}