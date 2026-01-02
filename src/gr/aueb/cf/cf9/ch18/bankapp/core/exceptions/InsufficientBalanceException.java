package gr.aueb.cf.cf9.ch18.bankapp.core.exceptions;

import java.security.PublicKey;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){
        super(message);
    }
}
