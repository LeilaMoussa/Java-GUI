/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Comparator;

/**
 *
 * @author Leila
 */
public class MemberAlphaComp implements Comparator<Member> {

    @Override
    public int compare(Member a, Member b) {
        return (a.getEmail().compareTo(b.getEmail()));
    }
}
