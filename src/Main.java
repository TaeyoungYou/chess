import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.String.format;

public class Main{
    static Board board;
    static ArrayList<Pawn> whitePawns = new ArrayList<>();
    static ArrayList<Pawn> blackPawns = new ArrayList<>();
    static ArrayList<Knight> whiteKnights = new ArrayList<>();
    static ArrayList<Knight> blackKnights = new ArrayList<>();
    static ArrayList<Bishop> whiteBishops = new ArrayList<>();
    static ArrayList<Bishop> blackBishops = new ArrayList<>();
    static ArrayList<Rook> whiteRooks = new ArrayList<>();
    static ArrayList<Rook> blackRooks = new ArrayList<>();
    static ArrayList<Queen> whiteQueens = new ArrayList<>();
    static ArrayList<Queen> blackQueens = new ArrayList<>();
    static King whiteKing = new WhiteKing(4,0);
    static King blackKing = new BlackKing(4,7);


    public static void main(String[] args) throws InterruptedException{
        boolean stop = false;
        init();
        while(!stop){
            update();
            render();
        }
        release();
    }
    public static void init() {
        for (int i = 0; i < 8; i++) {
            whitePawns.add(new WhitePawn(i, 1));
            blackPawns.add(new BlackPawn(i, 6));
        }
        whiteKnights.add(new WhiteKnight(1,0));
        whiteKnights.add(new WhiteKnight(6,0));
        blackKnights.add(new BlackKnight(1,7));
        blackKnights.add(new BlackKnight(6,7));
        whiteBishops.add(new WhiteBishop(2,0));
        whiteBishops.add(new WhiteBishop(5,0));
        blackBishops.add(new BlackBishop(2,7));
        blackBishops.add(new BlackBishop(5,7));
        whiteRooks.add(new WhiteRook(0,0));
        whiteRooks.add(new WhiteRook(7,0));
        blackRooks.add(new BlackRook(0,7));
        blackRooks.add(new BlackRook(7,7));
        whiteQueens.add(new WhiteQueen(3,0));
        blackQueens.add(new BlackQueen(3,7));

        board = new Board(whitePawns,blackPawns,whiteKnights,blackKnights,whiteBishops,blackBishops,whiteRooks,blackRooks,whiteQueens,blackQueens,whiteKing,blackKing);
    }
    public static void update(){

    }
    public static void render() throws InterruptedException{
        board.printChessBoard();
        Thread.sleep(100000);
    }
    public static void release(){

    }
}
