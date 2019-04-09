

class Dog extends Animal{
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void shout() {
		System.out.println("嗷呜~~");
	}
	public void eat(Food food) {
		System.out.println(getName()+"正在吃着香喷喷的"+food.getName());
		
	}
	
}

