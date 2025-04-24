package com.mycompany.character;
import java.util.Scanner;
import java.lang.*;
public class Character {
 public static void main(String[] args) {
 String str;
 String S[]=new String[10];
 int i,j,k,len;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the string");
 str=sc.nextLine();
 S=str.split(" ");
 for(i=0;i<S.length;i++)
 {
 len=S[i].length();
 char m[]=new char[len];
 if(len%2==0)
 {
 m=S[i].toCharArray();
 for(j=0;j<len;j=j+2)
 {
 char ch=m[j];
 m[j]=m[j+1];
 m[j+1]=ch;
 }
 S[i]=" ";
 for(k=0;k<len;k++)
 S[i]=S[i]+m[k];
 System.out.println(S[i]);
 }
 }
 len=str.length();
 char cr[]=new char[len];
 cr=str.toCharArray();
 for(i=0;i<len;i++)
 {
 if(Character.isLowerCase(cr[i]))
 {
 cr[i]=Character.toUpperCase(cr[i]);
 continue;
 }
 if(Character.isUpperCase(cr[i]))
 cr[i]=Character.toLowerCase(cr[i]);
 }
 str=" ";
 for(k=0;k<len;k++)
 str=str+cr[k];
 System.out.println(str);
}
}
