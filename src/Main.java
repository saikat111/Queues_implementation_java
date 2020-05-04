public class Main {
 public  static  void main(String args[]){
     Queue queue = new Queue(10);
     queue.add(10);
     queue.add(20);
     queue.add(30);
     queue.printQueue();
     queue.remove();
     System.out.println("----->");
     queue.printQueue();
     System.out.println("----->");
     System.out.println(queue.front);
     System.out.println(queue.back);
     System.out.println("----->");


 }

}
