package com.tinder.match.viewmodel;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.match.viewmodel.C12095a.C12094a;

public abstract class MatchListItem {

    public enum Type {
        GOING_OUT_V1,
        GOING_OUT_V2,
        NEW_MATCHES,
        MESSAGES_HEADER,
        MATCH_WITH_MESSAGE,
        NO_MESSAGES,
        NO_MATCHES
    }

    /* renamed from: com.tinder.match.viewmodel.MatchListItem$a */
    public static abstract class C9883a {
        /* renamed from: a */
        public abstract C9883a mo10596a(@NonNull Type type);

        /* renamed from: a */
        public abstract C9883a mo10597a(@Nullable C12099h c12099h);

        /* renamed from: a */
        public abstract C9883a mo10598a(@Nullable String str);

        /* renamed from: a */
        public abstract MatchListItem mo10599a();
    }

    @Nullable
    /* renamed from: a */
    public abstract C12099h mo10600a();

    @Nullable
    /* renamed from: b */
    public abstract String mo10601b();

    @NonNull
    /* renamed from: c */
    public abstract Type mo10602c();

    /* renamed from: d */
    public static C9883a m40672d() {
        return new C12094a();
    }
}
