/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Leila
 */
public class DataBaseCollection {

    HashMap<String, String> database;

    public DataBaseCollection() {
        database = new HashMap<>();
    }

    public boolean addUser(Member toAdd) { //to be called when registering
        //let's see if we can make use of map's no duplicate policy to get rid of if
        if (!database.containsKey(toAdd.getEmail())) {
            database.putIfAbsent(toAdd.getEmail(), toAdd.getPassword());
            //trying to avoid getPassword()
            //honestly put is fine too
            return true;
        }
        return false; //email already exists
    }

    public boolean removeUser(Member toRemove) {//only key is needed, since no dupliacate emails can be allowed
        if (database.containsKey(toRemove.getEmail())) {
            database.remove(toRemove.getEmail());
            return true;
        }
        return false;
    }

    public boolean modifyUser(Member toModify, Member newMember) {
        if (database.containsKey(toModify.getEmail())) {
            database.put(toModify.getEmail(), toModify.getPassword());
            return true;
        }
        return false;

    }

    public boolean authenticate(Member toAuth) {
        return (database.get(toAuth.getEmail()).equals(toAuth.getPassword()));
    }

    @Override
    public String toString() {
        String str = "";
        Set<String> emailSet = database.keySet();
        Iterator<String> iter = emailSet.iterator(); //literally no consequences if string is not specified
        while (iter.hasNext()) {
            String key = iter.next(); //key is an email
            str += key + database.get(key);
        }
        return str;
    }
}
