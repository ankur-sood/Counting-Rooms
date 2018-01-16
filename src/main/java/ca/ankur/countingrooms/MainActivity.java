package ca.ankur.countingrooms;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView showValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showValue = (TextView) findViewById(R.id.stepsCounter);
    }
    
    RoomModel model = new RoomModel();

    public void moveNorthButton (View View){
        if (model.canMoveNorth()) {
            model.moveNorth();
            updateLabel();
            updateButtonStatus();
        }
    }

    public void moveSouthButton (View View) {  //Create 4 methods for each button
        if (model.canMoveSouth()) {
            model.moveSouth();
            updateLabel();
            updateButtonStatus();
        }
    }
    public void moveWestButton (View View) {  //Create 4 methods for each button
        if (model.canMoveWest()) {
            model.moveWest();
            updateLabel();
            updateButtonStatus();
        }
    }
    public void moveEastButton (View View){  //Create 4 methods for each button
        if (model.canMoveEast()) {
            model.moveEast();
            updateLabel();
            updateButtonStatus();
        }
    }

    public void updateButtonStatus(){

        final Button buttonN = (Button) findViewById(R.id.buttonNorth);
        final Button buttonS = (Button) findViewById(R.id.buttonSouth);
        final Button buttonW = (Button) findViewById(R.id.buttonWest);
        final Button buttonE = (Button) findViewById(R.id.buttonEast);

        if(!model.canMoveNorth())
        {buttonN.setBackgroundColor(Color.RED);}
        else{buttonN.setBackgroundColor(Color.GREEN);}

        if(!model.canMoveSouth())
        {buttonS.setBackgroundColor(Color.RED);}
        else{buttonS.setBackgroundColor(Color.GREEN);}

        if(!model.canMoveWest())
        {buttonW.setBackgroundColor(Color.RED);}
        else{buttonW.setBackgroundColor(Color.GREEN);}

        if(!model.canMoveEast())
        {buttonE.setBackgroundColor(Color.RED);}
        else{buttonE.setBackgroundColor(Color.GREEN);}
    }

    public void updateLabel(){
        showValue.setText(model.getSteps()+"");
    }
}