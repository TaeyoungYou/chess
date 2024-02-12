public class Knight extends ChessObject{
    private int posX;
    private int posY;
    public Knight(int x, int y){
        super(x,y);
        this.posX = x;
        this.posY = y;
    }
    public String printObject(){
        return "K";
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
}
class WhiteKnight extends Knight{
    public WhiteKnight(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♘";
    }
}
class BlackKnight extends Knight{
    public BlackKnight(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♞";
    }
}