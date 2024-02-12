public class King extends ChessObject{
    private int posX;
    private int posY;
    public King(int x,int y){
        super(x,y);
        this.posX = x;
        this.posY = y;
    }
    public String printObject(){
        return "K^";
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
}
class WhiteKing extends King{
    public WhiteKing(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♔";
    }
}
class BlackKing extends King{
    public BlackKing(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♚";
    }
}