package com.tinder.toppicks.dialog;

import android.content.Context;
import android.view.View;
import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.paywall.legacy.TopPicksPaywallViewFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/tinder/toppicks/dialog/TinderTopPicksPaywallViewFactory;", "Lcom/tinder/paywall/legacy/TopPicksPaywallViewFactory;", "()V", "create", "Landroid/view/View;", "context", "Landroid/content/Context;", "topPicksPaywallSource", "Lcom/tinder/paywall/legacy/TopPicksPaywallSource;", "successListener", "Lcom/tinder/paywall/legacy/PaywallFlowSuccessListener;", "failureListener", "Lcom/tinder/paywall/legacy/PaywallFlowFailureListener;", "paywallListener", "Lcom/tinder/paywall/legacy/ListenerPaywall;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.dialog.a */
public final class C16996a implements TopPicksPaywallViewFactory {
    @NotNull
    public View create(@NotNull Context context, @NotNull TopPicksPaywallSource topPicksPaywallSource, @Nullable PaywallFlowSuccessListener paywallFlowSuccessListener, @Nullable PaywallFlowFailureListener paywallFlowFailureListener, @Nullable ListenerPaywall listenerPaywall) {
        C2668g.b(context, "context");
        C2668g.b(topPicksPaywallSource, "topPicksPaywallSource");
        TopPicksPaywallView topPicksPaywallView = new TopPicksPaywallView(context, null, 2, null);
        topPicksPaywallView.setPaywallFlowSuccessListener(paywallFlowSuccessListener);
        topPicksPaywallView.setPaywallFlowFailureListener(paywallFlowFailureListener);
        topPicksPaywallView.setPaywallListener(listenerPaywall);
        topPicksPaywallView.setSource(topPicksPaywallSource);
        return topPicksPaywallView;
    }
}
