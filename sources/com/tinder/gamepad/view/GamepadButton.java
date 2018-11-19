package com.tinder.gamepad.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.tinder.api.ManagerWebServices;
import com.tinder.gamepad.C9655a.C9651a;
import com.tinder.gamepad.C9655a.C9652b;
import com.tinder.gamepad.C9655a.C9653c;
import com.tinder.gamepad.C9655a.C9654d;
import com.tinder.gamepad.model.GamepadButtonState;
import com.tinder.gamepad.view.animation.C9661a;
import com.tinder.gamepad.view.animation.C9669c;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007J\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%J\n\u0010&\u001a\u0004\u0018\u00010\u0002H\u0014J\u0015\u0010'\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u001eH\u0002J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0016H\u0002J\n\u0010.\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010/\u001a\u00020\u001eH\u0002J\b\u00100\u001a\u00020\u001eH\u0014J\u0018\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0014J\u0006\u00104\u001a\u00020\u001eJ\u0010\u00105\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014J\u0010\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000208H\u0016J\u000e\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0016H\u0002R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000@BX\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/tinder/gamepad/view/GamepadButton;", "C", "Landroid/view/View;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundPadding", "", "getBackgroundPadding", "()I", "backgroundView", "<set-?>", "content", "getContent", "()Landroid/view/View;", "setContent", "(Landroid/view/View;)V", "Landroid/view/View;", "currentButtonScale", "", "gamepadCounterAnimation", "Lcom/tinder/gamepad/view/animation/GamepadCounterAnimation;", "innerPadding", "pendingCounterAnimation", "Lcom/tinder/gamepad/view/PendingCounterAnimation;", "sizeInPixels", "animateCounter", "", "count", "", "startDelayMS", "", "bindState", "gamepadButtonState", "Lcom/tinder/gamepad/model/GamepadButtonState;", "counterView", "createContent", "(Landroid/util/AttributeSet;)Landroid/view/View;", "enableTouch", "getShrinkToNormalButtonAnimator", "Landroid/animation/AnimatorSet;", "view", "initialScale", "iconView", "initializeBackgroundProperties", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "resetScale", "setCounterText", "setEnabled", "enabled", "", "setFlooredScale", "scale", "setScale", "gamepad_release"}, k = 1, mv = {1, 1, 10})
public abstract class GamepadButton<C extends View> extends FrameLayout {
    private final int backgroundPadding = getResources().getDimensionPixelSize(C9651a.gamepad_button_stroke_width);
    private final FrameLayout backgroundView;
    @NotNull
    private C content;
    private float currentButtonScale = 1.0f;
    private C9669c gamepadCounterAnimation;
    private int innerPadding;
    private C9670b pendingCounterAnimation;
    private int sizeInPixels = getResources().getDimensionPixelSize(GamepadSize.SMALL.getDimension());

    @JvmOverloads
    public final void animateCounter(@NotNull String str) {
        animateCounter$default(this, str, 0, 2, null);
    }

    @Nullable
    protected View counterView() {
        return null;
    }

    @NotNull
    public abstract C createContent(@NotNull AttributeSet attributeSet);

    @Nullable
    protected View iconView() {
        return null;
    }

