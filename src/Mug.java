
public class Mug implements TimMerchandise{

    public Mug(){
        System.out.println("Name: Mug \nFeatures: "+getFeature()+"\nPrice: $"+getPrice());
    }
    @Override
    public Double getPrice() {
        return 10.00;
    }

    @Override
    public String getFeature() {
        return "Mug is of large size";
    }
    public String toString(){
        return "Item: Mug, Price: $10.00";
    }
}
