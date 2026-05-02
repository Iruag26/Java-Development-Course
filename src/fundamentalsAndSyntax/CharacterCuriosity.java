package fundamentalsAndSyntax;

public class CharacterCuriosity {
    public static void main(String[] args) {
        int min = (int) Character.MIN_VALUE;
        int max = (int) Character.MAX_VALUE;
        for (int i = min; i<= max; i++){
            char c = (char) i;
            System.out.println(i + " "+c);
        }
    }
}
