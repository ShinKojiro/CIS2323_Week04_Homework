public class PopulateChessBoard{
    public static void main(String[] args){
        final int PIECES_PER_PLAYER = 16;
        //int[] wChessPieces = new int[PIECES_PER_PLAYER];
        //int[] bChessPieces = new int[PIECES_PER_PLAYER];
        ChessPiece[] wChessPieces = new ChessPiece[PIECES_PER_PLAYER];
        ChessPiece[] bChessPieces = new ChessPiece[PIECES_PER_PLAYER];

        int i = 0;
        int x = 0;
        int y1 = 2;
        int y2 = 7;
        while(i < PIECES_PER_PLAYER){
            wChessPieces[i] = new ChessPiece();
            bChessPieces[i] = new ChessPiece();
            wChessPieces[i].setColor("White");
            bChessPieces[i].setColor("Black");
            wChessPieces[i].setPieceNumber(i);
            bChessPieces[i].setPieceNumber(i);
            wChessPieces[i].setPosition((x + 1) , y1);
            bChessPieces[i].setPosition((x + 1) , y2);
            x++;
            if (x == 8){
                x = 0;
                y1--;
                y2++;
            }
            i++;
        }

        for(int j = 0; j < PIECES_PER_PLAYER; j++){
            System.out.println(wChessPieces[j].printInfo());
            //System.out.println(bChessPieces[j].printInfo());
        }
        for(int j = 0; j < PIECES_PER_PLAYER; j++){
            System.out.println(bChessPieces[j].printInfo());
            //System.out.println(bChessPieces[j].printInfo());
        }

    }
}