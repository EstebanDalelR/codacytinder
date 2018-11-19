package com.tinder.smsauth.sdk.analytics;

import com.tinder.smsauth.entity.Flow.C14974c;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "Lcom/tinder/smsauth/entity/Flow$State;", "state", "apply"}, k = 3, mv = {1, 1, 10})
final class SmsAuthAnalyticsWorker$a<T, R> implements Function<T, K> {
    /* renamed from: a */
    public static final SmsAuthAnalyticsWorker$a f51761a = new SmsAuthAnalyticsWorker$a();

    SmsAuthAnalyticsWorker$a() {
    }

    public /* synthetic */ Object apply(Object obj) {
        return m62269a((C14974c) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Class<C14974c> m62269a(@NotNull C14974c c14974c) {
        C2668g.b(c14974c, "state");
        return c14974c.getClass();
    }
}
