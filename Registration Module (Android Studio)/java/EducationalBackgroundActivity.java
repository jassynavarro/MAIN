package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class EducationalBackgroundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_background);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Educational Background");

        CheckBox elementary = findViewById(R.id.elementary);
        CheckBox secondary = findViewById(R.id.secondary);
        CheckBox vocational = findViewById(R.id.vocational);
        CheckBox college = findViewById(R.id.college);
        CheckBox gradStudies = findViewById(R.id.gradStudies);
        TextInputLayout txtelemNameofS;
        TextInputEditText inputElemnameOfS = findViewById(R.id.inputElemnameOfS);
        TextInputLayout txtelemCourse;
        TextInputEditText inputelemCourse = findViewById(R.id.inputelemCourse);
        TextInputLayout txtsedondNameofS;
        TextInputEditText inputsecondNameofS = findViewById(R.id.inputsecondNameofS);
        TextInputLayout txtsecondCourse;
        TextInputEditText inputsecondCourse = findViewById(R.id.inputsecondCourse);
        TextInputLayout txtinputvocNameofS;
        TextInputEditText inputvocNameofS = findViewById(R.id.inputvocNameofS);
        TextInputLayout txtvocCourse;
        TextInputEditText inputvocCourse = findViewById(R.id.inputvocCourse);
        TextInputLayout txtcollNameofS;
        TextInputEditText inputcollNameofS = findViewById(R.id.inputcollNameofS);
        TextInputLayout txtcollCourse;
        TextInputEditText inputcollCourse = findViewById(R.id.inputcollCourse);
        TextInputLayout txtgradNameofS;
        TextInputEditText inputgradNameofS = findViewById(R.id.inputgradNameofS);
        TextInputLayout txtgradCourse;
        TextInputEditText inputgradCourse = findViewById(R.id.inputgradCourse);
        Button nextCrim = findViewById(R.id.nextCrim);

        String elemS = inputElemnameOfS.getText().toString();
        String elemC = inputelemCourse.getText().toString();
        String secondS = inputsecondNameofS.getText().toString();
        String secondC = inputsecondCourse.getText().toString();
        String vocS = inputvocNameofS.getText().toString();
        String vocC = inputvocCourse.getText().toString();
        String collS = inputcollNameofS.getText().toString();
        String collC = inputcollCourse.getText().toString();
        String gradS = inputgradNameofS.getText().toString();
        String gradC = inputgradCourse.getText().toString();

        RadioGroup educGroup = findViewById(R.id.educGroup);
        educGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup educGroup, int checkedId) {
                int educChosen = educGroup.getCheckedRadioButtonId();
                RadioButton educAttain = findViewById(educChosen);
                String finalChoice = educAttain.getText().toString();
                Toast.makeText(EducationalBackgroundActivity.this, "You have selected " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });

        //methods for the checkbox to enabled when checked
        elementary.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    inputElemnameOfS.setEnabled(isChecked);
                    inputelemCourse.setEnabled(isChecked);
            }
        });
        secondary.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                inputsecondNameofS.setEnabled(isChecked);
                inputsecondCourse.setEnabled(isChecked);
            }
        });
        vocational.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                inputvocNameofS.setEnabled(isChecked);
                inputvocCourse.setEnabled(isChecked);
            }
        });
        college.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                inputcollNameofS.setEnabled(isChecked);
                inputcollCourse.setEnabled(isChecked);
            }
        });
        gradStudies.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                inputgradNameofS.setEnabled(isChecked);
                inputgradCourse.setEnabled(isChecked);
            }
        });
    }

    public void allMethods2(View v) {

        getData();
        emptyDetails();
    }

    public void getData() {
        CheckBox elementary;
        CheckBox secondary;
        CheckBox vocational;
        CheckBox college;
        CheckBox gradStudies;
        TextInputLayout txtelemNameofS;
        TextInputEditText inputElemnameOfS = findViewById(R.id.inputElemnameOfS);
        TextInputLayout txtelemCourse;
        TextInputEditText inputelemCourse = findViewById(R.id.inputelemCourse);
        TextInputLayout txtsedondNameofS;
        TextInputEditText inputsecondNameofS = findViewById(R.id.inputsecondNameofS);
        TextInputLayout txtsecondCourse;
        TextInputEditText inputsecondCourse = findViewById(R.id.inputsecondCourse);
        TextInputLayout txtinputvocNameofS;
        TextInputEditText inputvocNameofS = findViewById(R.id.inputvocNameofS);
        TextInputLayout txtvocCourse;
        TextInputEditText inputvocCourse = findViewById(R.id.inputvocCourse);
        TextInputLayout txtcollNameofS;
        TextInputEditText inputcollNameofS = findViewById(R.id.inputcollNameofS);
        TextInputLayout txtcollCourse;
        TextInputEditText inputcollCourse = findViewById(R.id.inputcollCourse);
        TextInputLayout txtgradNameofS;
        TextInputEditText inputgradNameofS = findViewById(R.id.inputgradNameofS);
        TextInputLayout txtgradCourse;
        TextInputEditText inputgradCourse = findViewById(R.id.inputgradCourse);

        String elemS = inputElemnameOfS.getText().toString();
        String elemC = inputelemCourse.getText().toString();
        String secondS = inputsecondNameofS.getText().toString();
        String secondC = inputsecondCourse.getText().toString();
        String vocS = inputvocNameofS.getText().toString();
        String vocC = inputvocCourse.getText().toString();
        String collS = inputcollNameofS.getText().toString();
        String collC = inputcollCourse.getText().toString();
        String gradS = inputgradNameofS.getText().toString();
        String gradC = inputgradCourse.getText().toString();

    }


    public void emptyDetails() {
        CheckBox elementary = findViewById(R.id.elementary);
        CheckBox secondary = findViewById(R.id.secondary);
        CheckBox vocational = findViewById(R.id.vocational);
        CheckBox college = findViewById(R.id.college);
        CheckBox gradStudies = findViewById(R.id.gradStudies);
        TextInputLayout txtelemNameofS;
        TextInputEditText inputElemnameOfS = findViewById(R.id.inputElemnameOfS);
        TextInputLayout txtelemCourse;
        TextInputEditText inputelemCourse = findViewById(R.id.inputelemCourse);
        TextInputLayout txtsedondNameofS;
        TextInputEditText inputsecondNameofS = findViewById(R.id.inputsecondNameofS);
        TextInputLayout txtsecondCourse;
        TextInputEditText inputsecondCourse = findViewById(R.id.inputsecondCourse);
        TextInputLayout txtinputvocNameofS;
        TextInputEditText inputvocNameofS = findViewById(R.id.inputvocNameofS);
        TextInputLayout txtvocCourse;
        TextInputEditText inputvocCourse = findViewById(R.id.inputvocCourse);
        TextInputLayout txtcollNameofS;
        TextInputEditText inputcollNameofS = findViewById(R.id.inputcollNameofS);
        TextInputLayout txtcollCourse;
        TextInputEditText inputcollCourse = findViewById(R.id.inputcollCourse);
        TextInputLayout txtgradNameofS;
        TextInputEditText inputgradNameofS = findViewById(R.id.inputgradNameofS);
        TextInputLayout txtgradCourse;
        TextInputEditText inputgradCourse = findViewById(R.id.inputgradCourse);
        Button nextCrim = findViewById(R.id.nextCrim);

        String elemS = inputElemnameOfS.getText().toString();
        String elemC = inputelemCourse.getText().toString();
        String secondS = inputsecondNameofS.getText().toString();
        String secondC = inputsecondCourse.getText().toString();
        String vocS = inputvocNameofS.getText().toString();
        String vocC = inputvocCourse.getText().toString();
        String collS = inputcollNameofS.getText().toString();
        String collC = inputcollCourse.getText().toString();
        String gradS = inputgradNameofS.getText().toString();
        String gradC = inputgradCourse.getText().toString();

        if(elementary.isChecked()) {
            if (elemS.length() == 0) {
                inputElemnameOfS.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            if (elemC.length() == 0) {
                inputelemCourse.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent crim = new Intent(EducationalBackgroundActivity.this, CriminalBackgroundActivity.class);
                startActivity(crim);
            }
        }
        if(secondary.isChecked()) {
            if (secondS.length() == 0) {
                inputsecondNameofS.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            if (secondC.length() == 0) {
                inputsecondCourse.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent crim = new Intent(EducationalBackgroundActivity.this, CriminalBackgroundActivity.class);
                startActivity(crim);
            }
        }
        if(vocational.isChecked()) {
            if (vocS.length() == 0) {
                inputvocNameofS.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            if (vocC.length() == 0) {
                inputvocCourse.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent crim = new Intent(EducationalBackgroundActivity.this, CriminalBackgroundActivity.class);
                startActivity(crim);
            }
        }
        if(college.isChecked()) {
            if (collS.length() == 0) {
                inputcollNameofS.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            if (collC.length() == 0) {
                inputcollCourse.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent crim = new Intent(EducationalBackgroundActivity.this, CriminalBackgroundActivity.class);
                startActivity(crim);
            }
        }
        if(gradStudies.isChecked()) {
            if (gradS.length() == 0) {
                inputgradNameofS.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            if (gradC.length() == 0) {
                inputgradCourse.setError("Required");
                Toast.makeText(EducationalBackgroundActivity.this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
            }
            else {
                Intent crim = new Intent(EducationalBackgroundActivity.this, CriminalBackgroundActivity.class);
                startActivity(crim);
            }
        }

    }
}

