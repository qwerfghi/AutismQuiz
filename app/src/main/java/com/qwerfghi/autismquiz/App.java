package com.qwerfghi.autismquiz;

import android.app.Application;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Pavel on 11.12.2017.
 */

public class App extends Application {

    private FirebaseUser user;

    public FirebaseUser getUser() {
        return user;
    }

    public void setUser(FirebaseUser user) {
        this.user = user;
    }
}