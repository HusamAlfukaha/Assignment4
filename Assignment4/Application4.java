package Assignment4;

import java.util.Locale;

public class Application4 {
    public static void main(String[] args) {

        ComposBoth <String,String> greeting = a -> "Welcome "+ a ;
        ComposBoth <String,String> toUpper = a -> a.toUpperCase(Locale.ROOT) ;
        /**
        ComposBoth <String ,String> compos = toUpper.compos(greeting);
        System.out.println("compos.apply(\"Test\") = " + compos.apply("Test"));
        */
        String Result = greeting.apply("Mr.Mohammed Al-Zurqan").toUpperCase(Locale.ROOT);
        System.out.println("Result = " + Result);
    }
}
