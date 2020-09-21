package br.com.unipar.agendamentomedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Delcara os objetos que identificam os campos da tela.
    private Button btnCadastro;
    private Button btnLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void telaCadastro(View view){

            Intent tela = new Intent(this, TelaCadastro.class);
            startActivity(tela);
        }

        public void telaLista(View view){

        Intent tela2 = new Intent(this, TelaListaConsultas.class);
        startActivity(tela2);
        }
}
