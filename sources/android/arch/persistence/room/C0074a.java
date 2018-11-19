package android.arch.persistence.room;

import android.arch.persistence.db.SupportSQLiteOpenHelper.Factory;
import android.arch.persistence.room.C0091e.C0089b;
import android.arch.persistence.room.C0091e.C0090c;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.List;

/* renamed from: android.arch.persistence.room.a */
public class C0074a {
    @NonNull
    /* renamed from: a */
    public final Factory f181a;
    @NonNull
    /* renamed from: b */
    public final Context f182b;
    @Nullable
    /* renamed from: c */
    public final String f183c;
    @NonNull
    /* renamed from: d */
    public final C0090c f184d;
    @Nullable
    /* renamed from: e */
    public final List<C0089b> f185e;
    /* renamed from: f */
    public final boolean f186f;
    /* renamed from: g */
    public final boolean f187g;

    @RestrictTo({Scope.LIBRARY_GROUP})
    public C0074a(@NonNull Context context, @Nullable String str, @NonNull Factory factory, @NonNull C0090c c0090c, @Nullable List<C0089b> list, boolean z, boolean z2) {
        this.f181a = factory;
        this.f182b = context;
        this.f183c = str;
        this.f184d = c0090c;
        this.f185e = list;
        this.f186f = z;
        this.f187g = z2;
    }
}
