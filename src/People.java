public class People {
    public String name;
    public  int age;
    public  String color;
   public   int heigth;
    Laptop laptop=new Laptop();

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", heigth=" + heigth +
                ", laptop=" + laptop +
                '}';
    }
}
