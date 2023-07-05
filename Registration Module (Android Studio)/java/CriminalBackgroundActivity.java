package com.example.finalproject;

import static android.content.Context.NOTIFICATION_SERVICE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CriminalBackgroundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_background);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Criminal Background");

        //Objects
        CheckBox checkYes1 = findViewById(R.id.checkYes1);
        CheckBox checkYes2 = findViewById(R.id.checkYes2);
        CheckBox checkYes3 = findViewById(R.id.checkYes3);
        CheckBox checkYesa = findViewById(R.id.checkYesa);
        CheckBox checkYesb = findViewById(R.id.checkYesb);
        CheckBox checkYesc = findViewById(R.id.checkYesc);
        EditText edtxtDets1 = findViewById(R.id.edtxtDet1);
        EditText edtxtDets2 = findViewById(R.id.edtxtDets2);
        EditText edtxtDets3 = findViewById(R.id.edtxtDets3);
        EditText edtxtDetsa = findViewById(R.id.edtxtDetsa);
        EditText edtxtDetsb = findViewById(R.id.edtxtDetsb);
        EditText edtxtDetsc = findViewById(R.id.edtxtDetsc);

        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rg1, int checkedId) {
                int rgChosen = rg1.getCheckedRadioButtonId();
                RadioButton radio1 = findViewById(rgChosen);
                String finalChoice = radio1.getText().toString();
                Toast.makeText(CriminalBackgroundActivity.this, "You're a " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rg2, int checkedId) {
                int rgChosen = rg2.getCheckedRadioButtonId();
                RadioButton radio2 = findViewById(rgChosen);
                String finalChoice = radio2.getText().toString();
                Toast.makeText(CriminalBackgroundActivity.this, "You're a " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });
        RadioGroup radioGroup3 = findViewById(R.id.radioGroup3);
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rg3, int checkedId) {
                int rgChosen = rg3.getCheckedRadioButtonId();
                RadioButton radio3 = findViewById(rgChosen);
                String finalChoice = radio3.getText().toString();
                Toast.makeText(CriminalBackgroundActivity.this, "You're a " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rg4, int checkedId) {
                int rgChosen = rg4.getCheckedRadioButtonId();
                RadioButton radio4 = findViewById(rgChosen);
                String finalChoice = radio4.getText().toString();
                Toast.makeText(CriminalBackgroundActivity.this, "You're a " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });
        RadioGroup radioGroup5 = findViewById(R.id.radioGroup5);
        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rg5, int checkedId) {
                int rgChosen = rg5.getCheckedRadioButtonId();
                RadioButton radio5 = findViewById(rgChosen);
                String finalChoice = radio5.getText().toString();
                Toast.makeText(CriminalBackgroundActivity.this, "You're a " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });
        RadioGroup radioGroup6 = findViewById(R.id.radioGroup6);
        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup rg6, int checkedId) {
                int rgChosen = rg6.getCheckedRadioButtonId();
                RadioButton radio6 = findViewById(rgChosen);
                String finalChoice = radio6.getText().toString();
                Toast.makeText(CriminalBackgroundActivity.this, "You're a " + finalChoice, Toast.LENGTH_SHORT).show();
            }
        });

        //methods to enable yes to open details
        checkYes1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                edtxtDets1.setEnabled(isChecked);
            }
        });
        checkYes2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                edtxtDets2.setEnabled(isChecked);
            }
        });
        checkYes3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                edtxtDets3.setEnabled(isChecked);
            }
        });
        checkYesa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                edtxtDetsa.setEnabled(isChecked);
            }
        });
        checkYesb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                edtxtDetsb.setEnabled(isChecked);
            }
        });
        checkYesc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                edtxtDetsc.setEnabled(isChecked);
            }
        });

    }

    public void allMethods3(View v) {
        getData();
        checksData();
        sendsNotif();
    }

    public void getData() {
        EditText edtxtDets1 = findViewById(R.id.edtxtDet1);
        EditText edtxtDets2 = findViewById(R.id.edtxtDets2);
        EditText edtxtDets3 = findViewById(R.id.edtxtDets3);
        EditText edtxtDetsa = findViewById(R.id.edtxtDetsa);
        EditText edtxtDetsb = findViewById(R.id.edtxtDetsb);
        EditText edtxtDetsc = findViewById(R.id.edtxtDetsc);

        String Dets1 = edtxtDets1.getText().toString();
        String Dets2 = edtxtDets2.getText().toString();
        String Dets3 = edtxtDets3.getText().toString();
        String Detsa = edtxtDetsa.getText().toString();
        String Detsb = edtxtDetsb.getText().toString();
        String Detsc = edtxtDetsc.getText().toString();
    }

    //combination of checked enabler and required notification, only the checked box shows the required notification
    public void checksData() {
        CheckBox checkNo1 = findViewById(R.id.checkNo1);
        CheckBox checkNo2 = findViewById(R.id.checkNo2);
        CheckBox checkNo3 = findViewById(R.id.checkNo3);
        CheckBox checkNoa = findViewById(R.id.checkNoa);
        CheckBox checkNob = findViewById(R.id.checkNob);
        CheckBox checkNoc = findViewById(R.id.checkNoc);
        CheckBox checkYes1 = findViewById(R.id.checkYes1);
        CheckBox checkYes2 = findViewById(R.id.checkYes2);
        CheckBox checkYes3 = findViewById(R.id.checkYes3);
        CheckBox checkYesa = findViewById(R.id.checkYesa);
        CheckBox checkYesb = findViewById(R.id.checkYesb);
        CheckBox checkYesc = findViewById(R.id.checkYesc);

        if(checkYes1.isChecked() || checkNo1.isChecked() || !checkYes1.isChecked() || !checkNo1.isChecked()) {
            q1();
            emptyDetails();
        }
        if(checkYes2.isChecked() || checkNo2.isChecked() || !checkYes2.isChecked() || !checkNo2.isChecked()) {
            q2();
            emptyDetails();
        }
        if(checkYes3.isChecked() || checkNo3.isChecked() || !checkYes3.isChecked() || !checkNo3.isChecked()) {
            q3();
            emptyDetails();
        }
        if(checkYesa.isChecked() || checkNoa.isChecked() || !checkYesa.isChecked() || !checkNoa.isChecked()) {
            qa();
            emptyDetails();
        }
        if(checkYesb.isChecked() || checkNob.isChecked() || !checkYesb.isChecked() || !checkNob.isChecked()) {
            qb();
            emptyDetails();
        }
        if(checkYesc.isChecked() || checkNoc.isChecked() || !checkYesc.isChecked() || !checkNoc.isChecked()) {
            qc();
            emptyDetails();

        }

    }

    public void sendsNotif() {

        CheckBox checkNo1 = findViewById(R.id.checkNo1);
        CheckBox checkNo2 = findViewById(R.id.checkNo2);
        CheckBox checkNo3 = findViewById(R.id.checkNo3);
        CheckBox checkNoa = findViewById(R.id.checkNoa);
        CheckBox checkNob = findViewById(R.id.checkNob);
        CheckBox checkNoc = findViewById(R.id.checkNoc);
        CheckBox checkYes1 = findViewById(R.id.checkYes1);
        CheckBox checkYes2 = findViewById(R.id.checkYes2);
        CheckBox checkYes3 = findViewById(R.id.checkYes3);
        CheckBox checkYesa = findViewById(R.id.checkYesa);
        CheckBox checkYesb = findViewById(R.id.checkYesb);
        CheckBox checkYesc = findViewById(R.id.checkYesc);
        EditText edtxtDets1 = findViewById(R.id.edtxtDet1);
        EditText edtxtDets2 = findViewById(R.id.edtxtDets2);
        EditText edtxtDets3 = findViewById(R.id.edtxtDets3);
        EditText edtxtDetsa = findViewById(R.id.edtxtDetsa);
        EditText edtxtDetsb = findViewById(R.id.edtxtDetsb);
        EditText edtxtDetsc = findViewById(R.id.edtxtDetsc);

        if ((checkYes1.isChecked() || checkNo1.isChecked()) && (checkYes2.isChecked() || checkNo2.isChecked())
                && (checkYes3.isChecked() || checkNo3.isChecked()) && (checkYesa.isChecked() || checkNoa.isChecked())
                && (checkYesb.isChecked() || checkNob.isChecked()) && (checkYesc.isChecked() || checkNoc.isChecked())) {

            NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
            builder.setContentTitle("Notification of Registration");
            builder.setContentText("click to view");
            builder.setSmallIcon(R.drawable.ic_baseline_contact_page_24);
            builder.setAutoCancel(true);

            Intent report = new Intent(this, ReportActivity.class);

            PendingIntent pi = PendingIntent.getActivity(this, 0, report, PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(pi);

            NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            nm.notify(0, builder.build());
        }
    }

    //methods for required notification
    public void q1() {
        CheckBox checkNo1 = findViewById(R.id.checkNo1);
        CheckBox checkYes1 = findViewById(R.id.checkYes1);

        boolean checkyes1= checkYes1.isChecked();
        boolean checkno1 = checkNo1.isChecked();

        if (!checkyes1 && !checkno1) {
            checkYes1.setError("Required");
            checkNo1.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
    }
    public void q2() {
        CheckBox checkNo2 = findViewById(R.id.checkNo2);
        CheckBox checkYes2 = findViewById(R.id.checkYes2);

        boolean checkyes2 = checkYes2.isChecked();
        boolean checkno2 = checkNo2.isChecked();

        if (!checkyes2 && !checkno2) {
            checkYes2.setError("Required");
            checkNo2.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
    }
    public void q3() {
        CheckBox checkNo3 = findViewById(R.id.checkNo3);
        CheckBox checkYes3 = findViewById(R.id.checkYes3);

        boolean checkyes3 = checkYes3.isChecked();
        boolean checkno3 = checkNo3.isChecked();

        if (!checkyes3 && !checkno3) {
            checkYes3.setError("Required");
            checkNo3.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
    }
    public void qa() {
        CheckBox checkNoa = findViewById(R.id.checkNoa);
        CheckBox checkYesa = findViewById(R.id.checkYesa);

        boolean checkyesa = checkYesa.isChecked();
        boolean checknoa = checkNoa.isChecked();

        if (!checkyesa && !checknoa) {
            checkYesa.setError("Required");
            checkNoa.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
    }
    public void qb() {
        CheckBox checkNob = findViewById(R.id.checkNob);
        CheckBox checkYesb = findViewById(R.id.checkYesb);

        boolean checkyesb = checkYesb.isChecked();
        boolean checknob = checkNob.isChecked();
        if (!checkyesb && !checknob) {
            checkYesb.setError("Required");
            checkNob.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
    }
    public void qc() {
        CheckBox checkNoc = findViewById(R.id.checkNoc);
        CheckBox checkYesc = findViewById(R.id.checkYesc);

        boolean checkyesc = checkYesc.isChecked();
        boolean checknoc = checkNoc.isChecked();

        if (!checkyesc && !checknoc) {
            checkYesc.setError("Required");
            checkNoc.setError("Required");
            Toast.makeText(this, "Fill out required questions!", Toast.LENGTH_SHORT).show();
        }
    }

    //Method used for knowing if the yes,details contains value
    public void emptyDetails() {
        EditText edtxtDets1 = findViewById(R.id.edtxtDet1);
        EditText edtxtDets2 = findViewById(R.id.edtxtDets2);
        EditText edtxtDets3 = findViewById(R.id.edtxtDets3);
        EditText edtxtDetsa = findViewById(R.id.edtxtDetsa);
        EditText edtxtDetsb = findViewById(R.id.edtxtDetsb);
        EditText edtxtDetsc = findViewById(R.id.edtxtDetsc);

        String det1 = edtxtDets1.getText().toString();
        String det2 = edtxtDets2.getText().toString();
        String det3 = edtxtDets3.getText().toString();
        String deta = edtxtDetsa.getText().toString();
        String detb = edtxtDetsb.getText().toString();
        String detc = edtxtDetsc.getText().toString();

        if(edtxtDets1.isEnabled() && det1.length() == 0) {
            edtxtDets1.setError("Required");
            Toast.makeText(this, "Fill out details!", Toast.LENGTH_SHORT).show();
        }
        if (edtxtDets2.isEnabled() && det2.length() == 0) {
            edtxtDets2.setError("Required");
        }
        if (edtxtDets3.isEnabled() && det3.length() == 0) {
            edtxtDets3.setError("Required");
        }
        if (edtxtDetsa.isEnabled() && deta.length() == 0) {
            edtxtDetsa.setError("Required");
        }
        if (edtxtDetsb.isEnabled() && detb.length() == 0) {
            edtxtDetsb.setError("Required");
        }
        if (edtxtDetsc.isEnabled() && detc.length() == 0) {
            edtxtDetsc.setError("Required");
            Toast.makeText(this, "Fill out details!", Toast.LENGTH_SHORT).show();
        }

    }

}
