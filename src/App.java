import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        PilhaLinkedList pilha = new PilhaLinkedList();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);


        System.out.println("Topo da pilha: " + pilha.imprimeTopo()); 

        pilha.pop();
         System.out.println("Topo da pilha: " + pilha.imprimeTopo()); 


         /* System.out.println("Pilha 2 "); */

         /* LinkedList<Integer> pilha2; */
         /* pilha2 = new LinkedList<>(); */
         /* pilha2.push(10); */
         /* pilha2.push(50); */
         /* System.out.println(pilha2.getFirst()); */
         /* pilha2.pop(); */
         /* System.out.println(pilha2.getFirst()); */
         /* pilha2.push(8); */
         /* System.out.println(pilha2.getFirst()); */

       


    }
}
