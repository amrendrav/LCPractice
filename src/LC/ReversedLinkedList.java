package LC;

public class ReversedLinkedList {

    private class Node{
        int val;
        Node next;
        Node(int sth ){this.val = sth;}
    }

    public Node reversedNode(Node inputNode){
        //Iterative
        /*Node reversed = null;
        Node current = inputNode;
        while (inputNode != null){
            Node tempNode = inputNode.next;
            inputNode.next = reversed;
            reversed = current;
            current = tempNode;
        }
        return reversed;*/
        Node result = null;
        while(inputNode != null){
            Node nextNode = inputNode.next;
            inputNode.next = result;
            result = inputNode;
            inputNode = nextNode;

        }
        return result;

        //recursive solution
       /* if(inputNode == null || inputNode.next == null )return inputNode;
        Node reversedList = reversedNode(inputNode.next);
        inputNode.next.next = inputNode;
        inputNode.next = null;
        return reversedList;*/
    }
}
