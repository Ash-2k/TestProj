package com.aswin.TestProj.ErrorHandling;

public class InvalidStatementException extends Exception {

    public static void main(String[] args){

    }
    public InvalidStatementException(String s) {
        super(s);
    }
    public InvalidStatementException(String s, Exception ex){
        super(s, ex);
    }
}
