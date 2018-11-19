package com.tinder.cardstack.cardgrid.animation;

import com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator;
import com.tinder.cardstack.cardgrid.animation.animator.CardPropertyAnimator.State;
import com.tinder.cardstack.cardgrid.animation.p184a.C8368a;
import com.tinder.cardstack.view.CardViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0002'(B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0016\u001a\u00020\u00052\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0000¢\u0006\u0002\b\u0019J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020\u001eH\u0000¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0019\u0010#\u001a\u00020\u001e2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0000¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u001eH\u0000¢\u0006\u0002\b&R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0011j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012`\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine;", "", "()V", "activeAnimators", "", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator;", "getActiveAnimators$cardstack_release", "()Ljava/util/List;", "animatorPool", "Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine$AnimatorPool;", "renderer", "Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine$Renderer;", "getRenderer$cardstack_release", "()Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine$Renderer;", "setRenderer$cardstack_release", "(Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine$Renderer;)V", "tempCardProperties", "Ljava/util/HashMap;", "Lcom/tinder/cardstack/cardgrid/animation/model/CardProperty;", "Lkotlin/collections/HashMap;", "getTempCardProperties$cardstack_release", "()Ljava/util/HashMap;", "animate", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "animate$cardstack_release", "getCardProperty", "animator", "getCardProperty$cardstack_release", "onPostUpdate", "", "onPostUpdate$cardstack_release", "onUpdate", "onUpdate$cardstack_release", "recycleInactiveAnimators", "reset", "reset$cardstack_release", "resetAll", "resetAll$cardstack_release", "AnimatorPool", "Renderer", "cardstack_release"}, k = 1, mv = {1, 1, 9})
public final class CardAnimationEngine {
    @Nullable
    /* renamed from: a */
    private Renderer f29703a;
    /* renamed from: b */
    private final C8366a f29704b = new C8366a(this);
    @NotNull
    /* renamed from: c */
    private final HashMap<CardPropertyAnimator, C8368a> f29705c = new HashMap();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine$Renderer;", "", "render", "", "cardViewHolder", "Lcom/tinder/cardstack/view/CardViewHolder;", "cardProperty", "Lcom/tinder/cardstack/cardgrid/animation/model/CardProperty;", "requestUpdate", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    public interface Renderer {
        void render(@NotNull CardViewHolder<?> cardViewHolder, @NotNull C8368a c8368a);

