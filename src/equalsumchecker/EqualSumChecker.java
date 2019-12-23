/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsumchecker;

/**
 *
 * @author User
 */
public class EqualSumChecker {
    public static boolean hasEqualSum (int x, int y, int z){
        
        if ( (x+y) == z){
            System.out.println("true");
            return true;
        }else {
            System.out.println("false");
            return false;
        }
    }
}
