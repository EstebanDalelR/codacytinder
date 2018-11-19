package com.tinder.intropricing.paywall.view.info;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.api.ManagerWebServices;
import com.tinder.intropricing.C9728a.C9723c;
import com.tinder.intropricing.C9728a.C9724d;
import com.tinder.intropricing.paywall.p266b.C11889e;
import com.tinder.paywall.view.itemsgroup.Bindable;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/intropricing/paywall/view/info/IntroPricingPerkView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/paywall/view/itemsgroup/Bindable;", "Lcom/tinder/intropricing/paywall/viewmodels/IntroPricingPerkViewModel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "perk", "Landroid/widget/TextView;", "bind", "", "data", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
public final class IntroPricingPerkView extends LinearLayout implements Bindable<C11889e> {
    /* renamed from: a */
    private final TextView f38759a;

    public /* synthetic */ void bind(Object obj) {
        m47880a((C11889e) obj);
    }

    public /* synthetic */ IntroPricingPerkView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public IntroPricingPerkView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        LinearLayout.inflate(context, C9724d.view_intro_pricing_perk, this);
        setOrientation(null);
        context = findViewById(C9723c.intro_pricing_perk);
        C2668g.a(context, "findViewById(R.id.intro_pricing_perk)");
        this.f38759a = (TextView) context;
    }

    /* renamed from: a */
    public void m47880a(@NotNull C11889e c11889e) {
        C2668g.b(c11889e, ManagerWebServices.FB_DATA);
        this.f38759a.setText(c11889e.m47870a());
    }
}
