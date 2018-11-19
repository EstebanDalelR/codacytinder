package com.tinder.feed.analytics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/tinder/feed/analytics/FetchSource;", "", "()V", "value", "", "getValue", "()Ljava/lang/String;", "NextPage", "Open", "PullToRefresh", "Lcom/tinder/feed/analytics/FetchSource$Open;", "Lcom/tinder/feed/analytics/FetchSource$PullToRefresh;", "Lcom/tinder/feed/analytics/FetchSource$NextPage;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.analytics.e */
public abstract class C9434e {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/feed/analytics/FetchSource$NextPage;", "Lcom/tinder/feed/analytics/FetchSource;", "()V", "value", "", "getValue", "()Ljava/lang/String;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.e$a */
    public static final class C11683a extends C9434e {
        /* renamed from: a */
        public static final C11683a f38181a = new C11683a();

        @NotNull
        /* renamed from: a */
        public String mo10419a() {
            return "next page";
        }

        private C11683a() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/feed/analytics/FetchSource$Open;", "Lcom/tinder/feed/analytics/FetchSource;", "()V", "value", "", "getValue", "()Ljava/lang/String;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.e$b */
    public static final class C11684b extends C9434e {
        /* renamed from: a */
        public static final C11684b f38182a = new C11684b();

        @NotNull
        /* renamed from: a */
        public String mo10419a() {
            return "open";
        }

        private C11684b() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/feed/analytics/FetchSource$PullToRefresh;", "Lcom/tinder/feed/analytics/FetchSource;", "unseenActivityBadge", "", "(Z)V", "getUnseenActivityBadge", "()Z", "value", "", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.analytics.e$c */
    public static final class C11685c extends C9434e {
        /* renamed from: a */
        private final boolean f38183a;

        @NotNull
        /* renamed from: a */
        public String mo10419a() {
            return "pull to refresh";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C11685c) {
                if ((this.f38183a == ((C11685c) obj).f38183a ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            boolean z = this.f38183a;
            return z ? 1 : z;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PullToRefresh(unseenActivityBadge=");
            stringBuilder.append(this.f38183a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        /* renamed from: b */
        public final boolean m47495b() {
            return this.f38183a;
        }

        public C11685c(boolean z) {
            super();
            this.f38183a = z;
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract String mo10419a();

    private C9434e() {
    }
}
