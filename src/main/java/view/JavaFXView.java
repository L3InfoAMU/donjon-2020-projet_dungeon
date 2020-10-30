package view;

import javafx.scene.text.*;
import model.Move;

public class JavaFXView implements View{

    public Text text = new Text(100,100,"Hello World");

    public void handleMove(Move move){
        text.setText(move.message);
    }
}
