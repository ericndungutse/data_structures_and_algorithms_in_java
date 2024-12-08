public class App {
    public static void main(String[] args) throws Exception {
        // DIRECT CHAINING
        // Direct_chaining hashTable = new Direct_chaining(15);

        // hashTable.insertHashTable("Eric");
        // hashTable.insertHashTable("Jane");
        // hashTable.insertHashTable("Bwiza");
        // hashTable.insertHashTable("Bwiza");
        // hashTable.insertHashTable("Rwaza");
        // hashTable.insertHashTable("xdsjiwenoinodjeiurytpqws");

        // hashTable.displayHashTable();
        // System.out.println(hashTable.searchHashTable("Eric"));

        // hashTable.deleteKeyHashTable("Eric");
        // System.out.println(hashTable.searchHashTable("Eric"));
        // hashTable.displayHashTable();

        // OPEN ADDRESSING LINEAR PROBING
        // Open_addressing_linier_probing hashTable = new
        // Open_addressing_linier_probing(10);
        // hashTable.insertInHashTable("AAA");
        // hashTable.insertInHashTable("BBB");
        // hashTable.insertInHashTable("CCC");
        // hashTable.insertInHashTable("KKK");
        // hashTable.insertInHashTable("DDD");
        // hashTable.insertInHashTable("III");
        // hashTable.insertInHashTable("YYY");
        // hashTable.insertInHashTable("XXX");
        // hashTable.insertInHashTable("MMM");

        // hashTable.displayHashTable();
        // System.out.println("_______________________________");
        // hashTable.searchHashTable("YYYY");
        // hashTable.deleteKyHashTable("YYY");

        // System.out.println("_____________AFTER DELETING__________________");
        // hashTable.displayHashTable();

        // QUADRATIC PROBING
        Quadratic_Probing hashTable = new Quadratic_Probing(5);
        hashTable.insertHashTable("Eric");
        hashTable.insertHashTable("Jay");
        hashTable.insertHashTable("Jays");
        hashTable.insertHashTable("YYY");
        hashTable.insertHashTable("XXX");
        hashTable.insertHashTable("ZZZ");

        hashTable.displayHashTable();

    }
}
