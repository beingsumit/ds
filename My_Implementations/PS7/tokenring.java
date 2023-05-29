package PS7;

import java.util.*;

public class tokenring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the tokens:");
        n = sc.nextInt();
        int sender, receiver;
        System.out.println("Enter the Sender:");
        sender = sc.nextInt();
        System.out.println("Enter the Receiver:");
        receiver = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the message:");
        String message = sc.nextLine();
        boolean msg_sent = false;
        for (int i = 0; i < n; i++) {
            if (i == sender) {
                System.out.println("Sender found. Sending the message.");
                msg_sent = true;
            } else if (i == receiver) {
                System.out.println("Receiver Found. Message received.");
                System.out.println("Message is:" + message);
                msg_sent = false;
            }
            if (msg_sent) {
                System.out.println(i + " is sending token to" + (i + 1) % n);
            }
        }
        sc.close();
    }
}
