package com.tinder.domain.injection.modules;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class CommonDomainModule$provideDateTimeProvider$1 extends Lambda implements Function0<DateTime> {
    public static final CommonDomainModule$provideDateTimeProvider$1 INSTANCE = new CommonDomainModule$provideDateTimeProvider$1();

    CommonDomainModule$provideDateTimeProvider$1() {
        super(0);
    }

    public final DateTime invoke() {
        DateTime a = DateTime.a();
        C2668g.a(a, "DateTime.now()");
        return a;
    }
}
