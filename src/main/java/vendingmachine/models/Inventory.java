package vendingmachine.models;

public class Inventory {
    ItemShelf[] itemShelves;

    public Inventory(){
        itemShelves=new ItemShelf[10];
        initializeInventory();
    }

    private void initializeInventory() {
        for(int i=0;i<10;i++){
            if(i>=0 && i<=3){
                Item item = new Item(ItemType.COKE,10);
                itemShelves[i]=new ItemShelf(item,101);
            }
            if(i>=4 && i<=6){
                Item item = new Item(ItemType.LAYS,12);
                itemShelves[i]=new ItemShelf(item,102);
            }
            if(i>=7 && i<=9){
                Item item = new Item(ItemType.PEPSI,15);
                itemShelves[i]=new ItemShelf(item,103);
            }
        }
    }

    public Item getProductByCode(int code){
        for(ItemShelf  itemShelf: itemShelves){
            if(itemShelf.getCode()==code){
                return itemShelf.getItem();
            }
        } return  null;
    }

}
