import java.util.ArrayList;

public class Board {
    private ChessObject[][] chessBoard = new ChessObject[8][8];

    public Board(ArrayList<Pawn> wp, ArrayList<Pawn> bp, ArrayList<Knight> wk, ArrayList<Knight> bk, ArrayList<Bishop> wb, ArrayList<Bishop> bb, ArrayList<Rook> wr, ArrayList<Rook> br, ArrayList<Queen> wq, ArrayList<Queen> bq, King wK, King bK){
        setChessBoard(wp,bp,wk,bk,wb,bb,wr,br,wq,bq,wK,bK);
    }
    public void setChessBoard(ArrayList<Pawn> wp, ArrayList<Pawn> bp, ArrayList<Knight> wk, ArrayList<Knight> bk, ArrayList<Bishop> wb, ArrayList<Bishop> bb, ArrayList<Rook> wr, ArrayList<Rook> br, ArrayList<Queen> wq, ArrayList<Queen> bq, King wK, King bK){
        for(int i=0;i<wp.size();i++){
            chessBoard[wp.get(i).getPosY()][wp.get(i).getPosX()]=wp.get(i);
            chessBoard[bp.get(i).getPosY()][bp.get(i).getPosX()]=wp.get(i);
        }
        for(int i=0;i<wk.size();i++){
            chessBoard[wk.get(i).getPosY()][wk.get(i).getPosX()]=wk.get(i);
        }
        for(int i=0;i<bk.size();i++){
            chessBoard[bk.get(i).getPosY()][bk.get(i).getPosX()]=bk.get(i);
        }
        for(int i=0;i<wb.size();i++){
            chessBoard[wb.get(i).getPosY()][wb.get(i).getPosX()]=wb.get(i);
        }
        for(int i=0;i<bb.size();i++){
            chessBoard[bb.get(i).getPosY()][bb.get(i).getPosX()]=bb.get(i);
        }
        for(int i=0;i<wr.size();i++){
            chessBoard[wr.get(i).getPosY()][wr.get(i).getPosX()]=wr.get(i);
        }
        for(int i=0;i<br.size();i++){
            chessBoard[br.get(i).getPosY()][br.get(i).getPosX()]=br.get(i);
        }
        for(int i=0;i<wq.size();i++){
            chessBoard[wq.get(i).getPosY()][wq.get(i).getPosX()]=wq.get(i);
        }
        for(int i=0;i<bq.size();i++){
            chessBoard[bq.get(i).getPosY()][bq.get(i).getPosX()]=bq.get(i);
        }
        chessBoard[wK.getPosY()][wK.getPosX()]=wK;
        chessBoard[bK.getPosY()][bK.getPosX()]=bK;
    }
    public void printChessBoard(){
        System.out.println(" +-----+-----+-----+-----+-----+-----+-----+-----+");
        for(int y=7;y>=0;y--){
            System.out.format("%d |",y+1);
            for(int x=0;x<8;x++){
                if(chessBoard[y][x]!=null){
                    System.out.format("ㅤ%sㅤ|",chessBoard[y][x].printObject());
                }
                else{
                    System.out.format("ㅤㅤㅤ|");
                }
            }
            System.out.println("\n +-----+-----+-----+-----+-----+-----+-----+-----+");
        }
        System.out.println("ㅤㅤㅤAㅤㅤㅤBㅤㅤㅤCㅤㅤㅤDㅤㅤㅤEㅤㅤㅤFㅤㅤㅤGㅤㅤㅤH");
    }
}
