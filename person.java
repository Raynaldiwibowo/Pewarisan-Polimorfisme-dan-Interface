/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Outstanding Student
 */
public class person {
    protected String nama;
    protected String adress;
    protected String hobby;
    protected int age;
    
    
    public person(String nama, String adress, String hobby, int age) {
        this.nama = nama;
        this.adress = adress;
        this.hobby = hobby;
        this.age = age;
        System.out.println("Hello from person class");
         
    }
    public String getNama(){
    return nama;
}
    public void setNama(String nama){
        this.nama = nama; 
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getHobby(){
        return hobby;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

