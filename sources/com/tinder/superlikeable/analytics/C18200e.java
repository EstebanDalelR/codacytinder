package com.tinder.superlikeable.analytics;

import com.tinder.domain.common.model.Photo;
import com.tinder.domain.recs.model.Swipe.Method;
import com.tinder.domain.recs.model.SwipeMethod;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.domain.superlikeable.SuperLikeableGameSwipeTracker;
import com.tinder.domain.superlikeable.model.SuperLikeableGame;
import com.tinder.superlikeable.C15139b;
import com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent.SuperLikeablePosition;
import com.tinder.superlikeable.analytics.AddSuperLikeableSessionEvent.C15090a;
import com.tinder.superlikeable.analytics.AddSuperLikeableSessionEvent.Source;
import com.tinder.superlikeable.analytics.C16895d.C15093a;
import com.tinder.superlikeable.analytics.C18196a.C15091a;
import com.tinder.superlikeable.view.SuperLikeableViewContainer.C16902a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeUtils;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J \u0010$\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/tinder/superlikeable/analytics/AnalyticsSuperLikeableGameListener;", "Lcom/tinder/superlikeable/view/SuperLikeableViewContainer$SimpleGameListener;", "addSuperLikeableViewEvent", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableViewEvent;", "addSuperLikeableSessionEvent", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent;", "addSuperLikeableGameInteractEvent", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableGameInteractEvent;", "superLikeableConfig", "Lcom/tinder/superlikeable/SuperLikeableConfig;", "swipeTracker", "Lcom/tinder/domain/superlikeable/SuperLikeableGameSwipeTracker;", "(Lcom/tinder/superlikeable/analytics/AddSuperLikeableViewEvent;Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent;Lcom/tinder/superlikeable/analytics/AddSuperLikeableGameInteractEvent;Lcom/tinder/superlikeable/SuperLikeableConfig;Lcom/tinder/domain/superlikeable/SuperLikeableGameSwipeTracker;)V", "openedProfiles", "", "Lcom/tinder/domain/recs/model/UserRec;", "startTimeMs", "", "superLikeableGame", "Lcom/tinder/domain/superlikeable/model/SuperLikeableGame;", "calculateAge", "", "userRec", "methodForSwipeMethod", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Method;", "swipeMethod", "Lcom/tinder/domain/recs/model/Swipe$Method;", "onBackClick", "", "onGameEnd", "source", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableSessionEvent$Source;", "onGameStart", "game", "onProfileOpen", "onSkipClick", "onSuperLikeSwipe", "recIndex", "profileOpenCount", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.analytics.e */
public final class C18200e extends C16902a {
    /* renamed from: a */
    private final Set<UserRec> f56417a = ((Set) new LinkedHashSet());
    /* renamed from: b */
    private long f56418b;
    /* renamed from: c */
    private SuperLikeableGame f56419c;
    /* renamed from: d */
    private final C16895d f56420d;
    /* renamed from: e */
    private final AddSuperLikeableSessionEvent f56421e;
    /* renamed from: f */
    private final C18196a f56422f;
    /* renamed from: g */
    private final C15139b f56423g;
    /* renamed from: h */
    private final SuperLikeableGameSwipeTracker f56424h;

    @Inject
    public C18200e(@NotNull C16895d c16895d, @NotNull AddSuperLikeableSessionEvent addSuperLikeableSessionEvent, @NotNull C18196a c18196a, @NotNull C15139b c15139b, @NotNull SuperLikeableGameSwipeTracker superLikeableGameSwipeTracker) {
        C2668g.b(c16895d, "addSuperLikeableViewEvent");
        C2668g.b(addSuperLikeableSessionEvent, "addSuperLikeableSessionEvent");
        C2668g.b(c18196a, "addSuperLikeableGameInteractEvent");
        C2668g.b(c15139b, "superLikeableConfig");
        C2668g.b(superLikeableGameSwipeTracker, "swipeTracker");
        this.f56420d = c16895d;
        this.f56421e = addSuperLikeableSessionEvent;
        this.f56422f = c18196a;
        this.f56423g = c15139b;
        this.f56424h = superLikeableGameSwipeTracker;
    }

