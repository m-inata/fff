public class Complex {
    private final int real;
    private final int imag;

    public Complex() {
        this(0, 0);
    }

    public Complex(final int real) {
        this(real, 0);
    }

    public Complex(final int real, final int imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "" + real + "+" + imag + "i";
    }
}
