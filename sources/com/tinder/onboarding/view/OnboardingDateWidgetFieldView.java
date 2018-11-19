package com.tinder.onboarding.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tinder.R;
import com.tinder.onboarding.viewmodel.C10005a;
import com.tinder.onboarding.viewmodel.DateField;
import com.tinder.utils.C15357d;
import java8.util.Optional;

public abstract class OnboardingDateWidgetFieldView extends LinearLayout {
    @NonNull
    /* renamed from: a */
    private final EditText[] f32847a = new EditText[getAllowedCharsCount()];
    @NonNull
    /* renamed from: b */
    private final C10005a f32848b = new C10005a(getDateField(), getAllowedCharsCount());
    @Nullable
    /* renamed from: c */
    private KeyboardActionListener f32849c;
    @Nullable
    /* renamed from: d */
    private C15357d f32850d;
    /* renamed from: e */
    private boolean f32851e;

    public interface KeyboardActionListener {
        void onKeyboardAction(int i, OnboardingDateWidgetFieldView onboardingDateWidgetFieldView, EditText editText, Optional<Integer> optional);
    }

    /* renamed from: com.tinder.onboarding.view.OnboardingDateWidgetFieldView$a */
    private class C9992a implements InputFilter {
        /* renamed from: a */
        final /* synthetic */ OnboardingDateWidgetFieldView f32845a;

        private C9992a(OnboardingDateWidgetFieldView onboardingDateWidgetFieldView) {
            this.f32845a = onboardingDateWidgetFieldView;
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return (i == i2 || m40984a(charSequence) != null) ? null : "";
        }

