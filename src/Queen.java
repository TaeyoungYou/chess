public class Queen extends ChessObject{
    private int posX;
    private int posY;
    public Queen(int x, int y){
        super(x,y);
        this.posX = x;
        this.posY = y;
    }
    public String printObject(){
        return "Q";
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
}
class WhiteQueen extends Queen{
    public WhiteQueen(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♕";
    }
}
class BlackQueen extends Queen{
    public BlackQueen(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♛";
    }
}