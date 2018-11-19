package com.tinder.data.updates;

import android.content.Context;
import android.content.SharedPreferences;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import io.reactivex.C3956a;
import io.reactivex.C3958c;
import io.reactivex.functions.Action;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tinder/data/updates/LastActivityDatePreferencesRepository;", "Lcom/tinder/domain/common/repository/LastActivityDateRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lastActivityDate", "Lio/reactivex/Maybe;", "Lorg/joda/time/DateTime;", "getLastActivityDate", "()Lio/reactivex/Maybe;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "applyLastActivityDate", "", "clearLastActivityDate", "Lio/reactivex/Completable;", "getDateTimeFromDateString", "dateTimeString", "", "removeLastActivityDate", "updateLastActivityDate", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.updates.c */
public final class C11047c implements LastActivityDateRepository {
    /* renamed from: a */
    private final Context f35814a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.c$b */
    static final class C8801b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C11047c f30888a;

        C8801b(C11047c c11047c) {
            this.f30888a = c11047c;
        }

        public /* synthetic */ Object call() {
            return m37482a();
        }

        @Nullable
        /* renamed from: a */
        public final DateTime m37482a() {
            return this.f30888a.m43717a(this.f30888a.m43714a().getString(ManagerWebServices.PARAM_LAST_ACTIVITY_DATE, null));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.c$a */
    static final class C11045a implements Action {
        /* renamed from: a */
        final /* synthetic */ C11047c f35811a;

        C11045a(C11047c c11047c) {
            this.f35811a = c11047c;
        }

        public final void run() {
            this.f35811a.m43720b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.updates.c$c */
    static final class C11046c implements Action {
        /* renamed from: a */
        final /* synthetic */ C11047c f35812a;
        /* renamed from: b */
        final /* synthetic */ DateTime f35813b;

        C11046c(C11047c c11047c, DateTime dateTime) {
            this.f35812a = c11047c;
            this.f35813b = dateTime;
        }

        public final void run() {
            this.f35812a.m43719a(this.f35813b);
        }
    }

    public C11047c(@NotNull Context context) {
        C2668g.b(context, "context");
        this.f35814a = context;
    }

    /* renamed from: a */
    private final SharedPreferences m43714a() {
        SharedPreferences sharedPreferences = this.f35814a.getSharedPreferences("LastActivityDatePreferencesRepository_last_activity_date", 0);
        C2668g.a(sharedPreferences, "context.getSharedPrefere…EF, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    @NotNull
    public C3958c<DateTime> getLastActivityDate() {
        C3958c<DateTime> a = C3958c.a(new C8801b(this));
        C2668g.a(a, "Maybe.fromCallable {\n   …vityDateString)\n        }");
        return a;
    }

    @NotNull
    public C3956a updateLastActivityDate(@NotNull DateTime dateTime) {
        C2668g.b(dateTime, "lastActivityDate");
        dateTime = C3956a.a(new C11046c(this, dateTime));
        C2668g.a(dateTime, "Completable.fromAction {…yDate(lastActivityDate) }");
        return dateTime;
    }

    @NotNull
    public C3956a clearLastActivityDate() {
        C3956a a = C3956a.a(new C11045a(this));
        C2668g.a(a, "Completable.fromAction {…emoveLastActivityDate() }");
        return a;
    }

    /* renamed from: a */
    private final void m43719a(DateTime dateTime) {
        m43714a().edit().putString(ManagerWebServices.PARAM_LAST_ACTIVITY_DATE, dateTime.a(C8802d.f30889a)).apply();
    }

    /* renamed from: b */
    private final void m43720b() {
        m43714a().edit().remove(ManagerWebServices.PARAM_LAST_ACTIVITY_DATE).apply();
    }

    /* renamed from: a */
    private final DateTime m43717a(String str) {
        Object obj;
        CharSequence charSequence = str;
        if (charSequence != null) {
            if (charSequence.length() != 0) {
                obj = null;
                if (obj == null) {
                    return null;
                }
                return DateTime.a(str, C8802d.f30889a);
            }
        }
        obj = 1;
        if (obj == null) {
            return DateTime.a(str, C8802d.f30889a);
        }
        return null;
    }
}
