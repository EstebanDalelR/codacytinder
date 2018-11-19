package com.tinder.fastmatch.p355a;

import android.support.v4.content.res.C0441a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.view.SafeViewFlipper;
import com.tinder.paywall.p304b.C12265d;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.C12288d;
import com.tinder.paywall.viewmodels.C12289e;
import com.tinder.paywall.viewmodels.C12290f;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.paywall.views.TopPicksPaywallTeaserView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u001bH\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/fastmatch/adapter/TinderGoldPaywallPerksAdapter;", "Lcom/tinder/paywall/perks/PaywallPerksAdapter;", "perkViewModels", "", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "showFastMatchPreview", "", "(Ljava/util/List;Z)V", "fastMatchStatusProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "getFastMatchStatusProvider", "()Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;", "setFastMatchStatusProvider", "(Lcom/tinder/domain/fastmatch/provider/FastMatchStatusProvider;)V", "instantiateIconBackgroundItem", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "viewModel", "Lcom/tinder/paywall/viewmodels/IconWithBackgroundPaywallPerkViewModel;", "instantiateIconViewItem", "Lcom/tinder/paywall/viewmodels/IconPaywallPerkViewModel;", "position", "", "instantiateItem", "", "instantiatePerkWithImages", "Lcom/tinder/paywall/viewmodels/ImagePaywallPerkViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.a.a */
public final class C13182a extends C12265d {
    /* renamed from: f */
    private final boolean f41873f;

    public C13182a(@NotNull List<? extends C10093o> list, boolean z) {
        C2668g.b(list, "perkViewModels");
        super(list);
        this.f41873f = z;
        this.d = C0441a.b(this.a, R.color.title_gray, null);
        this.e = C0441a.b(this.a, R.color.title_gray, null);
    }

    @NotNull
    public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
        C2668g.b(viewGroup, "container");
        C10093o a = m48462a(i);
        if (a instanceof C12289e) {
            return m51129a(viewGroup, (C12289e) a);
        }
        if (a instanceof C12290f) {
            return m51130a(viewGroup, (C12290f) a);
        }
        if (a instanceof C12288d) {
            return m51128a(viewGroup, (C12288d) a, i);
        }
        throw ((Throwable) new IllegalArgumentException("Unrecognized paywall view model types are not allowed"));
    }

    /* renamed from: a */
    private final View m51128a(ViewGroup viewGroup, C12288d c12288d, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.paywall_perk, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.paywall_perk_image);
        TextView textView = (TextView) inflate.findViewById(R.id.paywall_perk_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.paywall_perk_byline);
        textView.setTextColor(this.d);
        textView2.setTextColor(this.e);
        C2668g.a(textView, ManagerWebServices.PARAM_JOB_TITLE);
        textView.setText(c12288d.mo10768c());
        C2668g.a(imageView, ManagerWebServices.IG_PARAM_IMAGE);
        imageView.setContentDescription(c12288d.mo10769d());
        imageView.setImageResource(c12288d.m48536b());
        imageView.setBackgroundResource(R.drawable.paywall_perk_gold_pedestal);
        if ((((CharSequence) c12288d.mo10769d()).length() == 0 ? 1 : null) == null) {
            C2668g.a(textView2, "byline");
            textView2.setText(c12288d.mo10769d());
            textView2.setVisibility(0);
        } else {
            C2668g.a(textView2, "byline");
            textView2.setVisibility(8);
        }
        m48464a(inflate, i);
        m48463a(inflate);
        viewGroup.addView(inflate);
        C2668g.a(inflate, "view");
        return inflate;
    }

    /* renamed from: a */
    private final View m51129a(ViewGroup viewGroup, C12289e c12289e) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.paywall_perk_fast_match, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.paywall_perk_image_foreground);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.paywall_perk_image_background);
        SafeViewFlipper safeViewFlipper = (SafeViewFlipper) inflate.findViewById(R.id.paywall_perk_image);
        TextView textView = (TextView) inflate.findViewById(R.id.paywall_perk_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.paywall_perk_byline);
        textView.setTextColor(this.d);
        textView2.setTextColor(this.e);
        C2668g.a(textView, ManagerWebServices.PARAM_JOB_TITLE);
        textView.setText(c12289e.mo10768c());
        int i = 1;
        if (this.f41873f && c12289e.mo10767a() == PaywallPerk.FAST_MATCH) {
            safeViewFlipper.setDisplayedChild(0);
        } else {
            safeViewFlipper.setDisplayedChild(1);
        }
        if (c12289e.mo10769d().length() != 0) {
            i = 0;
        }
        if (i == 0) {
            C2668g.a(textView2, "byline");
            textView2.setText(c12289e.mo10769d());
            textView2.setVisibility(0);
        } else {
            C2668g.a(textView2, "byline");
            textView2.setVisibility(8);
        }
        imageView.setImageResource(c12289e.m48541b());
        imageView2.setImageResource(c12289e.m48545f());
        viewGroup.addView(inflate);
        C2668g.a(inflate, "view");
        return inflate;
    }

    /* renamed from: a */
    private final View m51130a(ViewGroup viewGroup, C12290f c12290f) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.top_picks_paywall_view, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.paywall_perk_image);
        C2668g.a(findViewById, "view.findViewById(R.id.paywall_perk_image)");
        TopPicksPaywallTeaserView topPicksPaywallTeaserView = (TopPicksPaywallTeaserView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.paywall_perk_title);
        C2668g.a(findViewById2, "view.findViewById(R.id.paywall_perk_title)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.paywall_perk_byline);
        C2668g.a(findViewById3, "view.findViewById(R.id.paywall_perk_byline)");
        TextView textView2 = (TextView) findViewById3;
        topPicksPaywallTeaserView.m41297a(c12290f.m48547b());
        textView.setText(c12290f.mo10768c());
        textView2.setText(c12290f.mo10769d());
        textView.setTextColor(this.d);
        textView2.setTextColor(this.e);
        viewGroup.addView(inflate);
        C2668g.a(inflate, "view");
        return inflate;
    }
}
