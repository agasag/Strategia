/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author LeopardProMK
 */
public class Bubblesort {
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-babelkowe-bubblesort.html */
    
    
    	private static int tablica[];
	private static int ile_liczb;
	
	private static void b_sort(int tablica[], int ile_liczb) {
		int temp,i,zmiana;
		do {
			zmiana=0;
			i=ile_liczb-1;
			do {
				i--;
				if (tablica[i+1]< tablica[i]) {
					temp=tablica[i];	         
					tablica[i]=tablica[i+1];
					tablica[i+1]=temp;
					zmiana=1;
				}
			} while (i!=0);
	   } while (zmiana!=0); 
	}
}
