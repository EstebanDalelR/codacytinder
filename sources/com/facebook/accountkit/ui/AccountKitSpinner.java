package com.facebook.accountkit.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;

public class AccountKitSpinner extends AppCompatSpinner {
    @Nullable
    /* renamed from: a */
    private OnSpinnerEventsListener f13013a;
    /* renamed from: b */
    private boolean f13014b = null;

    public interface OnSpinnerEventsListener {
        void onSpinnerClosed();

        void onSpinnerOpened();
    }

    public AccountKitSpinner(Context context) {
        super(context);
    }

    public AccountKitSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountKitSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean performClick() {
        this.f13014b = true;
        if (this.f13013a != null) {
            this.f13013a.onSpinnerOpened();
        }
        return super.performClick();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f13014b && z) {
            m16001a();
        }
    }

    void setOnSpinnerEventsListener(OnSpinnerEventsListener onSpinnerEventsListener) {
        this.f13013a = onSpinnerEventsListener;
    }

    /* renamed from: a */
    private void m16001a() {
        this.f13014b = false;
        if (this.f13013a != null) {
            this.f13013a.onSpinnerClosed();
        }
    }
}
