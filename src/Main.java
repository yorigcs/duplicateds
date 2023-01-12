public class Main {
    public static void main(String[] args) {
        String[] string1 = new String[]{"Morango", "Uva", "Acerola", "Manga"};
        String[] string2 = new String[]{"Pêra","Caju", "Morango", "Uva", "Kiwi"};

        DuplicatedElements duplicatedElements = new DuplicatedElements(string1,string2);
        duplicatedElements.printDuplicatedItems();

    }
}