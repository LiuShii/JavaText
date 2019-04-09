class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void shout() {
		System.out.println("喵呜~~");
	}
	public void eat(Food food) {
		System.out.println(getName()+"正在吃着香喷喷的"+food.getName());
		
	}
	
}