package com.tinder.recs.data;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.C4330g;
import com.tinder.common.p077b.C2641a;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.recs.RecsAdditionalDataPrefetcher;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.recs.RecsPhotoUrlFactory;
import com.tinder.recs.card.CardSize;
import com.tinder.recs.card.CardSizeProvider;
import java.io.File;
import javax.inject.Singleton;
import rx.Observable;
import rx.p494a.p496b.C19397a;

@Singleton
public class RecsDataPrefetcher implements RecsAdditionalDataPrefetcher {
    private final Context applicationContext;
    private CardSize cardSize;
    private final RecsPhotoUrlFactory photoUrlFactory;

    /* renamed from: com.tinder.recs.data.RecsDataPrefetcher$2 */
    static /* synthetic */ class C147072 {
        static final /* synthetic */ int[] $SwitchMap$com$tinder$domain$recs$model$RecType = new int[RecType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.domain.recs.model.RecType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$tinder$domain$recs$model$RecType = r0;
            r0 = $SwitchMap$com$tinder$domain$recs$model$RecType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.domain.recs.model.RecType.USER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.data.RecsDataPrefetcher.2.<clinit>():void");
        }
    }

    /* renamed from: com.tinder.recs.data.RecsDataPrefetcher$1 */
    class C191651 extends C4330g<File> {
        public void onResourceReady(File file, GlideAnimation<? super File> glideAnimation) {
        }

        C191651() {
        }
    }

    public RecsDataPrefetcher(@NonNull Context context, @NonNull RecsPhotoUrlFactory recsPhotoUrlFactory, @NonNull CardSizeProvider cardSizeProvider) {
        this.applicationContext = context;
        this.photoUrlFactory = recsPhotoUrlFactory;
        context = context.getResources().getDisplayMetrics();
        this.cardSize = new CardSize(context.widthPixels, context.heightPixels, context.density);
        cardSizeProvider.observe().a(new RecsDataPrefetcher$$Lambda$0(this), RecsDataPrefetcher$$Lambda$1.$instance);
    }

    final /* synthetic */ void lambda$new$0$RecsDataPrefetcher(CardSize cardSize) {
        this.cardSize = cardSize;
    }

    public void prefetchAdditionalData(Rec rec) {
        if (C147072.$SwitchMap$com$tinder$domain$recs$model$RecType[((RecType) rec.getType()).ordinal()] == 1) {
            rec = ((UserRec) rec).getUser().photos();
            if (!C2641a.a(rec)) {
                preloadImage(this.photoUrlFactory.createUrl((Photo) rec.get(0), this.cardSize.getWidth(), this.cardSize.getHeight()));
            }
        }
    }

    private void preloadImage(String str) {
        Observable.a(str).b(C19397a.a()).a(new RecsDataPrefetcher$$Lambda$2(this), RecsDataPrefetcher$$Lambda$3.$instance);
    }

    final /* synthetic */ void lambda$preloadImage$1$RecsDataPrefetcher(String str) {
        C191651 c191651 = (C191651) C0994i.b(this.applicationContext).a(str).a(new C191651());
    }
}
