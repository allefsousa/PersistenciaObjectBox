package br.com.developers.allefsousa.objectbox;

import android.app.Application;


import br.com.developers.allefsousa.objectbox.Model.MyObjectBox;
import io.objectbox.BoxStore;
import io.objectbox.android.AndroidObjectBrowser;

/**
 * Created by allef on 09/07/2018.
 */

/**
 * A primeira classe a ser iniciada pela aplicação
 */
public class myApplication extends Application {
    private BoxStore boxStore;
    @Override
    public void onCreate() {
        super.onCreate();
        // inicializando Object box
        boxStore = MyObjectBox.builder().androidContext(myApplication.this).build();
        new AndroidObjectBrowser(boxStore).start(this);
    }
    // construtor para retornar a instacia do objeto;
    public BoxStore getBoxStore() {
        return boxStore;
    }

}
