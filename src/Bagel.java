

public class Bagel implements TimConsumable{

    public Bagel(){
        System.out.println("Name: Bagel \nCalories: "+getCalories()+"\nPrice: $"+getPrice());
    }
    @Override
    public int getCalories() {
        return 20;
    }

    @Override
    public Double getPrice() {
        return 3.00;
    }

    public String toString(){
        return "Item: Bagel, Price: $3.00";
    }


}
