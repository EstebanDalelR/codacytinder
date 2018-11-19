package com.tinder.dialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.R;
import com.tinder.enums.ConfirmationType;

/* renamed from: com.tinder.dialogs.p */
public class C11117p extends C8858i {
    /* renamed from: a */
    private OnClickListener f35992a;
    /* renamed from: b */
    private OnClickListener f35993b;

    @Deprecated
    public C11117p(@NonNull Context context, @NonNull ConfirmationType confirmationType, String str, OnClickListener onClickListener, OnClickListener onClickListener2) {
        this(context, confirmationType, str, onClickListener, onClickListener2, null);
    }

    @Deprecated
    public C11117p(@NonNull Context context, @NonNull ConfirmationType confirmationType, String str, OnClickListener onClickListener, OnClickListener onClickListener2, OnKeyListener onKeyListener) {
        super(context, 0, context.getString(confirmationType.getIdTitle(), new Object[]{str}), context.getString(confirmationType.getIdPrompt(), new Object[]{str}));
        if (onKeyListener != null) {
            context = getWindow();
            context.setFlags(32, 32);
            context.addFlags(262144);
            setOnKeyListener(onKeyListener);
        }
        this.f35992a = onClickListener2;
        this.f35993b = onClickListener;
        m37632a(R.string.cancel, new C8864q(this));
        m37636b(confirmationType.getIdAction(), new C8865r(this));
        setOnCancelListener(new C8866s(this));
        setOnKeyListener(onKeyListener);
    }

    /* renamed from: d */
    final /* synthetic */ void m43856d(View view) {
        if (this.f35992a != null) {
            this.f35992a.onClick(view);
        }
        dismiss();
    }

    /* renamed from: a */
    final /* synthetic */ void m43855a(View view) {
        dismiss();
        if (this.f35993b != null) {
            this.f35993b.onClick(view);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m43854a(DialogInterface dialogInterface) {
        m37630a().performClick();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            m37630a().performClick();
        }
        return null;
    }
}
