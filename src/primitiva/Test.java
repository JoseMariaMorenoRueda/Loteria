package primitiva;

public class Test {
    public static void main(String[] args) {

        int[] a = {15, 26, 8, 45, 17, 26, 39};


        Block myBlock = new Block(a);
        System.out.println(myBlock);

        Block myBlock2 = new Block(10);
        for (int i = 0; i < myBlock2.arrayNumber.length; i++) {
            if (i ==  myBlock2.arrayNumber.length - 1) {
                System.out.println(myBlock2.getNumbers()[i]);
            } else {
                System.out.print(myBlock2.getNumbers()[i] + " - ");
            }
        }

        Block myBlock3 = new Block(6);
        System.out.println(myBlock3);


        Ticket myTicket = new Ticket(7);
        System.out.println(myTicket);

        System.out.println("----------");
        myTicket.printUsedNumbers();

    }
}
