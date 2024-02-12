public class Bishop extends ChessObject{
    private int posX;
    private int posY;
    public Bishop(int x, int y){
        super(x,y);
        this.posX = x;
        this.posY = y;
    }
    public String printObject(){
        return "B";
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
}

class WhiteBishop extends Bishop{
    public WhiteBishop(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♗";
    }
}
class BlackBishop extends Bishop{
    public BlackBishop(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♝";
    }
}