public class StringPrac {
    public static void main(String[] args) {
        
        String name = "Santosh mane";
        String name2 = "Mane";

        System.out.println("---------- Learning String Basics--------------");

        System.out.println("Length: " + name.length());
        System.out.println("First Character: " + name.charAt(0));
        System.out.println("Last Character: " + name.charAt(name.length() - 1));
        System.out.println("Uppercase Characters: " + name.toUpperCase());
        System.out.println("Lowercase Characters: " + name.toLowerCase());
        System.out.println("check Contains Or Not: " + name.contains("Mane"));
        System.out.println("Replace Characters: " + name.replace("Santosh", "Rahul"));
        System.out.println("Substrings of Characters: " + name.substring(0, 7));
        System.out.println("Check Equality Characters: " + name.equals(name2));
        System.out.println("Check Equality Characters: " + "Santosh".equalsIgnoreCase("Santosh"));

        System.out.println("--------------Good Bye-------------");
    }
}
