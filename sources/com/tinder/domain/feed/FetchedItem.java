package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/feed/FetchedItem;", "", "id", "", "activityId", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getId", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class FetchedItem {
    @NotNull
    private final String activityId;
    @NotNull
    private final String id;
    @NotNull
    private final String userId;

    @NotNull
    public static /* synthetic */ FetchedItem copy$default(FetchedItem fetchedItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchedItem.id;
        }
        if ((i & 2) != 0) {
            str2 = fetchedItem.activityId;
        }
        if ((i & 4) != 0) {
            str3 = fetchedItem.userId;
        }
        return fetchedItem.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.activityId;
    }

    @NotNull
    public final String component3() {
        return this.userId;
    }

    @NotNull
    public final FetchedItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "activityId");
        C2668g.b(str3, ManagerWebServices.PARAM_USER_ID);
        return new FetchedItem(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FetchedItem) {
                FetchedItem fetchedItem = (FetchedItem) obj;
                if (C2668g.a(this.id, fetchedItem.id) && C2668g.a(this.activityId, fetchedItem.activityId) && C2668g.a(this.userId, fetchedItem.userId)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.activityId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.userId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FetchedItem(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", activityId=");
        stringBuilder.append(this.activityId);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FetchedItem(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "id");
        C2668g.b(str2, "activityId");
        C2668g.b(str3, ManagerWebServices.PARAM_USER_ID);
        this.id = str;
        this.activityId = str2;
        this.userId = str3;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }
}
