

class Dog extends Animal{
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void shout() {
		System.out.println("���~~");
	}
	public void eat(Food food) {
		System.out.println(getName()+"���ڳ����������"+food.getName());
		
	}
	
}

