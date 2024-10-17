package com.cbfacademy;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
    
        // Add elements to the list
        list.addFirst(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(9);
        list.addLast(2);
        list.add(2, 4); // Add 4 as the 3rd element (index 2)
    
        // Invoke the method element() on the list and print the result
        System.out.println("First element (using element()): " + list.element());
    
        // Return the list
        return list;
    }
    

    
        public Stack<Integer> useStack() {
            Stack<Integer> stack = new Stack<>();
        
            // Add elements to the stack
            stack.push(5);
            stack.push(6);
            stack.push(8);
            stack.push(9);
        
            // Print the first and last elements (the top element is the first in a stack)
            System.out.println("First element (top of stack): " + stack.peek());
            System.out.println("Last element (bottom of stack): " + stack.firstElement());
        
            // Invoke the pop() method and print the result
            System.out.println("Popped element: " + stack.pop());
        
            // Push 4 onto the stack
            stack.push(4);
        
            // Return the stack
            return stack;
        }
        

        public ArrayDeque<Integer> useArrayDeque() {
            ArrayDeque<Integer> deque = new ArrayDeque<>();
        
            // Add elements to the deque
            deque.add(5);
            deque.add(6);
            deque.add(8);
            deque.add(9);
        
            // Print the first and last elements
            System.out.println("First element: " + deque.getFirst());
            System.out.println("Last element: " + deque.getLast());
        
            // Invoke the poll() method and print the result
            System.out.println("Polled element: " + deque.poll());
        
            // Invoke the element() method and print the result
            System.out.println("Element at the head: " + deque.element());
        
            // Return the deque
            return deque;
        }
        
        public HashMap<Integer, String> useHashMap() {
            HashMap<Integer, String> map = new HashMap<>();
        
            // Add entries to the map
            map.put(1, "TypeScript");
            map.put(2, "Kotlin");
            map.put(3, "Python");
            map.put(4, "Java");
            map.put(5, "JavaScript");
            map.put(6, "Rust");
        
            // Determine and print the set of keys
            System.out.println("Keys: " + map.keySet());
        
            // Determine and print the set of values
            System.out.println("Values: " + map.values());
        
            // Check if the map contains "English" as a language
            System.out.println("Contains 'English'? " + map.containsValue("English"));
        
            // Return the map
            return map;
        }
        
    public String getName() {
        return "Collections Exercises";
    }
}
