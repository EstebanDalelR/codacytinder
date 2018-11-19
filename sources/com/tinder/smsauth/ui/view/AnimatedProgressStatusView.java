package com.tinder.smsauth.ui.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tinder.smsauth.ui.C15008k.C15004c;
import com.tinder.smsauth.ui.C15008k.C15005d;
import com.tinder.smsauth.ui.C15008k.C15006e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bH\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mode", "Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode;", "animationMode", "getAnimationMode", "()Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode;", "setAnimationMode", "(Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode;)V", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "update", "", "Mode", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class AnimatedProgressStatusView extends ConstraintLayout {
    /* renamed from: a */
    private HashMap f51813a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode;", "", "()V", "ConfirmationCheckmark", "Spinner", "Unspecified", "Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode$Unspecified;", "Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode$Spinner;", "Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode$ConfirmationCheckmark;", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.AnimatedProgressStatusView$a */
    public static abstract class C15009a {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode$ConfirmationCheckmark;", "Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode;", "()V", "ui_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.ui.view.AnimatedProgressStatusView$a$a */
        public static final class C16788a extends C15009a {
            /* renamed from: a */
            public static final C16788a f51810a = new C16788a();

            private C16788a() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode$Spinner;", "Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode;", "()V", "ui_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.ui.view.AnimatedProgressStatusView$a$b */
        public static final class C16789b extends C15009a {
            /* renamed from: a */
            public static final C16789b f51811a = new C16789b();

            private C16789b() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode$Unspecified;", "Lcom/tinder/smsauth/ui/view/AnimatedProgressStatusView$Mode;", "()V", "ui_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.ui.view.AnimatedProgressStatusView$a$c */
        public static final class C16790c extends C15009a {
            /* renamed from: a */
            public static final C16790c f51812a = new C16790c();

            private C16790c() {
                super();
            }
        }

        private C15009a() {
        }
    }

    /* renamed from: a */
    public View m62317a(int i) {
        if (this.f51813a == null) {
            this.f51813a = new HashMap();
        }
        View view = (View) this.f51813a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f51813a.put(Integer.valueOf(i), view);
        return view;
    }

    public AnimatedProgressStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ConstraintLayout.inflate(context, C15006e.animated_progress_status_view, this);
    }

    public /* synthetic */ AnimatedProgressStatusView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public final void setText(@Nullable String str) {
        TextView textView = (TextView) m62317a(C15005d.messageText);
        C2668g.a(textView, "messageText");
        textView.setText(str);
    }

    @Nullable
    public final String getText() {
        TextView textView = (TextView) m62317a(C15005d.messageText);
        C2668g.a(textView, "messageText");
        return textView.getText().toString();
    }

    public final void setAnimationMode(@NotNull C15009a c15009a) {
        C2668g.b(c15009a, "mode");
        m62316a(c15009a);
    }

    @NotNull
    public final C15009a getAnimationMode() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) m62317a(C15005d.animatedIcon);
        C2668g.a(appCompatImageView, "animatedIcon");
        Object tag = appCompatImageView.getTag();
        if (!(tag instanceof C15009a)) {
            tag = null;
        }
        C15009a c15009a = (C15009a) tag;
        return c15009a != null ? c15009a : C16790c.f51812a;
    }

    /* renamed from: a */
    private final void m62316a(C15009a c15009a) {
        int i;
        AppCompatImageView appCompatImageView = (AppCompatImageView) m62317a(C15005d.animatedIcon);
        if (C2668g.a(c15009a, C16790c.f51812a)) {
            i = 0;
        } else if (C2668g.a(c15009a, C16789b.f51811a)) {
            i = C15004c.animated_circular_progress_indicator;
        } else if (C2668g.a(c15009a, C16788a.f51810a)) {
            i = C15004c.animated_checkmark_progress_indicator;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i);
        appCompatImageView.setTag(c15009a);
        Drawable drawable = appCompatImageView.getDrawable();
        if (!(drawable instanceof Animatable)) {
            drawable = null;
        }
        Animatable animatable = (Animatable) drawable;
        if (animatable != null && animatable.isRunning()) {
            animatable.stop();
        }
        if (c15009a != C16790c.f51812a) {
            if (animatable != null) {
                animatable.start();
            }
        } else if (animatable != null) {
            animatable.stop();
        }
    }
}
