package com.southwind.util;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int Array[]=new int[10];
        int i=0;
        while(i<=9){
            Scanner reader=new Scanner(System.in);
            int rs=reader.nextInt();
            Array[i]=rs;
            i++;
            //这句话加上或者去掉都无所谓，因为while就相当于一个if
            //if(i>9)  { break;}
        }
        for(int s=Array.length-1;s>=0;s--){
           System.out.println(Array[s]);}
    }
}
