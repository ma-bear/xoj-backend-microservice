<h1>A+B问题I</h1>

<b>题解</b>
```java
import java.lang.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
    }
}
```

<h1>A+B问题II</h1>

<b>题解</b>
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            while (n-- > 0) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a + b);
            }
        }
    }
}
```
