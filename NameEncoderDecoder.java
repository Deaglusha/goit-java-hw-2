package main.java;

public class NameEncoderDecoder {
    public String encode(String name) {
        return "NOTFORYOU" +
                name
                        .replace("e", "1")
                        .replace("u", "2")
                        .replace("i", "3")
                        .replace("o", "4")
                        .replace("a", "5")
                + "YESNOTFORYOU";
    }

    public String decode(String name) {
        return name
                .replace("YESNOTFORYOU", "")
                .replace("NOTFORYOU", "")
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5", "a");
    }

    public static void main(String[] args) {
        NameEncoderDecoder nameEncoderDecoder = new NameEncoderDecoder();

        //"NOTFORYOUCr5bYESNOTFORYOU"
        System.out.println("encode(\"Crab\") = " + nameEncoderDecoder.encode("Crab"));
        //"Crab"
        System.out.println("decode(\"NOTFORYOUCr5bYESNOTFORYOU\") = " + nameEncoderDecoder.decode("NOTFORYOUCr5bYESNOTFORYOU"));
        //"NOTFORYOU"
        System.out.println("decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\") = " + nameEncoderDecoder.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
    }
}
