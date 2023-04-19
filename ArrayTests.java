import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

 // @Test
  //public void testReverseInPlace2(){
  //  int[] input2 = {1, 2, 3};
  //  ArrayExamples.reverseInPlace(input2);
  //  assertArrayEquals(new int[]{3, 2, 1}, input2);
  //}

  @Test 
  public void testAverage(){
    double[] input3 = {1.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input3), 0.01);
  }

  @Test 
  public void testAverage2(){
    double[] input3 = {1.0, 1.0};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input3), 0.01);
  }

  @Test
  public void testAverage3(){
    double[] input4 = {0.0, 2.0, 4.0, -1.2, -1.2};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input4), 0.1);
  }
}
