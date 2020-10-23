package lab16;

import MyPackadge.Person;

public class Test
{
    public static void main(String[] args)
    {
        FurnitureShop ikea=new FurnitureShop();
        Persens vacia=new Persens();

        System.out.println(vacia.basket);

        vacia.basket.add(ikea.GetItem(0));
        vacia.basket.add(ikea.GetItem(0));
        vacia.basket.add(ikea.GetItem(0));

        System.out.println(vacia.basket);
    }
}
