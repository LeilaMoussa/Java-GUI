/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

public enum Gender {
    MALE,
    FEMALE;
    
    public static void getList(Gender gender){
        for(Gender i : Gender.values()){
            System.out.println(i);
        }
        
    }
}
