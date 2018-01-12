package test.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;



public class TestList {

  /**
   * @param args
   * @throws InterruptedException 
   */
  public static void main(String[] args) throws InterruptedException {
    
    BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
    queue.add("one");
    queue.add("two");
    queue.add("three");
    queue.offer("three");
    queue.add("one");
    queue.put("five");
    queue.offer("six");
    queue.add("seven");
    
    System.out.println(queue);
    System.out.println(queue.element());
    System.out.println(queue.peek());
    
    System.out.println(queue.remove("joe"));
    System.out.println(queue.poll());
    System.out.println(queue);
    
    System.out.println(queue.poll());
    System.out.println(queue);
    System.out.println(queue.remove());
    System.out.println(queue);
    
    
    
  }


}
