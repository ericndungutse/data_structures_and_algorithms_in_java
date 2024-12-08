import java.util.LinkedList;
import java.util.Arrays;

public class Direct_chaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    @SuppressWarnings("unchecked")
    Direct_chaining(int size) {
        // Create a new hash table which is an array of linked lists 5 elements long
        hashTable = new LinkedList[size];
    }

    // Hash FUnction
    public int modAsciiHashFunction(String word, int M) {
        char ch[];
        ch = word.toCharArray();
        int i, sum;

        for (sum = 0, i = 0; i < word.length(); i++) {
            sum += ch[i];
        }

        return sum % M;
    }

    // Isert Key in Hastable
    public void insertHashTable(String word) {
        int newIndex = modAsciiHashFunction(word, hashTable.length);
        if (hashTable[newIndex] == null) {
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        } else {
            hashTable[newIndex].add(word);
        }
    }

    // Display values of hashtable
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash table does not exists");
        } else {
            System.out.println("\n -------------- Hash Table ----------------");

            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index " + i + " " + hashTable[i]);
            }

        }
    }

    // Search
    public boolean searchHashTable(String word) {
        int newIndex = modAsciiHashFunction(word, hashTable.length);

        if (hashTable[newIndex] != null && hashTable[newIndex].contains(word)) {
            System.out.println("\n" + "\"" + word + "\"" + " found in hashtable at location: " + newIndex);
            return true;
        } else {
            System.out.println("Word not found");
            return false;
        }

    }

    // delete Key Hashtable
    public void deleteKeyHashTable(String word) {
        int newIndex = modAsciiHashFunction(word, hashTable.length);

        boolean result = searchHashTable(word);

        if (result == true) {
            hashTable[newIndex].remove(word);
            System.out.println("\n" + "\"" + word + "\"" + " has been deleted");
        }
    }

    @Override
    public String toString() {
        return "Direct_chaining [hashTable=" + Arrays.toString(hashTable) + ", maxChainSize=" + maxChainSize + "]";
    }

}
