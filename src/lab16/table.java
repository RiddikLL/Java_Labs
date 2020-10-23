package lab16;

public class table extends furniture
{
    int legs;
    int height;
    @Override
    void GetInfo()
    {
        System.out.println("Number of legs"+legs);
        System.out.println("Height"+height);
    }
}
