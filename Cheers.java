// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {

        String cheer = args[0].toUpperCase(); 
        int count = Integer.parseInt(args[1]);
        String add_AN = "RAEFHILMNOSX";
        int num_of_chars = cheer.length(); // gets the amount of letters in the cheer.
        String an_a = "";

        // go over each letter from the cheer.
        for (int i = 0; i < num_of_chars; i++){ 
                char letter = cheer.charAt(i);
                // go over each letter from the string.
                for (int n = 0; n < add_AN.length(); n++){ 
                        // check if letter in the add_AN string, if so then return an and break else return a
                        if ((String.valueOf(letter)).indexOf(add_AN.charAt(n)) != -1){ 
                                an_a = "an";
                        break;
                        }
                        else {
                                an_a = "a ";
                        }
                }
                // print the first part of the cheer.
                System.out.println("Give me " + an_a + " " + letter + ": " + letter + "!");
        }
        // print the cheer the amount of times given.
        System.out.println("What does that spell?");
        for (int i = 0; i < count; i++){
                System.out.println(cheer + "!!!");
        }
}

}


