package com.tinder.api.model.activityfeed;

import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020<HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006="}, d2 = {"Lcom/tinder/api/model/activityfeed/ApiActivityEvent;", "", "instagramNewMedia", "Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramNewMedia;", "profileSpotifyTopArtist", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileSpotifyTopArtist;", "profileAddPhoto", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileAddPhoto;", "instagramConnect", "Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramConnect;", "profileChangeAnthem", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeAnthem;", "match", "Lcom/tinder/api/model/activityfeed/ApiActivityEventMatch;", "profileAddLoop", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileAddLoop;", "profileChangeBio", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeBio;", "profileChangeWork", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeWork;", "profileChangeSchool", "Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeSchool;", "(Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramNewMedia;Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileSpotifyTopArtist;Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileAddPhoto;Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramConnect;Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeAnthem;Lcom/tinder/api/model/activityfeed/ApiActivityEventMatch;Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileAddLoop;Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeBio;Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeWork;Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeSchool;)V", "getInstagramConnect", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramConnect;", "getInstagramNewMedia", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventInstagramNewMedia;", "getMatch", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventMatch;", "getProfileAddLoop", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileAddLoop;", "getProfileAddPhoto", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileAddPhoto;", "getProfileChangeAnthem", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeAnthem;", "getProfileChangeBio", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeBio;", "getProfileChangeSchool", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeSchool;", "getProfileChangeWork", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileChangeWork;", "getProfileSpotifyTopArtist", "()Lcom/tinder/api/model/activityfeed/ApiActivityEventProfileSpotifyTopArtist;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class ApiActivityEvent {
    @Nullable
    private final ApiActivityEventInstagramConnect instagramConnect;
    @Nullable
    private final ApiActivityEventInstagramNewMedia instagramNewMedia;
    @Nullable
    private final ApiActivityEventMatch match;
    @Nullable
    private final ApiActivityEventProfileAddLoop profileAddLoop;
    @Nullable
    private final ApiActivityEventProfileAddPhoto profileAddPhoto;
    @Nullable
    private final ApiActivityEventProfileChangeAnthem profileChangeAnthem;
    @Nullable
    private final ApiActivityEventProfileChangeBio profileChangeBio;
    @Nullable
    private final ApiActivityEventProfileChangeSchool profileChangeSchool;
    @Nullable
    private final ApiActivityEventProfileChangeWork profileChangeWork;
    @Nullable
    private final ApiActivityEventProfileSpotifyTopArtist profileSpotifyTopArtist;

    @NotNull
    public static /* synthetic */ ApiActivityEvent copy$default(ApiActivityEvent apiActivityEvent, ApiActivityEventInstagramNewMedia apiActivityEventInstagramNewMedia, ApiActivityEventProfileSpotifyTopArtist apiActivityEventProfileSpotifyTopArtist, ApiActivityEventProfileAddPhoto apiActivityEventProfileAddPhoto, ApiActivityEventInstagramConnect apiActivityEventInstagramConnect, ApiActivityEventProfileChangeAnthem apiActivityEventProfileChangeAnthem, ApiActivityEventMatch apiActivityEventMatch, ApiActivityEventProfileAddLoop apiActivityEventProfileAddLoop, ApiActivityEventProfileChangeBio apiActivityEventProfileChangeBio, ApiActivityEventProfileChangeWork apiActivityEventProfileChangeWork, ApiActivityEventProfileChangeSchool apiActivityEventProfileChangeSchool, int i, Object obj) {
        ApiActivityEvent apiActivityEvent2 = apiActivityEvent;
        int i2 = i;
        return apiActivityEvent2.copy((i2 & 1) != 0 ? apiActivityEvent2.instagramNewMedia : apiActivityEventInstagramNewMedia, (i2 & 2) != 0 ? apiActivityEvent2.profileSpotifyTopArtist : apiActivityEventProfileSpotifyTopArtist, (i2 & 4) != 0 ? apiActivityEvent2.profileAddPhoto : apiActivityEventProfileAddPhoto, (i2 & 8) != 0 ? apiActivityEvent2.instagramConnect : apiActivityEventInstagramConnect, (i2 & 16) != 0 ? apiActivityEvent2.profileChangeAnthem : apiActivityEventProfileChangeAnthem, (i2 & 32) != 0 ? apiActivityEvent2.match : apiActivityEventMatch, (i2 & 64) != 0 ? apiActivityEvent2.profileAddLoop : apiActivityEventProfileAddLoop, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? apiActivityEvent2.profileChangeBio : apiActivityEventProfileChangeBio, (i2 & 256) != 0 ? apiActivityEvent2.profileChangeWork : apiActivityEventProfileChangeWork, (i2 & 512) != 0 ? apiActivityEvent2.profileChangeSchool : apiActivityEventProfileChangeSchool);
    }

    @Nullable
    public final ApiActivityEventInstagramNewMedia component1() {
        return this.instagramNewMedia;
    }

    @Nullable
    public final ApiActivityEventProfileChangeSchool component10() {
        return this.profileChangeSchool;
    }

    @Nullable
    public final ApiActivityEventProfileSpotifyTopArtist component2() {
        return this.profileSpotifyTopArtist;
    }

    @Nullable
    public final ApiActivityEventProfileAddPhoto component3() {
        return this.profileAddPhoto;
    }

    @Nullable
    public final ApiActivityEventInstagramConnect component4() {
        return this.instagramConnect;
    }

    @Nullable
    public final ApiActivityEventProfileChangeAnthem component5() {
        return this.profileChangeAnthem;
    }

    @Nullable
    public final ApiActivityEventMatch component6() {
        return this.match;
    }

    @Nullable
    public final ApiActivityEventProfileAddLoop component7() {
        return this.profileAddLoop;
    }

    @Nullable
    public final ApiActivityEventProfileChangeBio component8() {
        return this.profileChangeBio;
    }

    @Nullable
    public final ApiActivityEventProfileChangeWork component9() {
        return this.profileChangeWork;
    }

    @NotNull
    public final ApiActivityEvent copy(@Nullable ApiActivityEventInstagramNewMedia apiActivityEventInstagramNewMedia, @Nullable ApiActivityEventProfileSpotifyTopArtist apiActivityEventProfileSpotifyTopArtist, @Nullable ApiActivityEventProfileAddPhoto apiActivityEventProfileAddPhoto, @Nullable ApiActivityEventInstagramConnect apiActivityEventInstagramConnect, @Nullable ApiActivityEventProfileChangeAnthem apiActivityEventProfileChangeAnthem, @Nullable ApiActivityEventMatch apiActivityEventMatch, @Nullable ApiActivityEventProfileAddLoop apiActivityEventProfileAddLoop, @Nullable ApiActivityEventProfileChangeBio apiActivityEventProfileChangeBio, @Nullable ApiActivityEventProfileChangeWork apiActivityEventProfileChangeWork, @Nullable ApiActivityEventProfileChangeSchool apiActivityEventProfileChangeSchool) {
        return new ApiActivityEvent(apiActivityEventInstagramNewMedia, apiActivityEventProfileSpotifyTopArtist, apiActivityEventProfileAddPhoto, apiActivityEventInstagramConnect, apiActivityEventProfileChangeAnthem, apiActivityEventMatch, apiActivityEventProfileAddLoop, apiActivityEventProfileChangeBio, apiActivityEventProfileChangeWork, apiActivityEventProfileChangeSchool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApiActivityEvent) {
                ApiActivityEvent apiActivityEvent = (ApiActivityEvent) obj;
                if (C2668g.a(this.instagramNewMedia, apiActivityEvent.instagramNewMedia) && C2668g.a(this.profileSpotifyTopArtist, apiActivityEvent.profileSpotifyTopArtist) && C2668g.a(this.profileAddPhoto, apiActivityEvent.profileAddPhoto) && C2668g.a(this.instagramConnect, apiActivityEvent.instagramConnect) && C2668g.a(this.profileChangeAnthem, apiActivityEvent.profileChangeAnthem) && C2668g.a(this.match, apiActivityEvent.match) && C2668g.a(this.profileAddLoop, apiActivityEvent.profileAddLoop) && C2668g.a(this.profileChangeBio, apiActivityEvent.profileChangeBio) && C2668g.a(this.profileChangeWork, apiActivityEvent.profileChangeWork) && C2668g.a(this.profileChangeSchool, apiActivityEvent.profileChangeSchool)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ApiActivityEventInstagramNewMedia apiActivityEventInstagramNewMedia = this.instagramNewMedia;
        int i = 0;
        int hashCode = (apiActivityEventInstagramNewMedia != null ? apiActivityEventInstagramNewMedia.hashCode() : 0) * 31;
        ApiActivityEventProfileSpotifyTopArtist apiActivityEventProfileSpotifyTopArtist = this.profileSpotifyTopArtist;
        hashCode = (hashCode + (apiActivityEventProfileSpotifyTopArtist != null ? apiActivityEventProfileSpotifyTopArtist.hashCode() : 0)) * 31;
        ApiActivityEventProfileAddPhoto apiActivityEventProfileAddPhoto = this.profileAddPhoto;
        hashCode = (hashCode + (apiActivityEventProfileAddPhoto != null ? apiActivityEventProfileAddPhoto.hashCode() : 0)) * 31;
        ApiActivityEventInstagramConnect apiActivityEventInstagramConnect = this.instagramConnect;
        hashCode = (hashCode + (apiActivityEventInstagramConnect != null ? apiActivityEventInstagramConnect.hashCode() : 0)) * 31;
        ApiActivityEventProfileChangeAnthem apiActivityEventProfileChangeAnthem = this.profileChangeAnthem;
        hashCode = (hashCode + (apiActivityEventProfileChangeAnthem != null ? apiActivityEventProfileChangeAnthem.hashCode() : 0)) * 31;
        ApiActivityEventMatch apiActivityEventMatch = this.match;
        hashCode = (hashCode + (apiActivityEventMatch != null ? apiActivityEventMatch.hashCode() : 0)) * 31;
        ApiActivityEventProfileAddLoop apiActivityEventProfileAddLoop = this.profileAddLoop;
        hashCode = (hashCode + (apiActivityEventProfileAddLoop != null ? apiActivityEventProfileAddLoop.hashCode() : 0)) * 31;
        ApiActivityEventProfileChangeBio apiActivityEventProfileChangeBio = this.profileChangeBio;
        hashCode = (hashCode + (apiActivityEventProfileChangeBio != null ? apiActivityEventProfileChangeBio.hashCode() : 0)) * 31;
        ApiActivityEventProfileChangeWork apiActivityEventProfileChangeWork = this.profileChangeWork;
        hashCode = (hashCode + (apiActivityEventProfileChangeWork != null ? apiActivityEventProfileChangeWork.hashCode() : 0)) * 31;
        ApiActivityEventProfileChangeSchool apiActivityEventProfileChangeSchool = this.profileChangeSchool;
        if (apiActivityEventProfileChangeSchool != null) {
            i = apiActivityEventProfileChangeSchool.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApiActivityEvent(instagramNewMedia=");
        stringBuilder.append(this.instagramNewMedia);
        stringBuilder.append(", profileSpotifyTopArtist=");
        stringBuilder.append(this.profileSpotifyTopArtist);
        stringBuilder.append(", profileAddPhoto=");
        stringBuilder.append(this.profileAddPhoto);
        stringBuilder.append(", instagramConnect=");
        stringBuilder.append(this.instagramConnect);
        stringBuilder.append(", profileChangeAnthem=");
        stringBuilder.append(this.profileChangeAnthem);
        stringBuilder.append(", match=");
        stringBuilder.append(this.match);
        stringBuilder.append(", profileAddLoop=");
        stringBuilder.append(this.profileAddLoop);
        stringBuilder.append(", profileChangeBio=");
        stringBuilder.append(this.profileChangeBio);
        stringBuilder.append(", profileChangeWork=");
        stringBuilder.append(this.profileChangeWork);
        stringBuilder.append(", profileChangeSchool=");
        stringBuilder.append(this.profileChangeSchool);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ApiActivityEvent(@Nullable ApiActivityEventInstagramNewMedia apiActivityEventInstagramNewMedia, @Nullable ApiActivityEventProfileSpotifyTopArtist apiActivityEventProfileSpotifyTopArtist, @Nullable ApiActivityEventProfileAddPhoto apiActivityEventProfileAddPhoto, @Nullable ApiActivityEventInstagramConnect apiActivityEventInstagramConnect, @Nullable ApiActivityEventProfileChangeAnthem apiActivityEventProfileChangeAnthem, @Nullable ApiActivityEventMatch apiActivityEventMatch, @Nullable ApiActivityEventProfileAddLoop apiActivityEventProfileAddLoop, @Nullable ApiActivityEventProfileChangeBio apiActivityEventProfileChangeBio, @Nullable ApiActivityEventProfileChangeWork apiActivityEventProfileChangeWork, @Nullable ApiActivityEventProfileChangeSchool apiActivityEventProfileChangeSchool) {
        this.instagramNewMedia = apiActivityEventInstagramNewMedia;
        this.profileSpotifyTopArtist = apiActivityEventProfileSpotifyTopArtist;
        this.profileAddPhoto = apiActivityEventProfileAddPhoto;
        this.instagramConnect = apiActivityEventInstagramConnect;
        this.profileChangeAnthem = apiActivityEventProfileChangeAnthem;
        this.match = apiActivityEventMatch;
        this.profileAddLoop = apiActivityEventProfileAddLoop;
        this.profileChangeBio = apiActivityEventProfileChangeBio;
        this.profileChangeWork = apiActivityEventProfileChangeWork;
        this.profileChangeSchool = apiActivityEventProfileChangeSchool;
    }

    @Nullable
    public final ApiActivityEventInstagramNewMedia getInstagramNewMedia() {
        return this.instagramNewMedia;
    }

    @Nullable
    public final ApiActivityEventProfileSpotifyTopArtist getProfileSpotifyTopArtist() {
        return this.profileSpotifyTopArtist;
    }

    @Nullable
    public final ApiActivityEventProfileAddPhoto getProfileAddPhoto() {
        return this.profileAddPhoto;
    }

    @Nullable
    public final ApiActivityEventInstagramConnect getInstagramConnect() {
        return this.instagramConnect;
    }

    @Nullable
    public final ApiActivityEventProfileChangeAnthem getProfileChangeAnthem() {
        return this.profileChangeAnthem;
    }

    @Nullable
    public final ApiActivityEventMatch getMatch() {
        return this.match;
    }

    @Nullable
    public final ApiActivityEventProfileAddLoop getProfileAddLoop() {
        return this.profileAddLoop;
    }

    @Nullable
    public final ApiActivityEventProfileChangeBio getProfileChangeBio() {
        return this.profileChangeBio;
    }

    @Nullable
    public final ApiActivityEventProfileChangeWork getProfileChangeWork() {
        return this.profileChangeWork;
    }

    @Nullable
    public final ApiActivityEventProfileChangeSchool getProfileChangeSchool() {
        return this.profileChangeSchool;
    }
}
