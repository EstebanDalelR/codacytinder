package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import com.squareup.sqldelight.ColumnAdapter;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.adapter.n */
public class C10739n implements ColumnAdapter<DateTime, Long> {
    @NonNull
    public /* synthetic */ Object decode(@NonNull Object obj) {
        return m43132a((Long) obj);
    }

    public /* synthetic */ Object encode(@NonNull Object obj) {
        return m43131a((DateTime) obj);
    }

    @NonNull
    /* renamed from: a */
    public DateTime m43132a(@NonNull Long l) {
        return new DateTime(l);
    }

    /* renamed from: a */
    public Long m43131a(@NonNull DateTime dateTime) {
        return Long.valueOf(dateTime.getMillis());
    }
}
