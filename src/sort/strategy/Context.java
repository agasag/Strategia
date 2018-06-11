/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.strategy;

/**
 *
 * @author student
 */
public class Context {
   private IStrategy strategy;

   public Context(IStrategy strategy){
      this.strategy = strategy;
   }

   public double[] executeStrategy(double tablica[]){
      return strategy.Idosort(tablica);
   } 
}
