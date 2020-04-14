package functionalinterface;

import java.util.function.LongUnaryOperator;

public class _Operator {
    public static void main(String[] args) {
        LongUnaryOperator i = (l) -> -l;

        System.out.println(i.applyAsLong(Long.MAX_VALUE));
    }
}
