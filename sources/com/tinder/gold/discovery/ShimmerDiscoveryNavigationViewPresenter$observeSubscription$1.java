package com.tinder.gold.discovery;

import com.tinder.domain.common.model.Subscription;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
final class ShimmerDiscoveryNavigationViewPresenter$observeSubscription$1 extends PropertyReference1 {
    /* renamed from: a */
    public static final KProperty1 f45343a = new ShimmerDiscoveryNavigationViewPresenter$observeSubscription$1();

    ShimmerDiscoveryNavigationViewPresenter$observeSubscription$1() {
    }

    public String getName() {
        return "isGold";
    }

    public KDeclarationContainer getOwner() {
        return C15825i.a(Subscription.class);
    }

    public String getSignature() {
        return "isGold()Z";
    }

    @Nullable
    public Object get(@Nullable Object obj) {
        return Boolean.valueOf(((Subscription) obj).isGold());
    }
}
