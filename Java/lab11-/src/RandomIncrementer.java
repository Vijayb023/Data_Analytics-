public class RandomIncrementer implements increment {
	double value;
	
	public void Increment()
	{
		this.value = (int)(Math.random() * 50);
		value = value + (int)(Math.random() * 50);
	}
	public double getValue() 
	{
		return value;
	}
}
