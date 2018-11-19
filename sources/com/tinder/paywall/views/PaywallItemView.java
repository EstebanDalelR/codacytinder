package com.tinder.paywall.views;

import android.support.annotation.NonNull;
import android.view.View.OnClickListener;
import com.tinder.paywall.viewmodels.C10090l;

public interface PaywallItemView {
    void bindViewModel(@NonNull C10090l c10090l);

    int getPosition();

    boolean isActivated();

    void setItemDisabled();

    void setItemEnabled(boolean z);

    void setOnClickListener(OnClickListener onClickListener);

    void setPosition(int i);
}
