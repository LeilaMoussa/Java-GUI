/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

public class InvalidPasswordException extends Exception {

    /**
     * Creates a new instance of <code>InvalidPasswordException</code> without
     * detail message.
     */
    public InvalidPasswordException() {
    }

    /**
     * Constructs an instance of <code>InvalidPasswordException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidPasswordException(String msg) {
        super(msg);
        System.out.println(msg);
    }

    public void PasswordCriteria() {
        System.out.println("Please Enter a password that is at least 6 characters long, has at least one uppercase letter, and one digit");
    }

}
