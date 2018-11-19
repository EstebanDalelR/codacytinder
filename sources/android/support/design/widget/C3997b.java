package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.design.C0181a.C0171b;
import android.support.design.C0181a.C0175f;
import android.support.design.C0181a.C0177h;
import android.support.design.C0181a.C0179j;
import android.support.design.widget.BottomSheetBehavior.C0200a;
import android.support.v4.view.C0582a;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.C0586b;
import android.support.v7.app.AppCompatDialog;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: android.support.design.widget.b */
public class C3997b extends AppCompatDialog {
    /* renamed from: a */
    boolean f12720a;
    /* renamed from: b */
    private BottomSheetBehavior<FrameLayout> f12721b;
    /* renamed from: c */
    private boolean f12722c;
    /* renamed from: d */
    private boolean f12723d;
    /* renamed from: e */
    private C0200a f12724e;

    /* renamed from: android.support.design.widget.b$1 */
    class C02271 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3997b f785a;

        C02271(C3997b c3997b) {
            this.f785a = c3997b;
        }

        public void onClick(View view) {
            if (this.f785a.f12720a != null && this.f785a.isShowing() != null && this.f785a.m15678a() != null) {
                this.f785a.cancel();
            }
        }
    }

    /* renamed from: android.support.design.widget.b$3 */
    class C02283 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3997b f786a;

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }

        C02283(C3997b c3997b) {
            this.f786a = c3997b;
        }
    }

    /* renamed from: android.support.design.widget.b$2 */
    class C27742 extends C0582a {
        /* renamed from: a */
        final /* synthetic */ C3997b f8793a;

        C27742(C3997b c3997b) {
            this.f8793a = c3997b;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
            super.onInitializeAccessibilityNodeInfo(view, c0586b);
            if (this.f8793a.f12720a != null) {
                c0586b.m2255a(1048576);
                c0586b.m2290k(true);
                return;
            }
            c0586b.m2290k(null);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 1048576 || !this.f8793a.f12720a) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            this.f8793a.cancel();
            return true;
        }
    }

    /* renamed from: android.support.design.widget.b$4 */
    class C27754 extends C0200a {
        /* renamed from: a */
        final /* synthetic */ C3997b f8794a;

        /* renamed from: a */
        public void mo267a(@NonNull View view, float f) {
        }

        C27754(C3997b c3997b) {
            this.f8794a = c3997b;
        }

        /* renamed from: a */
        public void mo268a(@NonNull View view, int i) {
            if (i == 5) {
                this.f8794a.cancel();
            }
        }
    }

    public C3997b(@NonNull Context context) {
        this(context, 0);
    }

    public C3997b(@NonNull Context context, @StyleRes int i) {
        super(context, C3997b.m15676a(context, i));
        this.f12720a = true;
        this.f12722c = true;
        this.f12724e = new C27754(this);
        supportRequestWindowFeature(1);
    }

    public void setContentView(@LayoutRes int i) {
        super.setContentView(m15677a(i, null, null));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = getWindow();
        if (bundle != null) {
            if (VERSION.SDK_INT >= 21) {
                bundle.clearFlags(67108864);
                bundle.addFlags(Integer.MIN_VALUE);
            }
            bundle.setLayout(-1, -1);
        }
    }

    public void setContentView(View view) {
        super.setContentView(m15677a(0, view, null));
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m15677a(0, view, layoutParams));
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f12720a != z) {
            this.f12720a = z;
            if (this.f12721b != null) {
                this.f12721b.m10725a(z);
            }
        }
    }

    protected void onStart() {
        super.onStart();
        if (this.f12721b != null) {
            this.f12721b.m10732b(4);
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f12720a) {
            this.f12720a = true;
        }
        this.f12722c = z;
        this.f12723d = true;
    }

    /* renamed from: a */
    private View m15677a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0177h.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C0175f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        View view2 = (FrameLayout) coordinatorLayout.findViewById(C0175f.design_bottom_sheet);
        this.f12721b = BottomSheetBehavior.m10718b(view2);
        this.f12721b.m10721a(this.f12724e);
        this.f12721b.m10725a(this.f12720a);
        if (layoutParams == null) {
            view2.addView(view);
        } else {
            view2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0175f.touch_outside).setOnClickListener(new C02271(this));
        ViewCompat.m2185a(view2, new C27742(this));
        view2.setOnTouchListener(new C02283(this));
        return frameLayout;
    }

    /* renamed from: a */
    boolean m15678a() {
        if (!this.f12723d) {
            if (VERSION.SDK_INT < 11) {
                this.f12722c = true;
            } else {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
                this.f12722c = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
            this.f12723d = true;
        }
        return this.f12722c;
    }

    /* renamed from: a */
    private static int m15676a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        i = new TypedValue();
        if (context.getTheme().resolveAttribute(C0171b.bottomSheetDialogTheme, i, true) != null) {
            return i.resourceId;
        }
        return C0179j.Theme_Design_Light_BottomSheetDialog;
    }
}
