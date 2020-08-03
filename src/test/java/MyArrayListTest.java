import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {

    MyArrayList<Integer> ma;
    MyArrayList<Integer> ma2;

    @Before
    public void setup(){
        ma = new MyArrayList<>();
        ma2 = new MyArrayList<>(10);
    }

    @Test
    public void defaultConstructorTest(){
        // Given
        Integer expected = 20;

        // When
        Integer actual = ma.size;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nonDefaultConstructorTest(){
        // Given
        Integer expected = 10;

        // When
        Integer actual = ma2.size;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest(){
        // Given
        Integer expected = 20;

        // When
        Integer actual = ma.size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest_T(){
        // Given

        // When
        Integer testInput = 4;
        Boolean actual = ma.add(testInput);

        // Then
        Assert.assertTrue(actual);
    }


}
