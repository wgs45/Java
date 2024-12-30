// Name: 葉逢森, ID: 412416082, No: 7

// Description (a)
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

public class linkedListModif {

    public static void main(String[] args) {

        PlayerNode head = new PlayerNode(new Player(7, "Ajay", "NFL"));
        head.next = new PlayerNode(new Player(3, "Sarah", "Mario"));
        head.next.next = new PlayerNode(new Player(9, "Jin", "Golf"));
        head.next.next.next = new PlayerNode(new Player(5, "Joe", "Sonic"));


        PlayerNode previous = head;
        PlayerNode current = head.next;


        System.out.println("Before swapping:");
        printList(head);

        // Description (a) - Swapping the two middle nodes
        if (current != null && current.next != null) {

            PlayerNode temp = current.next;
            current.next = temp.next;
            temp.next = current;
            previous.next = temp;
        }


        System.out.println("After swapping:");
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

// Description (b)
class LLNode {
    private char grade;
    private LLNode next;

    // Description (b)
    public LLNode(char grade) {
        this.grade = grade;
        this.next = null;
    }

    // Description (c)
    public LLNode(char grade, LLNode next) {
        this.grade = grade;
        this.next = next;
    }

    // Description (d)
    public char getGrade() {
        return grade;
    }

    public LLNode getNext() {
        return next;
    }

    // Description (e)
    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }
}

