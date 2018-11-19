package com.tinder.domain.recs.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/recs/model/RecSource;", "Lcom/tinder/domain/recs/model/Rec$Source;", "()V", "Core", "FastMatch", "Places", "TopPicks", "Lcom/tinder/domain/recs/model/RecSource$Core;", "Lcom/tinder/domain/recs/model/RecSource$FastMatch;", "Lcom/tinder/domain/recs/model/RecSource$TopPicks;", "Lcom/tinder/domain/recs/model/RecSource$Places;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class RecSource implements Rec$Source {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/model/RecSource$Core;", "Lcom/tinder/domain/recs/model/RecSource;", "()V", "id", "", "getId", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Core extends RecSource {
        public static final Core INSTANCE = new Core();
        @NotNull
        private static final String id = "CORE";

        private Core() {
            super();
        }

        @NotNull
        public String getId() {
            return id;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/model/RecSource$FastMatch;", "Lcom/tinder/domain/recs/model/RecSource;", "()V", "id", "", "getId", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class FastMatch extends RecSource {
        public static final FastMatch INSTANCE = new FastMatch();
        @NotNull
        private static final String id = "FAST-MATCH";

        private FastMatch() {
            super();
        }

        @NotNull
        public String getId() {
            return id;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/domain/recs/model/RecSource$Places;", "Lcom/tinder/domain/recs/model/RecSource;", "placeId", "", "(J)V", "id", "", "getId", "()Ljava/lang/String;", "getPlaceId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Places extends RecSource {
        private final long placeId;

        @NotNull
        public static /* synthetic */ Places copy$default(Places places, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = places.placeId;
            }
            return places.copy(j);
        }

        public final long component1() {
            return this.placeId;
        }

        @NotNull
        public final Places copy(long j) {
            return new Places(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Places) {
                if ((this.placeId == ((Places) obj).placeId ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.placeId;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Places(placeId=");
            stringBuilder.append(this.placeId);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public final long getPlaceId() {
            return this.placeId;
        }

        public Places(long j) {
            super();
            this.placeId = j;
        }

        @NotNull
        public String getId() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PLACES-");
            stringBuilder.append(this.placeId);
            return stringBuilder.toString();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/recs/model/RecSource$TopPicks;", "Lcom/tinder/domain/recs/model/RecSource;", "()V", "id", "", "getId", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class TopPicks extends RecSource {
        public static final TopPicks INSTANCE = new TopPicks();
        @NotNull
        private static final String id = "TOP-PICKS";

        private TopPicks() {
            super();
        }

        @NotNull
        public String getId() {
            return id;
        }
    }

    private RecSource() {
    }
}
