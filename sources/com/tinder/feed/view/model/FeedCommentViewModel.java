package com.tinder.feed.view.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001%B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/tinder/feed/view/model/FeedCommentViewModel;", "", "feedItemId", "", "message", "createdAt", "Lorg/joda/time/DateTime;", "state", "Lcom/tinder/feed/view/model/FeedCommentViewModel$State;", "currentUserAvatarUrl", "matchId", "carouselItemId", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lcom/tinder/feed/view/model/FeedCommentViewModel$State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCarouselItemId", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCurrentUserAvatarUrl", "getFeedItemId", "getMatchId", "getMessage", "getState", "()Lcom/tinder/feed/view/model/FeedCommentViewModel$State;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "State", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedCommentViewModel {
    @NotNull
    /* renamed from: a */
    private final String f31901a;
    @NotNull
    /* renamed from: b */
    private final String f31902b;
    @NotNull
    /* renamed from: c */
    private final DateTime f31903c;
    @NotNull
    /* renamed from: d */
    private final State f31904d;
    @NotNull
    /* renamed from: e */
    private final String f31905e;
    @NotNull
    /* renamed from: f */
    private final String f31906f;
    @Nullable
    /* renamed from: g */
    private final String f31907g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/feed/view/model/FeedCommentViewModel$State;", "", "(Ljava/lang/String;I)V", "PENDING", "SENT", "FAILED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum State {
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedCommentViewModel) {
                FeedCommentViewModel feedCommentViewModel = (FeedCommentViewModel) obj;
                if (C2668g.a(this.f31901a, feedCommentViewModel.f31901a) && C2668g.a(this.f31902b, feedCommentViewModel.f31902b) && C2668g.a(this.f31903c, feedCommentViewModel.f31903c) && C2668g.a(this.f31904d, feedCommentViewModel.f31904d) && C2668g.a(this.f31905e, feedCommentViewModel.f31905e) && C2668g.a(this.f31906f, feedCommentViewModel.f31906f) && C2668g.a(this.f31907g, feedCommentViewModel.f31907g)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f31901a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31902b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DateTime dateTime = this.f31903c;
        hashCode = (hashCode + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        State state = this.f31904d;
        hashCode = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
        str2 = this.f31905e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f31906f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f31907g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedCommentViewModel(feedItemId=");
        stringBuilder.append(this.f31901a);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f31902b);
        stringBuilder.append(", createdAt=");
        stringBuilder.append(this.f31903c);
        stringBuilder.append(", state=");
        stringBuilder.append(this.f31904d);
        stringBuilder.append(", currentUserAvatarUrl=");
        stringBuilder.append(this.f31905e);
        stringBuilder.append(", matchId=");
        stringBuilder.append(this.f31906f);
        stringBuilder.append(", carouselItemId=");
        stringBuilder.append(this.f31907g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedCommentViewModel(@NotNull String str, @NotNull String str2, @NotNull DateTime dateTime, @NotNull State state, @NotNull String str3, @NotNull String str4, @Nullable String str5) {
        C2668g.b(str, "feedItemId");
        C2668g.b(str2, "message");
        C2668g.b(dateTime, "createdAt");
        C2668g.b(state, "state");
        C2668g.b(str3, "currentUserAvatarUrl");
        C2668g.b(str4, "matchId");
        this.f31901a = str;
        this.f31902b = str2;
        this.f31903c = dateTime;
        this.f31904d = state;
        this.f31905e = str3;
        this.f31906f = str4;
        this.f31907g = str5;
    }

    @NotNull
    /* renamed from: a */
    public final String m39789a() {
        return this.f31901a;
    }

    @NotNull
    /* renamed from: b */
    public final String m39790b() {
        return this.f31902b;
    }

    @NotNull
    /* renamed from: c */
    public final DateTime m39791c() {
        return this.f31903c;
    }

    @NotNull
    /* renamed from: d */
    public final State m39792d() {
        return this.f31904d;
    }

    @NotNull
    /* renamed from: e */
    public final String m39793e() {
        return this.f31905e;
    }

    @NotNull
    /* renamed from: f */
    public final String m39794f() {
        return this.f31906f;
    }

    @Nullable
    /* renamed from: g */
    public final String m39795g() {
        return this.f31907g;
    }
}
