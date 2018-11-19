package com.tinder.paywall.paywallflow;

import android.app.Activity;
import com.tinder.paywall.legacy.LegacyPaywallLauncher;
import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.PaywallTypeSource;
import java.util.List;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jf\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/tinder/paywall/paywallflow/TinderLegacyPaywallLauncher;", "Lcom/tinder/paywall/legacy/LegacyPaywallLauncher;", "()V", "launchPaywall", "", "source", "Lcom/tinder/paywall/legacy/PaywallTypeSource;", "activity", "Landroid/app/Activity;", "animationStartListener", "Lkotlin/Function0;", "dismissListener", "successListener", "failureListener", "imageUrls", "", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ab implements LegacyPaywallLauncher {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/paywall/paywallflow/TinderLegacyPaywallLauncher$launchPaywall$1$1", "Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "(Lcom/tinder/paywall/paywallflow/TinderLegacyPaywallLauncher$launchPaywall$1;)V", "handleSuccess", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.paywallflow.ab$a */
    public static final class C12269a implements PaywallFlowSuccessListener {
        /* renamed from: a */
        final /* synthetic */ C10076o f39691a;
        /* renamed from: b */
        final /* synthetic */ Function0 f39692b;

        C12269a(C10076o c10076o, Function0 function0) {
            this.f39691a = c10076o;
            this.f39692b = function0;
        }

        public void handleSuccess() {
            this.f39692b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/paywall/paywallflow/TinderLegacyPaywallLauncher$launchPaywall$2$1", "Lcom/tinder/paywall/legacy/PaywallFlowFailureListener;", "(Lcom/tinder/paywall/paywallflow/TinderLegacyPaywallLauncher$launchPaywall$2;)V", "handleFailure", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.paywallflow.ab$b */
    public static final class C12270b implements PaywallFlowFailureListener {
        /* renamed from: a */
        final /* synthetic */ C10076o f39693a;
        /* renamed from: b */
        final /* synthetic */ Function0 f39694b;

        C12270b(C10076o c10076o, Function0 function0) {
            this.f39693a = c10076o;
            this.f39694b = function0;
        }

        public void handleFailure() {
            this.f39694b.invoke();
        }
    }

    public void launchPaywall(@NotNull PaywallTypeSource paywallTypeSource, @NotNull Activity activity, @Nullable Function0<C15813i> function0, @Nullable Function0<C15813i> function02, @Nullable Function0<C15813i> function03, @Nullable Function0<C15813i> function04, @NotNull List<String> list) {
        C2668g.b(paywallTypeSource, "source");
        C2668g.b(activity, "activity");
        C2668g.b(list, "imageUrls");
        paywallTypeSource = C10076o.m41167a(paywallTypeSource);
        if (function03 != null) {
            paywallTypeSource.m41170a((PaywallFlowSuccessListener) new C12269a(paywallTypeSource, function03));
        }
        if (function04 != null) {
            paywallTypeSource.m41169a((PaywallFlowFailureListener) new C12270b(paywallTypeSource, function04));
        }
        if (function0 != null) {
            paywallTypeSource.m41173a((Function0) function0);
        }
        if (function02 != null) {
            paywallTypeSource.m41177b((Function0) function02);
        }
        paywallTypeSource.m41176b((List) list);
        paywallTypeSource.m41174a(activity);
    }
}
