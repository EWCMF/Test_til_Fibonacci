import junit.framework.TestCase;

public class FibonacciTest extends TestCase {

    //test for Fibonacci

    public void Fibo() {
        //test med 1 input = 0
        int x = 1;
        int resultat = Fibonacci.beregn(x);

        assertEquals(0, resultat);

        //test med 2 inputs = 0,1
        x = 2;
        resultat = Fibonacci.beregn(x);

        assertEquals(1, resultat);


        //test med 3 inputs = 0,1,2
        x = 3;
        resultat = Fibonacci.beregn(x);

        assertEquals(3, resultat);


        //test med 4 inputs = 0,1,2,3
        x = 4;
        resultat = Fibonacci.beregn(x);

        assertEquals(6, resultat);


        //test med 5 inputs = 0,1,2,3,4
        x = 5;
        resultat = Fibonacci.beregn(x);

        assertEquals(10, resultat);

        //test på 0 input som giver -1 fordi der ikke kan være 0 inputs
        x = 0;
        resultat = Fibonacci.beregn(x);

        assertEquals(-1, resultat);

        //test til hvis x er noget minus så skal den give -1 fordi man kan ikke have minus inputs
        x = -1;
        resultat = Fibonacci.beregn(x);

        assertEquals(-1, resultat);
    }
}
