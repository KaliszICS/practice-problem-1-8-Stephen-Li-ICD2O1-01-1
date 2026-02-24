import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   InputStream originalIn = System.in;
   PrintStream originalOut = System.out;
   ByteArrayOutputStream bos = new ByteArrayOutputStream();

   @BeforeEach
   public void setUp() {
      System.setOut(new PrintStream(bos));
   }

   @AfterEach
   public void tearDown() {
      System.setOut(originalOut);
      System.setIn(originalIn);
   }
   

   @Test
   public void testQ1_1()
   {
      String data = "2\n5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("Input a number: Input a number: 7\n", bos.toString());

   }

   @Test
   public void testQ1_2()
   {
      String data = "1\n2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("Input a number: Input a number: 3\n", bos.toString());

   }

   @Test
   public void testQ2_1()
   {
      String data = "15\n3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a number: Input a number: 5\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ2_2()
   {
      String data = "8\n5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a number: Input a number: 1\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ3_1() {
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("hello \"Mr. Kalisz\" have you seen my work yet?\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_1()
   {
      String data = "3\n8.2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: Input a number: 41.0\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

   @Test
   public void testQ4_2()
   {
      String data = "4\n5.5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));
      
      PrintStream originalOut = System.out;
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      System.setOut(new PrintStream(bos));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: Input a number: 33.0\n", bos.toString());

      // undo the binding in System
      System.setOut(originalOut);
   }

}
