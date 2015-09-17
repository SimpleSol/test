package com.learning;

import java.io.FileWriter;
import java.io.IOException;

public  class ChessKnight {
    private char a1;
    private char a2;
    private char c1;
    private char c2;
    private char hyphen;
    boolean isHyphen;
    boolean isRightNumbers;
    boolean isRightChars;




    public ChessKnight(char c1, char a1, char hyphen, char c2, char a2){
        this.c1 = c1;
        this.a1 = a1;
        this.hyphen = hyphen;
        this.c2 = c2;
        this.a2 = a2;
        isHyphen = hyphen == '-';
        isRightNumbers = (checkNumbers(a1) && checkNumbers(a2));
        isRightChars = (checkChars(c1) && checkChars(c2));
    }

    private boolean checkNumbers(char a){
        return (a < 57 && a > 48);
    }

    private boolean checkChars(char c){
        return (c < 73 && c > 54);
    }

    void checkKnightTurn(){
        try(FileWriter fw = new FileWriter("OUTPUT.txt")){
            if( (Math.abs(a1 - a2) == 2 && Math.abs(c1 - c2) == 1 ) ||
                    (Math.abs(a1 - a2) == 1 && Math.abs(c1 - c2) == 2 ) ){
                fw.write("YES");
            }

            else{
                fw.write("NO");
            }
        }catch (IOException e){}



    }
}


