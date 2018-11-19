package com.leanplum.p069a;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.leanplum.a.ac */
final class ac {
    /* renamed from: a */
    private final Map<aw, C2592k> f7899a = new HashMap();

    ac() {
    }

    /* renamed from: a */
    final void m9460a(aw awVar, ba baVar, ay ayVar) {
        if (awVar != null) {
            if (baVar != null || ayVar != null) {
                this.f7899a.put(awVar, new C2592k(baVar, ayVar));
            }
        }
    }

    /* renamed from: a */
    final void m9461a(@NonNull final Exception exception, int i) {
        if (this.f7899a.size() != 0) {
            Iterator it = this.f7899a.entrySet().iterator();
            while (it.hasNext()) {
                final Entry entry = (Entry) it.next();
                if (entry.getKey() != null) {
                    long j = (long) i;
                    if (((aw) entry.getKey()).m9577b() >= j) {
                        ((aw) entry.getKey()).m9573a(((aw) entry.getKey()).m9577b() - j);
                    } else {
                        if (!(entry.getValue() == null || ((C2592k) entry.getValue()).f8112y == null)) {
                            bo.m9613a(false, new AsyncTask<Void, Void, Void>(this) {
                                /* renamed from: c */
                                private /* synthetic */ ac f7895c;

                                /* renamed from: a */
                                private Void m9458a() {
                                    ((C2592k) entry.getValue()).f8112y.mo2612a(exception);
                                    return null;
                                }

                                protected final /* synthetic */ Object doInBackground(Object[] objArr) {
                                    ((C2592k) entry.getValue()).f8112y.mo2612a(exception);
                                    return null;
                                }
                            }, new Void[0]);
                        }
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    final void m9462a(@NonNull final JSONObject jSONObject, int i) {
        if (this.f7899a.size() != 0) {
            Iterator it = this.f7899a.entrySet().iterator();
            while (it.hasNext()) {
                final Entry entry = (Entry) it.next();
                if (entry.getKey() != null) {
                    long j = (long) i;
                    if (((aw) entry.getKey()).m9577b() >= j) {
                        ((aw) entry.getKey()).m9573a(((aw) entry.getKey()).m9577b() - j);
                    } else {
                        if (!(entry.getValue() == null || ((C2592k) entry.getValue()).f8111x == null)) {
                            bo.m9613a(false, new AsyncTask<Void, Void, Void>(this) {
                                /* renamed from: c */
                                private /* synthetic */ ac f7898c;

                                /* renamed from: a */
                                private Void m9459a() {
                                    ((C2592k) entry.getValue()).f8111x.mo2627a(aw.m9532a(jSONObject, (int) ((aw) entry.getKey()).m9577b()));
                                    return null;
                                }

                                protected final /* synthetic */ Object doInBackground(Object[] objArr) {
                                    ((C2592k) entry.getValue()).f8111x.mo2627a(aw.m9532a(jSONObject, (int) ((aw) entry.getKey()).m9577b()));
                                    return null;
                                }
                            }, new Void[0]);
                        }
                        it.remove();
                    }
                }
            }
        }
    }
}
