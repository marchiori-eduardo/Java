package util;

public class Converter {

    public static final double tax = 0.06;

    public static double CurrencyConverter(double dolar, double compra) {
        return (dolar * compra) * 1.06 ;
    }
}
