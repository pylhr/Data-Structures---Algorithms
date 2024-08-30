public class dynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    // Constructor to initialize the dynamic array with a default capacity
    public dynamicArray() {
        array = new int[2];
        size = 0;
        capacity = 2;
    }

    // Method to add an element to the dynamic array
    public void add(int element) {
        if (size == capacity) {
            resize();
        }
        array[size++] = element;
    }

    // Method to resize the array when it reaches capacity
    private void resize() {
        int[] newArray = new int[capacity * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        capacity *= 2;
    }

    // Method to get the size of the dynamic array
    public int getSize() {
        return size;
    }

    // Method to get an element at a specific index
    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    // Main method to test the DynamicArray class
    public static void main(String[] args) {
        // Create a new DynamicArray
        dynamicArray dynamicArray = new dynamicArray();

        // Add elements to the array
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);

        // Display the size of the array
        System.out.println("Size of array: " + dynamicArray.getSize()); // Expected: 4

        // Display elements at various indices
        System.out.println("Element at index 0: " + dynamicArray.get(0)); // Expected: 1
        System.out.println("Element at index 1: " + dynamicArray.get(1)); // Expected: 2
        System.out.println("Element at index 2: " + dynamicArray.get(2)); // Expected: 3
        System.out.println("Element at index 3: " + dynamicArray.get(3)); // Expected: 4

        // Add another element to trigger resizing
        dynamicArray.add(5);

        // Display the new size of the array after resizing
        System.out.println("Size of array after adding another element: " + dynamicArray.getSize()); // Expected: 5

        // Display the new element
        System.out.println("Element at index 4: " + dynamicArray.get(4)); // Expected: 5

        // Testing out-of-bounds access
        try {
            dynamicArray.get(5); // This should throw an exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage()); // Expected: Index out of bounds
        }
    }
}
