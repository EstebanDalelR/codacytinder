package com.tinder.domain.injection.modules;

import com.tinder.api.ManagerWebServices;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.joda.time.DateTimeZone;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class CommonDomainModule$provideUtcOffsetMins$1 extends Lambda implements Function0<Integer> {
    public static final CommonDomainModule$provideUtcOffsetMins$1 INSTANCE = new CommonDomainModule$provideUtcOffsetMins$1();

    CommonDomainModule$provideUtcOffsetMins$1() {
        super(0);
    }

    /* renamed from: invoke */
    public /* synthetic */ Object m71747invoke() {
        return Integer.valueOf(invoke());
    }

    public final int invoke() {
        return DateTimeZone.a(TimeZone.getDefault()).a(null) / ManagerWebServices.TIMEOUT_AUTH_MS;
    }
}
