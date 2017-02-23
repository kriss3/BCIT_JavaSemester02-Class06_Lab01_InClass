package pl.kriss3.bcit;

public class King extends ChessPiece 
{
	public static final int KING_VALUE = 1000;
	
	public King()
	{
		super(KING_VALUE);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "";
	}
	
	@Override
	public void move()
	{
		System.out.println("one square");
	}
}
