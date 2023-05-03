import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCalculatorTest {
    @Test
    public void add()
     {
         MyCalculator MyCal=new MyCalculator();
         int res= MyCal.add(5,5);
         assertEquals(10,res);
     }

    @Test
    public void sub() {
        MyCalculator MyCal=new MyCalculator();
        int res= MyCal.sub(10,5);
        assertEquals(5,res);
    }
    @Test
    public void multi() {
        MyCalculator MyCal=new MyCalculator();
        int res= MyCal.multi(10,5);
        assertEquals(50,res);
    }
    @Test
    public void div() throws Exception {
        MyCalculator MyCal=new MyCalculator();
        int res= MyCal.div(10,5);
        assertEquals(2,res);
    }
}
