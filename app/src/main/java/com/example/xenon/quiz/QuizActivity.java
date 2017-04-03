package com.example.xenon.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    public void RevealImages(){
        ImageView img1 = (ImageView)findViewById(R.id.ImageViewDzik);
        ImageView img2 = (ImageView)findViewById(R.id.imageViewPies);
        ImageView img3 = (ImageView)findViewById(R.id.imageViewKot);
        ImageView img4 = (ImageView)findViewById(R.id.imageViewKrowa);
        ImageView img5 = (ImageView)findViewById(R.id.imageViewKura);
        ImageView img6 = (ImageView)findViewById(R.id.imageViewLis);

        img1.setImageResource(R.drawable.dzik);
        img2.setImageResource(R.drawable.pies);
        img3.setImageResource(R.drawable.kot);
        img4.setImageResource(R.drawable.krowa);
        img5.setImageResource(R.drawable.kura);
        img6.setImageResource(R.drawable.lis);
    }

    public void Check(){

        int suma=0;

        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.RG1);
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.RG2);
        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.RG3);
        RadioGroup radioGroup4 = (RadioGroup)findViewById(R.id.RG4);
        RadioGroup radioGroup5 = (RadioGroup)findViewById(R.id.RG5);
        RadioGroup radioGroup6 = (RadioGroup)findViewById(R.id.RG6);

        int zaznaczonyId = radioGroup1.getCheckedRadioButtonId();
        RadioButton radioButton1 = (RadioButton)findViewById(zaznaczonyId);
        RadioButton radioCorrect=(RadioButton)findViewById(R.id.DzikCorrect);
        if (radioButton1.equals(radioCorrect)) suma++;

        zaznaczonyId = radioGroup2.getCheckedRadioButtonId();
        radioButton1 = (RadioButton)findViewById(zaznaczonyId);
        radioCorrect=(RadioButton)findViewById(R.id.PiesCorrect);
        if (radioButton1.equals(radioCorrect)) suma++;

        zaznaczonyId = radioGroup3.getCheckedRadioButtonId();
        radioButton1 = (RadioButton)findViewById(zaznaczonyId);
        radioCorrect=(RadioButton)findViewById(R.id.KotCorrect);
        if (radioButton1.equals(radioCorrect)) suma++;

        zaznaczonyId = radioGroup4.getCheckedRadioButtonId();
        radioButton1 = (RadioButton)findViewById(zaznaczonyId);
        radioCorrect=(RadioButton)findViewById(R.id.KrowaCorrect);
        if (radioButton1.equals(radioCorrect)) suma++;

        zaznaczonyId = radioGroup5.getCheckedRadioButtonId();
        radioButton1 = (RadioButton)findViewById(zaznaczonyId);
        radioCorrect=(RadioButton)findViewById(R.id.KuraCorrect);
        if (radioButton1.equals(radioCorrect)) suma++;

        zaznaczonyId = radioGroup6.getCheckedRadioButtonId();
        radioButton1 = (RadioButton)findViewById(zaznaczonyId);
        radioCorrect=(RadioButton)findViewById(R.id.LisCorrect);
        if (radioButton1.equals(radioCorrect)) suma++;

        Toast.makeText(getApplicationContext(),"Zdobyta ilość punktów: "+suma, Toast.LENGTH_LONG).show();
        RevealImages();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button b1 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Check();
            }
        });



    }
}
