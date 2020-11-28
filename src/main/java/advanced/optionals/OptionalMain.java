package advanced.optionals;

import java.util.Optional;

public class OptionalMain {
    public static final String ABC = "abc";

    public static void main(String[] args) {

        Optional<String> optionalEx = Optional.ofNullable(null);
        if (optionalEx.isPresent()) {
            String result = optionalEx.get();
            System.out.println(result);
        }

        Optional<String> optionalEx2 = Optional.empty();
        System.out.println(optionalEx2.isPresent());

        String optionalEx3 = Optional.ofNullable("abc").orElse("def");
        System.out.println(optionalEx3);

        String e = null;

        System.out.println(isAbc(e));
        System.out.println(isAbc2(Optional.ofNullable(e)));
    }

    static boolean isAbc(String a) {
        if (a != null) { //null check
            return ABC.equals(a); //nullPointer anti-pattern
        }
        return false;
    }

    static boolean isAbc2(Optional<String> a) {
        if(a.isPresent()) {
            return a.get().equals(ABC);
        }
        return false;
    }
}