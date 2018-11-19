package com.tinder.purchase.logging;

import com.tinder.api.model.purchase.PurchaseLog.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ2\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\f\u001a\u00020\u0004H&¨\u0006\r"}, d2 = {"Lcom/tinder/purchase/logging/PurchaseLogger;", "", "()V", "logError", "", "source", "Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "throwable", "", "productId", "", "receiptId", "startLogging", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.logging.a */
public abstract class C14522a {
    /* renamed from: a */
    public abstract void mo11892a();

    /* renamed from: a */
    public abstract void mo11893a(@NotNull Source source, @NotNull Throwable th, @Nullable String str, @Nullable String str2);

    /* renamed from: a */
    public final void m55476a(@NotNull Source source, @NotNull Throwable th) {
        C2668g.b(source, "source");
        C2668g.b(th, "throwable");
        mo11893a(source, th, null, null);
    }

    /* renamed from: a */
    public final void m55478a(@NotNull Throwable th) {
        C2668g.b(th, "throwable");
        mo11893a(Source.OTHER, th, null, null);
    }
}
