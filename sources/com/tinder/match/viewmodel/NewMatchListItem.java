package com.tinder.match.viewmodel;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.match.viewmodel.C12097c.C12096a;
import java8.util.Optional;

public abstract class NewMatchListItem {

    public enum Type {
        SPACE_VIEW,
        FAST_MATCH_PREVIEW,
        NEW_MATCH
    }

    /* renamed from: com.tinder.match.viewmodel.NewMatchListItem$a */
    public static abstract class C9884a {
        /* renamed from: a */
        public abstract C9884a mo10603a(@NonNull Type type);

        /* renamed from: a */
        public abstract C9884a mo10604a(@Nullable Optional<C12102k> optional);

        /* renamed from: a */
        public abstract NewMatchListItem mo10605a();
    }

    @NonNull
    /* renamed from: a */
    public abstract Optional<C12102k> mo10606a();

    @NonNull
    /* renamed from: b */
    public abstract Type mo10607b();

    /* renamed from: c */
    public static C9884a m40686c() {
        return new C12096a();
    }
}
