/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author janitha
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
   
   
static int count=0;
    public static void main(String[] args) {
        search(100, 1, 33);

    }

    static void search(int upperBound, int lowerBound, int num) {
        int gussedNo = (upperBound + lowerBound) / 2;
        count();
       
      
        if (gussedNo == num) {
            System.out.println("The number "+num+" is found in "+ count+" steps");
        } if (gussedNo > num) {
 
            upperBound = gussedNo - 1;

            search(upperBound, lowerBound, num);

        }
        if (gussedNo < num) {

            lowerBound = gussedNo + 1;
            search(upperBound, lowerBound, num);

        }
    }

    static int count() {
        count = count + 1;
      //  System.out.println("count "+count);
        return count;
    }
}
