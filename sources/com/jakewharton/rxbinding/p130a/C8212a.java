package com.jakewharton.rxbinding.p130a;

import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.p494a.C19562a;

/* renamed from: com.jakewharton.rxbinding.a.a */
final class C8212a implements OnSubscribe<Float> {
    /* renamed from: a */
    final RatingBar f29355a;

    /* renamed from: com.jakewharton.rxbinding.a.a$2 */
    class C78132 extends C19562a {
        /* renamed from: a */
        final /* synthetic */ C8212a f28270a;

        C78132(C8212a c8212a) {
            this.f28270a = c8212a;
        }

        /* renamed from: a */
        protected void m33580a() {
            this.f28270a.f29355a.setOnRatingBarChangeListener(null);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m35017a((C19571c) obj);
    }

    public C8212a(RatingBar ratingBar) {
        this.f29355a = ratingBar;
    }

    /* renamed from: a */
    public void m35017a(final C19571c<? super Float> c19571c) {
        C19562a.b();
        OnRatingBarChangeListener c56961 = new OnRatingBarChangeListener(this) {
            /* renamed from: b */
            final /* synthetic */ C8212a f21107b;

            public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                if (c19571c.isUnsubscribed() == null) {
                    c19571c.onNext(Float.valueOf(f));
                }
            }
        };
        c19571c.add(new C78132(this));
        this.f29355a.setOnRatingBarChangeListener(c56961);
        c19571c.onNext(Float.valueOf(this.f29355a.getRating()));
    }
}
