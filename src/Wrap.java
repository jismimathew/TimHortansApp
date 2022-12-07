

public class Wrap implements TimConsumable{

    public Wrap(){
        System.out.println("Name: Wrap \nCalories: "+getCalories()+"\nPrice: $"+getPrice());
    }
    @Override
    public int getCalories() {
        return 100;
    }

    @Override
    public Double getPrice() {
        return 7.00;
    }

    public String toString(){
        return "Item: Wrap, Price: $7.00";
    }
}