        void requestUpdate();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\u00052\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0012\u0010\u000e\u001a\u00020\u000f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R2\u0010\b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u00050\tj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u0005`\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine$AnimatorPool;", "", "(Lcom/tinder/cardstack/cardgrid/animation/CardAnimationEngine;)V", "activeAnimators", "", "Lcom/tinder/cardstack/cardgrid/animation/animator/CardPropertyAnimator;", "getActiveAnimators$cardstack_release", "()Ljava/util/List;", "animatorMap", "Ljava/util/HashMap;", "Lcom/tinder/cardstack/view/CardViewHolder;", "Lkotlin/collections/HashMap;", "obtain", "cardViewHolder", "recycle", "", "cardPropertyAnimator", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.animation.CardAnimationEngine$a */
    private final class C8366a {
        /* renamed from: a */
        final /* synthetic */ CardAnimationEngine f29701a;
        /* renamed from: b */
        private final HashMap<CardViewHolder<?>, CardPropertyAnimator> f29702b = new HashMap();

        public C8366a(CardAnimationEngine cardAnimationEngine) {
            this.f29701a = cardAnimationEngine;
        }

        @NotNull
        /* renamed from: a */
        public final List<CardPropertyAnimator> m35617a() {
            Collection values = this.f29702b.values();
            C2668g.a(values, "animatorMap.values");
            return C19301m.l(values);
        }

        @NotNull
        /* renamed from: a */
        public final CardPropertyAnimator m35616a(@NotNull CardViewHolder<?> cardViewHolder) {
            C2668g.b(cardViewHolder, "cardViewHolder");
            if (this.f29702b.containsKey(cardViewHolder)) {
                cardViewHolder = this.f29702b.get(cardViewHolder);
                if (cardViewHolder == null) {
                    C2668g.a();
                }
                return (CardPropertyAnimator) cardViewHolder;
            }
            CardPropertyAnimator cardPropertyAnimator = new CardPropertyAnimator(cardViewHolder);
            this.f29702b.put(cardViewHolder, cardPropertyAnimator);
            return cardPropertyAnimator;
        }

        /* renamed from: b */
        public final void m35619b(@NotNull CardViewHolder<?> cardViewHolder) {
            C2668g.b(cardViewHolder, "cardViewHolder");
            this.f29702b.remove(cardViewHolder);
        }

        /* renamed from: a */
        public final void m35618a(@NotNull CardPropertyAnimator cardPropertyAnimator) {
            C2668g.b(cardPropertyAnimator, "cardPropertyAnimator");
            this.f29702b.remove(cardPropertyAnimator.m35691e());
        }
    }

    /* renamed from: a */
    public final void m35624a(@Nullable Renderer renderer) {
        this.f29703a = renderer;
    }

    @NotNull
    /* renamed from: a */
    public final List<CardPropertyAnimator> m35623a() {
        return this.f29704b.m35617a();
    }

    @NotNull
    /* renamed from: a */
    public final CardPropertyAnimator m35622a(@NotNull CardViewHolder<?> cardViewHolder) {
        C2668g.b(cardViewHolder, "cardViewHolder");
        cardViewHolder = this.f29704b.m35616a((CardViewHolder) cardViewHolder);
        Renderer renderer = this.f29703a;
        if (renderer != null) {
            renderer.requestUpdate();
        }
        return cardViewHolder;
    }

    /* renamed from: b */
    public final void m35626b(@NotNull CardViewHolder<?> cardViewHolder) {
        C2668g.b(cardViewHolder, "cardViewHolder");
        this.f29704b.m35616a((CardViewHolder) cardViewHolder).m35686b();
        this.f29704b.m35619b(cardViewHolder);
        Renderer renderer = this.f29703a;
        if (renderer != null) {
            renderer.render(cardViewHolder, C8368a.f29706a.m35629a());
        }
    }

    /* renamed from: b */
    public final void m35625b() {
        for (CardPropertyAnimator e : m35623a()) {
            m35626b(e.m35691e());
        }
    }

    /* renamed from: c */
    public final void m35627c() {
        Renderer renderer = this.f29703a;
        if (renderer != null) {
            for (CardPropertyAnimator cardPropertyAnimator : this.f29704b.m35617a()) {
                C8368a d = cardPropertyAnimator.m35690d();
                this.f29705c.put(cardPropertyAnimator, d);
                renderer.render(cardPropertyAnimator.m35691e(), d);
            }
        }
    }

    /* renamed from: d */
    public final void m35628d() {
        this.f29705c.clear();
        if (!this.f29704b.m35617a().isEmpty()) {
            Renderer renderer = this.f29703a;
            if (renderer != null) {
                renderer.requestUpdate();
            }
        }
        m35620e();
    }

    @NotNull
    /* renamed from: a */
    public final C8368a m35621a(@NotNull CardPropertyAnimator cardPropertyAnimator) {
        C2668g.b(cardPropertyAnimator, "animator");
        cardPropertyAnimator = this.f29705c.get(cardPropertyAnimator);
        if (cardPropertyAnimator == null) {
            C2668g.a();
        }
        return (C8368a) cardPropertyAnimator;
    }

    /* renamed from: e */
    private final void m35620e() {
        Collection arrayList = new ArrayList();
        for (Object next : this.f29704b.m35617a()) {
            if (C2668g.a(((CardPropertyAnimator) next).m35681a(), State.STOPPED)) {
                arrayList.add(next);
            }
        }
        for (CardPropertyAnimator a : (List) arrayList) {
            this.f29704b.m35618a(a);
        }
    }
}
