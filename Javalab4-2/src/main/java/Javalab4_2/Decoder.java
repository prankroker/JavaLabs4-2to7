package Javalab4_2;

public class Decoder {
    public static String decodeVowels(String input) {
        return input.replaceAll("1", "a").replaceAll("2", "e").replaceAll("3", "i").replaceAll("4", "o").replaceAll("5", "u");
    }

    public static String decodeConsonants(String input) {
        return input.replaceAll("a", "z").replaceAll("b", "a").replaceAll("c","b").replaceAll("d","c").replaceAll("e","d").replaceAll("f","e").replaceAll("g","f").replaceAll("h","g").replaceAll("i","h").replaceAll("j","i").replaceAll("k","j").replaceAll("l","k").replaceAll("m","l").replaceAll("n","m").replaceAll("o","n").replaceAll("p","o").replaceAll("q","p").replaceAll("r","q").replaceAll("s","r").replaceAll("t","s").replaceAll("u","t").replaceAll("v","u").replaceAll("w","v").replaceAll("x","w").replaceAll("y","x").replaceAll("z","y");
    }
}
