package pl.kriss3.bcit;

public class Rook extends ChessPiece 
{
	public static final int ROOK_VALUE = 2;
	
	public Rook()
	{
		super(ROOK_VALUE);
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	@Override
	public void move()
	{
		System.out.println("horizontally or vertically");
	}
	
}
