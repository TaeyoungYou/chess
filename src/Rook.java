public class Rook extends ChessObject{
    private int posX;
    private int posY;
    public Rook(int x,int y){
        super(x,y);
        this.posX = x;
        this.posY = y;
    }
    public String printObject(){
        return "R";
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
}
class WhiteRook extends Rook{
    public WhiteRook(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♖";
    }
}
class BlackRook extends Rook{
    public BlackRook(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♜";
    }
}