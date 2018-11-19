package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.annotation.VisibleForTesting;
import android.support.design.C0181a.C0177h;
import android.support.design.C0181a.C0178i;
import android.support.design.C0181a.C0179j;
import android.support.design.C0181a.C0180k;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0582a;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.C0586b;
import android.support.v4.widget.C0651o;
import android.support.v4.widget.Space;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.TintTypedArray;
import android.support.v7.widget.WithHint;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextInputLayout extends LinearLayout implements WithHint {
    /* renamed from: A */
    private boolean f8749A;
    /* renamed from: B */
    private Drawable f8750B;
    /* renamed from: C */
    private Drawable f8751C;
    /* renamed from: D */
    private ColorStateList f8752D;
    /* renamed from: E */
    private boolean f8753E;
    /* renamed from: F */
    private Mode f8754F;
    /* renamed from: G */
    private boolean f8755G;
    /* renamed from: H */
    private ColorStateList f8756H;
    /* renamed from: I */
    private ColorStateList f8757I;
    /* renamed from: J */
    private boolean f8758J;
    /* renamed from: K */
    private boolean f8759K;
    /* renamed from: L */
    private ValueAnimator f8760L;
    /* renamed from: M */
    private boolean f8761M;
    /* renamed from: N */
    private boolean f8762N;
    /* renamed from: O */
    private boolean f8763O;
    /* renamed from: a */
    EditText f8764a;
    /* renamed from: b */
    TextView f8765b;
    /* renamed from: c */
    boolean f8766c;
    /* renamed from: d */
    final C0230e f8767d;
    /* renamed from: e */
    private final FrameLayout f8768e;
    /* renamed from: f */
    private CharSequence f8769f;
    /* renamed from: g */
    private boolean f8770g;
    /* renamed from: h */
    private CharSequence f8771h;
    /* renamed from: i */
    private Paint f8772i;
    /* renamed from: j */
    private final Rect f8773j;
    /* renamed from: k */
    private LinearLayout f8774k;
    /* renamed from: l */
    private int f8775l;
    /* renamed from: m */
    private Typeface f8776m;
    /* renamed from: n */
    private boolean f8777n;
    /* renamed from: o */
    private int f8778o;
    /* renamed from: p */
    private boolean f8779p;
    /* renamed from: q */
    private CharSequence f8780q;
    /* renamed from: r */
    private TextView f8781r;
    /* renamed from: s */
    private int f8782s;
    /* renamed from: t */
    private int f8783t;
    /* renamed from: u */
    private int f8784u;
    /* renamed from: v */
    private boolean f8785v;
    /* renamed from: w */
    private boolean f8786w;
    /* renamed from: x */
    private Drawable f8787x;
    /* renamed from: y */
    private CharSequence f8788y;
    /* renamed from: z */
    private CheckableImageButton f8789z;

    /* renamed from: android.support.design.widget.TextInputLayout$1 */
    class C02201 implements TextWatcher {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f774a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C02201(TextInputLayout textInputLayout) {
            this.f774a = textInputLayout;
        }

        public void afterTextChanged(Editable editable) {
            this.f774a.m10805a(this.f774a.f8763O ^ 1);
            if (this.f774a.f8766c) {
                this.f774a.m10804a(editable.length());
            }
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$2 */
    class C02212 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f775a;

        C02212(TextInputLayout textInputLayout) {
            this.f775a = textInputLayout;
        }

        public void onAnimationStart(Animator animator) {
            this.f775a.f8765b.setVisibility(0);
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$4 */
    class C02234 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f778a;

        C02234(TextInputLayout textInputLayout) {
            this.f778a = textInputLayout;
        }

        public void onClick(View view) {
            this.f778a.m10794b(false);
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$5 */
    class C02245 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f779a;

        C02245(TextInputLayout textInputLayout) {
            this.f779a = textInputLayout;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f779a.f8767d.m836b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02251();
        CharSequence error;
        boolean isPasswordToggledVisible;

        /* renamed from: android.support.design.widget.TextInputLayout$SavedState$1 */
        static class C02251 implements ClassLoaderCreator<SavedState> {
            C02251() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m798a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m799a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m800a(i);
            }

            /* renamed from: a */
            public SavedState m799a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m798a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m800a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            classLoader = true;
            if (parcel.readInt() != 1) {
                classLoader = null;
            }
            this.isPasswordToggledVisible = classLoader;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isPasswordToggledVisible);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TextInputLayout.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" error=");
            stringBuilder.append(this.error);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$a */
    private class C2773a extends C0582a {
        /* renamed from: a */
        final /* synthetic */ TextInputLayout f8748a;

        C2773a(TextInputLayout textInputLayout) {
            this.f8748a = textInputLayout;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            view = this.f8748a.f8767d.m852j();
            if (!TextUtils.isEmpty(view)) {
                accessibilityEvent.getText().add(view);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
            super.onInitializeAccessibilityNodeInfo(view, c0586b);
            c0586b.m2264b(TextInputLayout.class.getSimpleName());
            CharSequence j = this.f8748a.f8767d.m852j();
            if (!TextUtils.isEmpty(j)) {
                c0586b.m2271c(j);
            }
            if (this.f8748a.f8764a != null) {
                c0586b.m2269c(this.f8748a.f8764a);
            }
            j = this.f8748a.f8765b != null ? this.f8748a.f8765b.getText() : null;
            if (!TextUtils.isEmpty(j)) {
                c0586b.m2286i(true);
                c0586b.m2277e(j);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f8773j = new Rect();
        this.f8767d = new C0230e(this);
        C0248o.m917a(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f8768e = new FrameLayout(context);
        this.f8768e.setAddStatesFromChildren(true);
        addView(this.f8768e);
        this.f8767d.m832a(C0226a.f781b);
        this.f8767d.m841b(new AccelerateInterpolator());
        this.f8767d.m837b(8388659);
        context = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0180k.TextInputLayout, i, C0179j.Widget_Design_TextInputLayout);
        this.f8770g = context.getBoolean(C0180k.TextInputLayout_hintEnabled, true);
        setHint(context.getText(C0180k.TextInputLayout_android_hint));
        this.f8759K = context.getBoolean(C0180k.TextInputLayout_hintAnimationEnabled, true);
        if (context.hasValue(C0180k.TextInputLayout_android_textColorHint) != null) {
            attributeSet = context.getColorStateList(C0180k.TextInputLayout_android_textColorHint);
            this.f8757I = attributeSet;
            this.f8756H = attributeSet;
        }
        if (context.getResourceId(C0180k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(context.getResourceId(C0180k.TextInputLayout_hintTextAppearance, 0));
        }
        this.f8778o = context.getResourceId(C0180k.TextInputLayout_errorTextAppearance, 0);
        attributeSet = context.getBoolean(C0180k.TextInputLayout_errorEnabled, false);
        boolean z = context.getBoolean(C0180k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(context.getInt(C0180k.TextInputLayout_counterMaxLength, -1));
        this.f8783t = context.getResourceId(C0180k.TextInputLayout_counterTextAppearance, 0);
        this.f8784u = context.getResourceId(C0180k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f8786w = context.getBoolean(C0180k.TextInputLayout_passwordToggleEnabled, false);
        this.f8787x = context.getDrawable(C0180k.TextInputLayout_passwordToggleDrawable);
        this.f8788y = context.getText(C0180k.TextInputLayout_passwordToggleContentDescription);
        if (context.hasValue(C0180k.TextInputLayout_passwordToggleTint)) {
            this.f8753E = true;
            this.f8752D = context.getColorStateList(C0180k.TextInputLayout_passwordToggleTint);
        }
        if (context.hasValue(C0180k.TextInputLayout_passwordToggleTintMode)) {
            this.f8755G = true;
            this.f8754F = C0250q.m924a(context.getInt(C0180k.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        context.recycle();
        setErrorEnabled(attributeSet);
        setCounterEnabled(z);
        m10802h();
        if (ViewCompat.m2203d(this) == null) {
            ViewCompat.m2176a((View) this, 1);
        }
        ViewCompat.m2185a((View) this, new C2773a(this));
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (view instanceof EditText) {
            i = new FrameLayout.LayoutParams(layoutParams);
            i.gravity = (i.gravity & -113) | 16;
            this.f8768e.addView(view, i);
            this.f8768e.setLayoutParams(layoutParams);
            m10785a();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if ((this.f8776m != null && !this.f8776m.equals(typeface)) || (this.f8776m == null && typeface != null)) {
            this.f8776m = typeface;
            this.f8767d.m844c(typeface);
            if (this.f8781r != null) {
                this.f8781r.setTypeface(typeface);
            }
            if (this.f8765b != null) {
                this.f8765b.setTypeface(typeface);
            }
        }
    }

    @NonNull
    public Typeface getTypeface() {
        return this.f8776m;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f8769f != null) {
            if (this.f8764a != null) {
                CharSequence hint = this.f8764a.getHint();
                this.f8764a.setHint(this.f8769f);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, i);
                    return;
                } finally {
                    this.f8764a.setHint(hint);
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, i);
    }

    private void setEditText(EditText editText) {
        if (this.f8764a != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (!(editText instanceof C3998n)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f8764a = editText;
        if (m10800f() == null) {
            this.f8767d.m844c(this.f8764a.getTypeface());
        }
        this.f8767d.m826a(this.f8764a.getTextSize());
        int gravity = this.f8764a.getGravity();
        this.f8767d.m837b((gravity & -113) | 48);
        this.f8767d.m827a(gravity);
        this.f8764a.addTextChangedListener(new C02201(this));
        if (this.f8756H == null) {
            this.f8756H = this.f8764a.getHintTextColors();
        }
        if (!(this.f8770g == null || TextUtils.isEmpty(this.f8771h) == null)) {
            this.f8769f = this.f8764a.getHint();
            setHint(this.f8769f);
            this.f8764a.setHint(null);
        }
        if (this.f8781r != null) {
            m10804a(this.f8764a.getText().length());
        }
        if (this.f8774k != null) {
            m10793b();
        }
        m10799e();
        m10806a((boolean) null, true);
    }

    /* renamed from: a */
    private void m10785a() {
        int i;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8768e.getLayoutParams();
        if (this.f8770g) {
            if (this.f8772i == null) {
                this.f8772i = new Paint();
            }
            this.f8772i.setTypeface(this.f8767d.m845d());
            this.f8772i.setTextSize(this.f8767d.m850h());
            i = (int) (-this.f8772i.ascent());
        } else {
            i = 0;
        }
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.f8768e.requestLayout();
        }
    }

    /* renamed from: a */
    void m10805a(boolean z) {
        m10806a(z, false);
    }

    /* renamed from: a */
    void m10806a(boolean z, boolean z2) {
        boolean isEnabled = isEnabled();
        Object obj = (this.f8764a == null || TextUtils.isEmpty(this.f8764a.getText())) ? null : 1;
        boolean a = m10792a(getDrawableState(), 16842908);
        int isEmpty = 1 ^ TextUtils.isEmpty(getError());
        if (this.f8756H != null) {
            this.f8767d.m839b(this.f8756H);
        }
        if (isEnabled && this.f8785v && this.f8781r != null) {
            this.f8767d.m829a(this.f8781r.getTextColors());
        } else if (isEnabled && a && this.f8757I != null) {
            this.f8767d.m829a(this.f8757I);
        } else if (this.f8756H != null) {
            this.f8767d.m829a(this.f8756H);
        }
        if (obj == null) {
            if (isEnabled()) {
                if (!a) {
                    if (isEmpty != 0) {
                    }
                }
            }
            if (z2 || !this.f8758J) {
                m10798d(z);
                return;
            }
            return;
        }
        if (z2 || this.f8758J) {
            m10796c(z);
        }
    }

    @Nullable
    public EditText getEditText() {
        return this.f8764a;
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f8770g) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(ItemAnimator.FLAG_MOVED);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        this.f8771h = charSequence;
        this.f8767d.m833a(charSequence);
    }

    @Nullable
    public CharSequence getHint() {
        return this.f8770g ? this.f8771h : null;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f8770g) {
            this.f8770g = z;
            z = this.f8764a.getHint();
            if (!this.f8770g) {
                if (!TextUtils.isEmpty(this.f8771h) && TextUtils.isEmpty(z)) {
                    this.f8764a.setHint(this.f8771h);
                }
                setHintInternal(null);
            } else if (!TextUtils.isEmpty(z)) {
                if (TextUtils.isEmpty(this.f8771h)) {
                    setHint(z);
                }
                this.f8764a.setHint(null);
            }
            if (this.f8764a) {
                m10785a();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.f8767d.m843c(i);
        this.f8757I = this.f8767d.m853k();
        if (this.f8764a != 0) {
            m10805a((boolean) 0);
            m10785a();
        }
    }

    /* renamed from: a */
    private void m10789a(TextView textView, int i) {
        if (this.f8774k == null) {
            this.f8774k = new LinearLayout(getContext());
            this.f8774k.setOrientation(0);
            addView(this.f8774k, -1, -2);
            this.f8774k.addView(new Space(getContext()), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f8764a != null) {
                m10793b();
            }
        }
        this.f8774k.setVisibility(0);
        this.f8774k.addView(textView, i);
        this.f8775l++;
    }

    /* renamed from: b */
    private void m10793b() {
        ViewCompat.m2197b(this.f8774k, ViewCompat.m2210g(this.f8764a), 0, ViewCompat.m2212h(this.f8764a), this.f8764a.getPaddingBottom());
    }

    /* renamed from: a */
    private void m10788a(TextView textView) {
        if (this.f8774k != null) {
            this.f8774k.removeView(textView);
            textView = this.f8775l - 1;
            this.f8775l = textView;
            if (textView == null) {
                this.f8774k.setVisibility(8);
            }
        }
    }

    public void setErrorEnabled(boolean r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.f8777n;
        if (r0 == r6) goto L_0x008a;
    L_0x0004:
        r0 = r5.f8765b;
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r5.f8765b;
        r0 = r0.animate();
        r0.cancel();
    L_0x0011:
        r0 = 0;
        if (r6 == 0) goto L_0x007b;
    L_0x0014:
        r1 = new android.support.v7.widget.AppCompatTextView;
        r2 = r5.getContext();
        r1.<init>(r2);
        r5.f8765b = r1;
        r1 = r5.f8765b;
        r2 = android.support.design.C0181a.C0175f.textinput_error;
        r1.setId(r2);
        r1 = r5.f8776m;
        if (r1 == 0) goto L_0x0031;
    L_0x002a:
        r1 = r5.f8765b;
        r2 = r5.f8776m;
        r1.setTypeface(r2);
    L_0x0031:
        r1 = 1;
        r2 = r5.f8765b;	 Catch:{ Exception -> 0x0051 }
        r3 = r5.f8778o;	 Catch:{ Exception -> 0x0051 }
        android.support.v4.widget.TextViewCompat.m2517a(r2, r3);	 Catch:{ Exception -> 0x0051 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0051 }
        r3 = 23;	 Catch:{ Exception -> 0x0051 }
        if (r2 < r3) goto L_0x004f;	 Catch:{ Exception -> 0x0051 }
    L_0x003f:
        r2 = r5.f8765b;	 Catch:{ Exception -> 0x0051 }
        r2 = r2.getTextColors();	 Catch:{ Exception -> 0x0051 }
        r2 = r2.getDefaultColor();	 Catch:{ Exception -> 0x0051 }
        r3 = -65281; // 0xffffffffffff00ff float:NaN double:NaN;
        if (r2 != r3) goto L_0x004f;
    L_0x004e:
        goto L_0x0051;
    L_0x004f:
        r2 = 0;
        goto L_0x0052;
    L_0x0051:
        r2 = 1;
    L_0x0052:
        if (r2 == 0) goto L_0x006a;
    L_0x0054:
        r2 = r5.f8765b;
        r3 = android.support.v7.appcompat.C0667R.style.TextAppearance_AppCompat_Caption;
        android.support.v4.widget.TextViewCompat.m2517a(r2, r3);
        r2 = r5.f8765b;
        r3 = r5.getContext();
        r4 = android.support.v7.appcompat.C0667R.color.error_color_material;
        r3 = android.support.v4.content.C0432b.m1647c(r3, r4);
        r2.setTextColor(r3);
    L_0x006a:
        r2 = r5.f8765b;
        r3 = 4;
        r2.setVisibility(r3);
        r2 = r5.f8765b;
        android.support.v4.view.ViewCompat.m2196b(r2, r1);
        r1 = r5.f8765b;
        r5.m10789a(r1, r0);
        goto L_0x0088;
    L_0x007b:
        r5.f8779p = r0;
        r5.m10795c();
        r0 = r5.f8765b;
        r5.m10788a(r0);
        r0 = 0;
        r5.f8765b = r0;
    L_0x0088:
        r5.f8777n = r6;
    L_0x008a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setErrorEnabled(boolean):void");
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        this.f8778o = i;
        if (this.f8765b != null) {
            TextViewCompat.m2517a(this.f8765b, i);
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        boolean z = ViewCompat.m2234z(this) && isEnabled() && (this.f8765b == null || !TextUtils.equals(this.f8765b.getText(), charSequence));
        m10790a(charSequence, z);
    }

    /* renamed from: a */
    private void m10790a(@Nullable final CharSequence charSequence, boolean z) {
        this.f8780q = charSequence;
        if (!this.f8777n) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        this.f8779p = TextUtils.isEmpty(charSequence) ^ true;
        this.f8765b.animate().cancel();
        if (this.f8779p) {
            this.f8765b.setText(charSequence);
            this.f8765b.setVisibility(0);
            if (z) {
                if (this.f8765b.getAlpha() == 1.0f) {
                    this.f8765b.setAlpha(0.0f);
                }
                this.f8765b.animate().alpha(1.0f).setDuration(200).setInterpolator(C0226a.f783d).setListener(new C02212(this)).start();
            } else {
                this.f8765b.setAlpha(1.0f);
            }
        } else if (this.f8765b.getVisibility() == 0) {
            if (z) {
                this.f8765b.animate().alpha(0.0f).setDuration(200).setInterpolator(C0226a.f782c).setListener(new AnimatorListenerAdapter(this) {
                    /* renamed from: b */
                    final /* synthetic */ TextInputLayout f777b;

                    public void onAnimationEnd(Animator animator) {
                        this.f777b.f8765b.setText(charSequence);
                        this.f777b.f8765b.setVisibility(4);
                    }
                }).start();
            } else {
                this.f8765b.setText(charSequence);
                this.f8765b.setVisibility(4);
            }
        }
        m10795c();
        m10805a(z);
    }

    public void setCounterEnabled(boolean r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.f8766c;
        if (r0 == r4) goto L_0x006e;
    L_0x0004:
        if (r4 == 0) goto L_0x0064;
    L_0x0006:
        r0 = new android.support.v7.widget.AppCompatTextView;
        r1 = r3.getContext();
        r0.<init>(r1);
        r3.f8781r = r0;
        r0 = r3.f8781r;
        r1 = android.support.design.C0181a.C0175f.textinput_counter;
        r0.setId(r1);
        r0 = r3.f8776m;
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = r3.f8781r;
        r1 = r3.f8776m;
        r0.setTypeface(r1);
    L_0x0023:
        r0 = r3.f8781r;
        r1 = 1;
        r0.setMaxLines(r1);
        r0 = r3.f8781r;	 Catch:{ Exception -> 0x0031 }
        r1 = r3.f8783t;	 Catch:{ Exception -> 0x0031 }
        android.support.v4.widget.TextViewCompat.m2517a(r0, r1);	 Catch:{ Exception -> 0x0031 }
        goto L_0x0047;
    L_0x0031:
        r0 = r3.f8781r;
        r1 = android.support.v7.appcompat.C0667R.style.TextAppearance_AppCompat_Caption;
        android.support.v4.widget.TextViewCompat.m2517a(r0, r1);
        r0 = r3.f8781r;
        r1 = r3.getContext();
        r2 = android.support.v7.appcompat.C0667R.color.error_color_material;
        r1 = android.support.v4.content.C0432b.m1647c(r1, r2);
        r0.setTextColor(r1);
    L_0x0047:
        r0 = r3.f8781r;
        r1 = -1;
        r3.m10789a(r0, r1);
        r0 = r3.f8764a;
        if (r0 != 0) goto L_0x0056;
    L_0x0051:
        r0 = 0;
        r3.m10804a(r0);
        goto L_0x006c;
    L_0x0056:
        r0 = r3.f8764a;
        r0 = r0.getText();
        r0 = r0.length();
        r3.m10804a(r0);
        goto L_0x006c;
    L_0x0064:
        r0 = r3.f8781r;
        r3.m10788a(r0);
        r0 = 0;
        r3.f8781r = r0;
    L_0x006c:
        r3.f8766c = r4;
    L_0x006e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setCounterEnabled(boolean):void");
    }

    public void setCounterMaxLength(int i) {
        if (this.f8782s != i) {
            if (i > 0) {
                this.f8782s = i;
            } else {
                this.f8782s = -1;
            }
            if (this.f8766c != 0) {
                m10804a(this.f8764a == 0 ? 0 : this.f8764a.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        m10787a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    /* renamed from: a */
    private static void m10787a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m10787a((ViewGroup) childAt, z);
            }
        }
    }

    public int getCounterMaxLength() {
        return this.f8782s;
    }

    /* renamed from: a */
    void m10804a(int i) {
        boolean z = this.f8785v;
        if (this.f8782s == -1) {
            this.f8781r.setText(String.valueOf(i));
            this.f8785v = false;
        } else {
            this.f8785v = i > this.f8782s;
            if (z != this.f8785v) {
                TextViewCompat.m2517a(this.f8781r, this.f8785v ? this.f8784u : this.f8783t);
            }
            this.f8781r.setText(getContext().getString(C0178i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f8782s)}));
        }
        if (this.f8764a != 0 && z != this.f8785v) {
            m10805a(false);
            m10795c();
        }
    }

    /* renamed from: c */
    private void m10795c() {
        if (this.f8764a != null) {
            Drawable background = this.f8764a.getBackground();
            if (background != null) {
                m10797d();
                if (DrawableUtils.canSafelyMutateDrawable(background)) {
                    background = background.mutate();
                }
                if (this.f8779p && this.f8765b != null) {
                    background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.f8765b.getCurrentTextColor(), Mode.SRC_IN));
                } else if (!this.f8785v || this.f8781r == null) {
                    C0450a.m1729f(background);
                    this.f8764a.refreshDrawableState();
                } else {
                    background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.f8781r.getCurrentTextColor(), Mode.SRC_IN));
                }
            }
        }
    }

    /* renamed from: d */
    private void m10797d() {
        int i = VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            Drawable background = this.f8764a.getBackground();
            if (!(background == null || this.f8761M)) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.f8761M = C0231f.m854a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.f8761M) {
                    ViewCompat.m2183a(this.f8764a, newDrawable);
                    this.f8761M = true;
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (this.f8779p) {
            savedState.error = getError();
        }
        savedState.isPasswordToggledVisible = this.f8749A;
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            setError(savedState.error);
            if (savedState.isPasswordToggledVisible != null) {
                m10794b(true);
            }
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f8763O = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f8763O = null;
    }

    @Nullable
    public CharSequence getError() {
        return this.f8777n ? this.f8780q : null;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f8759K = z;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f8770g) {
            this.f8767d.m830a(canvas);
        }
    }

    protected void onMeasure(int i, int i2) {
        m10799e();
        super.onMeasure(i, i2);
    }

    /* renamed from: e */
    private void m10799e() {
        if (this.f8764a != null) {
            Drawable[] b;
            if (m10801g()) {
                if (this.f8789z == null) {
                    this.f8789z = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0177h.design_text_input_password_icon, this.f8768e, false);
                    this.f8789z.setImageDrawable(this.f8787x);
                    this.f8789z.setContentDescription(this.f8788y);
                    this.f8768e.addView(this.f8789z);
                    this.f8789z.setOnClickListener(new C02234(this));
                }
                if (this.f8764a != null && ViewCompat.m2220l(this.f8764a) <= 0) {
                    this.f8764a.setMinimumHeight(ViewCompat.m2220l(this.f8789z));
                }
                this.f8789z.setVisibility(0);
                this.f8789z.setChecked(this.f8749A);
                if (this.f8750B == null) {
                    this.f8750B = new ColorDrawable();
                }
                this.f8750B.setBounds(0, 0, this.f8789z.getMeasuredWidth(), 1);
                b = TextViewCompat.m2519b(this.f8764a);
                if (b[2] != this.f8750B) {
                    this.f8751C = b[2];
                }
                TextViewCompat.m2518a(this.f8764a, b[0], b[1], this.f8750B, b[3]);
                this.f8789z.setPadding(this.f8764a.getPaddingLeft(), this.f8764a.getPaddingTop(), this.f8764a.getPaddingRight(), this.f8764a.getPaddingBottom());
            } else {
                if (this.f8789z != null && this.f8789z.getVisibility() == 0) {
                    this.f8789z.setVisibility(8);
                }
                if (this.f8750B != null) {
                    b = TextViewCompat.m2519b(this.f8764a);
                    if (b[2] == this.f8750B) {
                        TextViewCompat.m2518a(this.f8764a, b[0], b[1], this.f8751C, b[3]);
                        this.f8750B = null;
                    }
                }
            }
        }
    }

    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : 0);
    }

    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f8787x = drawable;
        if (this.f8789z != null) {
            this.f8789z.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : 0);
    }

    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f8788y = charSequence;
        if (this.f8789z != null) {
            this.f8789z.setContentDescription(charSequence);
        }
    }

    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8787x;
    }

    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8788y;
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f8786w != z) {
            this.f8786w = z;
            if (!z && this.f8749A && this.f8764a) {
                this.f8764a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f8749A = false;
            m10799e();
        }
    }

    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f8752D = colorStateList;
        this.f8753E = true;
        m10802h();
    }

    public void setPasswordVisibilityToggleTintMode(@Nullable Mode mode) {
        this.f8754F = mode;
        this.f8755G = true;
        m10802h();
    }

    /* renamed from: b */
    private void m10794b(boolean z) {
        if (this.f8786w) {
            int selectionEnd = this.f8764a.getSelectionEnd();
            if (m10800f()) {
                this.f8764a.setTransformationMethod(null);
                this.f8749A = true;
            } else {
                this.f8764a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f8749A = false;
            }
            this.f8789z.setChecked(this.f8749A);
            if (z) {
                this.f8789z.jumpDrawablesToCurrentState();
            }
            this.f8764a.setSelection(selectionEnd);
        }
    }

    /* renamed from: f */
    private boolean m10800f() {
        return this.f8764a != null && (this.f8764a.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: g */
    private boolean m10801g() {
        return this.f8786w && (m10800f() || this.f8749A);
    }

    /* renamed from: h */
    private void m10802h() {
        if (this.f8787x == null) {
            return;
        }
        if (this.f8753E || this.f8755G) {
            this.f8787x = C0450a.m1730g(this.f8787x).mutate();
            if (this.f8753E) {
                C0450a.m1719a(this.f8787x, this.f8752D);
            }
            if (this.f8755G) {
                C0450a.m1722a(this.f8787x, this.f8754F);
            }
            if (this.f8789z != null && this.f8789z.getDrawable() != this.f8787x) {
                this.f8789z.setImageDrawable(this.f8787x);
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f8770g && this.f8764a) {
            z = this.f8773j;
            C0651o.m2650b(this, this.f8764a, z);
            i = z.left + this.f8764a.getCompoundPaddingLeft();
            i3 = z.right - this.f8764a.getCompoundPaddingRight();
            this.f8767d.m828a(i, z.top + this.f8764a.getCompoundPaddingTop(), i3, z.bottom - this.f8764a.getCompoundPaddingBottom());
            this.f8767d.m838b(i, getPaddingTop(), i3, (i4 - i2) - getPaddingBottom());
            this.f8767d.m851i();
        }
    }

    /* renamed from: c */
    private void m10796c(boolean z) {
        if (this.f8760L != null && this.f8760L.isRunning()) {
            this.f8760L.cancel();
        }
        if (z && this.f8759K) {
            m10803a(1.0f);
        } else {
            this.f8767d.m836b(1.0f);
        }
        this.f8758J = false;
    }

    protected void drawableStateChanged() {
        if (!this.f8762N) {
            boolean z = true;
            this.f8762N = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!ViewCompat.m2234z(this) || !isEnabled()) {
                z = false;
            }
            m10805a(z);
            m10795c();
            if ((this.f8767d != null ? this.f8767d.m834a(drawableState) | 0 : 0) != 0) {
                invalidate();
            }
            this.f8762N = false;
        }
    }

    /* renamed from: d */
    private void m10798d(boolean z) {
        if (this.f8760L != null && this.f8760L.isRunning()) {
            this.f8760L.cancel();
        }
        if (z && this.f8759K) {
            m10803a(0.0f);
        } else {
            this.f8767d.m836b(0.0f);
        }
        this.f8758J = true;
    }

    @VisibleForTesting
    /* renamed from: a */
    void m10803a(float f) {
        if (this.f8767d.m849g() != f) {
            if (this.f8760L == null) {
                this.f8760L = new ValueAnimator();
                this.f8760L.setInterpolator(C0226a.f780a);
                this.f8760L.setDuration(200);
                this.f8760L.addUpdateListener(new C02245(this));
            }
            this.f8760L.setFloatValues(new float[]{this.f8767d.m849g(), f});
            this.f8760L.start();
        }
    }

    /* renamed from: a */
    private static boolean m10792a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return 1;
            }
        }
        return false;
    }
}
