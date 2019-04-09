//测试类
public class TestDemo {
    public static void main(String[] args) {
        Feeder feeder = new Feeder("花花");
        feeder.speak();        
        Dog dog = new Dog("小布丁");
        Food food = new Bone();
        feeder.feed(dog, food);  
        Tiger tiger = new Tiger("小猫崽");
        food = new Chicken("小公鸡");
        feeder.feed(tiger , food);
    }

}