

public class Coffee implements TimConsumable{

    public Coffee(){
        System.out.println("Name: Coffee \nCalories: "+getCalories()+"\nPrice: $"+getPrice());
    }
    @Override
    public int getCalories() {
        return 10;
    }

    @Override
    public Double getPrice() {
        return 2.20;
    }

    public String toString(){
        return "Item: Coffee, Price: $2.20";
    }
}
