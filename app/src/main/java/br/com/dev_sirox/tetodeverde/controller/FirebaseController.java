package br.com.dev_sirox.tetodeverde.controller;

import android.content.Context;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by sirox90 on 03/02/2017.
 */

public abstract class FirebaseController {

    protected static FirebaseUser user;
    protected static FirebaseAuth firebaseAuth;
    protected static FirebaseAuth.AuthStateListener fireAuthStateListener;

    protected static final DatabaseReference mDATABASE = FirebaseDatabase.getInstance().getReference().child("Profissional");

    public static void initialize(Context context) {
        FirebaseApp.initializeApp(context);
    }

}
