public class King extends Piece {
    static final int IMPORTANCE = 1000;

    public King() {
        this(true);
    }

    public King(boolean isWhite) {
        super(isWhite, IMPORTANCE);
    }

    @java.lang.Override
    public String toString() {
        return "King{value='" + getValue() + "'}";
    }

    /*
    TODO: override isValidMove().
     */

    @Override
    public boolean isValidMove(Position newPosition, Piece[][] board) {
        if (!super.isValidMove(newPosition, board)){
            return false;
        }

        if (Math.abs(curPos.getCol() - newPosition.getCol()) <= 1 &&
            Math.abs(curPos.getRow() - newPosition.getRow()) <= 1){
            return true;
        }

        return false;
    }
}
