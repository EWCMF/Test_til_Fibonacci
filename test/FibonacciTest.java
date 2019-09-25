import junit.framework.TestCase;

// Lavet af Matias men med få ændringer efter snak i klassen.

public class FibonacciTest extends TestCase {

    //test for Fibonacci

    public void testFibo() {
        //test med input = 1
        int x = 1;
        int resultat = Fibonacci.beregn(x);

        assertEquals(1, resultat);

        //test med input = 2
        x = 2;
        resultat = Fibonacci.beregn(x);

        assertEquals(3, resultat);


        //test med input = 3
        x = 3;
        resultat = Fibonacci.beregn(x);

        assertEquals(6, resultat);


        //test med input = 4
        x = 4;
        resultat = Fibonacci.beregn(x);

        assertEquals(10, resultat);


        //test med input = 5
        x = 5;
        resultat = Fibonacci.beregn(x);

        assertEquals(15, resultat);

        //test på 0 input som giver -1 fordi der ikke må være 0 inputs
        x = 0;
        resultat = Fibonacci.beregn(x);

        assertEquals(-1, resultat);

        //test til hvis x er noget minus så skal den give -1 fordi man kan ikke have minus inputs
        x = -1;
        resultat = Fibonacci.beregn(x);

        assertEquals(-1, resultat);
    }
}
