class Chicken extends Animal implements Food {


    Chicken(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.println(getName()+"发出惨叫！");
    }

    @Override
    public void eat(Food food) {
        System.out.println(getName()+"正在吃着香喷喷的"+food.getName());
    }

    @Override
    public String getName() {
        return "小公鸡";
    }
}
