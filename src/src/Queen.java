
public class Queen extends Piece {
	
	public static final String UNICODE_PIECE_WHITE = "\u2655";
	public static final String UNICODE_PIECE_BLACK = "\u265B";
	
	Queen(Color color) {
		super(color);
		
		String unicodePiece = Queen.UNICODE_PIECE_WHITE;
		if (color == Color.BLACK) {
			unicodePiece = Queen.UNICODE_PIECE_BLACK;
		}
		this.setUnicodePiece(unicodePiece);
	}

	@Override
	public Coordinate[] getDefaultCoordinates() {
		
		Coordinate[] coordinates = new Coordinate[1];
 		
		if (this.getColor() == Color.WHITE) {
			coordinates[0] = new Coordinate('1', 'd');
		} else {
			coordinates[0] = new Coordinate('8', 'd');
		}
		
		return coordinates;
		
	}
	
	@Override
	public boolean isValidRuleMove(Coordinate origin, Coordinate destination) {
		return origin.isHorizontalDirection(destination) || origin.isVerticalDirection(destination) ||
				origin.isDiagonalDirection(destination);
	}
	
	
	
}
