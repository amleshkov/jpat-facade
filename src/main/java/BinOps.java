public class BinOps {

    private static enum Operation {
        SUM, MULT;
    }
    public String sum(String a, String b) {
        return calculate(a, b, Operation.SUM);
    }

    public String mult(String a, String b) {
        return calculate(a, b, Operation.MULT);
    }

    private String calculate(String a, String b, Operation op) {
        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);
        int intRes = 0;
        switch (op) {
            case SUM:
                intRes = intA + intB;
                break;
            case MULT:
                intRes = intA * intB;
                break;
        }
        return Integer.toBinaryString(intRes);
    }
}