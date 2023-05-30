package com.example.proyectito;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView lastNameTextView = findViewById(R.id.lastNameTextView);
        TextView emailEditText = findViewById(R.id.emailEditText);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            String apellido = extras.getString("apellido");
            String email = extras.getString("email");

            // Mostrar los datos en los TextView correspondientes
            nameTextView.setText("Nombre: " + nombre);
            lastNameTextView.setText("Apellido: " + apellido);
            emailEditText.setText("Correo: " + email);
        }
    }
}