package com.tinder.paywall.legacy;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH&¨\u0006\u000e"}, d2 = {"Lcom/tinder/paywall/legacy/TopPicksPaywallViewFactory;", "", "create", "Landroid/view/View;", "context", "Landroid/content/Context;", "topPicksPaywallSource", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "successListener", "Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "failureListener", "Lcom/tinder/paywall/legacy/PaywallFlowFailureListener;", "paywallListener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "paywall_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksPaywallViewFactory {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.paywall.legacy.TopPicksPaywallViewFactory$a */
    public static final class C10064a {
        @NotNull
        /* renamed from: a */
        public static /* synthetic */ View m41132a(TopPicksPaywallViewFactory topPicksPaywallViewFactory, Context context, TopPicksPaywallSource topPicksPaywallSource, PaywallFlowSuccessListener paywallFlowSuccessListener, PaywallFlowFailureListener paywallFlowFailureListener, ListenerPaywall listenerPaywall, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 4) != null) {
                paywallFlowSuccessListener = null;
            }
            PaywallFlowSuccessListener paywallFlowSuccessListener2 = paywallFlowSuccessListener;
            if ((i & 8) != null) {
                paywallFlowFailureListener = null;
            }
            PaywallFlowFailureListener paywallFlowFailureListener2 = paywallFlowFailureListener;
            if ((i & 16) != null) {
                listenerPaywall = null;
            }
            return topPicksPaywallViewFactory.create(context, topPicksPaywallSource, paywallFlowSuccessListener2, paywallFlowFailureListener2, listenerPaywall);
        }
    }

    @NotNull
    View create(@NotNull Context context, @NotNull TopPicksPaywallSource topPicksPaywallSource, @Nullable PaywallFlowSuccessListener paywallFlowSuccessListener, @Nullable PaywallFlowFailureListener paywallFlowFailureListener, @Nullable ListenerPaywall listenerPaywall);
}
