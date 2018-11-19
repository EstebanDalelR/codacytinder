package com.tinder.domain.injection.modules;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.joda.time.DateTimeUtils;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class CommonDomainModule$provideCurrentDateTimeMillis$1 extends Lambda implements Function0<Long> {
    public static final CommonDomainModule$provideCurrentDateTimeMillis$1 INSTANCE = new CommonDomainModule$provideCurrentDateTimeMillis$1();

    CommonDomainModule$provideCurrentDateTimeMillis$1() {
        super(0);
    }

    /* renamed from: invoke */
    public /* synthetic */ Object m71746invoke() {
        return Long.valueOf(invoke());
    }

    public final long invoke() {
        return DateTimeUtils.a();
    }
}
