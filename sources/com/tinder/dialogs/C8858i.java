package com.tinder.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.gamepad.view.animation.C9661a;
import java8.util.Objects;

/* renamed from: com.tinder.dialogs.i */
public class C8858i extends Dialog {
    /* renamed from: a */
    private LayoutInflater f31019a;
    /* renamed from: b */
    private LinearLayout f31020b;
    /* renamed from: c */
    private ImageView f31021c;
    /* renamed from: d */
    private TextView f31022d;
    /* renamed from: e */
    private TextView f31023e;
    /* renamed from: f */
    private TextView f31024f;
    /* renamed from: g */
    private TextView f31025g;
    /* renamed from: h */
    private View f31026h;
    /* renamed from: i */
    private ScrollView f31027i;

    /* renamed from: com.tinder.dialogs.i$a */
    public static class C8857a {
        /* renamed from: a */
        final Context f31014a;
        @DrawableRes
        /* renamed from: b */
        int f31015b;
        @StringRes
        /* renamed from: c */
        int f31016c;
        @StringRes
        /* renamed from: d */
        int f31017d;
        @Nullable
        /* renamed from: e */
        String f31018e;

        public C8857a(@NonNull Context context) {
            Objects.b(context);
            this.f31014a = context;
        }

        /* renamed from: a */
        public C8857a m37625a(@StringRes int i) {
            this.f31016c = i;
            return this;
        }

        /* renamed from: b */
        public C8857a m37628b(@StringRes int i) {
            this.f31017d = i;
            return this;
        }

        /* renamed from: a */
        public C8857a m37626a(@NonNull String str) {
            this.f31018e = str;
            return this;
        }

        /* renamed from: a */
        public C8858i m37627a() {
            return new C8858i();
        }
    }

    private C8858i(C8857a c8857a) {
        super(c8857a.f31014a, R.style.DialogBinary);
        m37629a(c8857a.f31014a);
        m37631a(c8857a.f31015b);
        setTitle(c8857a.f31016c);
        if (TextUtils.isEmpty(c8857a.f31018e)) {
            m37635b(c8857a.f31017d);
        } else {
            m37638b(c8857a.f31018e);
        }
    }

    @Deprecated
    public C8858i(@NonNull Context context, @DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        super(context, R.style.DialogBinary);
        m37629a(context);
        m37631a(i);
        setTitle(i2);
        m37635b(i3);
    }

    @Deprecated
    public C8858i(@NonNull Context context, @DrawableRes int i, String str, String str2) {
        super(context, R.style.DialogBinary);
        m37629a(context);
        m37631a(i);
        m37633a(str);
        m37638b(str2);
    }

    /* renamed from: a */
    private void m37629a(Context context) {
        this.f31019a = LayoutInflater.from(context);
        setContentView(R.layout.view_dialog_binary_base);
        context = getWindow();
        context.setLayout(-2, -2);
        context.setGravity(17);
        this.f31020b = (LinearLayout) findViewById(R.id.linear_container);
        this.f31021c = (ImageView) findViewById(R.id.img_dialog_icon);
        this.f31022d = (TextView) findViewById(R.id.txt_dialog_title);
        this.f31023e = (TextView) findViewById(R.id.txt_dialog_txt);
        this.f31024f = (TextView) findViewById(R.id.txt_choice_one);
        this.f31025g = (TextView) findViewById(R.id.txt_choice_two);
        this.f31026h = findViewById(R.id.linear_binary_choices);
        this.f31027i = (ScrollView) findViewById(R.id.scroll_txt);
        C9661a.m40068a(this.f31024f, 1.0f, 0.95f, 275, 275);
        C9661a.m40068a(this.f31025g, 1.0f, 0.95f, 275, 275);
        m37632a(R.string.cancel, new C8859j(this));
        m37636b(R.string.cancel, new C8860k(this));
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: c */
    final /* synthetic */ void m37640c(View view) {
        dismiss();
    }

    /* renamed from: b */
    final /* synthetic */ void m37637b(View view) {
        dismiss();
    }

    public void setTitle(int i) {
        this.f31022d.setText(i);
    }

    /* renamed from: a */
    public void m37633a(String str) {
        this.f31022d.setText(str);
    }

    /* renamed from: a */
    public void m37631a(@DrawableRes int i) {
        if (i == 0) {
            this.f31021c.setVisibility(8);
        } else {
            this.f31021c.setImageResource(i);
        }
    }

    /* renamed from: b */
    public void m37635b(@StringRes int i) {
        this.f31023e.setText(i);
    }

    /* renamed from: b */
    public void m37638b(String str) {
        this.f31023e.setText(str);
    }

    /* renamed from: a */
    public void m37632a(int i, OnClickListener onClickListener) {
        this.f31024f.setText(i);
        this.f31024f.setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public void m37636b(int i, OnClickListener onClickListener) {
        this.f31025g.setText(i);
        this.f31025g.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public TextView m37630a() {
        return this.f31024f;
    }

    /* renamed from: a */
    public void m37634a(boolean z) {
        if (z) {
            this.f31027i.getLayoutParams().height = (int) getContext().getResources().getDimension(R.dimen.dialog_txt_max_height);
            return;
        }
        this.f31027i.getLayoutParams().height = -2;
    }

    /* renamed from: c */
    public void m37639c(@StringRes int i, OnClickListener onClickListener) {
        this.f31026h.setVisibility(8);
        View view = (TextView) findViewById(R.id.txt_mono_choice);
        view.setOnClickListener(onClickListener);
        view.setText(i);
        C9661a.m40068a(view, 1.0f, 0.95f, 275, 275);
        view.setVisibility(0);
    }
}
