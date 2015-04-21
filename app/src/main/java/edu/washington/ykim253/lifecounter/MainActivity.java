package edu.washington.ykim253.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private int p1 = 20;
    private int p2 = 20;
    private int p3 = 20;
    private int p4 = 20;

    private String losers = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView p1life = (TextView) findViewById(R.id.p1);
        final Button p1add1 = (Button) findViewById(R.id.p1add1);
        final Button p1sub1 = (Button) findViewById(R.id.p1sub1);
        final Button p1add5 = (Button) findViewById(R.id.p1add5);
        final Button p1sub5 = (Button) findViewById(R.id.p1sub5);

        final TextView p2life = (TextView) findViewById(R.id.p2);
        final Button p2add1 = (Button) findViewById(R.id.p2add1);
        final Button p2sub1 = (Button) findViewById(R.id.p2sub1);
        final Button p2add5 = (Button) findViewById(R.id.p2add5);
        final Button p2sub5 = (Button) findViewById(R.id.p2sub5);

        final TextView p3life = (TextView) findViewById(R.id.p3);
        final Button p3add1 = (Button) findViewById(R.id.p3add1);
        final Button p3sub1 = (Button) findViewById(R.id.p3sub1);
        final Button p3add5 = (Button) findViewById(R.id.p3add5);
        final Button p3sub5 = (Button) findViewById(R.id.p3sub5);

        final TextView p4life = (TextView) findViewById(R.id.p4);
        final Button p4add1 = (Button) findViewById(R.id.p4add1);
        final Button p4sub1 = (Button) findViewById(R.id.p4sub1);
        final Button p4add5 = (Button) findViewById(R.id.p4add5);
        final Button p4sub5 = (Button) findViewById(R.id.p4sub5);

        final TextView whoLost = (TextView) findViewById(R.id.losers);

        p1add1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1 > 0) {
                    p1++;
                    p1life.setText("Player 1: " + p1);
                }
            }
        });

        p2add1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p2 > 0) {
                    p2++;
                    p2life.setText("Player 2: " + p2);
                }
            }
        });

        p3add1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p3 > 0) {
                    p3++;
                    p3life.setText("Player 3: " + p3);
                }
            }
        });

        p4add1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p4 > 0) {
                    p4++;
                    p4life.setText("Player 4: " + p4);
                }
            }
        });

        p1sub1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1 > 0) {
                    p1--;
                    p1life.setText("Player 1: " + p1);
                } if (p1 <= 0) {
                    whoLost.setText(losers + " Player 1 LOSES!");
                    losers = "" + whoLost.getText();
                    p1add1.setEnabled(false);
                    p1sub1.setEnabled(false);
                    p1add5.setEnabled(false);
                    p1sub5.setEnabled(false);
                }
            }
        });

        p2sub1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p2 > 0) {
                    p2--;
                    p2life.setText("Player 2: " + p2);
                } if (p2 <= 0) {
                    whoLost.setText(losers + " Player 2 LOSES!");
                    losers = "" + whoLost.getText();
                    p2add1.setEnabled(false);
                    p2sub1.setEnabled(false);
                    p2add5.setEnabled(false);
                    p2sub5.setEnabled(false);
                }
            }
        });

        p3sub1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p3 > 0) {
                    p3--;
                    p3life.setText("Player 3: " + p3);
                } if (p3 <= 0) {
                    whoLost.setText(losers + " Player 3 LOSES!");
                    losers = "" + whoLost.getText();
                    p3add1.setEnabled(false);
                    p3sub1.setEnabled(false);
                    p3add5.setEnabled(false);
                    p3sub5.setEnabled(false);
                }
            }
        });

        p4sub1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p4 > 0) {
                    p4--;
                    p4life.setText("Player 4: " + p4);
                } if (p4 <= 0) {
                    whoLost.setText(losers + " Player 4 LOSES!");
                    losers = "" + whoLost.getText();
                    p4add1.setEnabled(false);
                    p4sub1.setEnabled(false);
                    p4add5.setEnabled(false);
                    p4sub5.setEnabled(false);
                }
            }
        });

        p1add5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1 > 0) {
                    p1+=5;
                    p1life.setText("Player 1: " + p1);
                }
            }
        });

        p2add5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p2 > 0) {
                    p2+=5;
                    p2life.setText("Player 2: " + p2);
                }
            }
        });

        p3add5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p3 > 0) {
                    p3+=5;
                    p3life.setText("Player 3: " + p3);
                }
            }
        });

        p4add5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p4 > 0) {
                    p4+=5;
                    p4life.setText("Player 4: " + p4);
                }
            }
        });

        p1sub5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p1 > 0) {
                    p1-=5;
                    p1life.setText("Player 1: " + p1);
                } if (p1 <= 0) {
                    whoLost.setText(losers + " Player 1 LOSES!");
                    losers = "" + whoLost.getText();
                    p1add1.setEnabled(false);
                    p1sub1.setEnabled(false);
                    p1add5.setEnabled(false);
                    p1sub5.setEnabled(false);
                }
            }
        });

        p2sub5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p2 > 0) {
                    p2-=5;
                    p2life.setText("Player 2: " + p2);
                } if (p2 <= 0) {
                    whoLost.setText(losers + " Player 2 LOSES!");
                    losers = "" + whoLost.getText();
                    p2add1.setEnabled(false);
                    p2sub1.setEnabled(false);
                    p2add5.setEnabled(false);
                    p2sub5.setEnabled(false);
                }
            }
        });

        p3sub5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p3 > 0) {
                    p3-=5;
                    p3life.setText("Player 3: " + p3);
                } if (p3 <= 0) {
                    whoLost.setText(losers + " Player 3 LOSES!");
                    losers = "" + whoLost.getText();
                    p3add1.setEnabled(false);
                    p3sub1.setEnabled(false);
                    p3add5.setEnabled(false);
                    p3sub5.setEnabled(false);
                }
            }
        });

        p4sub5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (p4 > 0) {
                    p4-=5;
                    p4life.setText("Player 4: " + p4);
                } if (p4 <= 0) {
                    whoLost.setText(losers + " Player 4 LOSES!");
                    losers = "" + whoLost.getText();
                    p4add1.setEnabled(false);
                    p4sub1.setEnabled(false);
                    p4add5.setEnabled(false);
                    p4sub5.setEnabled(false);
                }
            }
        });

        if(savedInstanceState != null) {
            p1 = savedInstanceState.getInt("Player 1");
            p1life.setText("Player 1: " + p1);
            p2 = savedInstanceState.getInt("Player 2");
            p2life.setText("Player 2: " + p2);
            p3 = savedInstanceState.getInt("Player 3");
            p3life.setText("Player 3: " + p3);
            p4 = savedInstanceState.getInt("Player 4");
            p4life.setText("Player 4: " + p4);
        }

    }

    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("Player 1", p1);
        savedInstanceState.putInt("Player 2", p2);
        savedInstanceState.putInt("Player 3", p3);
        savedInstanceState.putInt("Player 4", p4);
    }
}