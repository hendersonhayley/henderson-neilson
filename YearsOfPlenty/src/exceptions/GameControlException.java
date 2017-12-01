/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Brennan.Neilson
 */
public class GameControlException extends Exception{
    
    public GameControlException() {
    }

    public GameControlException(String message) {
        super(message);
    }
    
}
