/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.IStrategy;

/**
 *
 * @author LeopardProMK
 */

public class Selectionsort implements IStrategy{
    @Override
    public double[] Idosort(double tab[]){
       for (int i = 0; i < tab.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < tab.length; j++)
                if (tab[j] < tab[index]) 
                    index = j;
      
            double smallerNumber = tab[index];  
            tab[index] = tab[i];
            tab[i] = smallerNumber;
        }
        return tab;
    }
}
