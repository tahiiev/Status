/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 *
 * @author srinivsi
 * @modified tahiiev
 */
public class StausUser{
    private Code code;
    
    //each number represents a value in Code enum
    public StausUser(int i){
        if(i==0)
            code = Code.ZERO;
        if(i==1)
            code = Code.ONE;
        if(i==2)
            code = Code.TWO;
        if(i==3)
            code = Code.THREE;
    }
    
    public void statusDetail(){
        
    //converting enum to String
    switch(code.toString()){
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
    }
}
