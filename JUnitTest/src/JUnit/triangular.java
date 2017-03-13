package JUnit;

public class triangular {
 public static String triangles (int a, int b, int c){
        
        if (a == b && b == c)
            return "this is a equilateral triganle!";
        else if (a == b || b == c || c == a)
            return "this is a isosceles triganle!";
        else
            return "this is a scalene triganle!";
            
        }
        
    }

