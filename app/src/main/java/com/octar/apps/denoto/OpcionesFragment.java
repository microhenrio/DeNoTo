package com.octar.apps.denoto;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Abel on 08/03/2016.
 */
public class OpcionesFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}