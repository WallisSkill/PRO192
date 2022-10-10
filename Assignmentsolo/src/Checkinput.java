
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimerTask;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Checkinput {
    
    public String CheckID(String ID){  
        int count =1;
        String falseid ="false";
            try{
                String pattern="HE[0-9]{6}";
                if(!ID.matches(pattern))
                    throw new Exception();
                count=1;
           }catch(Exception e){
               count =0;
            }
         if(count==1){
        return ID;
         }
         else{
             return falseid;
         }
    }
    public String CheckName(String name){ 
        int count =0;
        String falsename ="false";
        char[] a = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            if((a[i]>='a'&& a[i]<='z')||(a[i]>='A'&& a[i]<='Z')||a[i]==' '){
                    count =1;              
            }
            else
            {
                count =0;
                break;
            }
        }
        if(count==0){
            return falsename;
        }
        else{
            return name;
        }      
}
    public String CheckFloat(String number){
        int count =0,count2=0;
        String falsenumber="false";
        String number2="";
        try{
        number2= number;    
        Float.parseFloat(number2);
        count2=1;
        }
        catch(NumberFormatException e){
            count2=0;
        }
        if(count2==0){
            count=0;
        }
        else{
        try{
            System.out.print(number2);
            int count3 = 1;      
            System.out.print(String.format("\033[%dA",count3)); // Move up      
            System.out.print("\033[2K");
            count =1;
        }
        catch(InputMismatchException e){
            count =0;
        }
        }
        if(count==0){
            return falsenumber;
        }
        else{
            return number;
        }
        
    }
    
}

