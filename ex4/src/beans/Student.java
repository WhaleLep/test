package beans;

public class Student {
	private int id;
	private String name;
	private int age;
	private String sex;
	private float weight;
	private float height;
	public Student() {}
	public Student(int id, String name, String sex, int age, float weight, float height) {
		super();
		this.id = id;
		this.name = name;
		this.sex=sex;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
}
