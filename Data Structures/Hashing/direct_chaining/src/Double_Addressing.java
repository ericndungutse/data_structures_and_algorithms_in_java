import java.util.ArrayList;

public class Double_Addressing {
    String[] hashTable;
    int usedSize;

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
        ArrayList<String> data = new ArrayList<String>();

        for (String s : this.hashTable) {
            if (s != null) {
                data.add(s);
            }
        }

        data.add(newStringToBeInserted);

        hashTable = new String[2 * hashTable.length];

        for (String s : data) {
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

        if (hashTable[index] == null) {
            hashTable[index] = value;
            usedSize++;
            return;
        } else {
            int secondHashIndex = secondHash(index);
            if (secondHashIndex != -1) {
                hashTable[secondHashIndex] = value;
                usedSize++;
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

    // Formulas
    // probe = (h1​(x) + i*h 2​(x)) % m

    // Where m: size of the hash table

    // Where: h1(x) = x % m

    // h2(x) = prime_less_than_m - (x % prime_less_than_m)

    // Second Hash
    public int secondHash(int firstHash) {
        int primeLessThanM = getPrimeLessThanM();
        int secondHash = primeLessThanM - (firstHash % primeLessThanM);

        for (int i = 0; i < hashTable.length; i++) {
            int newIndex = (firstHash + (i * secondHash)) % hashTable.length;
            if (hashTable[newIndex] == null) {
                return newIndex;
            }
        }

        return -1;
    }

    // Get Prime less than M
    public int getPrimeLessThanM() {
        int m = this.hashTable.length;
        for (int i = m - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return 2;
    }

    private boolean isPrime(int n) {
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;

        for (int i = 3; i <= (n / 2); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
