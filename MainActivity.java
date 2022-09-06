package quiz.s63;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int skortotal;
    private TextView textSkorTotal;
    //duplikat ini
    private TextView pilihan1;
    private TextView pilihan2;
    private TextView pilihan3;
    private TextView pilihan4;
    private TextView pilihan5;
    private TextView pilihan6;
    private TextView pilihan7;
    private TextView pilihan8;
    private TextView pilihan9;
    private TextView pilihan10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //duplikat ini
        textSkorTotal = findViewById(R.id.textskortotal);
        pilihan1 = findViewById(R.id.skor1a) ;
        pilihan2 = findViewById(R.id.skor1b) ;
        pilihan3 = findViewById(R.id.skor1c) ;
        pilihan4 = findViewById(R.id.skor1d) ;
        pilihan5 = findViewById(R.id.skor1e) ;
        pilihan6 = findViewById(R.id.skor1f) ;
        pilihan7 = findViewById(R.id.skor1g) ;
        pilihan8 = findViewById(R.id.skor1h) ;
        pilihan9 = findViewById(R.id.skor1i) ;
        pilihan10 = findViewById(R.id.skor1j) ;


        //duplikat ini
        final RadioGroup rgJawaban1 = (RadioGroup) findViewById(R.id.radioGrupa);
        Button btSubmit = (Button) findViewById(R.id.buttona);
        btSubmit.setOnClickListener((view -> {
            int id = rgJawaban1.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1a:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb2a:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb3a:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar!" +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan1.setText("skor : 10");
                    skortotal+=10;
                    break;
            }
        }));

        final RadioGroup rgJawaban2 = (RadioGroup) findViewById(R.id.radioGrupb);
        Button btSubmitb = (Button) findViewById(R.id.buttonb);
        btSubmitb.setOnClickListener((view -> {
            int id = rgJawaban2.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1b:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar!" +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan2.setText("skor : 10");
                    skortotal+=10;
                    break;
                case R.id.jwb2b:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb3b:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }));

        final RadioGroup rgJawaban3 = (RadioGroup) findViewById(R.id.radioGrupc);
        Button btSubmitc = (Button) findViewById(R.id.buttonc);
        btSubmitc.setOnClickListener((view -> {
            int id = rgJawaban3.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1c:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar!" +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan3.setText("skor : 10");
                    skortotal+=10;
                    break;
                case R.id.jwb2c:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb3c:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }));

        final RadioGroup rgJawaban4 = (RadioGroup) findViewById(R.id.radioGrupd);
        Button btSubmitd = (Button) findViewById(R.id.buttond);
        btSubmitd.setOnClickListener((view -> {
            int id = rgJawaban4.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1d:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb2d:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar! " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan4.setText("skor : 10");
                    skortotal+=10;
                    break;
                case R.id.jwb3d:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }));

        final RadioGroup rgJawaban5 = (RadioGroup) findViewById(R.id.radioGrupe);
        Button btSubmite = (Button) findViewById(R.id.buttone);
        btSubmite.setOnClickListener((view -> {
            int id = rgJawaban5.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1e:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb2e:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar! " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan5.setText("skor : 10");
                    skortotal+=10;
                    break;
                case R.id.jwb3e:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }));

        final RadioGroup rgJawaban6 = (RadioGroup) findViewById(R.id.radioGrupf);
        Button btSubmitf = (Button) findViewById(R.id.buttonf);
        btSubmitf.setOnClickListener((view -> {
            int id = rgJawaban6.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1f:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb2f:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb3f:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar! " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan6.setText("skor : 10");
                    skortotal+=10;
                    break;
            }
        }));

        final RadioGroup rgJawaban7 = (RadioGroup) findViewById(R.id.radioGrupg);
        Button btSubmitg = (Button) findViewById(R.id.buttong);
        btSubmitg.setOnClickListener((view -> {
            int id = rgJawaban7.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1g:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb2g:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar! " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan7.setText("skor : 10");
                    skortotal+=10;
                    break;
                case R.id.jwb3g:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }));

        final RadioGroup rgJawaban8 = (RadioGroup) findViewById(R.id.radioGruph);
        Button btSubmith = (Button) findViewById(R.id.buttonh);
        btSubmith.setOnClickListener((view -> {
            int id = rgJawaban8.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1h:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb2h:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar! " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan8.setText("skor : 10");
                    skortotal+=10;
                    break;
                case R.id.jwb3h:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }));

        final RadioGroup rgJawaban9 = (RadioGroup) findViewById(R.id.radioGrupi);
        Button btSubmiti = (Button) findViewById(R.id.buttoni);
        btSubmiti.setOnClickListener((view -> {
            int id = rgJawaban9.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1i:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb2i:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb3i:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar! " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan9.setText("skor : 10");
                    skortotal+=10;
                    break;
            }
        }));

        final RadioGroup rgJawaban10 = (RadioGroup) findViewById(R.id.radioGrupj);
        Button btSubmitj = (Button) findViewById(R.id.buttonj);
        btSubmitj.setOnClickListener((view -> {
            int id = rgJawaban10.getCheckedRadioButtonId();
            switch (id) {
                case R.id.jwb1j:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.jwb2j:
                    Toast.makeText(getApplicationContext(), "selamat jawabanmu benar! " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    pilihan10.setText("skor : 10");
                    skortotal+=10;
                    break;
                case R.id.jwb3j:
                    Toast.makeText(getApplicationContext(), "maaf jawabanmu salah " +
                            ((RadioButton) findViewById(id)).getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }));

        btSubmitj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btSubmit.isClickable() && btSubmitb.isClickable() && btSubmitc.isClickable() && btSubmitd.isClickable() &&
                        btSubmite.isClickable() && btSubmitf.isClickable() && btSubmitg.isClickable() && btSubmith.isClickable() &&
                        btSubmiti.isClickable() && btSubmitj.isClickable()) {
                    Toast.makeText(getApplicationContext(), "selamat sudah menyelesaikan latihan!", Toast.LENGTH_SHORT).show();
                    textSkorTotal.setText("Total Skormu : "+skortotal);
                }
                else {
                Toast.makeText(getApplicationContext(), "total skor belum ada, silahkan kerjaakn semua soal yang ada", Toast.LENGTH_SHORT).show();
            }
            }
        });

    ;}
}
