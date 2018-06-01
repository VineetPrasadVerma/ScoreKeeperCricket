package com.example.vineetprasadverma.scorekeeper_cricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int runs = 0;
    int bowls = 0;
    int wicket = 0;
    String winnerTeam = "" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add6ForBattingTeam(View v){
        runs = runs +6 ;
        displayForBattingTeam(runs);
        chooseWinner();
    }
    public void add4ForBattingTeam(View v){
        runs = runs +4 ;
        displayForBattingTeam(runs);
        chooseWinner();
    }
    public void add1ForBattingTeam(View v){
        runs = runs +1 ;
        displayForBattingTeam(runs);
        chooseWinner();
    }
    public void addOneForBattingTeam(View v){
        runs = runs +1 ;
        displayForBattingTeam(runs);
        chooseWinner();
    }
    public void add1BowlForBowlingTeam(View v){
        bowls = bowls +1 ;
        displayForBowlingTeam(bowls);
        chooseWinner();
    }
    public void addWicket(View v){
        bowls = bowls +1;
        wicket = wicket +1;
        displayWicket(wicket);
        displayForBowlingTeam(bowls);
        chooseWinner();
    }
    public void reset(View v){
        runs = 0;
        bowls = 0;
        wicket = 0;
        winnerTeam = "";
        displayForBattingTeam(runs);
        displayForBowlingTeam(bowls);
        displayWicket(wicket);
        displayWinner(winnerTeam);
    }

    public void chooseWinner(){
        if(runs>21){
            winnerTeam = "BATTING TEAM WINS" ;
            displayWinner(winnerTeam);
        }
        else if(bowls>=6){
            winnerTeam = "BOWLING TEAM WINS";
            displayWinner(winnerTeam);
        }

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForBattingTeam(int runs) {
        TextView scoreView = (TextView) findViewById(R.id.batting_team_runs);
        scoreView.setText(String.valueOf(runs));
    }
    public void displayWicket(int wicket) {
        TextView scoreView = (TextView) findViewById(R.id.wicket);
        scoreView.setText(String.valueOf(wicket));
    }
    public void displayWinner(String winner) {
        TextView scoreView = (TextView) findViewById(R.id.winner);
        scoreView.setText(winner);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForBowlingTeam(int bowls) {
        TextView scoreView = (TextView) findViewById(R.id.bowling_team_bowled);
        scoreView.setText(String.valueOf(bowls));
    }
}
