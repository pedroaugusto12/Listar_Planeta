package br.com.etecia.listar_planeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListaDados extends AppCompatActivity {

    TextView LstPlanetas;
    ImageView imgPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_dados);

        LstPlanetas = (TextView) findViewById(R.id.LstDPlanetas);
        imgPlanetas = (ImageView) findViewById(R.id.IMGDPlanetas);

        Intent intent = getIntent();
        String nomeRetorno = intent.getStringExtra();
        int imagemRetorno = intent. getIntExtra();

        LstPlanetas. setText( nomeRetorno);
        imgPlanetas. setImageResource(imagemRetorno);

        getSupportActionBar().setDisplayHomeAsUpEnabled (true);

    }

    @Override
    public boolean onOptionsItemSelected