package lab16;

import java.util.ArrayList;

public class FurnitureShop
{
    ArrayList<furniture> items=new ArrayList<>();
    FurnitureShop()
    {
        items.add(new table());
        items.add(new closet());
    }
    furniture GetItem(int index){
        return items.get(index);
    }
}
