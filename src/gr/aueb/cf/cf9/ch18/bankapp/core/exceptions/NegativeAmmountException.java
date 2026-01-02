package gr.aueb.cf.cf9.ch18.bankapp.core.exceptions;

import gr.aueb.cf.cf9.ch14.bank_app.NegativeAmountException;

public class NegativeAmmountException extends Exception{

    public NegativeAmountException (String message){
        super(message);
    }

}
