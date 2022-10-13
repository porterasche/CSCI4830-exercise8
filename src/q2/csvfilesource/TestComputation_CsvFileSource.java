package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {

   @ParameterizedTest
   @CsvFileSource(resources = "computation_dataset.csv")
   public void testGetDiscount(int testId, int testRate, int expected) throws Exception {

	  Computation com = new Computation();
      int result = com.getDiscount(testId, testRate); 
      Assert.assertEquals(result, expected);

   }
}
