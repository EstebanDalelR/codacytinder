package com.tinder.fireboarding.view.reccard;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector;", "", "onCardAtTopOfCardStackCallback", "Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$OnCardAtTopOfCardStackCallback;", "viewState", "Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$ViewState;", "(Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$OnCardAtTopOfCardStackCallback;Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$ViewState;)V", "checkAndNotifyIfReadyForAnimation", "", "onPairWithAboveCardCreated", "onPairWithAboveCardDestroyed", "onViewMovedToTop", "onViewRecycled", "onViewRemovedFromTop", "OnCardAtTopOfCardStackCallback", "PairState", "ViewState", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
public final class CardAtTopOfCardStackDetector {
    /* renamed from: a */
    private final OnCardAtTopOfCardStackCallback f32132a;
    /* renamed from: b */
    private final C9618a f32133b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$OnCardAtTopOfCardStackCallback;", "", "onCardAtTopOfCardStack", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    public interface OnCardAtTopOfCardStackCallback {
        void onCardAtTopOfCardStack();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$PairState;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "PAIR_CREATED_WITH_CARD_ABOVE", "PAIR_DESTROYED_WITH_CARD_ABOVE", "PAIR_NOT_CREATED_IS_TOP_CARD", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    public enum PairState {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$ViewState;", "", "()V", "isCardMovedToTop", "", "()Z", "setCardMovedToTop", "(Z)V", "pairState", "Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$PairState;", "getPairState", "()Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$PairState;", "setPairState", "(Lcom/tinder/fireboarding/view/reccard/CardAtTopOfCardStackDetector$PairState;)V", "isReadyForAnimation", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.reccard.CardAtTopOfCardStackDetector$a */
    public static final class C9618a {
        /* renamed from: a */
        private boolean f32130a;
        @NotNull
        /* renamed from: b */
        private PairState f32131b = PairState.UNKNOWN;

        /* renamed from: a */
        public final void m40016a(boolean z) {
            this.f32130a = z;
        }

        @NotNull
        /* renamed from: a */
        public final PairState m40014a() {
            return this.f32131b;
        }

        /* renamed from: a */
        public final void m40015a(@NotNull PairState pairState) {
            C2668g.b(pairState, "<set-?>");
            this.f32131b = pairState;
        }

        /* renamed from: b */
        public final boolean m40017b() {
            return this.f32130a && (this.f32131b == PairState.PAIR_DESTROYED_WITH_CARD_ABOVE || this.f32131b == PairState.PAIR_NOT_CREATED_IS_TOP_CARD);
        }
    }

    public CardAtTopOfCardStackDetector(@NotNull OnCardAtTopOfCardStackCallback onCardAtTopOfCardStackCallback, @NotNull C9618a c9618a) {
        C2668g.b(onCardAtTopOfCardStackCallback, "onCardAtTopOfCardStackCallback");
        C2668g.b(c9618a, "viewState");
        this.f32132a = onCardAtTopOfCardStackCallback;
        this.f32133b = c9618a;
    }

    public /* synthetic */ CardAtTopOfCardStackDetector(OnCardAtTopOfCardStackCallback onCardAtTopOfCardStackCallback, C9618a c9618a, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            c9618a = new C9618a();
        }
        this(onCardAtTopOfCardStackCallback, c9618a);
    }

    /* renamed from: a */
    public final void m40019a() {
        this.f32133b.m40016a(true);
        if (this.f32133b.m40014a() == PairState.UNKNOWN) {
            this.f32133b.m40015a(PairState.PAIR_NOT_CREATED_IS_TOP_CARD);
        }
        m40018f();
    }

    /* renamed from: b */
    public final void m40020b() {
        this.f32133b.m40016a(false);
    }

    /* renamed from: c */
    public final void m40021c() {
        this.f32133b.m40015a(PairState.PAIR_CREATED_WITH_CARD_ABOVE);
    }

    /* renamed from: d */
    public final void m40022d() {
        if ((this.f32133b.m40014a() == PairState.PAIR_CREATED_WITH_CARD_ABOVE ? 1 : null) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OnPairCreated, expected state was ");
            stringBuilder.append(PairState.PAIR_CREATED_WITH_CARD_ABOVE);
            stringBuilder.append(' ');
            stringBuilder.append("but is ");
            stringBuilder.append(this.f32133b.m40014a());
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        this.f32133b.m40015a(PairState.PAIR_DESTROYED_WITH_CARD_ABOVE);
        m40018f();
    }

    /* renamed from: e */
    public final void m40023e() {
        this.f32133b.m40016a(false);
        this.f32133b.m40015a(PairState.UNKNOWN);
    }

    /* renamed from: f */
    private final void m40018f() {
        if (this.f32133b.m40017b()) {
            this.f32132a.onCardAtTopOfCardStack();
        }
    }
}
