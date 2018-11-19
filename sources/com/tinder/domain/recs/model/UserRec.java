package com.tinder.domain.recs.model;

import com.tinder.domain.common.model.PerspectableUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001!R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0012\u0010\u000b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\nR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0012\u0010\u000f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0012\u0010\u0010\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0012\u0010\u0011\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/tinder/domain/recs/model/UserRec;", "Lcom/tinder/domain/recs/model/Rec;", "age", "", "getAge", "()Ljava/lang/String;", "contentHash", "getContentHash", "isAlreadyMatched", "", "()Z", "isBoost", "isBranded", "isFastMatch", "isSelectMember", "isSuperLike", "isTopPick", "isTraveling", "name", "getName", "sNumber", "", "getSNumber", "()J", "teasers", "", "Lcom/tinder/domain/recs/model/UserRec$Teaser;", "getTeasers", "()Ljava/util/List;", "user", "Lcom/tinder/domain/common/model/PerspectableUser;", "getUser", "()Lcom/tinder/domain/common/model/PerspectableUser;", "Teaser", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface UserRec extends Rec {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/domain/recs/model/UserRec$Teaser;", "", "value", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Teaser {
        @NotNull
        private final String type;
        @NotNull
        private final String value;

        @NotNull
        public static /* synthetic */ Teaser copy$default(Teaser teaser, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = teaser.value;
            }
            if ((i & 2) != 0) {
                str2 = teaser.type;
            }
            return teaser.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.value;
        }

        @NotNull
        public final String component2() {
            return this.type;
        }

        @NotNull
        public final Teaser copy(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "value");
            C2668g.b(str2, "type");
            return new Teaser(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Teaser) {
                    Teaser teaser = (Teaser) obj;
                    if (C2668g.a(this.value, teaser.value) && C2668g.a(this.type, teaser.type)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.value;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.type;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Teaser(value=");
            stringBuilder.append(this.value);
            stringBuilder.append(", type=");
            stringBuilder.append(this.type);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Teaser(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "value");
            C2668g.b(str2, "type");
            this.value = str;
            this.type = str2;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Nullable
    String getAge();

    @Nullable
    String getContentHash();

    @NotNull
    String getName();

    long getSNumber();

    @NotNull
    List<Teaser> getTeasers();

    @NotNull
    PerspectableUser getUser();

    boolean isAlreadyMatched();

    boolean isBoost();

    boolean isBranded();

    boolean isFastMatch();

    boolean isSelectMember();

    boolean isSuperLike();

    boolean isTopPick();

    boolean isTraveling();
}
