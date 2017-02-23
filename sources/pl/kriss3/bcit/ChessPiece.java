package pl.kriss3.bcit;

public class ChessPiece 
{
	private Color color;
	private int value;
	
	public ChessPiece(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setColor(Color c)
	{
		this.color = c;
	}
	
	public void move()
	{
		System.out.println("moving ...");
	}
	
	public String toString()
	{
		return String.format("%5s %6s %4s", color, this.getClass().getSimpleName(),value);
	}
}
