/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author acer
 */
public class TOH {
    void recursion(int n, char src, char aux, char dest){
        if(n==1){
            System.out.println(src+" -> "+dest);
        }
        else{
            recursion(n-1,src,dest,aux);
            recursion(1,src,aux,dest);
            recursion(n-1,aux,src,dest);
        }
    }
}
