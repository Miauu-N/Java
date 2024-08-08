package ObjetosYMetodos;
public class Operaciones {
    //métodos para:
    // Sumar dos números.
    // Restar dos números.
    // Multiplicar dos números.
    // Dividir dos números (considerando que el divisor no sea cero).
    public static int sumar(int a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return a - b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int dividir(int a, int b){
        if (b == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre 0");
        }else{
            return a / b;
        }
    }
}
