package com.tinder.superlikeable.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tinder.superlikeable.C15088a.C15085c;
import com.tinder.superlikeable.C15088a.C15086d;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fR$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R&\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\r¨\u0006 "}, d2 = {"Lcom/tinder/superlikeable/view/BackgroundScalingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "superLikeCount", "getSuperLikeCount", "()I", "setSuperLikeCount", "(I)V", "superLikeCounterView", "Landroid/widget/TextView;", "", "superLikeCounterViewAlpha", "getSuperLikeCounterViewAlpha", "()F", "setSuperLikeCounterViewAlpha", "(F)V", "superLikeCounterViewRotationY", "getSuperLikeCounterViewRotationY", "setSuperLikeCounterViewRotationY", "superLikeCounterViewVisibility", "getSuperLikeCounterViewVisibility", "setSuperLikeCounterViewVisibility", "inflateCounterView", "", "layoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public final class BackgroundScalingView extends FrameLayout {
    /* renamed from: a */
    private TextView f47143a;
    /* renamed from: b */
    private int f47144b;
    /* renamed from: c */
    private int f47145c;
    /* renamed from: d */
    private float f47146d;
    /* renamed from: e */
    private float f47147e;

    public /* synthetic */ BackgroundScalingView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public BackgroundScalingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f47145c = 8;
        this.f47147e = 1.0f;
    }

    public final int getSuperLikeCount() {
        return this.f47144b;
    }

    public final void setSuperLikeCount(int i) {
        this.f47144b = i;
        TextView textView = this.f47143a;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    public final int getSuperLikeCounterViewVisibility() {
        TextView textView = this.f47143a;
        return textView != null ? textView.getVisibility() : this.f47145c;
    }

    public final void setSuperLikeCounterViewVisibility(int i) {
        this.f47145c = i;
        TextView textView = this.f47143a;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    public final float getSuperLikeCounterViewRotationY() {
        TextView textView = this.f47143a;
        return textView != null ? textView.getRotationY() : this.f47146d;
    }

    public final void setSuperLikeCounterViewRotationY(float f) {
        this.f47146d = f;
        TextView textView = this.f47143a;
        if (textView != null) {
            textView.setRotationY(f);
        }
    }

    public final float getSuperLikeCounterViewAlpha() {
        TextView textView = this.f47143a;
        return textView != null ? textView.getAlpha() : this.f47147e;
    }

    public final void setSuperLikeCounterViewAlpha(float f) {
        this.f47147e = f;
        TextView textView = this.f47143a;
        if (textView != null) {
            textView.setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void m57011a(@NotNull LayoutParams layoutParams) {
        C2668g.b(layoutParams, "layoutParams");
        TextView textView = (TextView) View.inflate(getContext(), C15086d.view_superlikeable_superlike_counter, this).findViewById(C15085c.superlikeable_superlike_count);
        C2668g.a(textView, "superLikeCounterView");
        textView.setLayoutParams(layoutParams);
        textView.setText(String.valueOf(this.f47144b));
        textView.setVisibility(getSuperLikeCounterViewVisibility());
        textView.setRotationY(getSuperLikeCounterViewRotationY());
        textView.setAlpha(getSuperLikeCounterViewAlpha());
        this.f47143a = textView;
    }
}
