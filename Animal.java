
//动物抽象类
public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void shout();
    public abstract void eat(Food food);//动物吃食之前先叫一声，然后打印***正在吃着香喷喷的***
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


	

