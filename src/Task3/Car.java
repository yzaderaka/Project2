package Task3;

public class Car {
    /*
    Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
    which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and has its own implementation of calculateSalePrice()
    method in which returned price is calculated as following: if weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
    int carPrice;
    String color;
    Car(int carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }

    double calculateSalePrice() {
        return carPrice;
    }

}

class Sedan extends Car {
double lenght;

    Sedan(int carPrice, String color, double lenght) {
        super(carPrice, color);
        this.lenght=lenght;
    }

    @Override
    double calculateSalePrice() {
       if (lenght>20){
           return carPrice*0.95;
       }else return carPrice*0.9;
    }
}

class Truck extends Car {
    int weight;

    Truck(int carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    double calculateSalePrice() {
        if (weight>2000){
            return carPrice*0.9;
        }else return carPrice*0.8;

    }
}
class CarTest{
    public static void main(String[] args) {
        Sedan sedan=new Sedan(30000,"Green",18);
        Truck truck=new Truck(55000,"Black",21000);
        System.out.println(sedan.calculateSalePrice());
        System.out.println(truck.calculateSalePrice());
    }
}
