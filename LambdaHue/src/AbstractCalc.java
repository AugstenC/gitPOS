public class AbstractCalc {
    protected CalcOperation add;
    protected CalcOperation subtract;
    protected CalcOperation multiply;
    protected CalcOperation divide;

    public AbstractCalc(CalcOperation add, CalcOperation subtract,
                        CalcOperation multiply, CalcOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Number add(Number a, Number b);
    public abstract Number subtract(Number a, Number b);
    public abstract Number multiply(Number a, Number b);
    public abstract Number divide(Number a, Number b);
}

