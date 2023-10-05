
public class Main {
    //See kood on püütonist ümber porditud Javasse Mart Trageli materjalidest.
    public static void main(String[] args)
    {
        QueueUsingArray Fifo = new QueueUsingArray(10);
        Fifo.enqueue(15);
        Fifo.enqueue(52);
        Fifo.enqueue(14);
        Fifo.enqueue(16);
        Fifo.enqueue(51);
        Fifo.enqueue(25);



        System.out.println("Esimesna lisatud liige: " + Fifo.peek()); // Prindib 15
        System.out.println("Järjekorra suurus: " + Fifo.size()); // Prindib 6

        System.out.println("Eemaldatav element: " + Fifo.dequeue()); // Prindib 15
        System.out.println("Järjekorra suurus pärast esimese eemaldamist: " + Fifo.size()); // Prindib 5

        System.out.println("Kas järjekord on tühi? " + Fifo.isEmpty()); // false
    }
}
