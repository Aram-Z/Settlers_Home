package GameEngine;

public class Resource {

    private String type;

    private int quantity;



    public Resource(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public Resource() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
