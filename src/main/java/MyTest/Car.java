package MyTest;

public class Car {
    
    static int id;
    Boolean check;
    String name;

    public Car() {
        
    }
    
    public static void show() {
        System.out.println(id);
    }
    public Car(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + "]";
    }

    
    

}
