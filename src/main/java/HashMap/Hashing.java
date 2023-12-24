package HashMap;

import java.util.Arrays;
import java.util.Scanner;

class KeyValueClass {
    private int key;
    private String value;

    public KeyValueClass(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "KeyValueClass{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
public class Hashing {
    public   KeyValueClass[] array;
    public int size;

    /**Constructor to create Hashing Object with Array of KeyValueClasses */
    public Hashing(int size) {
        this.size = size;
        this.array = new KeyValueClass[size];
    }

    public void insertInLinearProbing(int key, String value) {

        /** Hashing formula is key % size to store in the generated index **/
        int index = key % size;

        /** Here In Traditional Linear Probing  it will generate an index for mewly entered key value pair,
         *  if it is filled then it will check in the next index untill find the index is empty*/
        while ( array[index] != null ) {
            index = (index + 1) % size;
        }

        array[index] = new KeyValueClass(key, value);
        System.out.println("Value "+value+" is inserted at index: "+index+" in Normal Linear Probing");
    }

    public void insertInModifiedLinearProbing(int key, String value) {

        /** Hashing formula is key % size to store in the generated index **/
        int index = key % size;

        /** In Updated Linear Probing insertion the generated index for key will store in the particular index of array(i.e., Hash table).
         * if the index of array is already filled with another element we are going to store the new element in that location and shifting the existing element to the next index */
        while (array[index] != null) {
            KeyValueClass temp = array[index];
            array[index] = new KeyValueClass(key, value);
            value = temp.getValue();
            key = temp.getKey();

            index = (index + 1) % size;
        }

        array[index] = new KeyValueClass(key, value);
        System.out.println("Value "+value+" is inserted at index: "+index+" in Updated Linear probing");

    }

    public String searchInLinearProbing(int key) {

        /** Hashing formula is key % size to store in the generated index **/
        int index = key % size;

        while (array[index] != null) {
            if (array[index].getKey() == key) {
                return array[index].getValue()+" found at index: "+index;
            }
            index = (index + 1) % size;
        }

        /** If element is not found then returning Not Found */
        return "Not Found";
    }



    public String modifiedLinearProbingSearch(int key) {
        /** Hashing formula to generate index is key % size  **/
        int index = key % size;

        while (array[index] != null) {
            if (array[index].getKey() == key) {
                return array[index].getValue()+" found at index: "+index;
            }
            index = (index + 1) % size;
        }

        return "Not Found";
    }

    public static void main(String[] args) {

      //  System.out.println("enter Hash Table size");
       // Scanner scanner = new Scanner(System.in);
        int HTSize = 100;

        Hashing linearProbingObject = new Hashing(HTSize);
        Hashing updatedLinearProbingObject = new Hashing(HTSize);

        // Insert and search keys in both tables and compare the results

        linearProbingObject.insertInLinearProbing(6, "6");
        linearProbingObject.insertInLinearProbing(106, "106");

        System.out.println("array is After Tradition Linear Probe Insertion"+ linearProbingObject);

        updatedLinearProbingObject.insertInModifiedLinearProbing(6, "6");
        updatedLinearProbingObject.insertInModifiedLinearProbing(106, "106");

        System.out.println("array is After Updated Linear Probe Insertion"+ updatedLinearProbingObject);

        String lpResult = linearProbingObject.searchInLinearProbing(6);

        String modifiedLinearProbingResult = updatedLinearProbingObject.modifiedLinearProbingSearch(6);

        System.out.println("Traditional Linear Probing Searching for  6 key: " + lpResult);
        System.out.println("Modified Linear Probing Searching for 6 key : " + modifiedLinearProbingResult);
    }

    @Override
    public String toString() {
        return "Hashing{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
