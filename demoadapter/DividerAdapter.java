/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoadapter;

import java.math.BigDecimal;

/**
 *
 * @author messi
 */
public class DividerAdapter implements DivideInterface
{
    
    MultiplyInterace MultiplyInterace;
 
    public DividerAdapter(String TypeOFoperation)
    {
        if(TypeOFoperation.equalsIgnoreCase("*"))
            MultiplyInterace=new Multipleir();
    }


    @Override
    public BigDecimal Divide(BigDecimal num1 , BigDecimal num2  , String TypeOFoperation) 
    {
        if(TypeOFoperation.equalsIgnoreCase("*"))
        {
           return MultiplyInterace.Multiply(num1, num2, TypeOFoperation);
             
        }    
        return null;
       
    }
    
    
}
