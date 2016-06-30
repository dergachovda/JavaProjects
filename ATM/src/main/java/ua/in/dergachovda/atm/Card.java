package ua.in.dergachovda.atm;

import java.util.Date;

public class Card {

    private static final int VALIDITY = 3;

    private Person person;
    private Account acct;
    private CardsNo cardsNo;
    private ExpiresEnd expiresEnd;


    public Card(Person person, Account acct, int number) {
        this.person = person;
        this.acct = acct;
        this.cardsNo = new CardsNo(number);
        Date date = new Date();
        this.expiresEnd = new ExpiresEnd(date.getMonth(), date.getYear() + VALIDITY);
    }

    public ExpiresEnd getExpiresEnd() {
        return expiresEnd;
    }
}
