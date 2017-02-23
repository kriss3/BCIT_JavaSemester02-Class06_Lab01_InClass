package pl.kriss3.bcit;

public class Pawn extends ChessPiece 
{
	public static final int PAWN_VALUE = 2;
	public Pawn()
	{
		super(PAWN_VALUE);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public void move()
	{
		System.out.println("forward 1");
	}
}
