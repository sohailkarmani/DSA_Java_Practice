
LinkedList<DataType> linkedListName = new LinkedList<>();  // Declaration

linkedListName.add(element);              // Adds the element at the end of the LinkedList
linkedListName.addFirst(element);         // Adds the element at the beginning of the LinkedList
linkedListName.addLast(element);          // Adds the element at the end of the LinkedList
linkedListName.add(index, element);       // Adds the element at the specified index in the LinkedList

DataType element = linkedListName.get(index);   // Retrieves the element at the specified index

linkedListName.set(index, newValue);    // Updates the element at the specified index with a new value

linkedListName.remove();                 // Removes the first element from the LinkedList
linkedListName.removeFirst();            // Removes the first element from the LinkedList
linkedListName.removeLast();             // Removes the last element from the LinkedList
linkedListName.remove(index);            // Removes the element at the specified index from the LinkedList

int size = linkedListName.size();        // Returns the number of elements in the LinkedList

boolean isEmpty = linkedListName.isEmpty();  // Checks if the LinkedList is empty

for (DataType element : linkedListName) {
    // Process each element
}

int index = linkedListName.indexOf(element);   // Returns the index of the first occurrence of the element in the LinkedList
boolean contains = linkedListName.contains(element);  // Checks if the LinkedList contains the specified element

Collections.reverse(linkedListName);   // Reverses the elements in the LinkedList
