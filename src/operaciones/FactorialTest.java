import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    Factorial fn;

    @Before
    public void crearClasse(){
        fn = new Factorial();
    }

    @Test
    public void getRecursivaTest(){
        Assert.assertEquals(120, fn.getRecursiva(5), 0.001);
    }

    @Test
    public void getIterativaTest(){
        Assert.assertEquals(120, fn.getIterativa(5), 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getExceptionTest(){
        double valor = fn.getIterativa(-3);
        System.out.println(valor);
    }
}