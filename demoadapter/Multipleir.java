/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoadapter;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author messi
 */
public class Multipleir implements MultiplyInterace
{



   BigDecimal num1=new BigDecimal("4") , num2=new BigDecimal("2") , num3=num1.multiply(num2);
   
    @Override
    
    public BigDecimal Multiply(BigDecimal num1 , BigDecimal num2  , String TypeOFoperation)
    {
        return num3;
        
    }
    
}
