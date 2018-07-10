package br.com.developers.allefsousa.objectbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import br.com.developers.allefsousa.objectbox.Model.Estabelecimento;
import io.objectbox.Box;
import io.objectbox.BoxStore;

public class PrincipalActivity extends AppCompatActivity {

    private Box<Estabelecimento> estabelecimentoBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // recuperando a instacia do banco de dados
        BoxStore boxStore = ((myApplication) getApplication()).getBoxStore();

        // fazendo referencia ao Objeto/tabela do banco de dados
        estabelecimentoBox = boxStore.boxFor(Estabelecimento.class);


    }
}
