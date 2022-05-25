package it.polimi.ingsw.client.gui.ScenesController;

import it.polimi.ingsw.client.gui.Gui;
import it.polimi.ingsw.client.gui.GuiMain;
import it.polimi.ingsw.client.gui.Scenes.GuiLoadScene;
import it.polimi.ingsw.client.model.ClientColour;
import it.polimi.ingsw.server.model.*;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class GuiPlaygroundController {

    // Game Model
    private static String myNickname = null;
    private static PlayGround playGround = null;
    private static Board myBoard = null;
    private static Deck myDeck = null;
    private static Card myCurrentCard = null;
    private static int expert;
    private static String notification;

    // Game fx id references
    public Label notificationLabel;
    // Buttons to display others players board
    public Button nickname1;
    public Button nickname2;
    // professors owner
    public Label pinkProfessor;
    public Label redProfessor;
    public Label greenProfessor;
    public Label yellowProfessor;
    public Label blueProfessor;
    // number of tower per colour
    public Label towerGray;
    public Label towerBlack;
    public Label towerWhite;
    // assistant Cards
    public ImageView assistantOne;
    public ImageView assistantTwo;
    public ImageView assistantThree;
    public ImageView assistantFour;
    public ImageView assistantFive;
    public ImageView assistantSix;
    public ImageView assistantSeven;
    public ImageView assistantEight;
    public ImageView assistantNine;
    public ImageView assistantTen;
    public List<ImageView> assistantCards;

    public ImageView island1;
    public ImageView island2;
    public ImageView island3;
    public ImageView island4;
    public ImageView island5;
    public ImageView island6;
    public ImageView island7;
    public ImageView island8;
    public ImageView island9;
    public ImageView island10;
    public ImageView island11;
    public ImageView island12;
    public List<ImageView> islands;

    public Label studentRed1;
    public Label studentGreen1;
    public Label studentBlue1;
    public Label studentYellow1;
    public Label studentPink1;
    public List<Label> studentIsland1;

    public Label studentRed2;
    public Label studentGreen2;
    public Label studentBlue2;
    public Label studentYellow2;
    public Label studentPink2;
    public List<Label> studentIsland2;

    public Label studentRed3;
    public Label studentGreen3;
    public Label studentBlue3;
    public Label studentYellow3;
    public Label studentPink3;
    public List<Label> studentIsland3;


    public Label studentRed4;
    public Label studentGreen4;
    public Label studentBlue4;
    public Label studentYellow4;
    public Label studentPink4;
    public List<Label> studentIsland4;

    public Label studentRed5;
    public Label studentGreen5;
    public Label studentBlue5;
    public Label studentYellow5;
    public Label studentPink5;
    public List<Label> studentIsland5;

    public Label studentRed6;
    public Label studentGreen6;
    public Label studentBlue6;
    public Label studentYellow6;
    public Label studentPink6;
    public List<Label> studentIsland6;

    public Label studentRed7;
    public Label studentGreen7;
    public Label studentBlue7;
    public Label studentYellow7;
    public Label studentPink7;
    public List<Label> studentIsland7;

    public Label studentRed8;
    public Label studentGreen8;
    public Label studentBlue8;
    public Label studentYellow8;
    public Label studentPink8;
    public List<Label> studentIsland8;

    public Label studentRed9;
    public Label studentGreen9;
    public Label studentBlue9;
    public Label studentYellow9;
    public Label studentPink9;
    public List<Label> studentIsland9;

    public Label studentRed10;
    public Label studentGreen10;
    public Label studentBlue10;
    public Label studentYellow10;
    public Label studentPink10;
    public List<Label> studentIsland10;

    public Label studentRed11;
    public Label studentGreen11;
    public Label studentBlue11;
    public Label studentYellow11;
    public Label studentPink11;
    public List<Label> studentIsland11;

    public Label studentRed12;
    public Label studentGreen12;
    public Label studentBlue12;
    public Label studentYellow12;
    public Label studentPink12;
    public List<Label> studentIsland12;
    public List<List<Label>> isl;

    public GuiPlaygroundController()
    {

    }

    public void initialize()
    {
        assistantCards = new ArrayList<>();
        assistantCards.add(assistantOne);
        assistantCards.add(assistantTwo);
        assistantCards.add(assistantThree);
        assistantCards.add(assistantFour);
        assistantCards.add(assistantFive);
        assistantCards.add(assistantSix);
        assistantCards.add(assistantSeven);
        assistantCards.add(assistantEight);
        assistantCards.add(assistantNine);
        assistantCards.add(assistantTen);

        islands = new ArrayList<>();
        islands.add(island1);
        islands.add(island2);
        islands.add(island3);
        islands.add(island4);
        islands.add(island5);
        islands.add(island6);
        islands.add(island7);
        islands.add(island8);
        islands.add(island9);
        islands.add(island10);
        islands.add(island11);
        islands.add(island12);

        studentIsland1 = new ArrayList<>();
        studentIsland1.add(studentPink1);
        studentIsland1.add(studentYellow1);
        studentIsland1.add(studentBlue1);
        studentIsland1.add(studentGreen1);
        studentIsland1.add(studentRed1);

        studentIsland2 = new ArrayList<>();
        studentIsland2.add(studentPink2);
        studentIsland2.add(studentYellow2);
        studentIsland2.add(studentBlue2);
        studentIsland2.add(studentGreen2);
        studentIsland2.add(studentRed2);

        studentIsland3 = new ArrayList<>();
        studentIsland3.add(studentPink3);
        studentIsland3.add(studentYellow3);
        studentIsland3.add(studentBlue3);
        studentIsland3.add(studentGreen3);
        studentIsland3.add(studentRed3);

        studentIsland4 = new ArrayList<>();
        studentIsland4.add(studentPink4);
        studentIsland4.add(studentYellow4);
        studentIsland4.add(studentBlue4);
        studentIsland4.add(studentGreen4);
        studentIsland4.add(studentRed4);

        studentIsland5 = new ArrayList<>();
        studentIsland5.add(studentPink5);
        studentIsland5.add(studentYellow5);
        studentIsland5.add(studentBlue5);
        studentIsland5.add(studentGreen5);
        studentIsland5.add(studentRed5);

        studentIsland6 = new ArrayList<>();
        studentIsland6.add(studentPink6);
        studentIsland6.add(studentYellow6);
        studentIsland6.add(studentBlue6);
        studentIsland6.add(studentGreen6);
        studentIsland6.add(studentRed6);

        studentIsland7 = new ArrayList<>();
        studentIsland7.add(studentPink7);
        studentIsland7.add(studentYellow7);
        studentIsland7.add(studentBlue7);
        studentIsland7.add(studentGreen7);
        studentIsland7.add(studentRed7);

        studentIsland8 = new ArrayList<>();
        studentIsland8.add(studentPink8);
        studentIsland8.add(studentYellow8);
        studentIsland8.add(studentBlue8);
        studentIsland8.add(studentGreen8);
        studentIsland8.add(studentRed8);

        studentIsland9 = new ArrayList<>();
        studentIsland9.add(studentPink9);
        studentIsland9.add(studentYellow9);
        studentIsland9.add(studentBlue9);
        studentIsland9.add(studentGreen9);
        studentIsland9.add(studentRed9);

        studentIsland10 = new ArrayList<>();
        studentIsland10.add(studentPink10);
        studentIsland10.add(studentYellow10);
        studentIsland10.add(studentBlue10);
        studentIsland10.add(studentGreen10);
        studentIsland10.add(studentRed10);

        studentIsland11 = new ArrayList<>();
        studentIsland11.add(studentPink11);
        studentIsland11.add(studentYellow11);
        studentIsland11.add(studentBlue11);
        studentIsland11.add(studentGreen11);
        studentIsland11.add(studentRed11);

        studentIsland12 = new ArrayList<>();
        studentIsland12.add(studentPink12);
        studentIsland12.add(studentYellow12);
        studentIsland12.add(studentBlue12);
        studentIsland12.add(studentGreen12);
        studentIsland12.add(studentRed12);

        isl = new ArrayList<>();
        isl.add(studentIsland1);
        isl.add(studentIsland2);
        isl.add(studentIsland3);
        isl.add(studentIsland4);
        isl.add(studentIsland5);
        isl.add(studentIsland6);
        isl.add(studentIsland7);
        isl.add(studentIsland8);
        isl.add(studentIsland9);
        isl.add(studentIsland10);
        isl.add(studentIsland11);
        isl.add(studentIsland12);



    }

    public static String getNotification() {
        return notification;
    }

    public static void setNotification(String notification) {
        GuiPlaygroundController.notification = notification;
    }

    public static String getMyNickname() {
        return myNickname;
    }

    public static void setMyNickname(String myNickname) {
        GuiPlaygroundController.myNickname = myNickname;
    }

    public static PlayGround getPlayGround() {
        return playGround;
    }

    public static void setPlayGround(PlayGround playGround) {
        GuiPlaygroundController.playGround = playGround;
    }

    public static Board getMyBoard() {
        return myBoard;
    }

    public static void setMyBoard(Board myBoard) {
        GuiPlaygroundController.myBoard = myBoard;
    }

    public static Deck getMyDeck() {
        return myDeck;
    }

    public static void setMyDeck(Deck myDeck) {
        GuiPlaygroundController.myDeck = myDeck;
    }

    public static Card getMyCurrentCard() {
        return myCurrentCard;
    }

    public static void setMyCurrentCard(Card myCurrentCard) {
        GuiPlaygroundController.myCurrentCard = myCurrentCard;
    }

    public static int getExpert() {
        return expert;
    }

    public static void setExpert(int expert) {
        GuiPlaygroundController.expert = expert;
    }

    public static void update(PlayGround playGroundNew)
    {
        setPlayGround(playGroundNew);
        for (Player p: playGroundNew.getPlayersList()) {
            if(p.getNickname().equals(getMyNickname()))
            {
                update(p.getPlayerBoard(),p.getAssistantCards(),p.getCurrentCard(),p.getPlayerBoard().getCoins());
                break;
            }
        }
    }

    private static void update(Board myBoardNew, Deck myDeckNew, Card myCurrentCardNew, int myCoins)
    {
        setMyBoard(myBoardNew);
        setMyCurrentCard(myCurrentCardNew);
        setMyDeck(myDeckNew);
        getMyBoard().setCoins(myCoins);
    }

    public void updatePlayground()
    {
        //Update Islands
        for(int index = getPlayGround().getIslands().size(); index <islands.size();index++)
        {
            islands.get(index).setOpacity(0.0);
        }
        for(int index = 0; index < getPlayGround().getIslands().size(); index++)
        {
            Island i = getPlayGround().getIslandByIndex(index);
            for(int student=0; student<i.getPlacedStudent().length;student++)
            {
                isl.get(index).get(student).setText(String.valueOf(i.getPlacedStudent()[student]));
            }

        }
    }

    public void updateStats() {
        // Update general info in Stats scene

        for(Player p : getPlayGround().getPlayersList())
        {
            if(!p.getNickname().equals(getMyNickname()))
            {
                if(nickname1.getText().equals("None"))
                    nickname1.setText(p.getNickname());
                else
                    nickname2.setText(p.getNickname());
            }
            if(p.getPlayerBoard().getTowerColour().equals(TColour.WHITE))
                towerWhite.setText(String.valueOf((p.getPlayerBoard().getTowerYard())));
            if(p.getPlayerBoard().getTowerColour().equals(TColour.BLACK))
                towerBlack.setText(String.valueOf((p.getPlayerBoard().getTowerYard())));
            if(p.getPlayerBoard().getTowerColour().equals(TColour.GRAY))
                towerGray.setText(String.valueOf((p.getPlayerBoard().getTowerYard())));
        }

        //Update assistant cards
        boolean found = false;
        for(ImageView card : assistantCards)
        {
            for(Card c : getMyDeck().getResidualCards())
            {
                if(assistantCards.indexOf(card)+1 == c.getValue())
                    found = true;
            }
            if(!found)
            {
                card.setOpacity(0.5);
                card.setDisable(true);
            }
            found = false;

        }

    }

    public void switchToBoard()
    {
        Platform.runLater(() ->
                new GuiLoadScene("Board").run());

    }

    public void switchToPlayground()
    {
        Platform.runLater(() -> new GuiLoadScene("Playground").run());
    }

    public void switchToSettings()
    {
        Platform.runLater(() -> new GuiLoadScene("Settings").run());
    }

    public void switchToStats()
    {
        Platform.runLater(() -> new GuiLoadScene("Stats").run());
    }

    private void assistantCardToUse(int card){
        if(Gui.getGamePhase().equals("assistantCard"))
            GuiMain.getQueue().add(card);
    }

    public void cardOne(MouseEvent mouseEvent) {
        assistantCardToUse(1);
    }
    public void cardTwo(MouseEvent mouseEvent) {
        assistantCardToUse(2);
    }
    public void cardThree(MouseEvent mouseEvent) {
        assistantCardToUse(3);
    }
    public void cardFour(MouseEvent mouseEvent) {
        assistantCardToUse(4);
    }
    public void cardFive(MouseEvent mouseEvent) {
        assistantCardToUse(5);
    }
    public void cardSix(MouseEvent mouseEvent) {
        assistantCardToUse(6);
    }
    public void cardSeven(MouseEvent mouseEvent) {
        assistantCardToUse(7);
    }
    public void cardEight(MouseEvent mouseEvent) {
        assistantCardToUse(8);
    }
    public void cardNine(MouseEvent mouseEvent) {
        assistantCardToUse(9);
    }
    public void cardTen(MouseEvent mouseEvent) {
        assistantCardToUse(10);
    }




}
