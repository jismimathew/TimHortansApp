

public class HockeyCards implements TimMerchandise{
    public HockeyCards(){
        System.out.println("Name: HockeyCards \nFeatures: "+getFeature()+"\nPrice: $"+getPrice());
    }

    @Override
    public Double getPrice() {
        return 20.00;
    }

    @Override
    public String getFeature() {
        return "Canadian Hockey legend card worth $20.00";
    }

    public String toString(){
        return "Item: Hockey cards, Price: $20.00";
    }
}
