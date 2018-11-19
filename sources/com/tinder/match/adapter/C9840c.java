package com.tinder.match.adapter;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.tinder.match.adapter.c */
final /* synthetic */ class C9840c implements Callable {
    /* renamed from: a */
    private final MatchListAdapter f32608a;
    /* renamed from: b */
    private final List f32609b;

    C9840c(MatchListAdapter matchListAdapter, List list) {
        this.f32608a = matchListAdapter;
        this.f32609b = list;
    }

    public Object call() {
        return this.f32608a.m48132b(this.f32609b);
    }
}
