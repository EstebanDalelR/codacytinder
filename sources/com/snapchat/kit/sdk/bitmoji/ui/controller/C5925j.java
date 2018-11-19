package com.snapchat.kit.sdk.bitmoji.ui.controller;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5880a;
import com.snapchat.kit.sdk.bitmoji.C5893a.C5882c;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5887d;
import com.snapchat.kit.sdk.bitmoji.p143a.p144a.C5889h;

/* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.j */
public class C5925j implements TextWatcher, OnFocusChangeListener, OnEditorActionListener {
    /* renamed from: a */
    private final Context f21673a;
    /* renamed from: b */
    private final View f21674b;
    /* renamed from: c */
    private final C5924a f21675c;
    /* renamed from: d */
    private final View f21676d;
    /* renamed from: e */
    private final View f21677e;
    /* renamed from: f */
    private final EditText f21678f;
    /* renamed from: g */
    private final View f21679g;
    /* renamed from: h */
    private final C5887d f21680h;
    /* renamed from: i */
    private final int f21681i;
    /* renamed from: j */
    private final int f21682j;
    /* renamed from: k */
    private boolean f21683k = false;
    /* renamed from: l */
    private boolean f21684l = false;
    /* renamed from: m */
    private boolean f21685m = true;
    /* renamed from: n */
    private OnFocusChangeListener f21686n;

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.j$1 */
    class C59221 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C5925j f21671a;

        C59221(C5925j c5925j) {
            this.f21671a = c5925j;
        }

        public void onClick(View view) {
            if (this.f21671a.m25514g() == null) {
                this.f21671a.m25512e();
            }
            this.f21671a.m25519b();
            this.f21671a.m25513f();
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.j$2 */
    class C59232 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C5925j f21672a;

        C59232(C5925j c5925j) {
            this.f21672a = c5925j;
        }

        public void onClick(View view) {
            this.f21672a.m25512e();
            this.f21672a.m25513f();
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.ui.controller.j$a */
    interface C5924a {
        /* renamed from: a */
        void mo7407a(String str);
    }

    public void afterTextChanged(Editable editable) {
    }

    C5925j(Context context, View view, C5887d c5887d, C5924a c5924a) {
        this.f21673a = context;
        this.f21674b = view;
        this.f21680h = c5887d;
        this.f21675c = c5924a;
        this.f21676d = this.f21674b.findViewById(C5882c.snap_connect_bitmoji_back_button);
        this.f21677e = this.f21674b.findViewById(C5882c.snap_connect_bitmoji_search_icon);
        this.f21678f = (EditText) this.f21674b.findViewById(C5882c.snap_connect_bitmoji_search_field);
        this.f21679g = this.f21674b.findViewById(C5882c.snap_connect_bitmoji_search_clear_button);
        this.f21681i = this.f21673a.getResources().getDimensionPixelSize(C5880a.snap_connect_bitmoji_search_field_initial_translate_x);
        this.f21682j = this.f21673a.getResources().getDimensionPixelSize(C5880a.snap_connect_bitmoji_back_button_initial_translate_x);
    }

    /* renamed from: a */
    public void m25515a() {
        this.f21678f.addTextChangedListener(this);
        this.f21678f.setOnEditorActionListener(this);
        this.f21678f.setOnFocusChangeListener(this);
        this.f21676d.setOnClickListener(new C59221(this));
        this.f21679g.setOnClickListener(new C59232(this));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence = i3 > i2 ? true : null;
        if (this.f21685m != 0 && charSequence == null) {
            this.f21680h.m25410a(C5889h.TEXT, m25520c());
        }
        this.f21685m = charSequence;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m25510b(charSequence.toString());
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return null;
        }
        m25519b();
        return true;
    }

    public void onFocusChange(View view, boolean z) {
        if (this.f21686n != null) {
            this.f21686n.onFocusChange(view, z);
        }
        m25513f();
    }

    /* renamed from: b */
    public void m25519b() {
        if (this.f21678f.hasFocus()) {
            this.f21678f.setFocusable(false);
            this.f21678f.setFocusableInTouchMode(true);
            ((InputMethodManager) this.f21673a.getSystemService("input_method")).hideSoftInputFromWindow(this.f21678f.getWindowToken(), 0);
        }
    }

    @NonNull
    /* renamed from: c */
    public String m25520c() {
        Editable text = this.f21678f.getText();
        if (text == null) {
            return "";
        }
        return text.toString();
    }

    /* renamed from: a */
    public void m25518a(String str) {
        this.f21683k = true;
        this.f21678f.setText(str);
        this.f21683k = null;
    }

    /* renamed from: d */
    public boolean m25521d() {
        return this.f21678f.hasFocus();
    }

    /* renamed from: a */
    public void m25517a(OnFocusChangeListener onFocusChangeListener) {
        this.f21686n = onFocusChangeListener;
    }

    /* renamed from: a */
    public void m25516a(int i) {
        this.f21674b.setTranslationY((float) i);
    }

    /* renamed from: b */
    private void m25510b(String str) {
        this.f21679g.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        if (!this.f21683k) {
            this.f21675c.mo7407a(str);
        }
    }

    /* renamed from: e */
    private void m25512e() {
        this.f21678f.setText("");
        m25510b("");
    }

    /* renamed from: f */
    private void m25513f() {
        boolean z;
        if (!m25521d()) {
            if (m25514g()) {
                z = false;
                if (z == this.f21684l) {
                    m25507a(z);
                    this.f21684l = z;
                }
            }
        }
        z = true;
        if (z == this.f21684l) {
            m25507a(z);
            this.f21684l = z;
        }
    }

    /* renamed from: g */
    private boolean m25514g() {
        return TextUtils.isEmpty(this.f21678f.getText());
    }

    /* renamed from: a */
    private void m25507a(boolean z) {
        int i;
        AnimatorSet animatorSet = new AnimatorSet();
        int i2 = z ? this.f21681i : 0;
        if (z) {
            i = 0;
        } else {
            i = this.f21681i;
        }
        int i3 = z ? this.f21682j : 0;
        if (z) {
            z = false;
        } else {
            z = this.f21682j;
        }
        Animator[] animatorArr = new Animator[3];
        EditText editText = this.f21678f;
        Property property = View.TRANSLATION_X;
        r9 = new float[2];
        r9[0] = (float) i2;
        r9[1] = (float) i;
        animatorArr[0] = ObjectAnimator.ofFloat(editText, property, r9);
        animatorArr[1] = ObjectAnimator.ofFloat(this.f21677e, View.TRANSLATION_X, new float[]{r2, r3});
        animatorArr[2] = ObjectAnimator.ofFloat(this.f21676d, View.TRANSLATION_X, new float[]{(float) i3, (float) z});
        animatorSet.playTogether(animatorArr);
        animatorSet.setDuration(200);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
    }
}
