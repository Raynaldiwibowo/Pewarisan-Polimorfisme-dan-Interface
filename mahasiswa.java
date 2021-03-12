/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Outstanding Student
 */
public class Mahasiswa extends person{
    protected String nim;
    
    public Mahasiswa(String nama, String adress, String hobby, int age, String nim) {
        super(nama, adress, hobby, age);
        
        this.nim = nim;
        System.out.println("Hello from mahasiswa class");
    }
    public String getNim(){
        return nim;
    }
    
    
}
