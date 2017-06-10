//โปรแกรมบันทึกจำนวณ สินค้า
package ject;

import java.util.*;
import java.io.*;


public class Ject {

    public static void main(String[] args) throws IOException {
        
        System.out.print("Program" + "\n"+"\n"); 
                
        Admin a = new Admin();
        a.Admin();
        
        Menu b = new Menu();
        b.Menu();
        
        SaveFile d = new SaveFile();
        d.SaveFile();
           
    }
    
}

class Admin{
    String name , userName , password ;

    void Admin() throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("name = ");
        name = scanner.next();
        System.out.print("username = ");
        userName = scanner.next();
        System.out.print("password = ");
        password = scanner.next();
        
        if (userName.equals("admin") && password.equals("admin")){
            System.out.println("\n"+"Hi "+name+"<>"+" Yousucess"+"\n");
        }else if(userName.equals("admin") && password.equals("password")){
            System.out.println("\n"+"Hi "+name+"<>"+" Yousucess"+"\n");
        }else{
            System.out.println("please try again"+"\n");
        }
        
    }
    
}

class Menu{
    
    void Menu(){
        
        Case c = new Case();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select the menu : ");
        
        int menu = scanner.next().charAt(0);
         
        switch (menu) {
            
            case '1' : { c.Case1(); } break;
            case '2' : { c.Case2(); } break;
            case '3' : { c.Case3(); } break;
            case '4' : { c.Case4(); } break;
            case '5' : { c.Case5(); } break;
            case '6' : { System.out.println("see ya");} break;
            
            
        }
    }
}

class Method{
    
    void Method(){
        
        
        }
}

class SaveFile{
    String data;
    
    void File() throws IOException{
        
        File file = new File ("data.txt");
            if (!file.exists()){
                file.createNewFile();
            }       
        try (FileWriter writer = new FileWriter("data.txt",true)) {
                writer.write("nona");
                }catch (IOException e){
                         System.out.print(e);}  
        
        
    }
}

class Case{
    
    void Case1(){
        
        System.out.print("dfsd");
}
        
    void Case2(){
        
        System.out.println("hi");       
    
}

    void Case3(){
        
        System.out.println("hi");       
   
}

    void Case4(){
        
        System.out.println("hi");
        
    }
    
    void Case5(){
        
        System.out.println("hi");
        
    }    
}
    
    




//throw IOException {
