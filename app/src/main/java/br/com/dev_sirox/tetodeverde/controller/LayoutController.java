package br.com.dev_sirox.tetodeverde.controller;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.com.dev_sirox.tetodeverde.R;
import br.com.dev_sirox.tetodeverde.model.Profissional;

/**
 * Created by sirox90 on 03/02/2017.
 */

public class LayoutController extends LinearLayout {

    private TextView txtUser;
    private TextView txtProfile;

    public LayoutController(Context context) {
        super(context);
        inflate(getContext(), R.layout.nav_header_main, this);
        txtUser = (TextView) findViewById(R.id.txtUser);
        txtProfile = (TextView) findViewById(R.id.txtProfile);
    }

    public TextView getTxtUser() {
        return txtUser;
    }

    public TextView getTxtProfile() {
        return txtProfile;
    }
}
