package com.tinder.domain.recs.model;

import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.recs.model.RecSource.TopPicks;
import com.tinder.domain.recs.model.UserRec.Teaser;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001>B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0013\u00108\u001a\u00020\u00172\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\rH\u0016R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\rX\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0012\u0010\u0016\u001a\u00020\u0017X\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u0017X\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0012\u0010\u001d\u001a\u00020\u0017X\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0012\u0010\u001e\u001a\u00020\u0017X\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u0017XD¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0012\u0010 \u001a\u00020\u0017X\u0005¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0012\u0010!\u001a\u00020\rX\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010\u000fR\u0012\u0010#\u001a\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0014\u0010%\u001a\u00020&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u000201X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0012\u00104\u001a\u000205X\u0005¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006?"}, d2 = {"Lcom/tinder/domain/recs/model/TopPickUserRec;", "Lcom/tinder/domain/recs/model/UserRec;", "defaultUserRec", "Lcom/tinder/domain/recs/model/DefaultUserRec;", "tpType", "Lcom/tinder/domain/recs/model/TopPickUserRec$TYPE;", "expirationTime", "", "tags", "", "Lcom/tinder/domain/recs/model/Tag;", "(Lcom/tinder/domain/recs/model/DefaultUserRec;Lcom/tinder/domain/recs/model/TopPickUserRec$TYPE;JLjava/util/List;)V", "age", "", "getAge", "()Ljava/lang/String;", "contentHash", "getContentHash", "getExpirationTime", "()J", "id", "getId", "isAlreadyMatched", "", "()Z", "isBoost", "isBranded", "isFastMatch", "isRewindable", "isSelectMember", "isSuperLike", "isTopPick", "isTraveling", "name", "getName", "sNumber", "getSNumber", "source", "Lcom/tinder/domain/recs/model/RecSource;", "getSource", "()Lcom/tinder/domain/recs/model/RecSource;", "getTags", "()Ljava/util/List;", "teasers", "Lcom/tinder/domain/recs/model/UserRec$Teaser;", "getTeasers", "getTpType", "()Lcom/tinder/domain/recs/model/TopPickUserRec$TYPE;", "type", "Lcom/tinder/domain/recs/model/RecType;", "getType", "()Lcom/tinder/domain/recs/model/RecType;", "user", "Lcom/tinder/domain/common/model/PerspectableUser;", "getUser", "()Lcom/tinder/domain/common/model/PerspectableUser;", "equals", "other", "", "hashCode", "", "toString", "TYPE", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class TopPickUserRec implements UserRec {
    private final /* synthetic */ DefaultUserRec $$delegate_0;
    private final long expirationTime;
    private final boolean isBranded;
    private final boolean isFastMatch;
    private final boolean isRewindable;
    private final boolean isTopPick;
    @NotNull
    private final RecSource source = ((RecSource) TopPicks.INSTANCE);
    @NotNull
    private final List<Tag> tags;
    @NotNull
    private final List<Teaser> teasers = C19301m.a();
    @NotNull
    private final TYPE tpType;
    @NotNull
    private final RecType type = RecType.TOP_PICK;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/domain/recs/model/TopPickUserRec$TYPE;", "", "value", "", "(Ljava/lang/String;II)V", "TEASER", "DAILY", "PURCHASED", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum TYPE {
        ;
        
        public static final Companion Companion = null;
        private static final Map<Integer, TYPE> map = null;
        private final int value;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/recs/model/TopPickUserRec$TYPE$Companion;", "", "()V", "map", "", "", "Lcom/tinder/domain/recs/model/TopPickUserRec$TYPE;", "from", "value", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final TYPE from(int i) {
                Object obj = TYPE.map.get(Integer.valueOf(i));
                if (obj != null) {
                    return (TYPE) obj;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown top picks type ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
        }

        protected TYPE(int i) {
            this.value = i;
        }

        static {
            Companion = new Companion();
            TYPE[] values = values();
            Map linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(values.length), 16));
            int length = values.length;
            int i;
            while (i < length) {
                TYPE type = values[i];
                linkedHashMap.put(Integer.valueOf(type.value), type);
                i++;
            }
            map = linkedHashMap;
        }
    }

    @Nullable
    public String getAge() {
        return this.$$delegate_0.getAge();
    }

    @Nullable
    public String getContentHash() {
        return this.$$delegate_0.getContentHash();
    }

    @NotNull
    public String getId() {
        return this.$$delegate_0.getId();
    }

    @NotNull
    public String getName() {
        return this.$$delegate_0.getName();
    }

    public long getSNumber() {
        return this.$$delegate_0.getSNumber();
    }

    @NotNull
    public PerspectableUser getUser() {
        return this.$$delegate_0.getUser();
    }

    public boolean isAlreadyMatched() {
        return this.$$delegate_0.isAlreadyMatched();
    }

    public boolean isBoost() {
        return this.$$delegate_0.isBoost();
    }

    public boolean isSelectMember() {
        return this.$$delegate_0.isSelectMember();
    }

    public boolean isSuperLike() {
        return this.$$delegate_0.isSuperLike();
    }

    public boolean isTraveling() {
        return this.$$delegate_0.isTraveling();
    }

    public TopPickUserRec(@NotNull DefaultUserRec defaultUserRec, @NotNull TYPE type, long j, @NotNull List<Tag> list) {
        C2668g.b(defaultUserRec, "defaultUserRec");
        C2668g.b(type, "tpType");
        C2668g.b(list, "tags");
        this.$$delegate_0 = defaultUserRec;
        this.tpType = type;
        this.expirationTime = j;
        this.tags = list;
    }

    @NotNull
    public final TYPE getTpType() {
        return this.tpType;
    }

    public final long getExpirationTime() {
        return this.expirationTime;
    }

    @NotNull
    public final List<Tag> getTags() {
        return this.tags;
    }

    @NotNull
    public RecSource getSource() {
        return this.source;
    }

    @NotNull
    public RecType getType() {
        return this.type;
    }

    public boolean isTopPick() {
        return this.isTopPick;
    }

    public boolean isFastMatch() {
        return this.isFastMatch;
    }

    public boolean isBranded() {
        return this.isBranded;
    }

    public boolean isRewindable() {
        return this.isRewindable;
    }

    @NotNull
    public List<Teaser> getTeasers() {
        return this.teasers;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopPickUserRec) {
            return C2668g.a(getId(), ((TopPickUserRec) obj).getId());
        }
        return null;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TopPickUserRec{id=");
        stringBuilder.append(getId());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
