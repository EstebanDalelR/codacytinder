package com.tinder.fireboarding.view.reccard;

import android.support.annotation.DrawableRes;
import com.tinder.cardstack.model.C8395a;
import com.tinder.fireboarding.C9559a.C9553b;
import com.tinder.fireboarding.domain.C11803i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/FireboardingRecCard;", "Lcom/tinder/cardstack/model/Card;", "Lcom/tinder/fireboarding/domain/FireboardingRec;", "item", "backgroundDrawable", "", "(Lcom/tinder/fireboarding/domain/FireboardingRec;I)V", "getBackgroundDrawable", "()I", "Factory", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.reccard.a */
public final class C11839a extends C8395a<C11803i> {
    /* renamed from: a */
    public static final C9620a f38585a = new C9620a();
    /* renamed from: b */
    private final int f38586b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/FireboardingRecCard$Factory;", "", "()V", "create", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCard;", "item", "Lcom/tinder/fireboarding/domain/FireboardingRec;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.reccard.a$a */
    public static final class C9620a {
        private C9620a() {
        }

        @NotNull
        /* renamed from: a */
        public final C11839a m40029a(@NotNull C11803i c11803i) {
            C2668g.b(c11803i, "item");
            switch (C9621b.f32139a[c11803i.m47720c().ordinal()]) {
                case 1:
                    return new C11839a(c11803i, C9553b.fireboarding_rewind_background_gradient);
                case 2:
                    return new C11839a(c11803i, C9553b.fireboarding_superlike_background_gradient);
                case 3:
                    return new C11839a(c11803i, C9553b.fireboarding_boost_background_gradient);
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected: ");
                    stringBuilder.append(c11803i.m47720c());
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    public final int m47741a() {
        return this.f38586b;
    }

    private C11839a(C11803i c11803i, @DrawableRes int i) {
        super(c11803i.getId(), c11803i);
        this.f38586b = i;
    }
}
