package com.tinder.data.database;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.sqlbrite.BriteDatabase;
import com.squareup.sqlbrite.BriteDatabase.Transaction;
import com.tinder.common.p076a.C2640a;

/* renamed from: com.tinder.data.database.h */
public class C8645h {
    @NonNull
    /* renamed from: a */
    private final BriteDatabase f30494a;
    @Nullable
    /* renamed from: b */
    private Transaction f30495b;

    private C8645h(@NonNull BriteDatabase briteDatabase) {
        this.f30494a = briteDatabase;
    }

    /* renamed from: a */
    public void m36876a() {
        C2640a.b(this.f30495b == null, "Transaction already in progress");
        this.f30495b = this.f30494a.c();
    }

    /* renamed from: b */
    public void m36877b() {
        C2640a.b(this.f30495b != null, "Transaction never begun");
        this.f30495b.markSuccessful();
    }

    /* renamed from: c */
    public void m36878c() {
        C2640a.b(this.f30495b != null, "Transaction never begun");
        this.f30495b.end();
        this.f30495b = null;
    }

    @NonNull
    /* renamed from: a */
    public static C8645h m36875a(@NonNull BriteDatabase briteDatabase) {
        return new C8645h(briteDatabase);
    }
}
