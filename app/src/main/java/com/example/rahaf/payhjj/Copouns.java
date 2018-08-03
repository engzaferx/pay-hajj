package com.example.rahaf.payhjj;

public class Copouns {

    private String coponTitle;

    /** Miwok translation for the word */
    private String coponDesc;


    public Copouns(String coponT, String coponD) {
        coponTitle = coponT;
        coponDesc = coponD;
    }

    /**
     * Get the default translation of the word.
     */
    public String getCoponTitle() {
        return coponTitle;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getCoponDesc() {
        return coponDesc;
    }
}
