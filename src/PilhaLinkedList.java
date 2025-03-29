import java.util.LinkedList;

public class PilhaLinkedList {
    
    private LinkedList<Integer> list;

    public PilhaLinkedList() {
        list = new LinkedList<>();
    }

    public void push(int value) {
        list.addFirst(value); 
    }

    
    public int pop() {
        if (list.isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return list.removeFirst();
    }

    
    public int imprimeTopo() {
        if (list.isEmpty()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return list.getFirst(); 
    }

  



}
