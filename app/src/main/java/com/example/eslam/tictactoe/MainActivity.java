package com.example.eslam.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int player=1;
    TextView txtplayer;
    public int [] array={0,0,0,0,0,0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn_1);
        btn2=(Button) findViewById(R.id.btn_2);
        btn3=(Button) findViewById(R.id.btn_3);
        btn4=(Button) findViewById(R.id.btn_4);
        btn5=(Button) findViewById(R.id.btn_5);
        btn6=(Button) findViewById(R.id.btn_6);
        btn7=(Button) findViewById(R.id.btn_7);
        btn8=(Button) findViewById(R.id.btn_8);
        btn9=(Button) findViewById(R.id.btn_9);
        txtplayer=(TextView)findViewById(R.id.txt_player);
        txtplayer.setText("Player: "+player);

        /////////////////////////////////
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn1.getText()==""){
                    if (player==1){
                        btn1.setText("X");
                        btn1.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[0]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn1.setText("O");
                        btn1.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[0]=2;
                        checkt();
                    }
                }

            }
        });
        ///////////////////////////////////////////////////////
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn2.getText()==""){
                    if (player==1){
                        btn2.setText("X");
                        btn2.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[1]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn2.setText("O");
                        btn2.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[1]=2;
                        checkt();
                    }
                }

            }
        });
        /////////////////////////////////
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn3.getText()==""){
                    if (player==1){
                        btn3.setText("X");
                        btn3.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[2]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn3.setText("O");
                        btn3.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[2]=2;
                        checkt();
                    }
                }

            }
        });
        ///////////////////////////////////////////////////////
        /////////////////////////////////
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn4.getText()==""){
                    if (player==1){
                        btn4.setText("X");
                        btn4.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[3]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn4.setText("O");
                        btn4.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[3]=2;
                        checkt();
                    }
                }

            }
        });
        ///////////////////////////////////////////////////////
        /////////////////////////////////
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn5.getText()==""){
                    if (player==1){
                        btn5.setText("X");
                        btn5.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[4]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn5.setText("O");
                        btn5.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[4]=2;
                        checkt();
                    }
                }

            }
        });
        ///////////////////////////////////////////////////////
        /////////////////////////////////
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn6.getText()==""){
                    if (player==1){
                        btn6.setText("X");
                        btn6.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[5]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn6.setText("O");
                        btn6.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[5]=2;
                        checkt();
                    }
                }

            }
        });
        ///////////////////////////////////////////////////////
        /////////////////////////////////
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn7.getText()==""){
                    if (player==1){
                        btn7.setText("X");
                        btn7.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[6]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn7.setText("O");
                        btn7.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[6]=2;
                        checkt();
                    }
                }

            }
        });
        ///////////////////////////////////////////////////////
        /////////////////////////////////
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn8.getText()==""){
                    if (player==1){
                        btn8.setText("X");
                        btn8.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[7]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn8.setText("O");
                        btn8.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[7]=2;
                        checkt();
                    }
                }

            }
        });
        ///////////////////////////////////////////////////////
        /////////////////////////////////
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn9.getText()==""){
                    if (player==1){
                        btn9.setText("X");
                        btn9.setTextSize(20);
                        player=2;
                        txtplayer.setText("Player: "+player);
                        array[8]=1;
                        checkt();
                    }
                    else if(player==2){
                        btn9.setText("O");
                        btn9.setTextSize(20);
                        player=1;
                        txtplayer.setText("Player: "+player);
                        array[8]=2;
                        checkt();
                    }
                }

            }
        });
        ///////////////////////////////////////////////////////
    }
       public void checkt(){
         if ((array[0]==1&& array[1]==1&&array[2]==1)||(array[3]==1&& array[4]==1&&array[5]==1)||(array[6]==1&& array[7]==1&&array[8]==1)
              ||(array[0]==1&& array[3]==1&&array[6]==1)||(array[1]==1&& array[4]==1&&array[7]==1)||(array[2]==1&& array[5]==1&&array[8]==1)
                 || (array[0]==1&& array[4]==1&&array[8]==1)||(array[2]==1&& array[4]==1&&array[6]==1)){

             Toast.makeText(this,"the player 1 is wain",Toast.LENGTH_SHORT).show();
             clear();
         }
           else if ((array[0]==2&& array[1]==2&&array[2]==2)||(array[3]==2&& array[4]==2&&array[5]==2)||(array[6]==2&& array[7]==2&&array[8]==2)
                 ||(array[0]==2&& array[3]==2&&array[6]==2)||(array[1]==2&& array[4]==2&&array[7]==2)||(array[2]==2&& array[5]==2&&array[8]==2)
                 || (array[0]==2&& array[4]==2&&array[8]==2)||(array[2]==2&& array[4]==2&&array[6]==2)){

             Toast.makeText(this,"the player 2 is wain",Toast.LENGTH_SHORT).show();
             clear();
         }
           else{

             if(btn1.getText()!=""&&btn2.getText()!=""&&btn3.getText()!=""&&btn4.getText()!=""&& btn5.getText()!=""&&btn6.getText()!=""&&btn7.getText()!=""&&btn9.getText()!=""&&btn9.getText()!=""){
                 Toast.makeText(this,"Game is equal to",Toast.LENGTH_SHORT).show();
                 clear();
             }
         }
       }
        //////////////////////////////////
        public void clear(){
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            player=1;
            txtplayer.setText("Player: "+player);
            array[0]=0;
            array[1]=0;
            array[2]=0;
            array[3]=0;
            array[4]=0;
            array[5]=0;
            array[6]=0;
            array[7]=0;
        }

}
