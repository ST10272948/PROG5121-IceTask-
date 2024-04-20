/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetaskquestion2.pkg2;
import java.util.Iterator;

public class IceTaskQuestion22 {
private int currentNumber;
    private int sum;
    private final int limit;

    public IceTaskQuestion22(int limit) {
        this.currentNumber = 1;
        this.sum = 0;
        this.limit = limit;
    }

   
    public boolean hasNext() {
        return currentNumber <= limit;
    }

    
    public Integer next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements in the sequence.");
        }

        int square = currentNumber * currentNumber;
        sum += square;
        currentNumber += 2; 
        return sum;
    }
    
    public static void main(String[] args) {
         int limit = 12;
         IceTaskQuestion22 generator = new IceTaskQuestion22(limit);

        while (generator.hasNext()) {
            System.out.println(generator.next());
        }
    }
        
    }
    

