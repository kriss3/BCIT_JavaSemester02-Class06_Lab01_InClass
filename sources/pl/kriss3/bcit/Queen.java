package pl.kriss3.bcit;

public class Queen extends ChessPiece 
{
	public static final int QUEEN_VALUE = 9;
	public Queen()
	{
		super(QUEEN_VALUE);
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public void move()
	{
		System.out.println("like a bishop or a rook");
	}
}
