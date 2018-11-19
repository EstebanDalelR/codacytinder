package com.tinder.recs.analytics;

import android.os.SystemClock;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10682a;
import com.tinder.common.navigation.Screen.C10683b;
import com.tinder.common.navigation.Screen.C10692k;
import com.tinder.common.navigation.Screen.Matches;
import com.tinder.domain.config.model.ProfileEditingConfig;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.etl.event.uk;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0007+,-./01B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\u001a\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020!H\u0002J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u0013H\u0007J\b\u0010(\u001a\u00020\u0013H\u0007J\f\u0010)\u001a\u00020\u001d*\u00020!H\u0002J\f\u0010*\u001a\u00020&*\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/tinder/recs/analytics/RecsSessionTracker;", "", "currentScreenTracker", "Lcom/tinder/common/navigation/CurrentScreenTracker;", "recsSession", "Lcom/tinder/recs/analytics/RecsSessionTracker$RecsSession;", "addRecsSessionEvent", "Lcom/tinder/recs/analytics/AddRecsSessionEvent;", "systemUpTimeProvider", "Lcom/tinder/recs/analytics/RecsSessionTracker$SystemUpTimeProvider;", "(Lcom/tinder/common/navigation/CurrentScreenTracker;Lcom/tinder/recs/analytics/RecsSessionTracker$RecsSession;Lcom/tinder/recs/analytics/AddRecsSessionEvent;Lcom/tinder/recs/analytics/RecsSessionTracker$SystemUpTimeProvider;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "isAppOpenPush", "", "()Z", "setAppOpenPush", "(Z)V", "addRecProfileOpened", "", "rec", "Lcom/tinder/domain/recs/model/Rec;", "addRecRewind", "addRecSwiped", "swipeType", "Lcom/tinder/domain/recs/model/Swipe$Type;", "addRecViewed", "endSession", "destination", "Lcom/tinder/recs/analytics/RecsSessionTracker$Destination;", "isSessionActive", "onScreenChange", "previousScreen", "Lcom/tinder/common/navigation/Screen;", "currentScreen", "setAppOpenFromPushMessage", "startSession", "source", "Lcom/tinder/recs/analytics/RecsSessionTracker$Source;", "startTracking", "stopTracking", "toDestination", "toSource", "Destination", "RecsScreen", "RecsSession", "RecsSessionFactory", "SessionState", "Source", "SystemUpTimeProvider", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsSessionTracker {
    private final AddRecsSessionEvent addRecsSessionEvent;
    private final CurrentScreenTracker currentScreenTracker;
    private Disposable disposable;
    private boolean isAppOpenPush;
    private final RecsSession recsSession;
    private final SystemUpTimeProvider systemUpTimeProvider;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/recs/analytics/RecsSessionTracker$Destination;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCOUNT", "MATCH_LIST", "BACKGROUND", "UNKNOWN", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Destination {
        ;
        
        @NotNull
        private final String value;

        protected Destination(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/recs/analytics/RecsSessionTracker$RecsScreen;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CARD_STACK", "FAST_MATCH", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum RecsScreen {
        ;
        
        @NotNull
        private final String value;

        protected RecsScreen(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0002\u0010\u0016J\u0006\u00102\u001a\u000203J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\u0019\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0019\u00109\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0019\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0019\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0019\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\u0019\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003Já\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\b\u0010F\u001a\u00020\u0014H\u0002J\u0006\u0010G\u001a\u00020HJ\t\u0010I\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R!\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c¨\u0006J"}, d2 = {"Lcom/tinder/recs/analytics/RecsSessionTracker$RecsSession;", "", "screen", "Lcom/tinder/recs/analytics/RecsSessionTracker$RecsScreen;", "recViewed", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "profileOpened", "swipes", "likes", "superLikes", "rewinds", "sessionState", "Lcom/tinder/recs/analytics/RecsSessionTracker$SessionState;", "source", "Lcom/tinder/recs/analytics/RecsSessionTracker$Source;", "destination", "Lcom/tinder/recs/analytics/RecsSessionTracker$Destination;", "sessionStartTimeMillis", "", "sessionEndTimeMillis", "(Lcom/tinder/recs/analytics/RecsSessionTracker$RecsScreen;Ljava/util/HashSet;Ljava/util/HashSet;Ljava/util/HashSet;Ljava/util/HashSet;Ljava/util/HashSet;Ljava/util/HashSet;Lcom/tinder/recs/analytics/RecsSessionTracker$SessionState;Lcom/tinder/recs/analytics/RecsSessionTracker$Source;Lcom/tinder/recs/analytics/RecsSessionTracker$Destination;JJ)V", "getDestination", "()Lcom/tinder/recs/analytics/RecsSessionTracker$Destination;", "setDestination", "(Lcom/tinder/recs/analytics/RecsSessionTracker$Destination;)V", "getLikes", "()Ljava/util/HashSet;", "getProfileOpened", "getRecViewed", "getRewinds", "getScreen", "()Lcom/tinder/recs/analytics/RecsSessionTracker$RecsScreen;", "getSessionEndTimeMillis", "()J", "setSessionEndTimeMillis", "(J)V", "getSessionStartTimeMillis", "setSessionStartTimeMillis", "getSessionState", "()Lcom/tinder/recs/analytics/RecsSessionTracker$SessionState;", "setSessionState", "(Lcom/tinder/recs/analytics/RecsSessionTracker$SessionState;)V", "getSource", "()Lcom/tinder/recs/analytics/RecsSessionTracker$Source;", "setSource", "(Lcom/tinder/recs/analytics/RecsSessionTracker$Source;)V", "getSuperLikes", "getSwipes", "clear", "", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "sessionDurationMillis", "toRecsSessionEvent", "Lcom/tinder/etl/event/RecsSessionEvent;", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class RecsSession {
        @NotNull
        private Destination destination;
        @NotNull
        private final HashSet<String> likes;
        @NotNull
        private final HashSet<String> profileOpened;
        @NotNull
        private final HashSet<String> recViewed;
        @NotNull
        private final HashSet<String> rewinds;
        @NotNull
        private final RecsScreen screen;
        private long sessionEndTimeMillis;
        private long sessionStartTimeMillis;
        @NotNull
        private SessionState sessionState;
        @NotNull
        private Source source;
        @NotNull
        private final HashSet<String> superLikes;
        @NotNull
        private final HashSet<String> swipes;

        @NotNull
        public static /* synthetic */ RecsSession copy$default(RecsSession recsSession, RecsScreen recsScreen, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, HashSet hashSet4, HashSet hashSet5, HashSet hashSet6, SessionState sessionState, Source source, Destination destination, long j, long j2, int i, Object obj) {
            RecsSession recsSession2 = recsSession;
            int i2 = i;
            return recsSession2.copy((i2 & 1) != 0 ? recsSession2.screen : recsScreen, (i2 & 2) != 0 ? recsSession2.recViewed : hashSet, (i2 & 4) != 0 ? recsSession2.profileOpened : hashSet2, (i2 & 8) != 0 ? recsSession2.swipes : hashSet3, (i2 & 16) != 0 ? recsSession2.likes : hashSet4, (i2 & 32) != 0 ? recsSession2.superLikes : hashSet5, (i2 & 64) != 0 ? recsSession2.rewinds : hashSet6, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? recsSession2.sessionState : sessionState, (i2 & 256) != 0 ? recsSession2.source : source, (i2 & 512) != 0 ? recsSession2.destination : destination, (i2 & 1024) != 0 ? recsSession2.sessionStartTimeMillis : j, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? recsSession2.sessionEndTimeMillis : j2);
        }

        @NotNull
        public final RecsScreen component1() {
            return this.screen;
        }

        @NotNull
        public final Destination component10() {
            return this.destination;
        }

        public final long component11() {
            return this.sessionStartTimeMillis;
        }

        public final long component12() {
            return this.sessionEndTimeMillis;
        }

        @NotNull
        public final HashSet<String> component2() {
            return this.recViewed;
        }

        @NotNull
        public final HashSet<String> component3() {
            return this.profileOpened;
        }

        @NotNull
        public final HashSet<String> component4() {
            return this.swipes;
        }

        @NotNull
        public final HashSet<String> component5() {
            return this.likes;
        }

        @NotNull
        public final HashSet<String> component6() {
            return this.superLikes;
        }

        @NotNull
        public final HashSet<String> component7() {
            return this.rewinds;
        }

        @NotNull
        public final SessionState component8() {
            return this.sessionState;
        }

        @NotNull
        public final Source component9() {
            return this.source;
        }

        @NotNull
        public final RecsSession copy(@NotNull RecsScreen recsScreen, @NotNull HashSet<String> hashSet, @NotNull HashSet<String> hashSet2, @NotNull HashSet<String> hashSet3, @NotNull HashSet<String> hashSet4, @NotNull HashSet<String> hashSet5, @NotNull HashSet<String> hashSet6, @NotNull SessionState sessionState, @NotNull Source source, @NotNull Destination destination, long j, long j2) {
            RecsScreen recsScreen2 = recsScreen;
            C2668g.b(recsScreen2, "screen");
            HashSet<String> hashSet7 = hashSet;
            C2668g.b(hashSet7, "recViewed");
            HashSet<String> hashSet8 = hashSet2;
            C2668g.b(hashSet8, "profileOpened");
            HashSet<String> hashSet9 = hashSet3;
            C2668g.b(hashSet9, "swipes");
            HashSet<String> hashSet10 = hashSet4;
            C2668g.b(hashSet10, ManagerWebServices.FB_PARAM_LIKES);
            HashSet<String> hashSet11 = hashSet5;
            C2668g.b(hashSet11, "superLikes");
            HashSet<String> hashSet12 = hashSet6;
            C2668g.b(hashSet12, "rewinds");
            SessionState sessionState2 = sessionState;
            C2668g.b(sessionState2, "sessionState");
            Source source2 = source;
            C2668g.b(source2, "source");
            Destination destination2 = destination;
            C2668g.b(destination2, "destination");
            return new RecsSession(recsScreen2, hashSet7, hashSet8, hashSet9, hashSet10, hashSet11, hashSet12, sessionState2, source2, destination2, j, j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RecsSession) {
                RecsSession recsSession = (RecsSession) obj;
                if (C2668g.a(this.screen, recsSession.screen) && C2668g.a(this.recViewed, recsSession.recViewed) && C2668g.a(this.profileOpened, recsSession.profileOpened) && C2668g.a(this.swipes, recsSession.swipes) && C2668g.a(this.likes, recsSession.likes) && C2668g.a(this.superLikes, recsSession.superLikes) && C2668g.a(this.rewinds, recsSession.rewinds) && C2668g.a(this.sessionState, recsSession.sessionState) && C2668g.a(this.source, recsSession.source) && C2668g.a(this.destination, recsSession.destination)) {
                    if ((this.sessionStartTimeMillis == recsSession.sessionStartTimeMillis ? 1 : null) != null) {
                        if ((this.sessionEndTimeMillis == recsSession.sessionEndTimeMillis ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            RecsScreen recsScreen = this.screen;
            int i = 0;
            int hashCode = (recsScreen != null ? recsScreen.hashCode() : 0) * 31;
            HashSet hashSet = this.recViewed;
            hashCode = (hashCode + (hashSet != null ? hashSet.hashCode() : 0)) * 31;
            hashSet = this.profileOpened;
            hashCode = (hashCode + (hashSet != null ? hashSet.hashCode() : 0)) * 31;
            hashSet = this.swipes;
            hashCode = (hashCode + (hashSet != null ? hashSet.hashCode() : 0)) * 31;
            hashSet = this.likes;
            hashCode = (hashCode + (hashSet != null ? hashSet.hashCode() : 0)) * 31;
            hashSet = this.superLikes;
            hashCode = (hashCode + (hashSet != null ? hashSet.hashCode() : 0)) * 31;
            hashSet = this.rewinds;
            hashCode = (hashCode + (hashSet != null ? hashSet.hashCode() : 0)) * 31;
            SessionState sessionState = this.sessionState;
            hashCode = (hashCode + (sessionState != null ? sessionState.hashCode() : 0)) * 31;
            Source source = this.source;
            hashCode = (hashCode + (source != null ? source.hashCode() : 0)) * 31;
            Destination destination = this.destination;
            if (destination != null) {
                i = destination.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j = this.sessionStartTimeMillis;
            hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            j = this.sessionEndTimeMillis;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RecsSession(screen=");
            stringBuilder.append(this.screen);
            stringBuilder.append(", recViewed=");
            stringBuilder.append(this.recViewed);
            stringBuilder.append(", profileOpened=");
            stringBuilder.append(this.profileOpened);
            stringBuilder.append(", swipes=");
            stringBuilder.append(this.swipes);
            stringBuilder.append(", likes=");
            stringBuilder.append(this.likes);
            stringBuilder.append(", superLikes=");
            stringBuilder.append(this.superLikes);
            stringBuilder.append(", rewinds=");
            stringBuilder.append(this.rewinds);
            stringBuilder.append(", sessionState=");
            stringBuilder.append(this.sessionState);
            stringBuilder.append(", source=");
            stringBuilder.append(this.source);
            stringBuilder.append(", destination=");
            stringBuilder.append(this.destination);
            stringBuilder.append(", sessionStartTimeMillis=");
            stringBuilder.append(this.sessionStartTimeMillis);
            stringBuilder.append(", sessionEndTimeMillis=");
            stringBuilder.append(this.sessionEndTimeMillis);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public RecsSession(@NotNull RecsScreen recsScreen, @NotNull HashSet<String> hashSet, @NotNull HashSet<String> hashSet2, @NotNull HashSet<String> hashSet3, @NotNull HashSet<String> hashSet4, @NotNull HashSet<String> hashSet5, @NotNull HashSet<String> hashSet6, @NotNull SessionState sessionState, @NotNull Source source, @NotNull Destination destination, long j, long j2) {
            C2668g.b(recsScreen, "screen");
            C2668g.b(hashSet, "recViewed");
            C2668g.b(hashSet2, "profileOpened");
            C2668g.b(hashSet3, "swipes");
            C2668g.b(hashSet4, ManagerWebServices.FB_PARAM_LIKES);
            C2668g.b(hashSet5, "superLikes");
            C2668g.b(hashSet6, "rewinds");
            C2668g.b(sessionState, "sessionState");
            C2668g.b(source, "source");
            C2668g.b(destination, "destination");
            this.screen = recsScreen;
            this.recViewed = hashSet;
            this.profileOpened = hashSet2;
            this.swipes = hashSet3;
            this.likes = hashSet4;
            this.superLikes = hashSet5;
            this.rewinds = hashSet6;
            this.sessionState = sessionState;
            this.source = source;
            this.destination = destination;
            this.sessionStartTimeMillis = j;
            this.sessionEndTimeMillis = j2;
        }

        @NotNull
        public final RecsScreen getScreen() {
            return this.screen;
        }

        public /* synthetic */ RecsSession(RecsScreen recsScreen, HashSet hashSet, HashSet hashSet2, HashSet hashSet3, HashSet hashSet4, HashSet hashSet5, HashSet hashSet6, SessionState sessionState, Source source, Destination destination, long j, long j2, int i, C15823e c15823e) {
            int i2 = i;
            this(recsScreen, (i2 & 2) != 0 ? new HashSet() : hashSet, (i2 & 4) != 0 ? new HashSet() : hashSet2, (i2 & 8) != 0 ? new HashSet() : hashSet3, (i2 & 16) != 0 ? new HashSet() : hashSet4, (i2 & 32) != 0 ? new HashSet() : hashSet5, (i2 & 64) != 0 ? new HashSet() : hashSet6, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? SessionState.INACTIVE : sessionState, (i2 & 256) != 0 ? Source.OPEN : source, (i2 & 512) != 0 ? Destination.UNKNOWN : destination, (i2 & 1024) != 0 ? Long.MIN_VALUE : j, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? Long.MIN_VALUE : j2);
        }

        @NotNull
        public final HashSet<String> getRecViewed() {
            return this.recViewed;
        }

        @NotNull
        public final HashSet<String> getProfileOpened() {
            return this.profileOpened;
        }

        @NotNull
        public final HashSet<String> getSwipes() {
            return this.swipes;
        }

        @NotNull
        public final HashSet<String> getLikes() {
            return this.likes;
        }

        @NotNull
        public final HashSet<String> getSuperLikes() {
            return this.superLikes;
        }

        @NotNull
        public final HashSet<String> getRewinds() {
            return this.rewinds;
        }

        @NotNull
        public final SessionState getSessionState() {
            return this.sessionState;
        }

        public final void setSessionState(@NotNull SessionState sessionState) {
            C2668g.b(sessionState, "<set-?>");
            this.sessionState = sessionState;
        }

        @NotNull
        public final Source getSource() {
            return this.source;
        }

        public final void setSource(@NotNull Source source) {
            C2668g.b(source, "<set-?>");
            this.source = source;
        }

        @NotNull
        public final Destination getDestination() {
            return this.destination;
        }

        public final void setDestination(@NotNull Destination destination) {
            C2668g.b(destination, "<set-?>");
            this.destination = destination;
        }

        public final long getSessionStartTimeMillis() {
            return this.sessionStartTimeMillis;
        }

        public final void setSessionStartTimeMillis(long j) {
            this.sessionStartTimeMillis = j;
        }

        public final long getSessionEndTimeMillis() {
            return this.sessionEndTimeMillis;
        }

        public final void setSessionEndTimeMillis(long j) {
            this.sessionEndTimeMillis = j;
        }

        public final void clear() {
            this.sessionStartTimeMillis = Long.MIN_VALUE;
            this.sessionEndTimeMillis = Long.MIN_VALUE;
            this.source = Source.UNKNOWN;
            this.destination = Destination.UNKNOWN;
            this.recViewed.clear();
            this.profileOpened.clear();
            this.swipes.clear();
            this.likes.clear();
            this.superLikes.clear();
            this.rewinds.clear();
        }

        private final long sessionDurationMillis() {
            return this.sessionEndTimeMillis - this.sessionStartTimeMillis;
        }

        @NotNull
        public final uk toRecsSessionEvent() {
            uk a = uk.a().b(this.screen.getValue()).c(this.source.getValue()).a(this.destination.getValue()).d(Integer.valueOf(this.recViewed.size())).c(Integer.valueOf(this.profileOpened.size())).f(Integer.valueOf(this.swipes.size())).b(Integer.valueOf(this.likes.size())).g(Integer.valueOf(this.superLikes.size())).e(Integer.valueOf(this.rewinds.size())).a(Long.valueOf(sessionDurationMillis())).a();
            C2668g.a(a, "RecsSessionEvent.builder…                 .build()");
            return a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recs/analytics/RecsSessionTracker$RecsSessionFactory;", "", "()V", "createRecsSession", "Lcom/tinder/recs/analytics/RecsSessionTracker$RecsSession;", "screen", "Lcom/tinder/recs/analytics/RecsSessionTracker$RecsScreen;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class RecsSessionFactory {
        @NotNull
        public final RecsSession createRecsSession(@NotNull RecsScreen recsScreen) {
            RecsScreen recsScreen2 = recsScreen;
            C2668g.b(recsScreen2, "screen");
            return new RecsSession(recsScreen2, null, null, null, null, null, null, null, null, null, 0, 0, 4094, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/recs/analytics/RecsSessionTracker$SessionState;", "", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum SessionState {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/tinder/recs/analytics/RecsSessionTracker$Source;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OPEN", "ACCOUNT", "MATCH_LIST", "PUSH", "BACKGROUND", "UNKNOWN", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Source {
        ;
        
        @NotNull
        private final String value;

        protected Source(String str) {
            C2668g.b(str, "value");
            this.value = str;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/recs/analytics/RecsSessionTracker$SystemUpTimeProvider;", "", "()V", "uptimeMillis", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class SystemUpTimeProvider {
        public final long uptimeMillis() {
            return SystemClock.uptimeMillis();
        }
    }

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Type.values().length];

        static {
            $EnumSwitchMapping$0[Type.LIKE.ordinal()] = 1;
            $EnumSwitchMapping$0[Type.SUPERLIKE.ordinal()] = 2;
        }
    }

    public RecsSessionTracker(@NotNull CurrentScreenTracker currentScreenTracker, @NotNull RecsSession recsSession, @NotNull AddRecsSessionEvent addRecsSessionEvent, @NotNull SystemUpTimeProvider systemUpTimeProvider) {
        C2668g.b(currentScreenTracker, "currentScreenTracker");
        C2668g.b(recsSession, "recsSession");
        C2668g.b(addRecsSessionEvent, "addRecsSessionEvent");
        C2668g.b(systemUpTimeProvider, "systemUpTimeProvider");
        this.currentScreenTracker = currentScreenTracker;
        this.recsSession = recsSession;
        this.addRecsSessionEvent = addRecsSessionEvent;
        this.systemUpTimeProvider = systemUpTimeProvider;
    }

    public /* synthetic */ RecsSessionTracker(CurrentScreenTracker currentScreenTracker, RecsSession recsSession, AddRecsSessionEvent addRecsSessionEvent, SystemUpTimeProvider systemUpTimeProvider, int i, C15823e c15823e) {
        if ((i & 8) != 0) {
            systemUpTimeProvider = new SystemUpTimeProvider();
        }
        this(currentScreenTracker, recsSession, addRecsSessionEvent, systemUpTimeProvider);
    }

    public final boolean isAppOpenPush() {
        return this.isAppOpenPush;
    }

    public final void setAppOpenPush(boolean z) {
        this.isAppOpenPush = z;
    }

    public final synchronized void startTracking() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        C3959e filter = this.currentScreenTracker.observe().observeOn(C15756a.m59010b()).map(RecsSessionTracker$startTracking$1.INSTANCE).scan(RecsSessionTracker$startTracking$2.INSTANCE).filter(RecsSessionTracker$startTracking$3.INSTANCE);
        Consumer recsSessionTracker$startTracking$4 = new RecsSessionTracker$startTracking$4(this);
        Function1 function1 = RecsSessionTracker$startTracking$5.INSTANCE;
        if (function1 != null) {
            function1 = new RecsSessionTracker$sam$io_reactivex_functions_Consumer$0(function1);
        }
        this.disposable = filter.subscribe(recsSessionTracker$startTracking$4, (Consumer) function1);
    }

    public final synchronized void stopTracking() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        if (isSessionActive()) {
            endSession(Destination.UNKNOWN);
        }
    }

    public final synchronized void addRecViewed(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        if (isSessionActive()) {
            this.recsSession.getRecViewed().add(rec.getId());
        }
    }

    public final synchronized void addRecProfileOpened(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        if (isSessionActive()) {
            this.recsSession.getProfileOpened().add(rec.getId());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void addRecSwiped(@org.jetbrains.annotations.NotNull com.tinder.domain.recs.model.Rec r3, @org.jetbrains.annotations.NotNull com.tinder.domain.recs.model.Swipe.Type r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = "rec";
        kotlin.jvm.internal.C2668g.b(r3, r0);	 Catch:{ all -> 0x0049 }
        r0 = "swipeType";
        kotlin.jvm.internal.C2668g.b(r4, r0);	 Catch:{ all -> 0x0049 }
        r0 = r2.isSessionActive();	 Catch:{ all -> 0x0049 }
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r2);
        return;
    L_0x0013:
        r0 = r2.recsSession;	 Catch:{ all -> 0x0049 }
        r0 = r0.getSwipes();	 Catch:{ all -> 0x0049 }
        r1 = r3.getId();	 Catch:{ all -> 0x0049 }
        r0.add(r1);	 Catch:{ all -> 0x0049 }
        r0 = com.tinder.recs.analytics.RecsSessionTracker.WhenMappings.$EnumSwitchMapping$0;	 Catch:{ all -> 0x0049 }
        r4 = r4.ordinal();	 Catch:{ all -> 0x0049 }
        r4 = r0[r4];	 Catch:{ all -> 0x0049 }
        switch(r4) {
            case 1: goto L_0x003a;
            case 2: goto L_0x002c;
            default: goto L_0x002b;
        };	 Catch:{ all -> 0x0049 }
    L_0x002b:
        goto L_0x0047;
    L_0x002c:
        r4 = r2.recsSession;	 Catch:{ all -> 0x0049 }
        r4 = r4.getSuperLikes();	 Catch:{ all -> 0x0049 }
        r3 = r3.getId();	 Catch:{ all -> 0x0049 }
        r4.add(r3);	 Catch:{ all -> 0x0049 }
        goto L_0x0047;
    L_0x003a:
        r4 = r2.recsSession;	 Catch:{ all -> 0x0049 }
        r4 = r4.getLikes();	 Catch:{ all -> 0x0049 }
        r3 = r3.getId();	 Catch:{ all -> 0x0049 }
        r4.add(r3);	 Catch:{ all -> 0x0049 }
    L_0x0047:
        monitor-exit(r2);
        return;
    L_0x0049:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.analytics.RecsSessionTracker.addRecSwiped(com.tinder.domain.recs.model.Rec, com.tinder.domain.recs.model.Swipe$Type):void");
    }

    public final synchronized void addRecRewind(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        if (isSessionActive()) {
            this.recsSession.getRewinds().add(rec.getId());
            this.recsSession.getLikes().remove(rec.getId());
            this.recsSession.getSuperLikes().remove(rec.getId());
        }
    }

    public final void setAppOpenFromPushMessage(boolean z) {
        this.isAppOpenPush = z;
        if (isSessionActive() && z) {
            this.recsSession.setSource(Source.PUSH);
        }
    }

    private final void onScreenChange(Screen screen, Screen screen2) {
        Source toSource;
        if (screen != null) {
            toSource = toSource(screen);
            if (toSource != null) {
                if (C2668g.a(screen2, C10692k.f35033a)) {
                    startSession(toSource);
                } else if (C2668g.a(screen, C10692k.f35033a) != null) {
                    endSession(toDestination(screen2));
                }
            }
        }
        toSource = this.isAppOpenPush ? Source.PUSH : Source.OPEN;
        if (C2668g.a(screen2, C10692k.f35033a)) {
            startSession(toSource);
        } else if (C2668g.a(screen, C10692k.f35033a) != null) {
            endSession(toDestination(screen2));
        }
    }

    private final void startSession(Source source) {
        if (this.recsSession.getSessionState() == SessionState.ACTIVE) {
            endSession(Destination.UNKNOWN);
        }
        this.recsSession.setSessionState(SessionState.ACTIVE);
        this.recsSession.setSource(source);
        this.recsSession.setSessionStartTimeMillis(this.systemUpTimeProvider.uptimeMillis());
    }

    private final void endSession(Destination destination) {
        this.recsSession.setSessionState(SessionState.INACTIVE);
        this.recsSession.setSessionEndTimeMillis(this.systemUpTimeProvider.uptimeMillis());
        this.recsSession.setDestination(destination);
        this.addRecsSessionEvent.execute(this.recsSession.toRecsSessionEvent());
        this.recsSession.clear();
    }

    private final boolean isSessionActive() {
        return this.recsSession.getSessionState() == SessionState.ACTIVE;
    }

    private final Source toSource(@NotNull Screen screen) {
        if (screen instanceof Matches) {
            return Source.MATCH_LIST;
        }
        if (C2668g.a(screen, C10683b.f35024a)) {
            screen = Source.BACKGROUND;
        } else if (C2668g.a(screen, C10682a.f35023a) != null) {
            screen = Source.ACCOUNT;
        } else {
            screen = Source.UNKNOWN;
        }
        return screen;
    }

    private final Destination toDestination(@NotNull Screen screen) {
        if (screen instanceof Matches) {
            return Destination.MATCH_LIST;
        }
        if (C2668g.a(screen, C10683b.f35024a)) {
            screen = Destination.BACKGROUND;
        } else if (C2668g.a(screen, C10682a.f35023a) != null) {
            screen = Destination.ACCOUNT;
        } else {
            screen = Destination.UNKNOWN;
        }
        return screen;
    }
}
