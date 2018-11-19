package com.tinder.paywall.p304b;

import com.tinder.domain.fastmatch.model.FastMatchStatus;
import com.tinder.paywall.viewmodels.C10093o;
import com.tinder.paywall.viewmodels.PaywallPerk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J6\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J0\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/tinder/paywall/perks/PaywallPerkViewModelAdapter;", "", "viewModelFactory", "Lcom/tinder/paywall/perks/PaywallPerkViewModelFactory;", "(Lcom/tinder/paywall/perks/PaywallPerkViewModelFactory;)V", "getViewModelFactory", "()Lcom/tinder/paywall/perks/PaywallPerkViewModelFactory;", "createPerksList", "", "Lcom/tinder/paywall/viewmodels/PaywallPerkViewModel;", "perkOrder", "", "fastMatchStatus", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "imageUrls", "getPerkViewModel", "perkName", "Lcom/tinder/paywall/viewmodels/PaywallPerk;", "isFirstPerk", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.b.a */
public final class C10047a {
    @NotNull
    /* renamed from: a */
    private final C10049c f32941a;

    @NotNull
    @JvmOverloads
    /* renamed from: a */
    public final List<C10093o> m41101a(@NotNull List<String> list) {
        return C10047a.m41100a(this, list, null, null, 6, null);
    }

    @Inject
    public C10047a(@NotNull C10049c c10049c) {
        C2668g.b(c10049c, "viewModelFactory");
        this.f32941a = c10049c;
    }

    @NotNull
    @JvmOverloads
    /* renamed from: a */
    public static /* synthetic */ List m41100a(C10047a c10047a, List list, FastMatchStatus fastMatchStatus, List list2, int i, Object obj) {
        if ((i & 2) != null) {
            FastMatchStatus fastMatchStatus2 = new FastMatchStatus(0, false, null, 0, null, 31, null);
        }
        if ((i & 4) != 0) {
            list2 = C19301m.a();
        }
        return c10047a.m41102a(list, fastMatchStatus, list2);
    }

    @NotNull
    @JvmOverloads
    /* renamed from: a */
    public final List<C10093o> m41102a(@NotNull List<String> list, @NotNull FastMatchStatus fastMatchStatus, @NotNull List<String> list2) {
        C2668g.b(list, "perkOrder");
        C2668g.b(fastMatchStatus, "fastMatchStatus");
        C2668g.b(list2, "imageUrls");
        Iterable<String> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        int i = 0;
        for (String a : iterable) {
            int i2 = i + 1;
            arrayList.add(m41099a(PaywallPerk.Companion.m41198a(a), fastMatchStatus, list2, i == 0));
            i = i2;
        }
        return C19301m.h((List) arrayList);
    }

    /* renamed from: a */
    private final C10093o m41099a(PaywallPerk paywallPerk, FastMatchStatus fastMatchStatus, List<String> list, boolean z) {
        switch (C10048b.f32942a[paywallPerk.ordinal()]) {
            case 1:
                paywallPerk = this.f32941a.m41107b();
                break;
            case 2:
                if ((list.isEmpty() ^ 1) == null || !z) {
                    paywallPerk = this.f32941a.m41103a();
                } else {
                    paywallPerk = this.f32941a.m41105a((String) list.get(0));
                }
                return paywallPerk;
            case 3:
                paywallPerk = this.f32941a.m41109c();
                break;
            case 4:
                paywallPerk = this.f32941a.m41110d();
                break;
            case 5:
                if ((list.isEmpty() ^ 1) == null || !z) {
                    paywallPerk = this.f32941a.m41111e();
                } else {
                    paywallPerk = this.f32941a.m41108b((String) list.get(0));
                }
                return paywallPerk;
            case 6:
                paywallPerk = this.f32941a.m41112f();
                break;
            case 7:
                paywallPerk = this.f32941a.m41113g();
                break;
            case 8:
                paywallPerk = this.f32941a.m41114h();
                break;
            case 9:
                paywallPerk = this.f32941a.m41115i();
                break;
            case 10:
                paywallPerk = this.f32941a.m41104a(fastMatchStatus);
                break;
            case 11:
                paywallPerk = this.f32941a.m41106a((List) list);
                break;
            case 12:
                paywallPerk = this.f32941a.m41116j();
                break;
            default:
                paywallPerk = null;
                break;
        }
        return paywallPerk;
    }
}
