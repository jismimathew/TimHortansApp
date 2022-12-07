
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimGetData[] []objAll = new TimGetData[100][100];
        double totalPrice =0.0;
        System.out.println("**WELCOME TO TIM HORTAN'S ORDERING SYSTEM**");
        boolean val = true;
        int count=0;
        if(count< objAll.length){
        while(val) {
            System.out.println("Select your option \n1.Tims Merchandise \n2.Tims Consumables \n3.Go to Checkout");
            switch (sc.nextInt()) {
                case 1:
                    objAll[count] = selectMenuMerchandise();
                    break;
                case 2:
                    objAll[count] = selectMenuConsumable();
                    break;
                case 3: {
                    val = false;
                    break;
                }
            }
            count++;
        }
        }
        System.out.println("list of items you ordered : ");
        for(int i =0;i< objAll.length;i++){
            for(int j =0;j<objAll.length;j++) {
                if (objAll[i][j] != null) {
                    System.out.println(objAll[i][j]);
                    System.out.println("*********************************");
                    totalPrice += objAll[i][j].getPrice();
                }
            }
        }
        System.out.println("Total Price: "+totalPrice);
        payment();


    }

    public static TimGetData[] selectMenuConsumable(){
        Scanner scanner = new Scanner(System.in);
        TimGetData[] arr = new TimGetData[100];
        int i = 0;
        if (i < arr.length) {
            System.out.println("select your items: \n 1.Coffee \n 2.Bagel \n 3.Donuts \n 4.Sandwich \n 5.Wrap");
            switch (scanner.nextInt()) {
                case 1: {
                    arr[i] = new Coffee();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
                case 2: {
                    arr[i] = new Bagel();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
                case 3: {
                    arr[i] = new Donuts();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
                case 4: {
                    arr[i] = new Sandwich();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
                case 5: {
                    arr[i] = new Wrap();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
            }
            i++;
        }
        return arr;
    }



    public static TimGetData[] selectMenuMerchandise() {
        Scanner scanner = new Scanner(System.in);
        TimGetData[] arr = new TimGetData[100];
        int i = 0;
        if (i < arr.length) {
            System.out.println("select your items: \n 1.Coffee powder \n 2.GiftCards \n 3.Hockey Cards \n 4.Mug");
            switch (scanner.nextInt()) {
                case 1: {
                    arr[i] = new CoffeePowder();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
                case 2: {
                    arr[i] = new GiftCards();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
                case 3: {
                    arr[i] = new HockeyCards();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
                case 4: {
                    arr[i] = new Mug();
                    System.out.println("Select \n1. Order this \n2.Choose Again");
                    if(scanner.nextInt()==2){
                        arr[i]=null;
                    }
                    break;
                }
            }
            i++;
        }
        return arr;
    }

    public static void payment(){
        Scanner sc = new Scanner(System.in);
        Pattern pattern;
        Matcher matcher;
        String reCardNo = "[0-9]{12}";
        String reExpiry = "[0 1][1-9]/[2 3][0-9]";
        String reCvv = "[0-9]{3}";
        System.out.println("Proceeding to payment ");
        System.out.println("Enter your 12 digit card number");
        pattern = Pattern.compile(reCardNo);
        String cardNo = sc.next();
        matcher=pattern.matcher(cardNo);
        while(!matcher.matches()){
            System.out.println("Enter the correct card number");
            cardNo=sc.next();
            matcher=pattern.matcher(cardNo);
        }
        System.out.println("Please enter the expiry month and year in MM/YY format ");
        pattern = Pattern.compile(reExpiry);
        String mmyy= sc.next();
        matcher=pattern.matcher(mmyy);
        while(!matcher.matches()){
            System.out.println("Enter the correct expiry month and year");
            mmyy=sc.next();
            matcher=pattern.matcher(mmyy);
        }
        System.out.println("Please enter 3 digit CVV");
        String cvv = sc.next();
        pattern = Pattern.compile(reCvv);
        matcher=pattern.matcher(cvv);
        while(!matcher.matches()){
            System.out.println("Enter the correct cvv number");
            cvv=sc.next();
            matcher=pattern.matcher(cvv);
        }
        System.out.println("PAYMENT SUCCEEDED..\n Thank you for ordering");
    }
}
