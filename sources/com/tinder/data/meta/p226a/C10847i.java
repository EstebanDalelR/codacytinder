package com.tinder.data.meta.p226a;

import android.support.annotation.NonNull;
import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import com.tinder.domain.meta.model.FastMatchSettings;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;

/* renamed from: com.tinder.data.meta.a.i */
public class C10847i extends C2646o<FastMatchSettings, Globals> {
    @Inject
    C10847i() {
    }

    @NonNull
    /* renamed from: a */
    public FastMatchSettings m43321a(@NonNull Globals globals) {
        return new FastMatchSettings(((Boolean) Objects.b(globals.isFastMatchEnabled(), Boolean.valueOf(false))).booleanValue(), ((Long) Objects.b(globals.fastMatchPreviewMinTimeInMillis(), Long.valueOf(DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS))).longValue(), (List) Objects.b(globals.fastMatchNotificationOptions(), DefaultFastMatchValues.INSTANCE.getNOTIFICATION_OPTIONS()), ((Integer) Objects.b(globals.fastMatchNotificationDefault(), Integer.valueOf(1))).intValue(), ((Long) Objects.b(globals.fastMatchNewCountFetchInterval(), Long.valueOf(DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL))).longValue(), ((Long) Objects.b(globals.fastMatchNewCountFetchIntervalWhileBoosting(), Long.valueOf(DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL))).longValue(), ((Integer) Objects.b(globals.fastMatchPillRangeThreshold(), Integer.valueOf(0))).intValue(), ((Integer) Objects.b(globals.fastMatchPollingMode(), Integer.valueOf(DefaultFastMatchValues.INSTANCE.getPOLLING_MODE().getValue()))).intValue());
    }
}
