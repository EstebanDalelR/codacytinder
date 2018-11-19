package com.tinder.domain.places.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tinder/domain/places/model/PlacesConfig;", "", "nextRefreshTime", "", "lastSelectedPlace", "", "newPlacesAvailable", "", "hasSeenPlacesRecsTutorial", "(JLjava/lang/String;ZZ)V", "getHasSeenPlacesRecsTutorial", "()Z", "getLastSelectedPlace", "()Ljava/lang/String;", "getNewPlacesAvailable", "getNextRefreshTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesConfig {
    private final boolean hasSeenPlacesRecsTutorial;
    @NotNull
    private final String lastSelectedPlace;
    private final boolean newPlacesAvailable;
    private final long nextRefreshTime;

    public PlacesConfig() {
        this(0, null, false, false, 15, null);
    }

    @NotNull
    public static /* synthetic */ PlacesConfig copy$default(PlacesConfig placesConfig, long j, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = placesConfig.nextRefreshTime;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = placesConfig.lastSelectedPlace;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = placesConfig.newPlacesAvailable;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = placesConfig.hasSeenPlacesRecsTutorial;
        }
        return placesConfig.copy(j2, str2, z3, z2);
    }

    public final long component1() {
        return this.nextRefreshTime;
    }

    @NotNull
    public final String component2() {
        return this.lastSelectedPlace;
    }

    public final boolean component3() {
        return this.newPlacesAvailable;
    }

    public final boolean component4() {
        return this.hasSeenPlacesRecsTutorial;
    }

    @NotNull
    public final PlacesConfig copy(long j, @NotNull String str, boolean z, boolean z2) {
        C2668g.b(str, "lastSelectedPlace");
        return new PlacesConfig(j, str, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlacesConfig) {
            PlacesConfig placesConfig = (PlacesConfig) obj;
            if ((this.nextRefreshTime == placesConfig.nextRefreshTime ? 1 : null) != null && C2668g.a(this.lastSelectedPlace, placesConfig.lastSelectedPlace)) {
                if ((this.newPlacesAvailable == placesConfig.newPlacesAvailable ? 1 : null) != null) {
                    if ((this.hasSeenPlacesRecsTutorial == placesConfig.hasSeenPlacesRecsTutorial ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.nextRefreshTime;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.lastSelectedPlace;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        int i2 = this.newPlacesAvailable;
        if (i2 != 0) {
            i2 = 1;
        }
        i = (i + i2) * 31;
        i2 = this.hasSeenPlacesRecsTutorial;
        if (i2 != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesConfig(nextRefreshTime=");
        stringBuilder.append(this.nextRefreshTime);
        stringBuilder.append(", lastSelectedPlace=");
        stringBuilder.append(this.lastSelectedPlace);
        stringBuilder.append(", newPlacesAvailable=");
        stringBuilder.append(this.newPlacesAvailable);
        stringBuilder.append(", hasSeenPlacesRecsTutorial=");
        stringBuilder.append(this.hasSeenPlacesRecsTutorial);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesConfig(long j, @NotNull String str, boolean z, boolean z2) {
        C2668g.b(str, "lastSelectedPlace");
        this.nextRefreshTime = j;
        this.lastSelectedPlace = str;
        this.newPlacesAvailable = z;
        this.hasSeenPlacesRecsTutorial = z2;
    }

    public final long getNextRefreshTime() {
        return this.nextRefreshTime;
    }

    @NotNull
    public final String getLastSelectedPlace() {
        return this.lastSelectedPlace;
    }

    public final boolean getNewPlacesAvailable() {
        return this.newPlacesAvailable;
    }

    public /* synthetic */ PlacesConfig(long j, String str, boolean z, boolean z2, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != null) {
            str = "";
        }
        this(j2, str, (i & 4) != null ? false : z, (i & 8) != null ? false : z2);
    }

    public final boolean getHasSeenPlacesRecsTutorial() {
        return this.hasSeenPlacesRecsTutorial;
    }
}
