package com.penafort.practiceset2;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    int teamACounter=0;
    int teamBCounter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void displayForTeamA(int point) {
        String value=String.valueOf(point);
        TextView t = findViewById(R.id.team_a_score_value);
        t.setText(value);
    }
    public void displayForTeamB(int point){
        String value=String.valueOf(point);
        TextView t = findViewById(R.id.team_b_score_value);
        t.setText(value);
    }

    private void addToTeamA(int value){
        teamACounter+=value;
    }
    private void addToTeamB(int value){
        teamBCounter+=value;
    }
    public void addThreeTeamA(View v){
        addToTeamA(3);
        displayForTeamA(teamACounter);
    }
    public void addTwoTeamA(View v){
        addToTeamA(2);
        displayForTeamA(teamACounter);
    }
    public void addOneTeamA(View v){
        addToTeamA(1);
        displayForTeamA(teamACounter);
    }
    public void addThreeTeamB(View v){
        addToTeamB(3);
        displayForTeamB(teamBCounter);
    }
    public void addTwoTeamB(View v){
        addToTeamB(2);
        displayForTeamB(teamBCounter);
    }
    public void addOneTeamB(View v){
        addToTeamB(1);
        displayForTeamB(teamBCounter);
    }
    public void reset(View v){
        teamACounter=0;
        teamBCounter=0;
        displayForTeamA(teamACounter);
        displayForTeamB(teamACounter);
    }




}