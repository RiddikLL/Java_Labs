package lab16;

public class closet extends furniture
{
    int doors;
    int shelves;

    @Override
    void GetInfo()
    {
        System.out.println("Number of doors"+doors);
        System.out.println("Number of shelves"+shelves);
    }
}
