package com.tinder.domain.feed;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/tinder/domain/feed/ProfileChangeBio;", "Lcom/tinder/domain/feed/ActivityEvent;", "userNumber", "", "timestamp", "bio", "", "oldBio", "(JJLjava/lang/String;Ljava/lang/String;)V", "getBio", "()Ljava/lang/String;", "getOldBio", "getTimestamp", "()J", "getUserNumber", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ProfileChangeBio extends ActivityEvent {
    @NotNull
    private final String bio;
    @NotNull
    private final String oldBio;
    private final long timestamp;
    private final long userNumber;

    @NotNull
    public static /* synthetic */ ProfileChangeBio copy$default(ProfileChangeBio profileChangeBio, long j, long j2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = profileChangeBio.userNumber;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = profileChangeBio.getTimestamp();
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = profileChangeBio.bio;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = profileChangeBio.oldBio;
        }
        return profileChangeBio.copy(j3, j4, str3, str2);
    }

    public final long component1() {
        return this.userNumber;
    }

    public final long component2() {
        return getTimestamp();
    }

    @NotNull
    public final String component3() {
        return this.bio;
    }

    @NotNull
    public final String component4() {
        return this.oldBio;
    }

    @NotNull
    public final ProfileChangeBio copy(long j, long j2, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, ManagerWebServices.PARAM_BIO);
        C2668g.b(str2, "oldBio");
        return new ProfileChangeBio(j, j2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProfileChangeBio) {
            ProfileChangeBio profileChangeBio = (ProfileChangeBio) obj;
            if ((this.userNumber == profileChangeBio.userNumber ? 1 : null) != null) {
                return ((getTimestamp() > profileChangeBio.getTimestamp() ? 1 : (getTimestamp() == profileChangeBio.getTimestamp() ? 0 : -1)) == 0 ? 1 : null) != null && C2668g.a(this.bio, profileChangeBio.bio) && C2668g.a(this.oldBio, profileChangeBio.oldBio);
            }
        }
    }

    public int hashCode() {
        long j = this.userNumber;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long timestamp = getTimestamp();
        i = (i + ((int) (timestamp ^ (timestamp >>> 32)))) * 31;
        String str = this.bio;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.oldBio;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfileChangeBio(userNumber=");
        stringBuilder.append(this.userNumber);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(getTimestamp());
        stringBuilder.append(", bio=");
        stringBuilder.append(this.bio);
        stringBuilder.append(", oldBio=");
        stringBuilder.append(this.oldBio);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long getUserNumber() {
        return this.userNumber;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getBio() {
        return this.bio;
    }

    @NotNull
    public final String getOldBio() {
        return this.oldBio;
    }

    public ProfileChangeBio(long j, long j2, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, ManagerWebServices.PARAM_BIO);
        C2668g.b(str2, "oldBio");
        super();
        this.userNumber = j;
        this.timestamp = j2;
        this.bio = str;
        this.oldBio = str2;
    }
}
