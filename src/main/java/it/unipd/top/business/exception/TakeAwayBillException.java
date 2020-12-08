////////////////////////////////////////////////////////////////////
// Romina Brotto 1201226
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

public class TakeAwayBillException extends Exception {

    private String messaggio;

    public TakeAwayBillException(String error) {
        this.messaggio = error;
    }

    public String getMessaggio() {
        return this.messaggio;
    }
} 