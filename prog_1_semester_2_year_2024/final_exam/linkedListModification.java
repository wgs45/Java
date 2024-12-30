// Name: 葉逢森, ID: 412416082, No: 6
class Player {
    int id;
    String name;
    String game;


    public Player(int id, String name, String game) {
        this.id = id;
        this.name = name;
        this.game = game;
    }

    @Override
    public String toString() {
        return "(" + id + ", " + name + ", " + game + ")";
    }
}


class PlayerNode {
    Player player;
    PlayerNode next;


    public PlayerNode(Player player) {
        this.player = player;
        this.next = null;
    }
}


public class linkedListModification {


    public static void main(String[] args) {

        PlayerNode head = new PlayerNode(new Player(7, "Ajay", "NFL"));
        head.next = new PlayerNode(new Player(3, "Sarah", "Mario"));
        head.next.next = new PlayerNode(new Player(9, "Jin", "Golf"));
        head.next.next.next = new PlayerNode(new Player(5, "Joe", "Sonic"));


        PlayerNode previous = head;


        System.out.println("Before deletion:");
        printList(head);


        if (previous.next != null && previous.next.next != null) {
            previous.next = previous.next.next; 
        }


        System.out.println("After deletion:");
        printList(head);
    }


    private static void printList(PlayerNode head) {
        PlayerNode current = head;
        while (current != null) {
            System.out.print(current.player + " → ");
            current = current.next;
        }
        System.out.println("null");
    }
}

