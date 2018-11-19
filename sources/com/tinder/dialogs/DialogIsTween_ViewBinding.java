package com.tinder.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public class DialogIsTween_ViewBinding implements Unbinder {
    /* renamed from: b */
    private DialogIsTween f35953b;
    /* renamed from: c */
    private View f35954c;

    @UiThread
    public DialogIsTween_ViewBinding(final DialogIsTween dialogIsTween, View view) {
        this.f35953b = dialogIsTween;
        dialogIsTween.mIsTweenBody = (TextView) C0761c.b(view, R.id.dialog_is_tween_body, "field 'mIsTweenBody'", TextView.class);
        dialogIsTween.mIsTweenEditText = (EditText) C0761c.b(view, R.id.dialog_is_tween_edit_text, "field 'mIsTweenEditText'", EditText.class);
        View a = C0761c.a(view, R.id.dialog_is_tween_button, "field 'mTweenButton' and method 'checkCollectEmail'");
        dialogIsTween.mTweenButton = (Button) C0761c.c(a, R.id.dialog_is_tween_button, "field 'mTweenButton'", Button.class);
        this.f35954c = a;
        a.setOnClickListener(new C0759a(this) {
            /* renamed from: b */
            final /* synthetic */ DialogIsTween_ViewBinding f35952b;

            public void doClick(View view) {
                dialogIsTween.checkCollectEmail();
            }
        });
        dialogIsTween.mEditTextContainer = (ViewGroup) C0761c.b(view, R.id.dialog_is_tween_edit_text_layout, "field 'mEditTextContainer'", ViewGroup.class);
    }

    @CallSuper
    public void unbind() {
        DialogIsTween dialogIsTween = this.f35953b;
        if (dialogIsTween == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f35953b = null;
        dialogIsTween.mIsTweenBody = null;
        dialogIsTween.mIsTweenEditText = null;
        dialogIsTween.mTweenButton = null;
        dialogIsTween.mEditTextContainer = null;
        this.f35954c.setOnClickListener(null);
        this.f35954c = null;
    }
}
