package com.learning;
import java.io.*;
import java.util.ArrayList;


public class ChessKnightMain {
    public static void main (String[] args) {

        int i;
        ArrayList<Character> chArr = new ArrayList<>();
        Character c;

        try(FileInputStream fin = new FileInputStream("INPUT.txt")) {
            do {
                i = fin.read();
                if (i != -1) {
                    c = (char) i;
                    chArr.add(c);
                }
            } while (i != -1);
        }catch(IOException e){}

        ChessKnight ch = new ChessKnight(chArr.get(0), chArr.get(1),
                chArr.get(2), chArr.get(3), chArr.get(4));

        try(FileWriter fw = new FileWriter("OUTPUT.txt")) {
            if (chArr.size() != 5 || !(ch.isHyphen && ch.isRightNumbers && ch.isRightChars)) {
                fw.write("ERROR");
                return;
            }
            else {
                ch.checkKnightTurn();
            }
        }catch(IOException e){}
    }
}



