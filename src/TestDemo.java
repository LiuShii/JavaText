//������
public class TestDemo {
    public static void main(String[] args) {
        Feeder feeder = new Feeder("����");
        feeder.speak();        
        Dog dog = new Dog("С����");
        Food food = new Bone();
        feeder.feed(dog, food);  
        Tiger tiger = new Tiger("Сè��");
        food = new Chicken("С����");
        feeder.feed(tiger , food);
    }

}