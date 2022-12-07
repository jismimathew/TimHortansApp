

public class CoffeePowder implements TimMerchandise{

    public CoffeePowder(){
        System.out.println("Name: CoffeePowder \nFeatures: "+getFeature()+"\nPrice: $"+getPrice());
    }

    @Override
    public Double getPrice() {
        return 20.20;
    }


    @Override
    public String getFeature() {
        return "DarkRoast CoffeePowder";
    }

    public String toString(){
        return "Item: Coffee Powder, Price: $20.20";
    }
}
