package Ch04;

class Dog {
	int size;
	String name;
	
	void bark() {
		if (size > 60) {
			System.out.println("Woof Woof!");
		} else if (size > 14) {
			System.out.println("Ruff Ruff");
		} else {
			System.out.println("Yip Yip");
		}
	}
	
	void bark2(int numOfBarks) {
		while (numOfBarks > 0) {
			System.out.print("ruff!  ");
			numOfBarks = numOfBarks - 1;
		}
	}
}

class DogTestDrive {
	public static void main (String[] args){
	
	//int rand = (int) (Math.random() * 100);
		
	Dog one = new Dog();
	one.size = (int) (Math.random() * 400);
	
	Dog two = new Dog();
	two.size = (int) (Math.random() * 400);
	
	Dog three = new Dog();
	three.size = (int) (Math.random() * 400);
	
	System.out.println(one.size);	
	one.bark();
	System.out.println(two.size);
	two.bark();
	System.out.println(three.size);
	three.bark();
	//one.bark2(one.size);
	//two.bark2(two.size);
	//three.bark2(three.size);
	}
}