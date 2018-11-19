package com.tinder.recs;

import android.support.annotation.NonNull;
import com.tinder.cardstack.model.C8395a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecType;
import com.tinder.domain.recs.model.SuperLikeableGameTeaserRec;
import com.tinder.domain.recs.model.TopPickTeaserRec;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.fireboarding.domain.C11803i;
import com.tinder.fireboarding.view.reccard.C11839a;
import com.tinder.profile.model.Profile.C14418b;
import com.tinder.recs.card.AdRecCard;
import com.tinder.recs.card.CardSizeProvider;
import com.tinder.recs.card.SuperLikeableGameTeaserRecCard;
import com.tinder.recs.card.TopPickTeaserRecCard;
import com.tinder.recs.card.UserRecCard;
import com.tinder.recs.model.AdRec;
import com.tinder.recsads.model.C16464a;
import com.tinder.recsads.p466a.C16428a;
import java.util.List;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;

public class RecsCardFactory {
    private final AbTestUtility abTestUtility;
    private final CardSizeProvider cardSizeProvider;
    private final RecsPhotoUrlFactory photoUrlFactory;
    private final C14418b profileFactory;

    /* renamed from: com.tinder.recs.RecsCardFactory$1 */
    static /* synthetic */ class C146961 {
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
            r1 = com.tinder.domain.recs.model.RecType.BRAND;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$tinder$domain$recs$model$RecType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.domain.recs.model.RecType.USER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$tinder$domain$recs$model$RecType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.domain.recs.model.RecType.TOP_PICK;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = $SwitchMap$com$tinder$domain$recs$model$RecType;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.tinder.domain.recs.model.RecType.TOP_PICKS_TEASER;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = $SwitchMap$com$tinder$domain$recs$model$RecType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.tinder.domain.recs.model.RecType.AD;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = $SwitchMap$com$tinder$domain$recs$model$RecType;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = com.tinder.domain.recs.model.RecType.SUPER_LIKABLE_GAME;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = $SwitchMap$com$tinder$domain$recs$model$RecType;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = com.tinder.domain.recs.model.RecType.FIREBOARDING;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.RecsCardFactory.1.<clinit>():void");
        }
    }

    @Inject
    public RecsCardFactory(@NonNull RecsPhotoUrlFactory recsPhotoUrlFactory, @NonNull CardSizeProvider cardSizeProvider, @NonNull C14418b c14418b, AbTestUtility abTestUtility) {
        this.photoUrlFactory = recsPhotoUrlFactory;
        this.cardSizeProvider = cardSizeProvider;
        this.profileFactory = c14418b;
        this.abTestUtility = abTestUtility;
    }

    @NonNull
    public List<C8395a> createCards(@NonNull List<Rec> list) {
        return (List) StreamSupport.m59708a(list).map(new RecsCardFactory$$Lambda$0(this)).collect(Collectors.m59434a());
    }

    @NonNull
    public C8395a createCard(@NonNull Rec rec) {
        switch (C146961.$SwitchMap$com$tinder$domain$recs$model$RecType[((RecType) rec.getType()).ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new UserRecCard((UserRec) rec, this.photoUrlFactory, this.cardSizeProvider, this.profileFactory);
            case 4:
                return new TopPickTeaserRecCard((TopPickTeaserRec) rec);
            case 5:
                if (this.abTestUtility.isAddyV2Enabled()) {
                    return new C16428a((C16464a) rec);
                }
                return new AdRecCard((AdRec) rec);
            case 6:
                return new SuperLikeableGameTeaserRecCard((SuperLikeableGameTeaserRec) rec);
            case 7:
                return C11839a.f38585a.a((C11803i) rec);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Un-configured Card type ");
                stringBuilder.append(rec.getType());
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
