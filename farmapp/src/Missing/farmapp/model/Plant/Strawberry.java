package Missing.farmapp.model.Plant;

public class Strawberry implements Plant {
	private String name = "Strawberry";
	private int healthContainer = 5;
	private int currentHealth = 5;
	private int waterContainer = 2;
	private int currentWater = 2;
	private int age = 0;
	private int lifeCycle = 5;
	private String type = null;

	public String getName() {
		return name;
	}

	public int getHealthContainer() {
		return healthContainer;
	}

	public void setHealthContainer(int healthContainer) {
		this.healthContainer = healthContainer;
	}

	public int getCurrentWater() {
		return currentWater;
	}

	public void setCurrentWater(int currentWater) {
		this.currentWater = currentWater;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return currentHealth;
	}

	public void setHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public int getWaterContainer() {
		return waterContainer;
	}

	public void setWaterContainer(int waterContainer) {
		this.waterContainer = waterContainer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLifeCycle() {
		return lifeCycle;
	}

	public void setLifeCycle(int lifeCycle) {
		this.lifeCycle = lifeCycle;
	}

	public void settype(String type) {
		this.type = type;
		
	}

	public String gettype() {
		// TODO Auto-generated method stub
		return this.type;
	}
}
