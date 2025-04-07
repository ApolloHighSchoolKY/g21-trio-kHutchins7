//Write your answer here
Public class Trio implement MenuItem{
    private String title;
    private double price;

    Public Trio(Sandwich sandwich, Saled salad, Drink drink){
        this.title = sandwich.getName() + salad.getName + drink.getName() + "Trio";
        double price1 = sandwich.getPrice();
        double price2 = salad.getPrice();
        double price3 = drink.getPrice();
        if(price1 <= price2 && price1 <= price3){
            this.price = price2 + price3;
        }else if(price2 <=price1 && price2<= price3){
            this.price = price1 + price3;
        }
        else{
            this.price = price1 + price2;
        }
    }
    public String getName(){
        return name;
    }
    public double getPrice() {
        return price;
    }
}