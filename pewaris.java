/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Outstanding Student
 */
public class pewarisan {
    public static void main(String[] args){
        //mengambil dari class person
       person  raynaldi = new person("raynaldi wibowo", "probolinggo", "freestyle", 19);
        System.out.println("Adress: "+raynaldi.getAdress()+", age: "+raynaldi.getAge()+", hobby: "+raynaldi.getHobby()+", Nama: "+raynaldi.getNama());
    
        //mengambi; dari class mahasiswa
        Mahasiswa rey = new Mahasiswa("rey", "probolinggo", "gamers", 17, "E31200822");
        
        rey.setAdress("jakarta");
        rey.setAge(20);
        rey.setHobby("pro player");
        rey.setNama("raynaldi wibowo");
        System.out.println("Adress: "+rey.getAdress()+", age: "+rey.getAge()+", hobby: "+rey.getHobby()+", Nama: "+rey.getNama()+", nim: "+rey.getNim());
    }
}
