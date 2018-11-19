package com.tinder.analytics.fireworks.data;

import android.database.Cursor;
import android.support.annotation.NonNull;
import com.squareup.sqldelight.C6124c;
import com.squareup.sqldelight.RowMapper;
import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.FireworksRepository;
import com.tinder.analytics.fireworks.data.FireworksEventModel.C6227a;
import com.tinder.analytics.fireworks.data.FireworksEventModel.C8012b;
import rx.Completable;
import rx.Emitter;
import rx.Emitter.BackpressureMode;
import rx.Observable;

/* renamed from: com.tinder.analytics.fireworks.data.b */
public class C7324b implements FireworksRepository {
    @NonNull
    /* renamed from: a */
    private final C6229j f26474a;
    /* renamed from: b */
    private final C6227a<C7328i> f26475b = new C6227a(C7325c.f26477a, new C7327h());
    /* renamed from: c */
    private final RowMapper<C2632i> f26476c = this.f26475b.m26886b();

    public C7324b(@NonNull C6229j c6229j) {
        this.f26474a = c6229j;
    }

    @NonNull
    public Completable insertEvent(@NonNull C2632i c2632i) {
        return Completable.a(new C8136d(this, c2632i));
    }

    /* renamed from: a */
    final /* synthetic */ void m31271a(@NonNull C2632i c2632i) {
        C8012b c8012b = new C8012b(this.f26474a.getWritableDatabase(), this.f26475b);
        c8012b.m33916a(c2632i);
        c8012b.b.executeInsert();
    }

    @NonNull
    public Observable<C2632i> loadEvents() {
        return m31267a(this.f26475b.m26885a(), this.f26476c);
    }

    @NonNull
    public Completable clear() {
        return Completable.a(new C8137e(this));
    }

    /* renamed from: a */
    final /* synthetic */ void m31269a() {
        this.f26474a.getWritableDatabase().execSQL("DELETE FROM fireworks");
    }

    /* renamed from: a */
    private <T> Observable<T> m31267a(C6124c c6124c, RowMapper<T> rowMapper) {
        return Observable.a(new C8138f(this, c6124c, rowMapper), BackpressureMode.BUFFER);
    }

    /* renamed from: a */
    final /* synthetic */ void m31270a(C6124c c6124c, RowMapper rowMapper, Emitter emitter) {
        c6124c = this.f26474a.getReadableDatabase().rawQuery(c6124c.f22514a, c6124c.f22515b);
        emitter.setCancellation(new C7326g(c6124c));
        try {
            if (c6124c.moveToFirst()) {
                do {
                    emitter.onNext(rowMapper.map(c6124c));
                } while (c6124c.moveToNext());
            }
            emitter.onCompleted();
        } catch (RowMapper rowMapper2) {
            emitter.onError(rowMapper2);
        } catch (Throwable th) {
            c6124c.close();
        }
        c6124c.close();
    }

    /* renamed from: a */
    static final /* synthetic */ void m31268a(Cursor cursor) throws Exception {
        if (!cursor.isClosed()) {
            cursor.close();
        }
    }
}
