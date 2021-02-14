package primitiva;


import java.util.Arrays;

public class Ticket {
    private int qtyBlocks;
    Block[] arrayBlocks;

    public Ticket(int n) {
        this.qtyBlocks = n;
        arrayBlocks = new Block[qtyBlocks];
        for (int i = 0; i < qtyBlocks; i++) {
            arrayBlocks[i] = new Block(6);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int j= 0; j < this.qtyBlocks; j++) {
            Arrays.sort(arrayBlocks[j].arrayNumber);
            for (int i = 0; i < arrayBlocks[j].arrayNumber.length; i++) {
                if (i ==  arrayBlocks[j].arrayNumber.length - 1) {
                    str += arrayBlocks[j].getNumbers()[i] + "\n";
                } else {
                    str += arrayBlocks[j].getNumbers()[i] + " - ";
                }
            }
        }
        return str;
    }

    public void printUsedNumbers() {
        boolean[] usedNumbers = new boolean[50];
        boolean firstOne = true;
        for (int i = 0; i < 50; i++) {
            usedNumbers[i] = false;
        }
        for (int numBlock = 0; numBlock < arrayBlocks.length; numBlock++) {
            int[] numbers = arrayBlocks[numBlock].getNumbers();
            for (int i = 0; i < numbers.length; i++) {
                int n = numbers[i];
                usedNumbers[n] = true;
            }
        }
        for (int i = 1; i <= 49; i++) {
            if (usedNumbers[i]) {
                if (firstOne){
                    System.out.print(i);
                    firstOne = false;
                } else {
                    System.out.print(", " + i);
                }
            }
        }
        System.out.println();
    }

}
