package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

    @Test
    public void testTriangle() {
        assertEquals("this is a equilateral triganle!",new triangular().triangles(1,1,1));
        assertEquals("this is a isosceles triganle!",new triangular().triangles(2,2,3));
        assertEquals("this is a scalene triganle!",new triangular().triangles(2,3,4));
    }

}