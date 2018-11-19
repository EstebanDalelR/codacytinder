package com.tinder.typingindicator.p440f;

import com.google.protobuf.Timestamp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"Lcom/tinder/typingindicator/mapperfunctions/TimestampToDateTime;", "Lkotlin/Function1;", "Lcom/google/protobuf/Timestamp;", "Lorg/joda/time/DateTime;", "()V", "invoke", "timestamp", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.f.e */
public final class C18252e implements Function1<Timestamp, DateTime> {
    public /* synthetic */ Object invoke(Object obj) {
        return m66140a((Timestamp) obj);
    }

    @NotNull
    /* renamed from: a */
    public DateTime m66140a(@NotNull Timestamp timestamp) {
        C2668g.b(timestamp, "timestamp");
        return new DateTime(TimeUnit.SECONDS.toMillis(timestamp.getSeconds()) + TimeUnit.NANOSECONDS.toMillis((long) timestamp.getNanos()));
    }
}
