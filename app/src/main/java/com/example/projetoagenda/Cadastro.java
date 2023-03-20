package com.example.projetoagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {

    EditText cNome;
    EditText cCelular;
    EditText cEmail;
    EditText cEndereco;
    Button  btMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cadastro );

        cNome = findViewById(R.id.edt_nome);
        cCelular = findViewById(R.id.edt_celular);
        cEmail = findViewById(R.id.edt_email);
        cEndereco = findViewById(R.id.edt_endereco);

        btMostrar = findViewById( R.id.cadastro );

        btMostrar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                chamaMostrar();
            }
        } );

;


    }

    private void chamaMostrar() {
        Intent it = new Intent( this, Mostrar.class );
        it.putExtra("Valornome", cNome.getText().toString() );
        it.putExtra("Valorcelular", cCelular.getText().toString() );
        it.putExtra("Valoremail", cEmail.getText().toString() );
        it.putExtra("Valorendereco", cEndereco.getText().toString() );

        startActivityForResult( it, 1 );


    }
}