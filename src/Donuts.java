

public class Donuts implements TimConsumable{

    public Donuts(){
        System.out.println("Name: Donut \nCalories: "+getCalories()+"\nPrice: $"+getPrice());
    }
    @Override
    public int getCalories() {
        return 25;
    }

    @Override
    public Double getPrice() {
        return 2.00;
    }

    public String toString(){
        return "Item: Donuts, Price: $2.00";
    }
}
