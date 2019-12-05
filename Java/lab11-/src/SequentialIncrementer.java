public class SequentialIncrementer implements increment {
	double value = 0;
	
	public void Increment()
	{
		value = value + 1;
	}
	public double getValue()
	{
		return value;
	}
}