    protected void setCounterText(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.FB_PARAM_FIELD_COUNT);
    }

    public GamepadButton(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        FrameLayout.inflate(context, C9653c.gamepad_button, this);
        View findViewById = findViewById(C9652b.gamepad_button_background);
        C2668g.a(findViewById, "findViewById(R.id.gamepad_button_background)");
        this.backgroundView = (FrameLayout) findViewById;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9654d.GamepadButton);
        try {
            this.innerPadding = (int) obtainStyledAttributes.getDimension(C9654d.GamepadButton_gpb_inner_padding, 0.0f);
            this.sizeInPixels = context.getResources().getDimensionPixelSize(GamepadSize.Companion.m40065a(obtainStyledAttributes.getInt(C9654d.GamepadButton_gpb_size, GamepadSize.SMALL.getSize())).getDimension());
            initializeBackgroundProperties();
            this.content = createContent(attributeSet);
            this.content.setPadding(this.innerPadding, this.innerPadding, this.innerPadding, this.innerPadding);
            this.content.setId(getId());
            addView(this.content, (LayoutParams) new FrameLayout.LayoutParams(-2, -2, 17));
            enableTouch();
            if (VERSION.SDK_INT >= 21) {
                setOutlineProvider((ViewOutlineProvider) new ViewOutlineProvider() {
                    @TargetApi(21)
                    public void getOutline(@NotNull View view, @NotNull Outline outline) {
                        C2668g.b(view, "view");
                        C2668g.b(outline, "outline");
                        outline.setOval(0, 0, this.getWidth(), this.getHeight());
                        outline.setAlpha(0.18f);
                    }
                });
                setElevation(getResources().getDimension(C9651a.gamepad_button_elevation));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void setContent(C c) {
        this.content = c;
    }

    @NotNull
    public final C getContent() {
        return this.content;
    }

    protected final int getBackgroundPadding() {
        return this.backgroundPadding;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.content.setEnabled(z);
        z = this.pendingCounterAnimation;
        if (z) {
            animateCounter(z.m40088a(), z.m40089b());
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(this.sizeInPixels, 1073741824), MeasureSpec.makeMeasureSpec(this.sizeInPixels, 1073741824));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9669c c9669c = this.gamepadCounterAnimation;
        if (c9669c != null) {
            c9669c.m40087b();
        }
    }

    public final void setFlooredScale(float f) {
        setScale(Math.max(f, 0.75f));
    }

    public final void resetScale() {
        this.currentButtonScale = 1.0f;
        if (getScaleX() != this.currentButtonScale) {
            getShrinkToNormalButtonAnimator(this, getScaleX()).start();
        }
    }

    public final void bindState(@NotNull GamepadButtonState gamepadButtonState) {
        C2668g.b(gamepadButtonState, "gamepadButtonState");
        switch (C9660a.f32196a[gamepadButtonState.ordinal()]) {
            case 1:
                setVisibility(0);
                setEnabled(true);
                return;
            case 2:
                setVisibility(0);
                setEnabled(false);
                return;
            case 3:
                setVisibility(4);
                setEnabled(false);
                return;
            default:
                return;
        }
    }

    @JvmOverloads
    public static /* synthetic */ void animateCounter$default(GamepadButton gamepadButton, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateCounter");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        gamepadButton.animateCounter(str, j);
    }

    @JvmOverloads
    public final void animateCounter(@NotNull String str, long j) {
        C2668g.b(str, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        View iconView = iconView();
        View counterView = counterView();
        if (iconView != null) {
            if (counterView != null) {
                if (isEnabled()) {
                    this.pendingCounterAnimation = (C9670b) null;
                    setCounterText(str);
                    this.gamepadCounterAnimation = new C9669c(this.backgroundView, iconView, counterView, null, j, 8, null);
                    str = this.gamepadCounterAnimation;
                    if (str != null) {
                        str.m40086a();
                    }
                    return;
                }
                this.pendingCounterAnimation = new C9670b(str, j);
                return;
            }
        }
        throw ((Throwable) new IllegalStateException("iconView and counterView are required to perform the counter animation."));
    }

    private final void initializeBackgroundProperties() {
        setClipChildren(false);
        setClipToPadding(false);
        setBackgroundColor(0);
        setPadding(this.backgroundPadding, this.backgroundPadding, this.backgroundPadding, this.backgroundPadding);
    }

    private final void enableTouch() {
        C9661a.m40068a((View) this, 1.0f, 0.75f, 200, 200);
    }

    private final void setScale(float f) {
        this.currentButtonScale = f;
        setScaleX(f);
        setScaleY(f);
    }

    private final AnimatorSet getShrinkToNormalButtonAnimator(View view, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{f, 1.0f});
        view = ObjectAnimator.ofFloat(view, "scaleY", new float[]{f, 1.0f});
        f = new AnimatorSet();
        f.playTogether(new Animator[]{ofFloat, (Animator) view});
        f.setInterpolator((TimeInterpolator) new OvershootInterpolator(4.0f));
        f.setDuration(100);
        return f;
    }
}
