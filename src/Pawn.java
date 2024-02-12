public class Pawn extends ChessObject{
    private int posX;
    private int posY;
    public Pawn(int x, int y){
        super(x,y);
        this.posX = x;
        this.posY = y;
    }
    public String printObject(){
        return "P";
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
}
class WhitePawn extends Pawn{
    public WhitePawn(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♙";
    }
}
class BlackPawn extends Pawn{
    public BlackPawn(int x, int y){
        super(x,y);
    }
    public String printObject(){
        return "♟";
    }
}