public class Quadratic_Probing {
    String[] hashTable;
    int usedSize;

    public Quadratic_Probing(int size) {
        this.hashTable = new String[size];
        this.usedSize = 0;
    }

    public int modAsciiHashFunction(String value, int tableSize) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            sum += (int) value.charAt(i);
        }
        return sum % tableSize;
    }

    // REHASHING
    public void rehashKeys(String newStringToBeInserted) {
        this.usedSize = 0;
        String[] oldHashTable = this.hashTable;

        this.hashTable = new String[2 * oldHashTable.length];
        oldHashTable[oldHashTable.length - 1] = newStringToBeInserted;

        for (String s : oldHashTable) {
            if (s != null) {
                insertHashTable(s);
            }
        }
    }

    // Inserting a value in the hashTable
    public void insertHashTable(String value) {
        int index = modAsciiHashFunction(value, this.hashTable.length);

        // Rehashing
        if (getLoadFactor() > 0.75) {
            rehashKeys(value);
        }

        for (int i = 0; i < hashTable.length; i++) {
            int newIndex = (index + (i * i)) % hashTable.length;
            if (hashTable[newIndex] == null) {
                hashTable[newIndex] = value;
                usedSize++;
                return;
            }
        }

    }

    // Calculate loadFactor
    public double getLoadFactor() {
        return this.usedSize * 1.0 / this.hashTable.length;
    }

    public void displayHashTable() {
        for (String s : hashTable) {
            System.out.println(s + " ");
        }
    }
}
