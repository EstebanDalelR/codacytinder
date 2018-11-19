package com.tinder.gold;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.api.ManagerWebServices;
import com.tinder.gold.C9692b.C9686b;
import com.tinder.gold.C9692b.C9687c;
import com.tinder.gold.C9692b.C9688d;
import com.tinder.gold.C9692b.C9691g;
import com.tinder.shimmy.ShimmerFrameLayout;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/gold/TinderGoldButtonView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionButton", "Landroid/widget/FrameLayout;", "buttonShimmerLayout", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "buttonText", "Landroid/widget/TextView;", "shadowButtonText", "clearButtonAction", "", "setButtonAction", "action", "Lkotlin/Function0;", "setButtonText", "resId", "", "text", "", "setButtonTextSpacing", "spacing", "", "gold_release"}, k = 1, mv = {1, 1, 10})
public final class TinderGoldButtonView extends LinearLayout {
    /* renamed from: a */
    private final FrameLayout f32261a;
    /* renamed from: b */
    private final TextView f32262b;
    /* renamed from: c */
    private final TextView f32263c;
    /* renamed from: d */
    private final ShimmerFrameLayout f32264d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.gold.TinderGoldButtonView$a */
    static final class C9683a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f32260a;

        C9683a(Function0 function0) {
            this.f32260a = function0;
        }

        public final void onClick(View view) {
            this.f32260a.invoke();
        }
    }

    public TinderGoldButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        LinearLayout.inflate(context, C9688d.tinder_gold_button_view, this);
        setOrientation(0);
        View findViewById = findViewById(C9687c.action_button);
        C2668g.a(findViewById, "findViewById(R.id.action_button)");
        this.f32261a = (FrameLayout) findViewById;
        findViewById = findViewById(C9687c.button_text);
        C2668g.a(findViewById, "findViewById(R.id.button_text)");
        this.f32262b = (TextView) findViewById;
        findViewById = findViewById(C9687c.shadow_button_text);
        C2668g.a(findViewById, "findViewById(R.id.shadow_button_text)");
        this.f32263c = (TextView) findViewById;
        findViewById = findViewById(C9687c.button_shimmer_layout);
        C2668g.a(findViewById, "findViewById(R.id.button_shimmer_layout)");
        this.f32264d = (ShimmerFrameLayout) findViewById;
        context = context.getTheme().obtainStyledAttributes(attributeSet, C9691g.TinderGoldButtonView, 0, 0);
        try {
            int i;
            String string = context.getString(C9691g.TinderGoldButtonView_buttonText);
            float f = context.getFloat(C9691g.TinderGoldButtonView_buttonTextSpacing, 0.0f);
            if (string != null) {
                setButtonText(string);
            }
            setButtonTextSpacing(f);
            attributeSet = context.getBoolean(C9691g.TinderGoldButtonView_reverse, false);
            if (attributeSet != null) {
                i = C9686b.tinder_gold_white_oval_background;
            } else {
                i = C9686b.tinder_gold_oval_background;
            }
            this.f32261a.setBackgroundResource(i);
            C9684a.m40145a(this.f32262b, attributeSet);
            C9684a.m40145a(this.f32261a, attributeSet ^ 1);
        } finally {
            context.recycle();
        }
    }

    public final void setButtonText(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TEXT);
        CharSequence charSequence = str;
        this.f32262b.setText(charSequence);
        this.f32263c.setText(charSequence);
    }

    public final void setButtonText(@StringRes int i) {
        String string = getContext().getString(i);
        C2668g.a(string, "context.getString(resId)");
        setButtonText(string);
    }

    public final void setButtonAction(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "action");
        this.f32261a.setOnClickListener(new C9683a(function0));
    }

    /* renamed from: a */
    public final void m40144a() {
        if (this.f32261a.hasOnClickListeners()) {
            this.f32261a.setOnClickListener(null);
        }
    }

    private final void setButtonTextSpacing(float f) {
        if (VERSION.SDK_INT >= 21) {
            this.f32262b.setLetterSpacing(f);
            this.f32263c.setLetterSpacing(f);
        }
    }
}
