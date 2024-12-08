import java.util.ArrayList;
import java.util.Arrays;

public class Open_addressing_linier_probing {
    String[] hashTable;
    int usedCellNumber;

    Open_addressing_linier_probing(int size) {
        // Creayes an array of size size, containing String Objects
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    // Hash Function
    public int modAsciiHashFunction(String word, int M) {
        char ch[];
        ch = word.toCharArray();
        int i, sum;

        for (sum = 0, i = 0; i < word.length(); i++) {
            sum += ch[i];
        }

        return sum % M;
    }

    // Get load factor
    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    // Rehash method: If load factor is greater than 0.75, rehash the table (create
    // a new table with double size and copy all the elements from the old table to
    // the new table and then insert the new element)
    public void rehashKeys(String newWord) {
        usedCellNumber = 0;
        // Temporary storage for current hash table data
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashTable) {
            if (s != null) {
                data.add(s);
            }
        }

        data.add(newWord);

        // Create a new hash table which is an array of Strings
        hashTable = new String[hashTable.length * 2];

        // Insert all the data in the new hash table
        for (String s : data) {
            insertInHashTable(s);
        }

    }

    // Insert in Hash Table
    public void insertInHashTable(String word) {
        if (getLoadFactor() >= 0.75) {
            rehashKeys(word);
            // Insert the new word in the new hash table
        } else {

            int index = modAsciiHashFunction(word, hashTable.length);
            if (hashTable[index] == null) {
                hashTable[index] = word;
                usedCellNumber++;
                System.out.println("Value " + word + " has been inserted at index: " + index);
            } else {
                System.out.println("Index is already occupied, trying next empty cell...");

                // Linear probing
                for (int i = 0; i < hashTable.length; i++) {
                    // Helps to wrap around the table: start from the beginning if we reach the end
                    // of the table
                    int probIndex = (index + i) % hashTable.length;
                    if (hashTable[probIndex] == null) {
                        hashTable[probIndex] = word;
                        usedCellNumber++;
                        System.out.println("Value " + word + " has been inserted at index: " + probIndex);
                        break;
                    }
                }
            }

        }
    }

    // Search in Hash Table
    public boolean searchHashTable(String word) {
        int index = modAsciiHashFunction(word, hashTable.length);

        for (int i = 0; i < hashTable.length; i++) {
            int newIndex = (index + i) % hashTable.length;

            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                System.out.println("\n" + "\"" + word + "\"" + " found in hashtable at location: " + newIndex);
                return true;
            }
        }

        System.out.println("Word " + word + " not found");
        return false;
    }

    // Delete Key Hash Table
    public void deleteKyHashTable(String word) {
        int index = modAsciiHashFunction(word, hashTable.length);

        for (int i = 0; i < hashTable.length; i++) {
            int newIndex = (index + i) % hashTable.length;

            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println("\n" + "\"" + word + "\"" + " has been deleted");
                return;
            }
        }

    }

    // Display the values of the hash table
    public void displayHashTable() {
        System.out.println("\n -------------- Hash Table ----------------");
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index " + i + " " + hashTable[i]);
        }
    }
}
