import java.util.List;

public class Purchase {

    private List<Item> itemList;

    public Purchase(List<Item> itemList) {
        this.itemList = itemList;
    }

    public String getDescription() {
        StringBuffer sb = new StringBuffer();
        for (Item item : itemList) {
            sb.append(item.getItemName() + "\t" + item.getPrice() + "\n");
        }
        return sb.toString();
    }

}
