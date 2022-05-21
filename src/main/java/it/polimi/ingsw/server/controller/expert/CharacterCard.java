package it.polimi.ingsw.server.controller.expert;
import it.polimi.ingsw.TextColours;
import it.polimi.ingsw.client.model.ClientColour;
import it.polimi.ingsw.network.messages.NotificationCMI;
import it.polimi.ingsw.server.controller.*;
import it.polimi.ingsw.server.controller.Exceptions.*;

import java.io.IOException;
import java.io.Serializable;

/**
 * This class serves as a blueprint for all the character cards, it implements on its own
 * the card buying process and basic getters and setters.
 */
public abstract class CharacterCard implements Serializable {
    int price;
    boolean hasBeenUsed;
    String description = "";
    String specificDescription;
    int[] students;

    public CharacterCard(int price){
        this.hasBeenUsed = false;
        this.price = price;
        this.specificDescription = null;
        this.students = null;
    }

    /**
     * This method handles the buying process of a card by decreasing its buyer's coins and increasing
     * the card's price in case it has never been selected before.
     * @param turnHandler
     */
    public void buyCard(TurnHandler turnHandler) throws IOException, NotEnoughCoins {
        turnHandler.getCurrentClient().sendMessage(new NotificationCMI("Card successfully acquired"));
        turnHandler.getCurrentPlayer().getPlayerBoard().decreaseCoins(price);
        if(!hasBeenUsed) {
            price++;
            turnHandler.getCurrentPlayer().getPlayerBoard().decreaseCoinReserve();
            hasBeenUsed = true;
            turnHandler.getCurrentClient().sendMessage(new NotificationCMI("The card price has been increased to " + price));
        }
    }

    /**
     * This method initializes the attributes at the beginning of the game
     */
    public void initializeCard(TurnHandler turnHandler){
    }

    /**
     * This method handles the card's effects
     */
    public abstract void useCardImpl(TurnHandler turnHandler) throws chooseCharacterCardException, IOException, NotEnoughCoins, EmptyTowerYard,UnableToUseCardException, GameWonException;

    public void useCard(TurnHandler turnHandler) throws IOException, EmptyTowerYard, NotEnoughCoins, GameWonException, UnableToUseCardException {
        try {
            useCardImpl(turnHandler);
        }catch (chooseCharacterCardException ignored){}

    }

    public int getPrice() {
        return price;
    }

    /**
     * This method handles the card's effects reset
     */
    public void resetCard(TurnHandler turnHandler) {}

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(int[] students) {
        this.students = students;
    }

    public int[] getStudents() {
        return students;
    }
}
