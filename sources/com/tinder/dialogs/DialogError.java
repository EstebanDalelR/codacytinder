package com.tinder.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tinder.R;

public class DialogError extends Dialog {
    @BindView(2131362307)
    TextView mBodyTextView;
    @BindView(2131362308)
    Button mButton;
    @BindView(2131362309)
    TextView mTitleTextView;

    /* renamed from: com.tinder.dialogs.DialogError$a */
    public static class C8846a {
        @StringRes
        /* renamed from: a */
        int f30985a;
        @StringRes
        /* renamed from: b */
        int f30986b;
        @NonNull
        /* renamed from: c */
        private Context f30987c;
        @Nullable
        /* renamed from: d */
        private String f30988d;
        @Nullable
        /* renamed from: e */
        private String f30989e;
        @Nullable
        /* renamed from: f */
        private OnClickListener f30990f;
        /* renamed from: g */
        private boolean f30991g;

        private C8846a(@NonNull Context context) {
            this.f30987c = context;
        }

        /* renamed from: a */
        public C8846a m37613a(@StringRes int i) {
            this.f30985a = i;
            return this;
        }

        /* renamed from: a */
        public C8846a m37615a(@NonNull String str) {
            this.f30989e = str;
            return this;
        }

        /* renamed from: b */
        public C8846a m37617b(@StringRes int i) {
            this.f30986b = i;
            return this;
        }

        /* renamed from: a */
        public C8846a m37614a(@Nullable OnClickListener onClickListener) {
            this.f30990f = onClickListener;
            return this;
        }

        /* renamed from: a */
        public DialogError m37616a() {
            return new DialogError();
        }
    }

    public DialogError(Context context, @StringRes int i, @StringRes int i2) {
        this(new C8846a(context).m37613a(i).m37617b(i2));
    }

    /* renamed from: a */
    public static C8846a m37618a(@NonNull Context context) {
        return new C8846a(context);
    }

    private DialogError(C8846a c8846a) {
        super(c8846a.f30987c, R.style.Theme.FloatingDialog);
        setContentView(R.layout.dialog_error);
        ButterKnife.a(this);
        if (c8846a.f30988d != null) {
            this.mTitleTextView.setText(c8846a.f30988d);
        }
        if (c8846a.f30985a != 0) {
            this.mTitleTextView.setText(c8846a.f30985a);
        }
        if (c8846a.f30989e != null) {
            this.mBodyTextView.setText(c8846a.f30989e);
        }
        if (c8846a.f30986b != 0) {
            this.mBodyTextView.setText(c8846a.f30986b);
        }
        this.mButton.setOnClickListener(new C8862m(this, c8846a));
        setCancelable(c8846a.f30991g);
    }

    /* renamed from: a */
    final /* synthetic */ void m37619a(C8846a c8846a, View view) {
        dismiss();
        if (c8846a.f30990f != null) {
            c8846a.f30990f.onClick(view);
        }
    }
}
