/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class receipt {
    private int time;
    private double money;
    private  String[] repa= new String[9];

    public receipt() {
        this.time=0;
        this.money=0.0;
        
    }

    public receipt(int time, double money) {
        this.time = time;
        this.money = money;
        
    }

    public int getTime() {
        return time;
    }

    public double getMoney() {
        return money;
    }

    

    public void setTime(int time) {
        this.time = time;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    
    public void setRepa(String a[], int b){
    
        
           this.repa[b]= a[b];
            
        
       
    }
   
    public void write_file() throws IOException{
    FileWriter fw=new FileWriter("ticket.txt",true);
    PrintWriter pw= new PrintWriter(fw);
        for (int i = 0; i < 9; i++) {
            pw.write(this.repa[i]+"\n");
        }
        pw.write("........................");
    pw.close();
    
}
    public int count_time(String b){
        int a=0;
        
       
            if("jeddah to riyad".equals(b)){
                a=2;
            }else
                if("jeddah to madina".equals(b)){
                a=1;
                }else
                    if("jeddah to dammam".equals(b)){
                    a=3;
                    }else
                        if("riyad to jeddah".equals(b)){
                        a=2;
                        }else
                            if("ryiad to dammam".equals(b)){
                            a=1;
                            }else
                                if("ryiad to madina".equals(b)){
                                a=3;
                                }else
                                    if("dammam to riyad".equals(b)){
                                    a=1;
                                    }else
                                        if("dammam to jeddah".equals(b)){
                                        a=2;
                                        }else
                                            if("dammam to madina".equals(b)){
                                                a=3;
                                            }
            
     return a;       
    }
    
     public double money(String b){
        double a=0;
        
       
            if("jeddah to riyad".equals(b)){
                a=40.0;
            }else
                if("jeddah to madina".equals(b)){
                a=20.0;
                }else
                    if("jeddah to dammam".equals(b)){
                    a=60.0;
                    }else
                        if("riyad to jeddah".equals(b)){
                        a=40.0;
                        }else
                            if("ryiad to dammam".equals(b)){
                            a=20.0;
                            }else
                                if("ryiad to madina".equals(b)){
                                a=60.0;
                                }else
                                    if("dammam to riyad".equals(b)){
                                    a=20.0;
                                    }else
                                        if("dammam to jeddah".equals(b)){
                                        a=40.0;
                                        }else
                                            if("dammam to madina".equals(b)){
                                                a=60.0;
                                            }
            
     return a;       
    }
    public void diplayall() throws FileNotFoundException{
        System.out.println("receipt info");
    File fl= new File("ticket.txt");
    Scanner read= new Scanner(fl);
    while(read.hasNext()){
        String line = read.nextLine();
        System.out.print(line);
    }
   read.close();
   
}
}
