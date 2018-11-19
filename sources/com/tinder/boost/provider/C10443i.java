package com.tinder.boost.provider;

import android.content.Context;
import com.tinder.boost.view.BoostEmitterView.BoostedImageProvider;
import com.tinder.boost.view.BoostEmitterView.C12641a;
import com.tinder.domain.boost.repository.BoostProfileFacesRepository;
import com.tinder.managers.ManagerApp;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3959e;
import java.util.Random;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.boost.provider.i */
public class C10443i implements BoostedImageProvider {
    @Inject
    /* renamed from: a */
    BoostProfileFacesRepository f34027a;
    /* renamed from: b */
    private final C10442h f34028b = new C10442h();
    /* renamed from: c */
    private int f34029c;
    /* renamed from: d */
    private Random f34030d = new Random();

    public C10443i() {
        ManagerApp.e().inject(this);
    }

    public Observable<C12641a> createdNextBoostedImageView(Context context) {
        this.f34029c++;
        this.f34030d = new Random();
        if (this.f34029c % (this.f34030d.nextInt(2) + 1) == 0) {
            return C15551e.a(m42308a(context), BackpressureStrategy.LATEST).f(this.f34028b.createdNextBoostedImageView(context));
        }
        return this.f34028b.createdNextBoostedImageView(context);
    }

    /* renamed from: a */
    private C3959e<C12641a> m42308a(Context context) {
        return this.f34027a.loadNextUrl().b(new C10444j(context));
    }
}
