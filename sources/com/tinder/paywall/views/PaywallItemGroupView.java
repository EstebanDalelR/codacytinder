package com.tinder.paywall.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tinder.common.p077b.C2641a;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.paywall.viewmodels.C10085h;
import com.tinder.paywall.viewmodels.C10090l;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.utils.C15365p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/paywall/views/PaywallItemGroupView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "currentOffer", "Lcom/tinder/purchase/domain/model/Offer;", "getCurrentOffer", "()Lcom/tinder/purchase/domain/model/Offer;", "enabledPosition", "", "itemSelectListener", "Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "offers", "", "onItemClick", "", "v", "Landroid/view/View;", "setPaywallAttributes", "paywallItemGroupViewModel", "Lcom/tinder/paywall/viewmodels/PaywallItemGroupViewModel;", "setViewModel", "groupViewModel", "PaywallItemSelectListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PaywallItemGroupView extends LinearLayout {
    /* renamed from: a */
    private PaywallItemSelectListener f33045a;
    /* renamed from: b */
    private int f33046b;
    /* renamed from: c */
    private List<? extends C14510e> f33047c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/tinder/paywall/views/PaywallItemGroupView$PaywallItemSelectListener;", "", "onPaywallItemInFocusTap", "", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "onPaywallItemSelected", "position", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface PaywallItemSelectListener {
        void onPaywallItemInFocusTap(@Nullable C14510e c14510e);

        void onPaywallItemSelected(@Nullable C14510e c14510e, int i);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.views.PaywallItemGroupView$a */
    static final class C10098a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ PaywallItemGroupView f33044a;

        C10098a(PaywallItemGroupView paywallItemGroupView) {
            this.f33044a = paywallItemGroupView;
        }

        public final void onClick(View view) {
            PaywallItemGroupView paywallItemGroupView = this.f33044a;
            C2668g.a(view, "it");
            paywallItemGroupView.m41283a(view);
        }
    }

    public /* synthetic */ PaywallItemGroupView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public PaywallItemGroupView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f33047c = (List) new ArrayList();
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(0);
        setGravity(81);
    }

    @Nullable
    public final C14510e getCurrentOffer() {
        C14510e c14510e = null;
        if (C2641a.a(this.f33047c)) {
            return null;
        }
        int i = 1;
        if (this.f33046b > this.f33047c.size() - 1) {
            i = 0;
        }
        if (i != 0) {
            c14510e = (C14510e) this.f33047c.get(this.f33046b);
        }
        return c14510e;
    }

    public final void setViewModel(@NotNull C10085h c10085h) {
        C2668g.b(c10085h, "groupViewModel");
        setPaywallAttributes(c10085h);
        int size = c10085h.m41206c().size();
        if (size != 0) {
            removeAllViews();
            ProductType a = c10085h.m41204a();
            for (int i = 0; i < size; i++) {
                PaywallItemView tinderPlusPaywallItemView;
                Context context;
                switch (C10106d.f33067a[a.ordinal()]) {
                    case 1:
                        context = getContext();
                        C2668g.a(context, "context");
                        tinderPlusPaywallItemView = new TinderPlusPaywallItemView(C15365p.b(context));
                        break;
                    case 2:
                    case 3:
                        context = getContext();
                        C2668g.a(context, "context");
                        tinderPlusPaywallItemView = new ConsumablePaywallItemView(C15365p.b(context));
                        break;
                    case 4:
                        context = getContext();
                        C2668g.a(context, "context");
                        context = C15365p.b(context);
                        if (context == null) {
                            C2668g.a();
                        }
                        tinderPlusPaywallItemView = new GoldConsumablePaywallItemView(context, null, 2, null);
                        break;
                    case 5:
                        context = getContext();
                        C2668g.a(context, "context");
                        tinderPlusPaywallItemView = new TinderGoldPaywallItemView(C15365p.b(context));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                C14510e c14510e = (C14510e) c10085h.m41205b().get(i);
                tinderPlusPaywallItemView.bindViewModel((C10090l) c10085h.m41206c().get(i));
                if (c14510e.i()) {
                    tinderPlusPaywallItemView.setItemEnabled(false);
                    this.f33046b = i;
                }
                tinderPlusPaywallItemView.setOnClickListener(new C10098a(this));
                tinderPlusPaywallItemView.setPosition(i);
                addView((View) tinderPlusPaywallItemView, new LayoutParams(0, -2, 1.0f));
            }
        }
    }

    private final void setPaywallAttributes(C10085h c10085h) {
        this.f33045a = c10085h.m41207d();
        this.f33047c = c10085h.m41205b();
    }

    /* renamed from: a */
    private final void m41283a(View view) {
        if (view == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.paywall.views.PaywallItemView");
        }
        PaywallItemView paywallItemView = (PaywallItemView) view;
        if (paywallItemView.isActivated()) {
            view = this.f33045a;
            if (view != null) {
                view.onPaywallItemInFocusTap(getCurrentOffer());
            }
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.paywall.views.PaywallItemView");
            }
            PaywallItemView paywallItemView2 = (PaywallItemView) childAt;
            if (paywallItemView.getPosition() == i) {
                paywallItemView.setItemEnabled(true);
                this.f33046b = i;
            } else {
                paywallItemView2.setItemDisabled();
            }
        }
        PaywallItemSelectListener paywallItemSelectListener = this.f33045a;
        if (paywallItemSelectListener != null) {
            paywallItemSelectListener.onPaywallItemSelected(getCurrentOffer(), paywallItemView.getPosition());
        }
    }
}
