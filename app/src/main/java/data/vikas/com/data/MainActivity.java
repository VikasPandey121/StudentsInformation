package data.vikas.com.data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name,rollNo, rank, branch;
    EditText enrollNO;
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        rollNo = findViewById(R.id.roll);
        rank = findViewById(R.id.rank);
        branch = findViewById(R.id.branch);

        enrollNO = findViewById(R.id.enroll);

        enter = findViewById(R.id.enter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int  admin = Integer.parseInt(enrollNO.getText().toString());

                   {
                    if (admin == 1) {
                        name.setText("ABHINAV GAUR");
                        rollNo.setText("00120703118");
                        rank.setText("8121");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 2) {
                        name.setText("ABHINAV PASSI");
                        rollNo.setText("0022073118");
                        rank.setText("34083");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 3) {
                        name.setText("AKASH CHOUDHARY");
                        rollNo.setText("0032073118");
                        rank.setText("8747");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 4) {
                        name.setText("ALTAMAS AHMED");
                        rollNo.setText("0042073118");
                        rank.setText("10340");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 5) {
                        name.setText("AMIT SUNEJA");
                        rollNo.setText("0052073118");
                        rank.setText("8174");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 6) {
                        name.setText("AMITABH KUMAR");
                        rollNo.setText("0062073118");
                        rank.setText("5881");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 7) {
                        name.setText("ANJALI SAHRAWAT");
                        rollNo.setText("0072073118");
                        rank.setText("11360");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 8) {
                        name.setText("ANSHUL GUPTA");
                        rollNo.setText("0082073118");
                        rank.setText("1798");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 10) {
                        name.setText("ARVIND KUMAR SINGH");
                        rollNo.setText("0102073118");
                        rank.setText("9820");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 9) {
                        name.setText("ARJIT GUPTA");
                        rollNo.setText("0092073118");
                        rank.setText("10297");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 11) {
                        name.setText("DHRUV KHATANA");
                        rollNo.setText("0112073118");
                        rank.setText("14849");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 12) {
                        name.setText("DIVYANSU");
                        rollNo.setText("0122073118");
                        rank.setText("30990");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 13) {
                        name.setText("GAGAN SHARMA");
                        rollNo.setText("2073118");
                        rank.setText("4511");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 14) {
                        name.setText("HARSH TYAGI");
                        rollNo.setText("0142073118");
                        rank.setText("8206");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 15) {
                        name.setText("HITESH KUMAR MEENA");
                        rollNo.setText("0152073118");
                        rank.setText("40209");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 16) {
                        name.setText("ISHANT CHAHAR");
                        rollNo.setText("0162073118");
                        rank.setText("12072");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 17) {
                        name.setText("JAISAL");
                        rollNo.setText("0172073118");
                        rank.setText("29872");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 18) {
                        name.setText("KANTESH");
                        rollNo.setText("0182073118");
                        rank.setText("8081");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 19) {
                        name.setText("MUKUND JANGRA");
                        rollNo.setText("0192073118");
                        rank.setText("23185");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 20) {
                        name.setText("NISHANT BAINSLA");
                        rollNo.setText("0202073118");
                        rank.setText("4122");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 21) {
                        name.setText("PRAKHAR OMAR");
                        rollNo.setText("0212073118");
                        rank.setText("8307");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 22) {
                        name.setText("RITHIK");
                        rollNo.setText("0222073118");
                        rank.setText("21901");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 23) {
                        name.setText("SATYARTH YADAV");
                        rollNo.setText("0232073118");
                        rank.setText("7259");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 24) {
                        name.setText("SHAURABH MISHRA");
                        rollNo.setText("0242073118");
                        rank.setText("9064");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 25) {
                        name.setText("SHIVANI");
                        rollNo.setText("0252073118");
                        rank.setText("31365");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 26) {
                        name.setText("SHUBHAM YADAV");
                        rollNo.setText("0262073118");
                        rank.setText("11810");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 27) {
                        name.setText("SIDDHANT SINGH");
                        rollNo.setText("0272073118");
                        rank.setText("29562");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 28) {
                        name.setText("SONU AMBEDKAR");
                        rollNo.setText("0282073118");
                        rank.setText("32281");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 29) {
                        name.setText("SYED NAYAB ALI");
                        rollNo.setText("0292073118");
                        rank.setText("6180");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 30) {
                        name.setText("Vikas Kumar");
                        rollNo.setText("0302073118");
                        rank.setText("8622");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 422) {
                        name.setText("ANUJ SINGH");
                        rollNo.setText("2073118");
                        rank.setText("12478");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 416) {
                        name.setText("YUGAM PARASHAR");
                        rollNo.setText("4162073118");
                        rank.setText("11399");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 414) {
                        name.setText("PRERNA");
                        rollNo.setText("2073118");
                        rank.setText("10999");
                        branch.setText("Information Technology");
                    }

                    else if (admin == 410) {
                        name.setText("Rajkumar Varshney");
                        rollNo.setText("2073118");
                        rank.setText("10099");
                        branch.setText("Information Technology");
                    }


                    else  {
                        name.setText("Invalid Roll No");
                        rollNo.setText("Invalid Roll No");
                        rank.setText("Invalid Roll No");
                        branch.setText("Invalid Roll No");
                    }


                }








            }
        });

    }
}
