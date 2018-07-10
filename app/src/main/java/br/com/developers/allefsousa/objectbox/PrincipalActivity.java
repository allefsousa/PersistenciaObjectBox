package br.com.developers.allefsousa.objectbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import br.com.developers.allefsousa.objectbox.Model.Estabelecimento;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class PrincipalActivity extends AppCompatActivity {

    private Box<Estabelecimento> estabelecimentoBox;
    private Estabelecimento estabelecimento;
    private String TAG = "ObjectBox";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //Objeto Estabelecimento
        estabelecimento = new Estabelecimento("Via Varejo","Casas Bahia");
        // recuperando a instacia do banco de dados
        BoxStore boxStore = ((myApplication) getApplication()).getBoxStore();

        // fazendo referencia ao Objeto/tabela do banco de dados
        estabelecimentoBox = boxStore.boxFor(Estabelecimento.class);
        AdicionarEstabelecimento(estabelecimento); // adicionando estabelecimento
    }

    //metodo para salvar estabelecimento
    private void AdicionarEstabelecimento(Estabelecimento estabelecimento) {
            Long id = estabelecimentoBox.put(estabelecimento);
            Log.d(TAG, "AdicionarEstabelecimento: " + id);
    }



}
