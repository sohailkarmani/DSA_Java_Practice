
int[] arrayName;                            // Declaration
arrayName = new int[size];                  // Initialization with specified size
int[] arrayName = new int[]{1, 2, 3, 4, 5};  // Declaration and initialization with values

int element = arrayName[index];  // Accessing the element at the given index

arrayName[index] = newValue;  // Updating the element at the given index with a new value

int length = arrayName.length;  // Getting the length (number of elements) of the array

for (int i = 0; i < arrayName.length; i++) {
    // Access and process each element: arrayName[i]
}

int targetIndex = -1;  // Default value if target is not found
for (int i = 0; i < arrayName.length; i++) {
    if (arrayName[i] == target) {
        targetIndex = i;
        break;  // Exit the loop once the target is found
    }
}


int[] newArray = Arrays.copyOf(arrayName, arrayName.length + 1);
newArray[newArray.length - 1] = newValue;  // Inserting the new value at the end


int[] newArray = new int[arrayName.length - 1];
int indexToDelete = 2;  // Index of the element to delete
System.arraycopy(arrayName, 0, newArray, 0, indexToDelete);
System.arraycopy(arrayName, indexToDelete + 1, newArray, indexToDelete, newArray.length - indexToDelete);


Arrays.sort(arrayName);  // Sort the array in ascending order
