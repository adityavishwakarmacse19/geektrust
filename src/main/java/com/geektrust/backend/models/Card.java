package com.geektrust.backend.models;

import com.geektrust.backend.models.Station.StationName;

public class Card {
    String cardNumber;


	StationName fromStation;
    int balance;
    boolean returnJourney; 

    public Card(String metroNumber, int balance) {
        this.cardNumber = metroNumber;
        this.balance = balance;
    }

    public StationName getFromStation() {
        return fromStation;
    }

    public void setFromStation(StationName fromStation) {
        this.fromStation = fromStation;
    }

    public boolean getReturnJourney() {
        return returnJourney;
    }

    public void setReturnJourney(boolean returnJourney) {
        this.returnJourney = returnJourney;
    }


    public String getCardNumber() {
		return cardNumber;
	}

   
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}