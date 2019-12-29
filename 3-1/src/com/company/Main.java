package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner( System.in );
        Mark mark=new Mark();
        while (true){
            System.out.println("enter a name : ");
            String name= scanner.nextLine();
            System.out.println("enter a mark : ");
            String str= scanner.nextLine();
            int mark1=Integer.parseInt( str );

            mark.name=name;
            mark.mark=mark1;


            if(mark1 < 10){
                System.out.println(mark.name+"  failed !");
            }else if (mark1 <=20){
                System.out.println(mark.name+"  passed ! ");
            }

        }
    }
}
