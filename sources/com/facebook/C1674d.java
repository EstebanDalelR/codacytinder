package com.facebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.common.C1672a.C1666a;
import com.facebook.common.C1672a.C1671f;
import com.facebook.internal.C1725l;

/* renamed from: com.facebook.d */
public abstract class C1674d extends Button {
    /* renamed from: a */
    private String f4593a;
    /* renamed from: b */
    private String f4594b;
    /* renamed from: c */
    private OnClickListener f4595c;
    /* renamed from: d */
    private OnClickListener f4596d;
    /* renamed from: e */
    private boolean f4597e;
    /* renamed from: f */
    private int f4598f;
    /* renamed from: g */
    private int f4599g;
    /* renamed from: h */
    private C1725l f4600h;

    /* renamed from: com.facebook.d$1 */
    class C16731 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1674d f4592a;

        C16731(C1674d c1674d) {
            this.f4592a = c1674d;
        }

        public void onClick(View view) {
            this.f4592a.m5657b(this.f4592a.getContext());
            if (this.f4592a.f4596d != null) {
                this.f4592a.f4596d.onClick(view);
            } else if (this.f4592a.f4595c != null) {
                this.f4592a.f4595c.onClick(view);
            }
        }
    }

    protected abstract int getDefaultRequestCode();

    protected int getDefaultStyleResource() {
        return 0;
    }

    protected C1674d(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        if (i2 == 0) {
            i2 = getDefaultStyleResource();
        }
        if (i2 == 0) {
            i2 = C1671f.com_facebook_button;
        }
        mo1875a(context, attributeSet, i, i2);
        this.f4593a = str;
        this.f4594b = str2;
        setClickable(true);
        setFocusable(true);
    }

    public void setFragment(Fragment fragment) {
        this.f4600h = new C1725l(fragment);
    }

    public void setFragment(android.app.Fragment fragment) {
        this.f4600h = new C1725l(fragment);
    }

    public Fragment getFragment() {
        return this.f4600h != null ? this.f4600h.m5948b() : null;
    }

    public android.app.Fragment getNativeFragment() {
        return this.f4600h != null ? this.f4600h.m5946a() : null;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f4595c = onClickListener;
    }

    public int getRequestCode() {
        return getDefaultRequestCode();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            m5654a(getContext());
        }
    }

    protected void onDraw(Canvas canvas) {
        if (((getGravity() & 1) != 0 ? 1 : null) != null) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - m5662a(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.f4598f = compoundPaddingLeft - min;
            this.f4599g = compoundPaddingRight + min;
            this.f4597e = true;
        }
        super.onDraw(canvas);
        this.f4597e = false;
    }

    public int getCompoundPaddingLeft() {
        if (this.f4597e) {
            return this.f4598f;
        }
        return super.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (this.f4597e) {
            return this.f4599g;
        }
        return super.getCompoundPaddingRight();
    }

    protected Activity getActivity() {
        Context context = getContext();
        while (true) {
            boolean z = context instanceof Activity;
            if (!z && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else if (z) {
                return (Activity) context;
            } else {
                throw new FacebookException("Unable to get Activity.");
            }
        }
        if (z) {
            return (Activity) context;
        }
        throw new FacebookException("Unable to get Activity.");
    }

    /* renamed from: a */
    protected int m5662a(String str) {
        return (int) Math.ceil((double) getPaint().measureText(str));
    }

    /* renamed from: a */
    protected void mo1875a(Context context, AttributeSet attributeSet, int i, int i2) {
        m5658b(context, attributeSet, i, i2);
        m5659c(context, attributeSet, i, i2);
        m5660d(context, attributeSet, i, i2);
        m5661e(context, attributeSet, i, i2);
        mo1874a();
    }

    /* renamed from: a */
    protected void m5664a(View view) {
        if (this.f4595c != null) {
            this.f4595c.onClick(view);
        }
    }

    protected void setInternalOnClickListener(OnClickListener onClickListener) {
        this.f4596d = onClickListener;
    }

    /* renamed from: a */
    private void m5654a(Context context) {
        AppEventsLogger.newLogger(context).logSdkEvent(this.f4593a, null, null);
    }

    /* renamed from: b */
    private void m5657b(Context context) {
        AppEventsLogger.newLogger(context).logSdkEvent(this.f4594b, null, null);
    }

    /* renamed from: b */
    private void m5658b(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            attributeSet = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
            try {
                if (attributeSet.hasValue(0) != 0) {
                    context = attributeSet.getResourceId(0, 0);
                    if (context != null) {
                        setBackgroundResource(context);
                    } else {
                        setBackgroundColor(attributeSet.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(C0432b.m1647c(context, C1666a.com_facebook_blue));
                }
                attributeSet.recycle();
            } catch (Throwable th) {
                attributeSet.recycle();
            }
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: c */
    private void m5659c(Context context, AttributeSet attributeSet, int i, int i2) {
        context = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
        try {
            setCompoundDrawablesWithIntrinsicBounds(context.getResourceId(0, 0), context.getResourceId(1, 0), context.getResourceId(2, 0), context.getResourceId(3, 0));
            setCompoundDrawablePadding(context.getDimensionPixelSize(4, 0));
        } finally {
            context.recycle();
        }
    }

    /* renamed from: d */
    private void m5660d(Context context, AttributeSet attributeSet, int i, int i2) {
        context = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
        try {
            setPadding(context.getDimensionPixelSize(0, 0), context.getDimensionPixelSize(1, 0), context.getDimensionPixelSize(2, 0), context.getDimensionPixelSize(3, 0));
        } finally {
            context.recycle();
        }
    }

    /* renamed from: e */
    private void m5661e(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
        try {
            setTextColor(obtainStyledAttributes.getColorStateList(0));
            obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
            try {
                setGravity(obtainStyledAttributes.getInt(0, 17));
                context = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                try {
                    setTextSize(0, (float) context.getDimensionPixelSize(0, 0));
                    setTypeface(Typeface.defaultFromStyle(context.getInt(1, 1)));
                    setText(context.getString(2));
                } finally {
                    context.recycle();
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void mo1874a() {
        super.setOnClickListener(new C16731(this));
    }
}
