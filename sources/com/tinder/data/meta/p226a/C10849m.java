package com.tinder.data.meta.p226a;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Purchase;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.common.model.Subscription.Platform;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/tinder/data/meta/adapter/SubscriptionAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/common/model/Subscription;", "", "Lcom/tinder/api/model/profile/Purchase;", "()V", "domainPlatformFromApiPlatform", "Lcom/tinder/domain/common/model/Subscription$Platform;", "platform", "Lcom/tinder/api/model/profile/Purchase$Platform;", "fromApi", "purchases", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.meta.a.m */
public final class C10849m extends C2646o<Subscription, List<? extends Purchase>> {
    @Deprecated
    /* renamed from: a */
    public static final C8699a f35470a = new C8699a();
    /* renamed from: b */
    private static final Subscription f35471b = new Subscription("", false, false, null, 8, null);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/meta/adapter/SubscriptionAdapter$Companion;", "", "()V", "REGULAR", "Lcom/tinder/domain/common/model/Subscription;", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.meta.a.m$a */
    private static final class C8699a {
        private C8699a() {
        }
    }

    /* renamed from: a */
    public /* synthetic */ Object m43326a(Object obj) {
        return m43327b((List) obj);
    }

    @NotNull
    /* renamed from: b */
    public Subscription m43327b(@NotNull List<? extends Purchase> list) {
        C2668g.b(list, ManagerWebServices.PARAM_PURCHASES);
        if (list.isEmpty()) {
            return f35471b;
        }
        String str = "";
        Platform platform = Platform.ANDROID;
        Object obj = null;
        Platform platform2 = platform;
        boolean z = false;
        boolean z2 = false;
        for (Purchase purchase : list) {
            boolean a = C2668g.a(purchase.productType(), Subscription.GOLD);
            Platform a2 = m43325a(purchase.platform());
            if (a) {
                str = purchase.productId();
                C2668g.a(str, "purchase.productId()");
                return new Subscription(str, a, true, a2);
            }
            if (!z) {
                boolean a3 = C2668g.a(purchase.productType(), "plus");
                String productId = purchase.productId();
                C2668g.a(productId, "purchase.productId()");
                String str2 = productId;
                z = a3;
                str = str2;
            }
            z2 = a;
            platform2 = a2;
        }
        if (str.length() == null) {
            obj = 1;
        }
        if (obj != null) {
            return f35471b;
        }
        return new Subscription(str, z2, z, platform2);
    }

    /* renamed from: a */
    private final Platform m43325a(Purchase.Platform platform) {
        if (platform == null) {
            return Platform.ANDROID;
        }
        if (platform != null) {
            switch (C8700n.f30652a[platform.ordinal()]) {
                case 1:
                    return Platform.ANDROID;
                case 2:
                    return Platform.IOS;
                case 3:
                    return Platform.TEST;
                case 4:
                    return Platform.WEB;
                default:
                    break;
            }
        }
        throw new NoWhenBranchMatchedException();
    }
}
