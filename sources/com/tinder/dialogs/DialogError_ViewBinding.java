package com.tinder.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0761c;
import com.tinder.R;

public class DialogError_ViewBinding implements Unbinder {
    /* renamed from: b */
    private DialogError f35947b;

    @UiThread
    public DialogError_ViewBinding(DialogError dialogError, View view) {
        this.f35947b = dialogError;
        dialogError.mTitleTextView = (TextView) C0761c.b(view, R.id.dialog_error_title, "field 'mTitleTextView'", TextView.class);
        dialogError.mBodyTextView = (TextView) C0761c.b(view, R.id.dialog_error_body, "field 'mBodyTextView'", TextView.class);
        dialogError.mButton = (Button) C0761c.b(view, R.id.dialog_error_button, "field 'mButton'", Button.class);
    }

    @CallSuper
    public void unbind() {
        DialogError dialogError = this.f35947b;
        if (dialogError == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f35947b = null;
        dialogError.mTitleTextView = null;
        dialogError.mBodyTextView = null;
        dialogError.mButton = null;
    }
}
