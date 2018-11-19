package com.tinder.smsauth.sdk.analytics;

import com.tinder.common.logger.Logger;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class SmsAuthAnalyticsWorker$c<T> implements Consumer<Throwable> {
    /* renamed from: a */
    final /* synthetic */ SmsAuthAnalyticsWorker f51763a;

    SmsAuthAnalyticsWorker$c(SmsAuthAnalyticsWorker smsAuthAnalyticsWorker) {
        this.f51763a = smsAuthAnalyticsWorker;
    }

    public /* synthetic */ void accept(Object obj) {
        m62271a((Throwable) obj);
    }

    /* renamed from: a */
    public final void m62271a(Throwable th) {
        Logger b = SmsAuthAnalyticsWorker.b(this.f51763a);
        C2668g.a(th, "error");
        b.error(th, "Error observing state");
    }
}
