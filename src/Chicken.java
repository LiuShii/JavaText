class Chicken extends Animal implements Food {


    Chicken(String name) {
        super(name);
    }

    @Override
    public void shout() {
        System.out.println(getName()+"�����ҽУ�");
    }

    @Override
    public void eat(Food food) {
        System.out.println(getName()+"���ڳ����������"+food.getName());
    }

    @Override
    public String getName() {
        return "С����";
    }
}
