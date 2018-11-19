package com.tinder.api.model.superlikeable;

import com.squareup.moshi.Json;
import com.tinder.api.model.recs.Rec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J8\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponseData;", "", "token", "", "position", "", "userRecs", "", "Lcom/tinder/api/model/recs/Rec;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToken", "()Ljava/lang/String;", "getUserRecs", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/tinder/api/model/superlikeable/SuperLikeableGameResponseData;", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeableGameResponseData {
    @Nullable
    private final Integer position;
    @Nullable
    private final String token;
    @Nullable
    private final List<Rec> userRecs;

    @NotNull
    public static /* synthetic */ SuperLikeableGameResponseData copy$default(SuperLikeableGameResponseData superLikeableGameResponseData, String str, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = superLikeableGameResponseData.token;
        }
        if ((i & 2) != 0) {
            num = superLikeableGameResponseData.position;
        }
        if ((i & 4) != 0) {
            list = superLikeableGameResponseData.userRecs;
        }
        return superLikeableGameResponseData.copy(str, num, list);
    }

    @Nullable
    public final String component1() {
        return this.token;
    }

    @Nullable
    public final Integer component2() {
        return this.position;
    }

    @Nullable
    public final List<Rec> component3() {
        return this.userRecs;
    }

    @NotNull
    public final SuperLikeableGameResponseData copy(@Nullable String str, @Nullable Integer num, @Nullable @Json(name = "results") List<? extends Rec> list) {
        return new SuperLikeableGameResponseData(str, num, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SuperLikeableGameResponseData) {
                SuperLikeableGameResponseData superLikeableGameResponseData = (SuperLikeableGameResponseData) obj;
                if (C2668g.a(this.token, superLikeableGameResponseData.token) && C2668g.a(this.position, superLikeableGameResponseData.position) && C2668g.a(this.userRecs, superLikeableGameResponseData.userRecs)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.position;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        List list = this.userRecs;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperLikeableGameResponseData(token=");
        stringBuilder.append(this.token);
        stringBuilder.append(", position=");
        stringBuilder.append(this.position);
        stringBuilder.append(", userRecs=");
        stringBuilder.append(this.userRecs);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SuperLikeableGameResponseData(@Nullable String str, @Nullable Integer num, @Nullable @Json(name = "results") List<? extends Rec> list) {
        this.token = str;
        this.position = num;
        this.userRecs = list;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final Integer getPosition() {
        return this.position;
    }

    @Nullable
    public final List<Rec> getUserRecs() {
        return this.userRecs;
    }
}
