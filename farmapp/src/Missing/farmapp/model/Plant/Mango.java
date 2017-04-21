package Missing.farmapp.model.Plant;

public class Mango implements Plant{
	private String name = "Mango";
	private int healthContainer = 10;
	private int currentHealth = 5;
	private int waterContainer = 7;
	private int currentWater = 5;
	private int age = 0;
	private int lifeCycle = 5;
	private String type = null;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public int getHealth() {
		return currentHealth;
	}

	public void setHealth(int health) {
		this.healthContainer = health;
		
	}

	public int getWaterContainer() {
		return waterContainer;
	}

	public void setWaterContainer(int waterContainer) {
		this.waterContainer = waterContainer;
		
	}

	public int getAge() {
		return  age;
	}

	public void setAge(int age) {
		this.age = age;
		
	}

	public int getLifeCycle() {
		return  lifeCycle;
	}

	public void setLifeCycle(int lifeCycle) {
		this.lifeCycle = lifeCycle;
		
	}

	public void settype(String type) {
		this.type = type;
		
	}

	public String gettype() {
		return this.type;
	}

}
