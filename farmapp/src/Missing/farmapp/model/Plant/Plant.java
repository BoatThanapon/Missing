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

<<<<<<< HEAD
	public int getAge();

	public void setAge(int age);

	public int getLifeCycle();

	public void setLifeCycle(int lifeCycle);
=======
		if (age > seedling) {
			state = "seedling";
		}
		if (age > mature) {
			state = "mature";
		}
		if (age > dead) {
			state = "dead";
		}
		
		if (state.equals("mature")){ 
			int numberOfFruit=0;
			if(fruit==null){
				fruit = GameController.getFruit(name);
				numberOfFruit++;
			}else{
				if(currentHealth == maxHealth){
					numberOfFruit++;
				}
				if(currentWater == maxWater){
					numberOfFruit++;
				}
			}
			fruit.addAmount(numberOfFruit);
			System.out.println("Your " + name + " has produced " + numberOfFruit);
			
		}
		
		if(currentWater == maxWater){
			increaseCurrentHealth();
		}
		decreaseCurrentWater();
		if (currentWater == 0) {
			decreaseCurrentHealth();
		}
		
		if (currentHealth == 0) {
			state = "dead";
			System.out.println("Your " + name + " has dead.");
			if(fruit!=null){
				fruit=null;
				System.out.println("Your " + name + "'s fruit has dead");
			}
		}
	}
>>>>>>> parent of fc29180... Fixed model and controller class
	
	public void settype(String type);

	public String gettype();
	
}
