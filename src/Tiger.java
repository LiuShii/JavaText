class Tiger extends Animal{
	public Tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void shout() {
		System.out.println("����~~");
	}
	public void eat(Food food) {
		System.out.println(getName()+"���ڳ����������"+food.getName());
		
	}
	
}