        /* renamed from: a */
        private boolean m40984a(java.lang.CharSequence r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = android.text.TextUtils.isEmpty(r2);
            if (r0 != 0) goto L_0x0010;
        L_0x0006:
            r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x000e }
            java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x000e }
            goto L_0x0010;
        L_0x000e:
            r2 = 0;
            return r2;
        L_0x0010:
            r2 = 1;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.onboarding.view.OnboardingDateWidgetFieldView.a.a(java.lang.CharSequence):boolean");
        }
    }

    /* renamed from: com.tinder.onboarding.view.OnboardingDateWidgetFieldView$b */
    private class C9993b implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ OnboardingDateWidgetFieldView f32846a;

        private C9993b(OnboardingDateWidgetFieldView onboardingDateWidgetFieldView) {
            this.f32846a = onboardingDateWidgetFieldView;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getAction() == null) {
                EditText editText = (EditText) view;
                if (i == 67) {
                    this.f32846a.m40992b(editText);
                    return true;
                }
            }
            return null;
        }
    }

    /* renamed from: com.tinder.onboarding.view.OnboardingDateWidgetFieldView$c */
    private class C12202c extends C15357d {
        /* renamed from: a */
        final /* synthetic */ OnboardingDateWidgetFieldView f39543a;
        /* renamed from: b */
        private int f39544b;

        private C12202c(OnboardingDateWidgetFieldView onboardingDateWidgetFieldView, int i) {
            this.f39543a = onboardingDateWidgetFieldView;
            this.f39544b = i;
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                this.f39543a.f32848b.m41008a(this.f39544b, -1);
            } else {
                int parseInt = Integer.parseInt(editable.toString());
                this.f39543a.f32848b.m41008a(this.f39544b, parseInt);
                if (this.f39543a.f32851e && this.f39543a.f32849c != null) {
                    this.f39543a.f32849c.onKeyboardAction(1, this.f39543a, this.f39543a.f32847a[this.f39544b], Optional.a(Integer.valueOf(parseInt)));
                }
            }
            if (this.f39543a.f32850d != null) {
                this.f39543a.f32850d.afterTextChanged(editable);
            }
        }
    }

    protected abstract int getAllowedCharsCount();

    protected abstract DateField getDateField();

    @StringRes
    protected abstract int getHintStringRes();

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public OnboardingDateWidgetFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40990b(getAllowedCharsCount());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f32848b.m41011c()) {
                m40991b(this.f32847a[this.f32847a.length - 1]);
                return true;
            }
            for (View view : this.f32847a) {
                if (TextUtils.isEmpty(view.getText())) {
                    m40991b(view);
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFocusable(boolean z) {
        for (EditText editText : this.f32847a) {
            editText.setFocusable(z);
            editText.setFocusableInTouchMode(z);
        }
        super.setFocusable(z);
    }

    /* renamed from: a */
    public boolean m41002a(int i) {
        return i >= 0 && i < this.f32847a.length && this.f32847a[i].requestFocus() != 0;
    }

    /* renamed from: a */
    public void m40999a(int i, String str) {
        if (i >= 0 && i < this.f32847a.length) {
            this.f32847a[i].setText(str);
        }
    }

    /* renamed from: a */
    public int m40997a(@NonNull EditText editText) {
        for (int i = 0; i < this.f32847a.length; i++) {
            if (this.f32847a[i].equals(editText)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    protected void m40998a() {
        if (this.f32848b.m41011c()) {
            this.f32847a[this.f32847a.length - 1].requestFocus();
            return;
        }
        for (EditText editText : this.f32847a) {
            if (TextUtils.isEmpty(editText.getText())) {
                editText.requestFocus();
                return;
            }
        }
    }

    /* renamed from: b */
    protected void m41003b() {
        if (this.f32847a.length > 0) {
            EditText editText = this.f32847a[this.f32847a.length - 1];
            editText.requestFocus();
            if (editText.getText().length() > 0) {
                editText.setSelection(1);
            }
        }
    }

    /* renamed from: c */
    protected void m41004c() {
        if (this.f32847a.length > 0) {
            EditText editText = this.f32847a[this.f32847a.length - 1];
            editText.requestFocus();
            editText.setText("");
        }
    }

    @NonNull
    public C10005a getFieldValue() {
        return this.f32848b;
    }

    public void setValues(@NonNull String str) {
        if (str.length() == getAllowedCharsCount()) {
            for (int i = 0; i < this.f32847a.length; i++) {
                this.f32847a[i].setText(String.valueOf(str.charAt(i)));
            }
        }
    }

    public void setKeyboardActionListener(@NonNull KeyboardActionListener keyboardActionListener) {
        this.f32849c = keyboardActionListener;
    }

    public void setTextChangeListener(@NonNull C15357d c15357d) {
        this.f32850d = c15357d;
    }

    /* renamed from: a */
    public void m41001a(boolean z) {
        this.f32851e = z;
    }

    /* renamed from: b */
    private void m40990b(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            View a = m40985a(getHintStringRes(), i2);
            addView(a);
            this.f32847a[i2] = a;
        }
    }

    /* renamed from: a */
    private EditText m40985a(@StringRes int i, int i2) {
        EditText editText = (EditText) LayoutInflater.from(getContext()).inflate(R.layout.view_onboarding_datewidget_edittext, this, false);
        editText.setHint(i);
        editText.addTextChangedListener(new C12202c(i2));
        editText.setFilters(new InputFilter[]{new C9992a(), new LengthFilter(1)});
        editText.setOnKeyListener(new C9993b());
        editText.setOnFocusChangeListener(new C10003k(this, editText));
        return editText;
    }

    /* renamed from: a */
    final /* synthetic */ void m41000a(EditText editText, View view, boolean z) {
        if (z) {
            editText.setSelection(editText.getText().length());
            m40987a(view);
        }
    }

    /* renamed from: a */
    private void m40987a(@NonNull View view) {
        getInputMethodManager().a(new C12214l(view));
    }

    private Optional<InputMethodManager> getInputMethodManager() {
        return Optional.b((InputMethodManager) getContext().getSystemService("input_method"));
    }

    /* renamed from: b */
    private void m40991b(View view) {
        if (view.isFocused()) {
            m40987a(view);
        } else {
            view.requestFocus();
        }
    }

    /* renamed from: b */
    private void m40992b(@NonNull EditText editText) {
        if (this.f32849c != null) {
            this.f32849c.onKeyboardAction(2, this, editText, Optional.a());
        }
    }
}
