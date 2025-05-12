public class OOPS {
        public static void main(String[] args) {
            InnerOOPS obj = new InnerOOPS();
            obj.name = "John";
            obj.age = 25;
            obj.display();
        }
}
class InnerOOPS {

    String name;
    int age;

    public void display() {
        System.out.println("This is an inner class");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}