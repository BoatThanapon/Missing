package Missing.farmapp.model.Plant;

public interface Plant {
	String name = null;
	int health = 0;
	int waterContainer = 0;		//Maximun water eg. 4/5
	int age = 0;
	int lifeCycle = 0;
	String type= null;

	public String getName();

	public void setName(String name);

	public int getHealth();

	public void setHealth(int health);

	public int getWaterContainer();

	public void setWaterContainer(int waterContainer);

	public int getAge();

	public void setAge(int age);

	public int getLifeCycle();

	public void setLifeCycle(int lifeCycle);
	
	public void settype(String type);

	public String gettype();
	
}
