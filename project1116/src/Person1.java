
class Person1 {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() { //데이터를 쓸 수 있도록 해주는 get
		return weight;
	}
}


class Student1 extends Person1{
	void set() {
		super.age = 30;
		super.name = "홍길동";
		super.height = 175;
		// weight = 99; /private이기 때문에 공개하지 않음
		super.setWeight(99);
	}
}