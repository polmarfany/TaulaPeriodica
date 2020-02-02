package com.example.taulaperiodica;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetallActivity extends AppCompatActivity {

    private String shareElementText;

    private Button btnShare;

    private TextView number, symbol, name, mass, electronConfiguration, electronNegativity, radius, ionRadius, vanDelWaalsRadius, ionizationEnergy;
    private TextView electronAffinity, oxidationStates, standardState, bondingType, meltingPoint, boilingPoint, density, family, yearDiscovered;
    private ImageView imageWikipedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detall_activity_layout);

        Bundle extras = getIntent().getExtras();
        final cElement elSel = (cElement) extras.getSerializable("element") ;

        shareElementText = "Number: " +elSel.getNumber() + System.lineSeparator() //a part d'afegir el valor,
        + "Symbol: " + elSel.getSymbol() + System.lineSeparator()               //afegeix el line Separator pertanyent del OS usat
        + "Name: " + elSel.getName() + System.lineSeparator()
        + "Mass: " + elSel.getMass() + System.lineSeparator()
        + "Family: " + elSel.getFamily() + System.lineSeparator()
        ;

        number = (TextView) findViewById(R.id.tvNumber);
        symbol = (TextView) findViewById(R.id.tvSymbol);
        name = (TextView) findViewById(R.id.tvName);
        mass = (TextView) findViewById(R.id.tvMass);
        standardState = (TextView) findViewById(R.id.tvStandardState);
        family = (TextView) findViewById(R.id.tvFamily);

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String numberString = elSel.getNumber();
        number.append(numberString);

        final String nameString = elSel.getName();
        name.append(nameString);

        setTitle("Element "+numberString+": "+nameString); //aprofitem i canviem el nom

        symbol.append(elSel.getSymbol());

        //handler per al Standard State = "", aixo indica que es un element sintetic i que en el XML el tag esta empty
        String stringStandardState = elSel.getStandardState();
        if (stringStandardState.equals("") ) {
            standardState.append("Synthetic");
        }
        else {
            standardState.append(stringStandardState);
        }

        checkString(elSel.getMass(), mass);
        checkString(elSel.getFamily(), family);

        imageWikipedia = (ImageView)findViewById(R.id.imageWikipedia);

        imageWikipedia.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intentBrowsable = new Intent();
                intentBrowsable.setAction(Intent.ACTION_VIEW);
                intentBrowsable.addCategory(Intent.CATEGORY_BROWSABLE);
                intentBrowsable.setData(Uri.parse("http://wikipedia.org/wiki/"+nameString ) );
                startActivity(intentBrowsable);
            }
        });

        btnShare = (Button) findViewById(R.id.btnShare);

        btnShare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intentShare = new Intent(Intent.ACTION_SEND);
                intentShare.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //nidea de que cony es aixo
                intentShare.setType("text/plain");
                intentShare.putExtra(android.content.Intent.EXTRA_TEXT, shareElementText);
                startActivity(intentShare);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.detail__layout_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;

            case R.id.menuItemShare:
                Intent intentShare = new Intent(Intent.ACTION_SEND);
                intentShare.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //nidea de que cony es aixo
                intentShare.setType("text/plain");
                intentShare.putExtra(android.content.Intent.EXTRA_TEXT, shareElementText);
                startActivity(intentShare);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
    public void checkString(String valorElement, TextView textViewElement){
        if (!valorElement.equals("")) {
            textViewElement.append(valorElement);
        }
        else {
            textViewElement.setVisibility(View.GONE);
        }
    }
}
