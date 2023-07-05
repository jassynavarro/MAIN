package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.io.ByteArrayOutputStream;

public class PersonalBackgroundActivity extends AppCompatActivity {
    
    Bitmap photo;
    ImageView img;
    Button takePhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_background);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Personal Background");

        RadioGroup Gender = findViewById(R.id.Gender);
        Gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup gender, int checkedId) {
                int genderChosen = gender.getCheckedRadioButtonId();
                RadioButton genders = findViewById(genderChosen);
                String finalChoice = genders.getText().toString();
                Toast.makeText(PersonalBackgroundActivity.this, "You're a " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });

        RadioGroup civilStatus = findViewById(R.id.civilStatus);
        civilStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup status, int checkedId) {
                int civilStatus = status.getCheckedRadioButtonId();
                RadioButton civilStat = findViewById(civilStatus);
                String finalChoice = civilStat.getText().toString();
                Toast.makeText(PersonalBackgroundActivity.this, "You are " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });

        Spinner relationship = findViewById(R.id.relationship);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(PersonalBackgroundActivity.this,
                R.array.Relationship, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        relationship.setAdapter(adapter);

        relationship.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position > 0) {
                    String RSchosen = parent.getItemAtPosition(position).toString();
                    Toast.makeText(PersonalBackgroundActivity.this, "You have selected " + RSchosen, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //Camera
        takePhoto = (Button) findViewById(R.id.takePhoto);
        img = (ImageView) findViewById(R.id.img);

        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    askCameraPermission();
            }
        });
    }
    private void askCameraPermission() {

        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.CAMERA}, 101);
        }
        else {
            openCamera();
        }
    }

    private void openCamera() {
        Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camera, 102);
        sendPicture();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            img.setImageBitmap(photo);
        }
        else {
            Toast.makeText(this, "The process has been cancelled", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 101) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                openCamera();
            } else {
                Toast.makeText(PersonalBackgroundActivity.this, "Camera permission is required", Toast.LENGTH_SHORT).show();
            }
        }
    }

         public void sendPicture() {
        if(photo != null) {
            //convert the image to array(byte)
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            photo.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
            byte[] photoByteArray = bytes.toByteArray();

            Intent report = new Intent(this, ReportActivity.class);
            report.putExtra("imageArray", photoByteArray);
            startActivity(report);
        }
        else {
            Toast.makeText(this, "Process cancelled since no photo has been taken.", Toast.LENGTH_SHORT).show();
        }
     }

    public void allMethods1(View v) {
        getData();
        fieldRequired();
    }
    
    public void getData() {
        TextInputLayout txtLname;
        TextInputEditText inputLname = findViewById(R.id.inputLname);
        TextInputLayout txtFname;
        TextInputEditText inputFname = findViewById(R.id.inputFname);
        TextInputLayout email;
        TextInputEditText inputEmail = findViewById(R.id.inputEmail);
        TextInputLayout phoneNum;
        TextInputEditText  inputPhone = findViewById(R.id.inputPhone);
        TextInputLayout height;
        TextInputEditText inputHeight = findViewById(R.id.inputHeight);
        TextInputLayout weight;
        TextInputEditText inputWeight = findViewById(R.id.inputWeight);
        RadioButton single = findViewById(R.id.single);
        RadioButton married = findViewById(R.id.married);
        RadioButton separated = findViewById(R.id.separated);
        RadioButton widowed = findViewById(R.id.widowed);
        RadioButton others = findViewById(R.id.others);
        TextInputLayout pagIbig;
        TextInputEditText inputpagIbig = findViewById(R.id.inputpagIbig);
        TextInputLayout tinNo;
        TextInputEditText inputTin = findViewById(R.id.inputTin);
        TextInputLayout philHealth;
        TextInputEditText inputPhilhealth = findViewById(R.id.inputPhilhealth);
        TextInputLayout GSIS;
        TextInputEditText inputGSIS = findViewById(R.id.inputGSIS);
        TextInputLayout emerName;
        TextInputEditText inputemerName = findViewById(R.id.inputemerName);
        TextInputLayout emerContact;
        TextInputEditText inputemerContact = findViewById(R.id.inputemerContact);
        Button takePhoto;
        Button nextEduc;

        String lName = inputLname.getText().toString();
        String fName = inputFname.getText().toString();
        String emailAdd = inputEmail.getText().toString();
        String emerFullname = inputemerName.getText().toString();
        int phone = inputPhone.getText().length();
        int heightNo = inputHeight.getText().length();
        int weightNo = inputWeight.getText().length();
        int pagIbigno = inputpagIbig.getText().length();
        int tinno = inputTin.getText().length();
        int phNo = inputPhilhealth.getText().length();
        int GSISno = inputGSIS.getText().length();
        int emerNo = inputemerContact.getText().length();

//        Intent report = new Intent(this, ReportActivity.class);
//        report.putExtra("huliName", lName);
//        startActivity(report);
    }

    public void fieldRequired() {
        TextInputLayout txtLname;
        TextInputEditText inputLname = findViewById(R.id.inputLname);
        TextInputLayout txtFname;
        TextInputEditText inputFname = findViewById(R.id.inputFname);
        TextInputLayout email;
        TextInputEditText inputEmail = findViewById(R.id.inputEmail);
        TextInputLayout phoneNum;
        TextInputEditText  inputPhone = findViewById(R.id.inputPhone);
        TextInputLayout height;
        TextInputEditText inputHeight = findViewById(R.id.inputHeight);
        TextInputLayout weight;
        TextInputEditText inputWeight = findViewById(R.id.inputWeight);
        TextInputLayout emerName;
        TextInputEditText inputemerName = findViewById(R.id.inputemerName);
        TextInputLayout emerContact;
        TextInputEditText inputemerContact = findViewById(R.id.inputemerContact);

        String lName = inputLname.getText().toString();
        String fName = inputFname.getText().toString();
        String emailAdd = inputEmail.getText().toString();
        String emerFullname = inputemerName.getText().toString();
        int phone = inputPhone.getText().length();
        int heightNo = inputHeight.getText().length();
        int weightNo = inputWeight.getText().length();
        int emerNo = inputemerContact.getText().length();

        if (fName.length() == 0) {
            inputFname.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
        if (lName.length() == 0) {
            inputLname.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
        if (emailAdd.length() == 0) {
            inputEmail.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
        if (emerFullname.length() == 0) {
            inputemerName.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
        if (phone == 0) {
            inputPhone.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
        if (heightNo == 0) {
            inputHeight.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
        if (weightNo == 0) {
            inputWeight.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
        if (emerNo == 0) {
            inputemerContact.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent educ = new Intent(this, EducationalBackgroundActivity.class);
            startActivity(educ);
        }
    }
}
