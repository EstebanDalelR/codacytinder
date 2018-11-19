package com.tinder.module;

import com.crashlytics.android.answers.Answers;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class bn implements Factory<Answers> {
    /* renamed from: a */
    private final bl f42820a;

    public /* synthetic */ Object get() {
        return m52181a();
    }

    public bn(bl blVar) {
        this.f42820a = blVar;
    }

    /* renamed from: a */
    public Answers m52181a() {
        return m52178a(this.f42820a);
    }

    /* renamed from: a */
    public static Answers m52178a(bl blVar) {
        return m52180c(blVar);
    }

    /* renamed from: b */
    public static bn m52179b(bl blVar) {
        return new bn(blVar);
    }

    /* renamed from: c */
    public static Answers m52180c(bl blVar) {
        return (Answers) C15521i.a(blVar.m40795c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
