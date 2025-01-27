package vendingmachine.models;

public class ItemShelf {
    Item item;
    int code;

    public ItemShelf(Item item,int code){
        this.item=item;
        this.code=code;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
