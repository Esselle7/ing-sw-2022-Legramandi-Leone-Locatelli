package it.polimi.ingsw.server.controller.expert;

import it.polimi.ingsw.network.messages.NotificationCMI;
import it.polimi.ingsw.network.messages.chooseStudentColourCMI;
import it.polimi.ingsw.server.controller.Exceptions.EmptyDiningRoom;
import it.polimi.ingsw.server.controller.Exceptions.NotEnoughCoins;
import it.polimi.ingsw.server.controller.Exceptions.ChooseCharacterCardException;
import it.polimi.ingsw.server.controller.TurnHandler;
import it.polimi.ingsw.server.model.*;
import java.io.IOException;

/**
 * Specific Character Card Class, its effect is listed in its description and its methods implement it
 */
public class BackInTheBagCard extends CharacterCard{

    public BackInTheBagCard(){
        super(3,11);
        setDescription("you can choose a color so that all players have to put back in the bag three or less (if they have less than three) students of that color");
    }

    /**
     * First the card asks for the colour to the player that bought it then it starts to remove 3 students from other player's
     * boards
     * @param turnHandler basic TurnHandler
     */
    @Override
    public void useCardImpl(TurnHandler turnHandler) throws IOException, ChooseCharacterCardException, NotEnoughCoins {
        buyCard(turnHandler);
        turnHandler.getCurrentClient().sendMessage(new NotificationCMI("Select the colour of the student to pick"));
        turnHandler.getCurrentClient().sendMessage(new chooseStudentColourCMI());
        turnHandler.getCurrentClient().sendMessage(new NotificationCMI("Alright, moving all the students back to the bag"));
        int colour = turnHandler.getCurrentClient().receiveChooseInt();
        for (Player player: turnHandler.getGameMoves().getCurrentGame().getPlayersList()){
            turnHandler.getCurrentClient().sendMessage(new NotificationCMI("Moving students from " + player.getNickname() + "'s board"));
            for(int i = 0; i < 3; i++){
                try {
                    player.getPlayerBoard().decreaseDiningRoom(colour);
                } catch (EmptyDiningRoom e) {
                    break;
                }
            }
            turnHandler.getCurrentClient().sendMessage(new NotificationCMI("Finished moving students"));
        }
    }
}
