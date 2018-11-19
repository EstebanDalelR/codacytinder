package com.facebook.accountkit.ui;

import android.support.annotation.StyleRes;

public interface UIManager extends UIManagerStub {

    public interface UIManagerListener {
        void onBack();

        void onCancel();
    }

    @StyleRes
    int getThemeId();

    void setThemeId(@StyleRes int i);

    void setUIManagerListener(UIManagerListener uIManagerListener);
}
