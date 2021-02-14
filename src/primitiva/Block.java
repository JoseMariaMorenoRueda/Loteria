package primitiva;

import java.util.Arrays;

public class Block {
    int[] arrayAux = new int[49];
    int[] arrayNumber;
    int counter = 0;
    int qty;


    public Block(int n) {
        if (n < 6) {
            this.qty = 6;
        } else {
            if (n > 49) {
                this.qty = 49;
            } else {
                this.qty = n;
            }
        }
        for (int i = 0; i < 49; i++) {
            arrayAux[i] = i + 1;
        }
        arrayNumber = new int[qty];
        while (counter < qty) {
            int number = (int)(Math.random() * 49);

            if (arrayAux[number] != 0) {
                arrayNumber[counter] = arrayAux[number];
                arrayAux[number] = 0;
                counter++;
            }
        }
    }

    public Block(int[] anArray) {
        arrayNumber = new int[anArray.length];
        for (int i = 0; i < anArray.length; i++) {
            arrayNumber[i] = anArray[i];
        }
    }

    @Override
    public String toString() {
        Arrays.sort(this.arrayNumber);
        String str = "(";
        for (int i = 0; i < arrayNumber.length; i++) {
            if (i != arrayNumber.length - 1) {
                str += arrayNumber[i] + ", ";
            } else {
                str += arrayNumber[i] + ")";
            }
        }
        return str;
    }

    public int[] getNumbers() {
        int[] aux = new int[arrayNumber.length];
        for (int i = 0; i < arrayNumber.length; i++) {
            aux[i] = arrayNumber[i];
        }
        return aux;
    }

}


