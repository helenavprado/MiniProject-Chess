public class Queen extends Piece {
    static final int IMPORTANCE = 9;

    public Queen() {
        this(true);
    }

    public Queen(boolean isWhite) {
        super(isWhite, IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Queen{value='" + getValue() + "'}";
    }

    /*
    TODO: override isValidMove().
     */

    @Override
    public boolean isValidMove(Position newPosition, Piece[][] board) {
        if (!super.isValidMove(newPosition, board)) {
            return false;
        }

        return true;
    }
}
