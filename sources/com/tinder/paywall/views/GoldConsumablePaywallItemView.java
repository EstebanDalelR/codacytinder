package com.tinder.paywall.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.paywall.viewmodels.C10090l;
import com.tinder.shimmy.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000fH\u0014J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/paywall/views/GoldConsumablePaywallItemView;", "Lcom/tinder/paywall/views/ConsumablePaywallItemView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "enabledBackground", "Landroid/view/View;", "shadowSavePercentage", "Landroid/widget/TextView;", "shimmerContainer", "shimmerView", "Lcom/tinder/shimmy/ShimmerFrameLayout;", "bindViewModel", "", "viewModel", "Lcom/tinder/paywall/viewmodels/PaywallItemViewModel;", "getLayoutRes", "", "mainContainerIsTransparent", "", "onSelectAnimationFinished", "setItemDisabled", "setItemEnabled", "shouldAnimate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class GoldConsumablePaywallItemView extends ConsumablePaywallItemView {
    /* renamed from: c */
    private final ShimmerFrameLayout f43280c;
    /* renamed from: d */
    private final View f43281d;
    /* renamed from: e */
    private final TextView f43282e;
    /* renamed from: f */
    private final View f43283f;

    /* renamed from: a */
    protected boolean mo11286a() {
        return true;
    }

    protected int getLayoutRes() {
        return R.layout.gold_consumable_paywall_item;
    }

    public /* synthetic */ GoldConsumablePaywallItemView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public GoldConsumablePaywallItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        context = findViewById(R.id.shimmer_view);
        C2668g.a(context, "findViewById(R.id.shimmer_view)");
        this.f43280c = (ShimmerFrameLayout) context;
        context = findViewById(R.id.paywall_item_shimmer_container_content);
        C2668g.a(context, "findViewById(R.id.paywal…himmer_container_content)");
        this.f43281d = context;
        context = findViewById(R.id.shadow_save_percentage);
        C2668g.a(context, "findViewById(R.id.shadow_save_percentage)");
        this.f43282e = (TextView) context;
        context = findViewById(R.id.background_enabled);
        C2668g.a(context, "findViewById(R.id.background_enabled)");
        this.f43283f = context;
    }

    public void bindViewModel(@NotNull C10090l c10090l) {
        C2668g.b(c10090l, "viewModel");
        super.bindViewModel(c10090l);
        this.f43282e.setText(getContext().getString(R.string.paywall_save_string, new Object[]{c10090l.m41250f()}));
        c10090l = this.mSavePercentText;
        C2668g.a(c10090l, "mSavePercentText");
        c10090l.setBackground((Drawable) null);
        setItemDisabled();
    }

    public void setItemEnabled(boolean z) {
        View view = this.f43283f;
        Integer j = this.b.mo10762j();
        C2668g.a(j, "uiElements.enabledBackgroundColor()");
        view.setBackgroundColor(j.intValue());
        if (!z) {
            this.f43280c.setEnabled(true);
        }
        if (this.a.m41253i()) {
            this.f43281d.setBackground(this.b.mo10753a());
        } else {
            TextView textView = this.mSavePercentText;
            C2668g.a(textView, "mSavePercentText");
            textView.setVisibility(0);
            this.f43282e.setVisibility(0);
            this.f43281d.setBackground(this.b.mo10754b());
        }
        super.setItemEnabled(z);
    }

    public void setItemDisabled() {
        super.setItemDisabled();
        this.f43280c.setEnabled(false);
        View view = this.mMainContainer;
        Integer f = this.b.mo10758f();
        C2668g.a(f, "uiElements.disabledBackgroundColor()");
        view.setBackgroundColor(f.intValue());
        this.f43281d.setBackground(this.b.mo10755c());
        this.f43282e.setVisibility(8);
    }

    /* renamed from: b */
    protected void mo11287b() {
        super.mo11287b();
        this.f43280c.setEnabled(true);
    }
}
