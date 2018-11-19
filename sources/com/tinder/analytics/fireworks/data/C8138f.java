package com.tinder.analytics.fireworks.data;

import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import rx.Emitter;
import rx.functions.Action1;

/* renamed from: com.tinder.analytics.fireworks.data.f */
final /* synthetic */ class C8138f implements Action1 {
    /* renamed from: a */
    private final C7324b f29145a;
    /* renamed from: b */
    private final C6124c f29146b;
    /* renamed from: c */
    private final RowMapper f29147c;

    C8138f(C7324b c7324b, C6124c c6124c, RowMapper rowMapper) {
        this.f29145a = c7324b;
        this.f29146b = c6124c;
        this.f29147c = rowMapper;
    }

    public void call(Object obj) {
        this.f29145a.m31270a(this.f29146b, this.f29147c, (Emitter) obj);
    }
}
