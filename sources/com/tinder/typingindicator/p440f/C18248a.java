package com.tinder.typingindicator.p440f;

import com.google.protobuf.Timestamp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"Lcom/tinder/typingindicator/mapperfunctions/DateTimeToTimestamp;", "Lkotlin/Function1;", "Lorg/joda/time/DateTime;", "Lcom/google/protobuf/Timestamp;", "()V", "invoke", "dateTime", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.f.a */
public final class C18248a implements Function1<DateTime, Timestamp> {
    public /* synthetic */ Object invoke(Object obj) {
        return m66132a((DateTime) obj);
    }

    @NotNull
    /* renamed from: a */
    public Timestamp m66132a(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "dateTime");
        long millis = dateTime.getMillis();
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(millis);
        dateTime = Timestamp.newBuilder().setSeconds(toSeconds).setNanos((int) TimeUnit.MILLISECONDS.toNanos(millis - TimeUnit.SECONDS.toMillis(toSeconds))).build();
        C2668g.a(dateTime, "Timestamp.newBuilder().s…).setNanos(nanos).build()");
        C2668g.a(dateTime, "dateTime.millis.let { da…(nanos).build()\n        }");
        return dateTime;
    }
}
