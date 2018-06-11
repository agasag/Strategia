/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.factory;
import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
import sort.strategy.IStrategy;

/**
 *
 * @author student
 */
public interface ISortFactory {
    
    public static IStrategy ChooseWisely(String s) //wybieranie odpowiedniej metody
    {
        MetodySort en = MetodySort.valueOf(s);     
        IStrategy method = null;
        
        switch(en){
            case bubblesort:
                method = new Bubblesort();
                break;
            case selectionsort:
                method = new Selectionsort();
                break;
            case insertionsort:
                method = new Insertionsort();
                break;
            case quicksort:
                method = new Quicksort();
                break;
        }      
        return method;
   }
}
