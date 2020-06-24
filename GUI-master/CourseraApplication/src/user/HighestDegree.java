/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

public enum HighestDegree {
    HIGHSCHOOL,
    ASSOCIATE,
    BACHELOR,
    MASTERS,
    PHD;
    
    public static void getList(HighestDegree highest_degree){
        for(HighestDegree i : HighestDegree.values()){
            System.out.println(i);
        }
        
    }
}
