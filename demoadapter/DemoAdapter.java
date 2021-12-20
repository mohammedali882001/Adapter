/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoadapter;

/**
 *
 * @author messi
 */
import java.math.BigDecimal;
public class DemoAdapter {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Divider d = new Divider();
        System.out.println(d.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "*"));
        System.out.println(d.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "/"));
        System.out.println(d.Divide(BigDecimal.ZERO, BigDecimal.ZERO, "+"));
        
    }
    
}
