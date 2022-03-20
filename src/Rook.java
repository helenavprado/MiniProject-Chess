public class Rook extends Piece {
    static final int IMPORTANCE = 5;

    public Rook() {
        this(true);
    }

    public Rook(boolean isWhite) {
        super(isWhite, IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Rook{value='" + getValue() + "'}";
    }

    /*
    TODO: override isValidMove().
     */

    @Override
    public boolean isValidMove(Position newPosition, Piece[][] board) {
        if (!super.isValidMove(newPosition, board)) {
            return false;
        }

        if (Math.abs(curPos.getCol() - newPosition.getCol()) <= 7 &&
                Math.abs(curPos.getRow() - newPosition.getRow()) == 0){
            return true;
        } else if (Math.abs(curPos.getRow() - newPosition.getRow()) <= 7 &&
                Math.abs(curPos.getCol() - newPosition.getCol()) == 0) {
            return true;

        }
        return false;
    }
}