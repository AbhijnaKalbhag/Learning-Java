public class String_practice {
    public static void main(String[] args) {
        String a ="Helloo";
        System.out.println("String length: "+ a.length());
        System.out.println("String in lower case: "+a.toLowerCase());
        System.out.println("String in Upper case: "+a.toUpperCase());
        String b = "   Blank Space";
        System.out.println("trimmed string : "+b.trim());
        System.out.println("Substring from 3rd index :"+a.substring(3));
        System.out.println("Substring from 2nd-4th index :"+a.substring(2,4));
        System.out.println(" Using Strip :"+a.strip());//removes white spaces like trim()
        System.out.println("Replacing 'l' with 'z': "+a.replace('l','z'));
    }
}
