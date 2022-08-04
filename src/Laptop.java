public class Laptop {
    int memory=256;
     String brand="Apple" ;
     String color="black";
      String model="Macbook";
      int weight;
      int ram=8;
     int price;

    @Override
    public String toString() {
        return "\nLaptop{" +
                "memory=" + memory +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}

