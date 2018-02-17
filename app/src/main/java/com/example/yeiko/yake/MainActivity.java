package com.example.yeiko.yake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button iniciarSesion,OlvidarContrasenia,cuentaFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciar ( enlazar, id )
        iniciarSesion = (Button) findViewById(R.id.iniciarSesion);
        OlvidarContrasenia = (Button) findViewById(R.id.OlvidarContrasenia);
        cuentaFacebook = (Button) findViewById(R.id.cuentaFacebook);

        // INICIAR SESION

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Ir a Nueva Actividad

                Intent intent = new Intent( MainActivity.this, FnishActivity.class);
                startActivity(intent);
            }
        });
        // OLVIDE MI CONTRASEÑA


        OlvidarContrasenia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Mala Suerte", Toast.LENGTH_SHORT).show();
            }
        });


        // CUENTA FACEBOOK

        cuentaFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Create pes we", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
