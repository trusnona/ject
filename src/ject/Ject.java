//โปรแกรมบันทึกข้อมูล
package ject;

import java.sql.*;
import java.util.*;
import java.io.*;


public class Ject {

    public static void main(String[] args) throws IOException {
        
        System.out.print("Program" + "\n"+"\n"); 
                
        //Admin a = new Admin();
        //a.Admin();
        
        Menu b = new Menu();
        b.Menu();
           
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
    
    void Menu() throws IOException{
        
        Case c = new Case();       
        int i = 0;
        
        System.out.println("1.Add Data"+"\n"+"2.Check Data"+"\n"+"3.Contact"+"\n"+"4.exit"+"\n");
        
        Scanner scanner = new Scanner(System.in);
        int menu;
        do{
        System.out.print("Please select the menu : ");
        
        menu = scanner.nextInt();

        switch (menu) {                    
                
            case 1 : { c.Case1(); } break;
            case 2 : { c.Case2(); } break;
            case 3 : { c.Case3(); } break;          
            //case 4 : { System.out.println("Thank You");} break;
 
        } System.out.println("Thank You");
        
        }while(menu < 4);
        
    
    }

}


class Case{
    
    String data1;
    
    void Case1() throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n"+"Please type the Data : ");
        data1 = scanner.next();
        System.out.println("\n"+"Complete");
        
               
        File file = new File ("data.txt");
            if (!file.exists()){
                file.createNewFile();
            }       
        try (FileWriter writer = new FileWriter("data.txt",true)) {           
                writer.write(data1 + "\n");
                }catch (IOException e){
                         System.out.print(e);}  
             
}
        
    void Case2() throws FileNotFoundException{
        
        try{
        File file = new File ("data.txt");
        Scanner checkFile = new Scanner(file);
        
        String keep = checkFile.nextLine();
        System.out.println(keep);
        }catch (Exception e){}
        System.out.println("\n"+"Complete");       
    
}

    void Case3(){
        
        System.out.println("\n"+"Plase contrat mr.trat"); 
        
    }
 
}  
