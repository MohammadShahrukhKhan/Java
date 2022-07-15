public class StringMethod {
    public static void main(String[] args) {
        String shahrukh = "Face";
        String khan = "King";
        String joker = "clown";
        String jackass = "GADHA";
        System.out.println(shahrukh + " of the " + khan);
        System.out.println(joker);
        System.out.println(joker.length()); // number of characters in the string
        System.out.println(joker.toUpperCase()); // changes to capital letter
        System.out.println(jackass.toLowerCase()); // changes to small letter
        System.out.println(joker + " is\" " + jackass); // to include characters
        System.out.println(joker + " is\\ " + jackass); // to include characters
        System.out.println(joker + " is\t " + jackass); // to include tab
        System.out.println(joker + " is\'' " + jackass); // to include characters
        System.out.println(joker + " is\n" + jackass); // to add new line
        System.out.println(joker.contains("own")); // to check if the given string is present or not (TRUE/FALSE)
        System.out.println(jackass.charAt(1)); // prints the character at index 2
        System.out.println(joker.endsWith("own")); // to check if it end with the given string or not (TRUE/FALSE)
        System.out.println(joker.indexOf("own")); // prints the index of the string
    }
}
