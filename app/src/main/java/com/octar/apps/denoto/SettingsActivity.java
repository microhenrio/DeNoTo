package com.octar.apps.denoto;

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by Abel on 04/03/2016.
 */
public class SettingsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new OpcionesFragment())
                .commit();
    }
}
