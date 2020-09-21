package br.com.unipar.agendamentomedico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaCadastro extends AppCompatActivity {

    private EditText editAtivo;
    private EditText editLLiquido;
    private EditText editPLiquido;
    private EditText editNAcoes;
    private EditText editPAtual;
    private Button btnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
    }

    // Segue abaixo toda a implementação do btn Limpar
    // para limpar todos os campos prenchidos na primeira tela
    public void limpar(View view) {

        btnLimpar = (Button)findViewById(R.id.btnLimpar); //Encontrar o botao no layout pelo id dele.
        //Transforma o objeyo View em Button "(Button)findViewById".
        btnLimpar.setOnClickListener(new View.OnClickListener() { // Cria um novo evento onClick.
            @Override
            public void onClick(View v) {
                editAtivo.setText("");
                editLLiquido.setText("");
                editPLiquido.setText("");
                editNAcoes.setText("");
                editPAtual.setText("");
            }
        });
    }  //Fim da limpar, buttonLimpar

}