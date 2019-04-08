package com.example.aksesdata;

import android.content.SharedPreferences;

public class PrefManager {
    private static final String PREF_NAME = "ExampleSharedPreferences";
    private static final String KEY_NAME = "name";
    private static final String KEY_SCORE = "score";
    private final SharedPreferences pref;
    private static final int PRIVATE_MODE = 0;

    public PrefManager(Context context) {
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
    }

    public void setName(String name) {
        Editor editor = pref.edit();
        editor.putString(KEY_NAME, name);
        editor.apply();
    }

    public String getName() {
        return pref.getString(KEY_NAME, Constant.DEFAULT_NAME);
    }

    public void setScore(int score) {
        Editor editor = pref.edit();
        editor.putInt(KEY_SCORE, score);
        editor.apply();
    }

    public int getScore() {
        return pref.getInt(KEY_SCORE, Constant.DEFAULT_SCORE);
    }

}
