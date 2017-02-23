package pl.kriss3.bcit;

/**
 * Chess Piece class to abstract chess piece.
 * It should be able to represent any chess piece on the chess board;
 * @author kszczurowski
 * @since 2017-02-17
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class06_Lab01_InClass.git
 */
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
	
	@Override
	public String toString()
	{
		return String.format("%5s %6s %4s", color, this.getClass().getSimpleName(),value);
	}
}
