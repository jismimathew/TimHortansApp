
public class GiftCards implements TimMerchandise{

    public GiftCards(){
        System.out.println("Name: GiftCard \nFeatures: "+getFeature()+"\nPrice: $"+getPrice());
    }
    @Override
    public Double getPrice() {
        return 50.00;
    }

    @Override
    public String getFeature() {
        return "Gift card worth 50.00 Canadian Dollars";
    }

    public String toString(){
        return "Item: GiftCard, Price: $50.00";
    }
}

