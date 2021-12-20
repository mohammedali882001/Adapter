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
public class Divider implements DivideInterface
{
    DividerAdapter DividerAdapter;
    Multipleir Multipleir;
    

    BigDecimal  num1=new BigDecimal("4") , num2=new BigDecimal("2"), num3=num1.divide(num2);
    @Override
    public BigDecimal Divide(BigDecimal num1 , BigDecimal num2 , String TypeOFoperation)
    {
        if(TypeOFoperation.equalsIgnoreCase("/"))
            return num3;
        else if(TypeOFoperation.equalsIgnoreCase("*"))
        {
          DividerAdapter=new DividerAdapter(TypeOFoperation);
         
           return DividerAdapter.Divide(num1, num2, TypeOFoperation);
        }
        return null;
    }

   
    
}