    public void onGameStart(@NotNull SuperLikeableGame superLikeableGame) {
        C2668g.b(superLikeableGame, "game");
        this.f56419c = superLikeableGame;
        this.f56418b = DateTimeUtils.a();
        superLikeableGame = this.f56419c;
        if (superLikeableGame == null) {
            C2668g.b("superLikeableGame");
        }
        superLikeableGame = superLikeableGame.getSuperLikeableRecs();
        if (superLikeableGame.size() != this.f56423g.m56968a()) {
            C0001a.d("Expected Recs Count to be 4", new Object[0]);
            return;
        }
        String id = ((UserRec) superLikeableGame.get(0)).getId();
        int a = m65982a((UserRec) superLikeableGame.get(0));
        String id2 = ((UserRec) superLikeableGame.get(1)).getId();
        int a2 = m65982a((UserRec) superLikeableGame.get(1));
        String id3 = ((UserRec) superLikeableGame.get(2)).getId();
        int a3 = m65982a((UserRec) superLikeableGame.get(2));
        String id4 = ((UserRec) superLikeableGame.get(3)).getId();
        superLikeableGame = m65982a((UserRec) superLikeableGame.get(3));
        int numberOfSwipesTracked = this.f56424h.numberOfSwipesTracked();
        SuperLikeableGame superLikeableGame2 = this.f56419c;
        if (superLikeableGame2 == null) {
            C2668g.b("superLikeableGame");
        }
        this.f56420d.m62495a(new C15093a(id, a, id2, a2, id3, a3, id4, superLikeableGame, numberOfSwipesTracked, superLikeableGame2.getTokenId()));
    }

    public void onSkipClick() {
        m65984a(Source.SKIP);
    }

    public void onBackClick() {
        m65984a(Source.BACK);
    }

    public void onSuperLikeSwipe(@NotNull UserRec userRec, @NotNull Method method, int i) {
        C2668g.b(userRec, "userRec");
        C2668g.b(method, "swipeMethod");
        m65984a(Source.SUPERLIKE);
        userRec = this.f56422f;
        int numberOfSwipesTracked = this.f56424h.numberOfSwipesTracked();
        SuperLikeableGame superLikeableGame = this.f56419c;
        if (superLikeableGame == null) {
            C2668g.b("superLikeableGame");
        }
        userRec.m65974a(new C15091a(numberOfSwipesTracked, superLikeableGame.getTokenId(), SuperLikeablePosition.Companion.m56839a(i), m65983a(method)));
    }

    public void onProfileOpen(@NotNull UserRec userRec) {
        C2668g.b(userRec, "userRec");
        this.f56417a.add(userRec);
    }

    /* renamed from: a */
    private final void m65984a(Source source) {
        long a = DateTimeUtils.a() - this.f56418b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Game length was ");
        stringBuilder.append(a);
        stringBuilder.append(", exited via ");
        stringBuilder.append(source);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        SuperLikeableGame superLikeableGame = this.f56419c;
        if (superLikeableGame == null) {
            C2668g.b("superLikeableGame");
        }
        Iterable<UserRec> superLikeableRecs = superLikeableGame.getSuperLikeableRecs();
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) superLikeableRecs, 10));
        for (UserRec user : superLikeableRecs) {
            List photos = user.getUser().photos();
            C2668g.a(photos, "userRec.user.photos()");
            arrayList.add(((Photo) C19299w.m68829f(photos)).url());
        }
        List l = C19299w.m68840l((List) arrayList);
        AddSuperLikeableSessionEvent addSuperLikeableSessionEvent = this.f56421e;
        int numberOfSwipesTracked = this.f56424h.numberOfSwipesTracked();
        SuperLikeableGame superLikeableGame2 = this.f56419c;
        if (superLikeableGame2 == null) {
            C2668g.b("superLikeableGame");
        }
        addSuperLikeableSessionEvent.m62494a(new C15090a(numberOfSwipesTracked, superLikeableGame2.getTokenId(), a, m65981a(), source, l));
    }

    /* renamed from: a */
    private final AddSuperLikeableInteractEvent.Method m65983a(Method method) {
        if (method == SwipeMethod.CARD) {
            return AddSuperLikeableInteractEvent.Method.SWIPE;
        }
        return AddSuperLikeableInteractEvent.Method.BUTTON;
    }

    /* renamed from: a */
    private final int m65982a(com.tinder.domain.recs.model.UserRec r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = -1;
        r3 = r3.getAge();	 Catch:{ NumberFormatException -> 0x0014, NullPointerException -> 0x000f }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NumberFormatException -> 0x0014, NullPointerException -> 0x000f }
        r1 = "Integer.valueOf(userRec.age)";	 Catch:{ NumberFormatException -> 0x0014, NullPointerException -> 0x000f }
        kotlin.jvm.internal.C2668g.a(r3, r1);	 Catch:{ NumberFormatException -> 0x0014, NullPointerException -> 0x000f }
        goto L_0x0018;
    L_0x000f:
        r3 = java.lang.Integer.valueOf(r0);
        goto L_0x0018;
    L_0x0014:
        r3 = java.lang.Integer.valueOf(r0);
    L_0x0018:
        r3 = r3.intValue();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.superlikeable.analytics.e.a(com.tinder.domain.recs.model.UserRec):int");
    }

    /* renamed from: a */
    private final int m65981a() {
        return this.f56417a.size();
    }
}
