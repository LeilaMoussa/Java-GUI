/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

public class InvalidEmailException extends Exception {

    /**
     * Creates a new instance of <code>InvalidEmailException</code> without
     * detail message.
     */
    public InvalidEmailException() {
    }

    /**
     * Constructs an instance of <code>InvalidEmailException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidEmailException(String msg) {
        super(msg);
        System.out.println(msg);
    }
    
    public void getEmailFormat(String email){
        System.out.println("Your email: " + email +" should follow the following format: TEXT@TEXT.COM");
    }
}
