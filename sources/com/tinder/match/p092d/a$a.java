package com.tinder.match.p092d;

import com.tinder.ads.MessageAd;
import com.tinder.domain.match.model.MessageAdMatch;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/MessageAdMatch;", "call"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.match.d.a$a */
final class a$a<V> implements Callable<T> {
    /* renamed from: a */
    final /* synthetic */ C3942a f32631a;
    /* renamed from: b */
    final /* synthetic */ MessageAd f32632b;

    a$a(C3942a c3942a, MessageAd messageAd) {
        this.f32631a = c3942a;
        this.f32632b = messageAd;
    }

    public /* synthetic */ Object call() {
        return m40548a();
    }

    @NotNull
    /* renamed from: a */
    public final MessageAdMatch m40548a() {
        return C3942a.a(this.f32631a, this.f32632b);
    }
}
