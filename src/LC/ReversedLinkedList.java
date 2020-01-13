package LC;

public class ReversedLinkedList {

    private class Node{
        int val;
        Node next;
        Node(int sth ){this.val = sth;}
    }

    public Node reversedNode(Node inputNode){
        Node reversed = null;
        Node current = inputNode;
        while (inputNode != null){
            Node tempNode = inputNode.next;
            inputNode.next = reversed;
            reversed = current;
            current = tempNode;
        }
        return reversed;
    }
}
