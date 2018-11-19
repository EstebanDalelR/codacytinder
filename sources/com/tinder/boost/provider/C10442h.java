package com.tinder.boost.provider;

import android.content.Context;
import com.tinder.R;
import com.tinder.boost.view.BoostEmitterView.BoostedImageProvider;
import com.tinder.boost.view.BoostEmitterView.C12641a;
import com.tinder.boost.view.C13657g;
import rx.Observable;

/* renamed from: com.tinder.boost.provider.h */
public class C10442h implements BoostedImageProvider {
    /* renamed from: a */
    private static final int[] f34025a = new int[]{R.drawable.boost_ic_heart, R.drawable.boost_ic_heart_purple, R.drawable.boost_ic_heart_light_purple};
    /* renamed from: b */
    private int f34026b = 0;

    public Observable<C12641a> createdNextBoostedImageView(Context context) {
        int i = f34025a[this.f34026b];
        this.f34026b++;
        if (this.f34026b > f34025a.length - 1) {
            this.f34026b = 0;
        }
        return Observable.a(new C13657g(context, i));
    }
}
