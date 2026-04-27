public class NumericFns <T extends  Number> {

    private T num;

    public NumericFns(T num) {
        this.num = num;
    }

    public boolean absEqual(NumericFns<?> obj){

        return Math.abs(this.num.doubleValue()) == Math.abs(obj.num.doubleValue());
    }
}
