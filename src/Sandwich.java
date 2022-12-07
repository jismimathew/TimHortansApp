

public class Sandwich implements TimConsumable{

    public Sandwich(){
        System.out.println("Name: Sandwich \nCalories: "+getCalories()+"\nPrice: $"+getPrice());
    }
    @Override
    public int getCalories() {
        return 50;
    }

    @Override
    public Double getPrice() {
        return 15.00;
    }

    public String toString(){
        return "Item: Sandwich, Price: $15.00";
    }
}
