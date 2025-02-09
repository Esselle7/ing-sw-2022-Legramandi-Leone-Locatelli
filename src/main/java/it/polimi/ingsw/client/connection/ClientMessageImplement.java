package it.polimi.ingsw.client.connection;

import it.polimi.ingsw.client.View;
import it.polimi.ingsw.client.connection.ConnectionClientSide;
import it.polimi.ingsw.network.messages.Message;

import java.io.IOException;

/**
 * This interface contains the method elaborateMessage that
 * will be implemented in a different way from the classes
 * that implements this. So it allows binding request from the server
 * to specific implementations in client View (userInterface).
 */
public interface ClientMessageImplement extends Message {
    /**
     * This method allows to execute the message received in the client
     * @param userInterface user interface used by the specific client (gui/cli)
     * @param socket the connection between client and server
     */
    void elaborateMessage(View userInterface, ConnectionClientSide socket) throws IOException, InterruptedException;

}
