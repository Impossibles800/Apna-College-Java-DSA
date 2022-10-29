public class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal(in all 4 direction)");
    }
}
class Root implements ChessPlayer{
    public void moves(){
        System.out.println("Horizontal, Vertical");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all 1 direction)");
    }
}