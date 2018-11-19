package com.tinder.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.C0432b;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.utils.CustomFont;
import com.tinder.utils.av;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\r\u0010\u001d\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\u0018H\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u000fH\u0016J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\u0005J\u0015\u0010$\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020%H\u0000¢\u0006\u0002\b&J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u000fH\u0016J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u000fH\u0002J\u000e\u0010.\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u000fJ\u0010\u0010/\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/tinder/views/SuperlikeCounterView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "drawableEnabled", "", "drawableDisabled", "(Landroid/content/Context;II)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "count", "counterText", "Lcom/tinder/views/CustomTextView;", "defaultAlpha", "", "defaultTextSize", "disabledDrawable", "Landroid/graphics/drawable/Drawable;", "enabledDrawable", "endColor", "smallerTextSize", "startColor", "superlikeIcon", "Landroid/widget/ImageView;", "superlikeText", "textSize", "applyAttributes", "", "counterView", "counterView$Tinder_release", "iconView", "iconView$Tinder_release", "setAlpha", "alpha", "setCount", "setCounterText", "", "setCounterText$Tinder_release", "setEnabled", "enabled", "", "setRotationY", "translationY", "setTextRotationY", "rotY", "setTextSize", "updateDrawable", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SuperlikeCounterView extends FrameLayout {
    /* renamed from: a */
    private final float f47842a;
    /* renamed from: b */
    private final float f47843b;
    /* renamed from: c */
    private ImageView f47844c;
    /* renamed from: d */
    private CustomTextView f47845d;
    /* renamed from: e */
    private CustomTextView f47846e;
    /* renamed from: f */
    private float f47847f;
    /* renamed from: g */
    private float f47848g;
    /* renamed from: h */
    private int f47849h;
    /* renamed from: i */
    private Drawable f47850i;
    /* renamed from: j */
    private Drawable f47851j;
    /* renamed from: k */
    private int f47852k;
    /* renamed from: l */
    private int f47853l;

    public SuperlikeCounterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f47842a = getResources().getDimension(R.dimen.text_xxxs);
        this.f47843b = getResources().getDimension(R.dimen.text_xxxxs);
        this.f47850i = C0432b.a(context, R.drawable.superlike_alc_dialog_fg);
        this.f47851j = C0432b.a(context, R.drawable.superlike_alc_dialog_fg_disabled);
        this.f47852k = C0432b.c(context, R.color.superlike_gradient_start);
        this.f47853l = C0432b.c(context, R.color.superlike_gradient_end);
        LayoutInflater.from(context).inflate(R.layout.view_superlike_counter, this);
        View findViewById = findViewById(R.id.sl_icon);
        C2668g.a(findViewById, "findViewById(R.id.sl_icon)");
        this.f47844c = (ImageView) findViewById;
        findViewById = findViewById(R.id.sl_text);
        C2668g.a(findViewById, "findViewById(R.id.sl_text)");
        this.f47845d = (CustomTextView) findViewById;
        findViewById = findViewById(R.id.sl_count_text);
        C2668g.a(findViewById, "findViewById(R.id.sl_count_text)");
        this.f47846e = (CustomTextView) findViewById;
        setClipChildren(false);
        setClipToPadding(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6249b.com_tinder_views_SuperlikeCounterView, 0, 0);
            try {
                this.f47847f = obtainStyledAttributes.getFloat(1, 1.0f);
                this.f47849h = obtainStyledAttributes.getInteger(0, 5);
                this.f47848g = obtainStyledAttributes.getDimension(2, this.f47842a);
                if (!isInEditMode()) {
                    av.a(this.f47845d, context, CustomFont.m57581a(context, attributeSet));
                }
                obtainStyledAttributes.recycle();
                m57932c();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
            }
        }
        setEnabled(true);
    }

    public /* synthetic */ SuperlikeCounterView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public SuperlikeCounterView(@NotNull Context context, @DrawableRes int i, @DrawableRes int i2) {
        C2668g.b(context, "context");
        this(context, null);
        this.f47850i = C0432b.a(context, i);
        this.f47851j = C0432b.a(context, i2);
        m57931a(isEnabled());
    }

    public void setAlpha(float f) {
        this.f47845d.setAlpha(f);
    }

    public void setRotationY(float f) {
        super.setRotationY(f);
        setTextRotationY(f);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        m57931a(z);
        this.f47845d.setEnabled(z);
    }

    public final void setCount(int i) {
        String str;
        CustomTextView customTextView = this.f47845d;
        if (i > 99) {
            str = "99+";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(i);
            str = stringBuilder.toString();
        }
        customTextView.setText(str);
        setTextSize(i > 99 ? this.f47843b : this.f47842a);
    }

    @NotNull
    /* renamed from: a */
    public final CustomTextView m57933a() {
        return this.f47846e;
    }

    @NotNull
    /* renamed from: b */
    public final ImageView m57934b() {
        return this.f47844c;
    }

    public final void setCounterText$Tinder_release(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.FB_PARAM_FIELD_COUNT);
        this.f47846e.setText(str);
        String linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, (float) this.f47846e.getHeight(), new int[]{this.f47852k, this.f47853l}, null, TileMode.CLAMP);
        TextPaint paint = this.f47846e.getPaint();
        C2668g.a(paint, "counterText.paint");
        paint.setShader((Shader) linearGradient);
    }

    /* renamed from: c */
    private final void m57932c() {
        setTextSize(this.f47848g);
        setAlpha(this.f47847f);
        setCount(this.f47849h);
    }

    private final void setTextRotationY(float f) {
        this.f47845d.setRotationY(f);
    }

    public final void setTextSize(float f) {
        this.f47845d.setTextSize(0, f);
    }

    /* renamed from: a */
    private final void m57931a(boolean z) {
        this.f47844c.setImageDrawable(z ? this.f47850i : this.f47851j);
    }
}
