package com.example.mathsquizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.gridlayout.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    ArrayList<Integer> answers = new ArrayList<Integer>();
    int locationOfCorrectAnswer;
    int score = 0;
    int numberOfQuestions;

    Button playButton;
    Button button1;
    Button button2;
    Button button3;
    Button button0;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    TextView questionTextView;
    TextView resultTextView;
    TextView scoreTextView;
    TextView timerTextView;
    Button playAgainButton;
    GridLayout multiplyGridLayout;
    GridLayout addGridLayout;
    GridLayout divideGridLayout;
    GridLayout subtractGridLayout;
    RelativeLayout chooseRelativeLayout;
    RelativeLayout innerRelativeLayout;
    Button addButton;
    Button subtractButton;
    Button multiplyButton;
    Button divideButton;
    ImageView imageView;

    public void playAgain(View view)
    {
        playAgainButton.setVisibility(View.INVISIBLE);
        innerRelativeLayout.setVisibility(View.INVISIBLE);
        chooseRelativeLayout.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.INVISIBLE);
    }

    public void addition(View view)
    {
        chooseRelativeLayout.setVisibility(View.INVISIBLE);
        innerRelativeLayout.setVisibility(View.VISIBLE);
        multiplyGridLayout.setVisibility(View.INVISIBLE);
        divideGridLayout.setVisibility(View.INVISIBLE);
        subtractGridLayout.setVisibility(View.INVISIBLE);
        questionTextView.setVisibility(View.VISIBLE);
        timerTextView.setVisibility(View.VISIBLE);
        scoreTextView.setVisibility(View.VISIBLE);
        score = 0;
        numberOfQuestions = 0;
        scoreTextView.setText("0/0");
        timerTextView.setText("30s");
        resultTextView.setText(" ");
        generateAddQuestion();

        new CountDownTimer(30100, 1000) {
            @Override
            public void onTick(long l) {
                timerTextView.setText(String.format("%ss", l / 1000));
            }

            @Override
            public void onFinish() {
                playAgainButton.setVisibility(View.VISIBLE);
                questionTextView.setVisibility(View.INVISIBLE);
                addGridLayout.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.VISIBLE);
                timerTextView.setText("0s");
                timerTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                resultTextView.setText(String.format("Your score is : %s", String.format("%d/%d", score, numberOfQuestions)));
            }
        }.start();
    }


    public void subtraction(View view)
    {
        chooseRelativeLayout.setVisibility(View.INVISIBLE);
        innerRelativeLayout.setVisibility(View.VISIBLE);
        multiplyGridLayout.setVisibility(View.INVISIBLE);
        divideGridLayout.setVisibility(View.INVISIBLE);
        addGridLayout.setVisibility(View.INVISIBLE);
        questionTextView.setVisibility(View.VISIBLE);
        timerTextView.setVisibility(View.VISIBLE);
        scoreTextView.setVisibility(View.VISIBLE);
        score = 0;
        numberOfQuestions = 0;
        scoreTextView.setText("0/0");
        timerTextView.setText("30s");
        resultTextView.setText(" ");
        generateSubtractQuestion();

        new CountDownTimer(30100, 1000) {
            @Override
            public void onTick(long l) {
                timerTextView.setText(String.format("%ss", l / 1000));
            }

            @Override
            public void onFinish() {
                playAgainButton.setVisibility(View.VISIBLE);
                questionTextView.setVisibility(View.INVISIBLE);
                subtractGridLayout.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.VISIBLE);
                timerTextView.setText("0s");
                timerTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                resultTextView.setText(String.format("Your score is : %s", String.format("%d/%d", score, numberOfQuestions)));
            }
        }.start();
    }

    public void multiplication(View view)
    {
        chooseRelativeLayout.setVisibility(View.INVISIBLE);
        innerRelativeLayout.setVisibility(View.VISIBLE);
        divideGridLayout.setVisibility(View.INVISIBLE);
        addGridLayout.setVisibility(View.INVISIBLE);
        subtractGridLayout.setVisibility(View.INVISIBLE);
        questionTextView.setVisibility(View.VISIBLE);
        timerTextView.setVisibility(View.VISIBLE);
        scoreTextView.setVisibility(View.VISIBLE);
        score = 0;
        numberOfQuestions = 0;
        scoreTextView.setText("0/0");
        timerTextView.setText("30s");
        resultTextView.setText(" ");
        generateMultiplyQuestion();

        new CountDownTimer(30100, 1000) {
            @Override
            public void onTick(long l) {
                timerTextView.setText(String.format("%ss", l / 1000));
            }

            @Override
            public void onFinish() {
                playAgainButton.setVisibility(View.VISIBLE);
                questionTextView.setVisibility(View.INVISIBLE);
                multiplyGridLayout.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.VISIBLE);
                timerTextView.setText("0s");
                timerTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                resultTextView.setText(String.format("Your score is : %s", String.format("%d/%d", score, numberOfQuestions)));
            }
        }.start();
    }


    public void division(View view)
    {
        chooseRelativeLayout.setVisibility(View.INVISIBLE);
        innerRelativeLayout.setVisibility(View.VISIBLE);
        addGridLayout.setVisibility(View.INVISIBLE);
        subtractGridLayout.setVisibility(View.INVISIBLE);
        multiplyGridLayout.setVisibility(View.INVISIBLE);
        questionTextView.setVisibility(View.VISIBLE);
        timerTextView.setVisibility(View.VISIBLE);
        scoreTextView.setVisibility(View.VISIBLE);
        score = 0;
        numberOfQuestions = 0;
        scoreTextView.setText("0/0");
        timerTextView.setText("30s");
        resultTextView.setText(" ");
        generateDivideQuestion();
        new CountDownTimer(30100, 1000) {
            @Override
            public void onTick(long l) {
                timerTextView.setText(String.format("%ss", l / 1000));
            }

            @Override
            public void onFinish() {
                playAgainButton.setVisibility(View.VISIBLE);
                questionTextView.setVisibility(View.INVISIBLE);
                divideGridLayout.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.VISIBLE);
                timerTextView.setText("0s");
                timerTextView.setVisibility(View.INVISIBLE);
                scoreTextView.setVisibility(View.INVISIBLE);
                resultTextView.setText(String.format("Your score is : %s", String.format("%d/%d", score, numberOfQuestions)));
            }
        }.start();
    }

    public void generateAddQuestion()
    {
        playAgainButton.setVisibility(View.INVISIBLE);
        addGridLayout.setVisibility(View.VISIBLE);
        answers.clear();
        Random rand = new Random();
        int a = rand.nextInt(51);
        int b = rand.nextInt(51);
        String sum = a +  " + " + b;
        questionTextView.setText(sum);
        locationOfCorrectAnswer = rand.nextInt(4);
        int incorrectAnswer;

        for (int i = 0; i <4; i ++)
        {
            if ( i == locationOfCorrectAnswer){
                answers.add(a + b);
            }
            else{
                incorrectAnswer = rand.nextInt(101);
                while(incorrectAnswer == a+b)
                {
                    incorrectAnswer = rand.nextInt(101);
                }
                answers.add(incorrectAnswer);
            }
        }

        button4.setText(Integer.toString(answers.get(0)));
        button5.setText(Integer.toString(answers.get(1)));
        button6.setText(Integer.toString(answers.get(2)));
        button7.setText(Integer.toString(answers.get(3)));
    }

    public void generateMultiplyQuestion()
    {
        playAgainButton.setVisibility(View.INVISIBLE);
        multiplyGridLayout.setVisibility(View.VISIBLE);
        answers.clear();
        Random rand = new Random();
        int a = rand.nextInt(21);
        int b = rand.nextInt(21);
        String product = a +  " X " + b;
        questionTextView.setText(product);
        locationOfCorrectAnswer = rand.nextInt(4);
        int incorrectAnswer;

        for (int i = 0; i <4; i ++)
        {
            if ( i == locationOfCorrectAnswer){
                answers.add(a * b);
            }
            else{
                incorrectAnswer = rand.nextInt(401);
                while(incorrectAnswer == a*b)
                {
                    incorrectAnswer = rand.nextInt(401);
                }
                answers.add(incorrectAnswer);
            }
        }

        button0.setText(Integer.toString(answers.get(0)));
        button1.setText(Integer.toString(answers.get(1)));
        button2.setText(Integer.toString(answers.get(2)));
        button3.setText(Integer.toString(answers.get(3)));
    }

    public void generateSubtractQuestion()
    {
        playAgainButton.setVisibility(View.INVISIBLE);
        subtractGridLayout.setVisibility(View.VISIBLE);
        answers.clear();
        Random rand = new Random();
        int a = rand.nextInt(51);
        int b = rand.nextInt(51);

        while(a<=b){
            a = rand.nextInt(51);
        }
        String diff = a +  " - " + b;
        questionTextView.setText(diff);
        locationOfCorrectAnswer = rand.nextInt(4);
        int incorrectAnswer;
        int c = rand.nextInt(51);
        for (int i = 0; i <4; i ++)
        {
            if ( i == locationOfCorrectAnswer){
                answers.add(a - b);
            }
            else{
                incorrectAnswer = rand.nextInt(a);
                while(incorrectAnswer == a-b)
                {
                    incorrectAnswer = rand.nextInt(a);
                }
                answers.add(incorrectAnswer);
            }
        }

        button8.setText(Integer.toString(answers.get(0)));
        button9.setText(Integer.toString(answers.get(1)));
        button10.setText(Integer.toString(answers.get(2)));
        button11.setText(Integer.toString(answers.get(3)));
    }

    public void generateDivideQuestion()
    {
        playAgainButton.setVisibility(View.INVISIBLE);
        divideGridLayout.setVisibility(View.VISIBLE);
        answers.clear();
        Random rand = new Random();
        int a = rand.nextInt(101);
        int b = rand.nextInt(101);

        while (a<=b || b==0 || a % b !=0 ) {
            b = rand.nextInt(100);
            a = rand.nextInt(100);
        }
        String product = a +  " / " + b;
        questionTextView.setText(product);
        locationOfCorrectAnswer = rand.nextInt(4);
        int incorrectAnswer;

        for (int i = 0; i <4; i ++)
        {
            if ( i == locationOfCorrectAnswer){
                answers.add(a / b);
            }
            else{
                incorrectAnswer = rand.nextInt(a);
                while(incorrectAnswer == a/b)
                {
                    incorrectAnswer = rand.nextInt(a);
                }
                answers.add(incorrectAnswer);
            }
        }

        button12.setText(Integer.toString(answers.get(0)));
        button13.setText(Integer.toString(answers.get(1)));
        button14.setText(Integer.toString(answers.get(2)));
        button15.setText(Integer.toString(answers.get(3)));
    }

    public void chooseMultiplyAnswer(View view)
    {
        resultTextView.setText(" ");
        String correct = "Correct !";
        String wrong = "Incorrect !";

        if (view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))) {
            Log.i("correct answer", view.getTag().toString());
            score++;
            resultTextView.setText(correct);
        }
        else {
            resultTextView.setText(wrong);
        }

        numberOfQuestions++;
        String pointsAndQuestions = score + "/"+ numberOfQuestions;
        scoreTextView.setText(pointsAndQuestions);
        generateMultiplyQuestion();
    }

    public void chooseAddAnswer(View view)
    {
        resultTextView.setText(" ");
        String correct = "Correct !";
        String wrong = "Incorrect !";
        if (view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))) {
            Log.i("correct answer", view.getTag().toString());
            score++;
            resultTextView.setText(correct);
        }

        else{
            resultTextView.setText(wrong);
        }

        numberOfQuestions++;
        String pointsAndQuestions = score + "/"+ numberOfQuestions;
        scoreTextView.setText(pointsAndQuestions);
        generateAddQuestion();
    }

    public void chooseSubtractAnswer(View view)
    {
        resultTextView.setText(" ");
        String correct = "Correct !";
        String wrong = "Incorrect !";

        if (view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))){
            Log.i("correct answer", view.getTag().toString());
            score++;
            resultTextView.setText(correct);
        }

        else{
            resultTextView.setText(wrong);
        }
        numberOfQuestions++;

        String pointsAndQuestions = score + "/"+ numberOfQuestions;
        scoreTextView.setText(pointsAndQuestions);
        generateSubtractQuestion();
    }

    public void chooseDivideAnswer(View view)
    {
        resultTextView.setText(" ");
        String correct = "Correct !";
        String wrong = "Incorrect !";
        if (view.getTag().toString().equals(Integer.toString(locationOfCorrectAnswer))) {
            Log.i("correct answer", view.getTag().toString());
            score++;
            resultTextView.setText(correct);
        }

        else{
            resultTextView.setText(wrong);
        }

        numberOfQuestions++;
        String pointsAndQuestions = score + "/"+ numberOfQuestions;
        scoreTextView.setText(pointsAndQuestions);
        generateDivideQuestion();
    }


    public void start(View view)
    {
        playButton.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.INVISIBLE);
        chooseRelativeLayout.setVisibility(RelativeLayout.VISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButton);
        questionTextView = findViewById(R.id.questionTextView);
        resultTextView = findViewById(R.id.resultTextView);
        scoreTextView =findViewById(R.id.scoreTextView);
        timerTextView= findViewById(R.id.timerTextView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button0 = findViewById(R.id.button0);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        imageView = findViewById(R.id.imageView);
        playAgainButton = findViewById(R.id.playAgainButton);
        multiplyGridLayout =findViewById(R.id.multiplyGridLayout);
        addGridLayout = findViewById(R.id.addGridLayout);
        subtractGridLayout = findViewById(R.id.subtractGridLayout);
        divideGridLayout = findViewById(R.id.divideGridLayout);
        chooseRelativeLayout = findViewById(R.id.chooseRelativeLayout);
        addButton = findViewById(R.id.addButton);
        subtractButton = findViewById(R.id.subtractButton);
        multiplyButton = findViewById(R.id.multiplyButton);
        divideButton = findViewById(R.id.divideButton);
        innerRelativeLayout = findViewById(R.id.innerRelativeLayout);
    }
}