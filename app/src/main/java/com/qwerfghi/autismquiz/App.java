package com.qwerfghi.autismquiz;

import android.app.Application;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by Pavel on 11.12.2017.
 */

public class App extends Application {

    private FirebaseUser user;
    private boolean[] answers = new boolean[10];
    private boolean[] checkedAnswers = new boolean[10];

    public FirebaseUser getUser() {
        return user;
    }

    public void setUser(FirebaseUser user) {
        this.user = user;
    }

    public boolean[] getAnswers() {
        return answers;
    }

    public boolean[] getCheckedAnswers() {
        return checkedAnswers;
    }
}