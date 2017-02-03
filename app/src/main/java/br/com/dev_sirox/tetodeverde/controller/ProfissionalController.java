package br.com.dev_sirox.tetodeverde.controller;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import br.com.dev_sirox.tetodeverde.model.IProfissional;
import br.com.dev_sirox.tetodeverde.model.Profissional;

/**
 * Created by sirox90 on 03/02/2017.
 */

public class ProfissionalController implements IProfissional {
    @Override
    public Profissional login(final Context context) {

        final Profissional[] profissional = new Profissional[1];

        FirebaseController.initialize(context);

        FirebaseController.mDATABASE.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Log.i("primeiro nivel", postSnapshot.toString());
                }
                String switchUser = Profissional.ADMINISTRADOR;


                profissional[0] = new Profissional(1, "ADMIN", "login", Profissional.ADMINISTRADOR, 9999L);

                LayoutController layoutController = new LayoutController(context);
                layoutController.getTxtUser().setText(profissional[0].getNome());
                layoutController.getTxtProfile().setText(profissional[0].getProfile());
                //layoutController.inflate(context, R.layout.nav_header_main,null);
                //layoutController.getTxtUser().;
            }


            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(context, databaseError.getMessage().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return profissional[0];
    }
}
