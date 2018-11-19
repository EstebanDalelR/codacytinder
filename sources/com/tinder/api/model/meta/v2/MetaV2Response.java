package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0013HÆ\u0003Ju\u00100\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lcom/tinder/api/model/meta/v2/MetaV2Response;", "", "clientResources", "Lcom/tinder/api/model/meta/v2/ClientResources;", "boostConfig", "Lcom/tinder/api/model/meta/v2/BoostConfig;", "fastMatchConfig", "Lcom/tinder/api/model/meta/v2/FastMatchConfig;", "recsConfig", "Lcom/tinder/api/model/meta/v2/RecsConfig;", "plusConfig", "Lcom/tinder/api/model/meta/v2/PlusConfig;", "superLikeConfig", "Lcom/tinder/api/model/meta/v2/SuperLikeConfig;", "profileConfig", "Lcom/tinder/api/model/meta/v2/ProfileConfig;", "selectConfig", "Lcom/tinder/api/model/meta/v2/SelectConfig;", "feedbackConfig", "Lcom/tinder/api/model/meta/v2/FeedbackConfig;", "(Lcom/tinder/api/model/meta/v2/ClientResources;Lcom/tinder/api/model/meta/v2/BoostConfig;Lcom/tinder/api/model/meta/v2/FastMatchConfig;Lcom/tinder/api/model/meta/v2/RecsConfig;Lcom/tinder/api/model/meta/v2/PlusConfig;Lcom/tinder/api/model/meta/v2/SuperLikeConfig;Lcom/tinder/api/model/meta/v2/ProfileConfig;Lcom/tinder/api/model/meta/v2/SelectConfig;Lcom/tinder/api/model/meta/v2/FeedbackConfig;)V", "getBoostConfig", "()Lcom/tinder/api/model/meta/v2/BoostConfig;", "getClientResources", "()Lcom/tinder/api/model/meta/v2/ClientResources;", "getFastMatchConfig", "()Lcom/tinder/api/model/meta/v2/FastMatchConfig;", "getFeedbackConfig", "()Lcom/tinder/api/model/meta/v2/FeedbackConfig;", "getPlusConfig", "()Lcom/tinder/api/model/meta/v2/PlusConfig;", "getProfileConfig", "()Lcom/tinder/api/model/meta/v2/ProfileConfig;", "getRecsConfig", "()Lcom/tinder/api/model/meta/v2/RecsConfig;", "getSelectConfig", "()Lcom/tinder/api/model/meta/v2/SelectConfig;", "getSuperLikeConfig", "()Lcom/tinder/api/model/meta/v2/SuperLikeConfig;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class MetaV2Response {
    @Nullable
    private final BoostConfig boostConfig;
    @Nullable
    private final ClientResources clientResources;
    @Nullable
    private final FastMatchConfig fastMatchConfig;
    @Nullable
    private final FeedbackConfig feedbackConfig;
    @Nullable
    private final PlusConfig plusConfig;
    @Nullable
    private final ProfileConfig profileConfig;
    @Nullable
    private final RecsConfig recsConfig;
    @Nullable
    private final SelectConfig selectConfig;
    @Nullable
    private final SuperLikeConfig superLikeConfig;

    @NotNull
    public static /* synthetic */ MetaV2Response copy$default(MetaV2Response metaV2Response, ClientResources clientResources, BoostConfig boostConfig, FastMatchConfig fastMatchConfig, RecsConfig recsConfig, PlusConfig plusConfig, SuperLikeConfig superLikeConfig, ProfileConfig profileConfig, SelectConfig selectConfig, FeedbackConfig feedbackConfig, int i, Object obj) {
        MetaV2Response metaV2Response2 = metaV2Response;
        int i2 = i;
        return metaV2Response2.copy((i2 & 1) != 0 ? metaV2Response2.clientResources : clientResources, (i2 & 2) != 0 ? metaV2Response2.boostConfig : boostConfig, (i2 & 4) != 0 ? metaV2Response2.fastMatchConfig : fastMatchConfig, (i2 & 8) != 0 ? metaV2Response2.recsConfig : recsConfig, (i2 & 16) != 0 ? metaV2Response2.plusConfig : plusConfig, (i2 & 32) != 0 ? metaV2Response2.superLikeConfig : superLikeConfig, (i2 & 64) != 0 ? metaV2Response2.profileConfig : profileConfig, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? metaV2Response2.selectConfig : selectConfig, (i2 & 256) != 0 ? metaV2Response2.feedbackConfig : feedbackConfig);
    }

    @Nullable
    public final ClientResources component1() {
        return this.clientResources;
    }

    @Nullable
    public final BoostConfig component2() {
        return this.boostConfig;
    }

    @Nullable
    public final FastMatchConfig component3() {
        return this.fastMatchConfig;
    }

    @Nullable
    public final RecsConfig component4() {
        return this.recsConfig;
    }

    @Nullable
    public final PlusConfig component5() {
        return this.plusConfig;
    }

    @Nullable
    public final SuperLikeConfig component6() {
        return this.superLikeConfig;
    }

    @Nullable
    public final ProfileConfig component7() {
        return this.profileConfig;
    }

    @Nullable
    public final SelectConfig component8() {
        return this.selectConfig;
    }

    @Nullable
    public final FeedbackConfig component9() {
        return this.feedbackConfig;
    }

    @NotNull
    public final MetaV2Response copy(@Nullable @Json(name = "client_resources") ClientResources clientResources, @Nullable @Json(name = "boost") BoostConfig boostConfig, @Nullable @Json(name = "fast_match") FastMatchConfig fastMatchConfig, @Nullable @Json(name = "recs") RecsConfig recsConfig, @Nullable @Json(name = "tinder_plus") PlusConfig plusConfig, @Nullable @Json(name = "super_like") SuperLikeConfig superLikeConfig, @Nullable @Json(name = "profile") ProfileConfig profileConfig, @Nullable @Json(name = "select") SelectConfig selectConfig, @Nullable @Json(name = "feedback") FeedbackConfig feedbackConfig) {
        return new MetaV2Response(clientResources, boostConfig, fastMatchConfig, recsConfig, plusConfig, superLikeConfig, profileConfig, selectConfig, feedbackConfig);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaV2Response) {
                MetaV2Response metaV2Response = (MetaV2Response) obj;
                if (C2668g.a(this.clientResources, metaV2Response.clientResources) && C2668g.a(this.boostConfig, metaV2Response.boostConfig) && C2668g.a(this.fastMatchConfig, metaV2Response.fastMatchConfig) && C2668g.a(this.recsConfig, metaV2Response.recsConfig) && C2668g.a(this.plusConfig, metaV2Response.plusConfig) && C2668g.a(this.superLikeConfig, metaV2Response.superLikeConfig) && C2668g.a(this.profileConfig, metaV2Response.profileConfig) && C2668g.a(this.selectConfig, metaV2Response.selectConfig) && C2668g.a(this.feedbackConfig, metaV2Response.feedbackConfig)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ClientResources clientResources = this.clientResources;
        int i = 0;
        int hashCode = (clientResources != null ? clientResources.hashCode() : 0) * 31;
        BoostConfig boostConfig = this.boostConfig;
        hashCode = (hashCode + (boostConfig != null ? boostConfig.hashCode() : 0)) * 31;
        FastMatchConfig fastMatchConfig = this.fastMatchConfig;
        hashCode = (hashCode + (fastMatchConfig != null ? fastMatchConfig.hashCode() : 0)) * 31;
        RecsConfig recsConfig = this.recsConfig;
        hashCode = (hashCode + (recsConfig != null ? recsConfig.hashCode() : 0)) * 31;
        PlusConfig plusConfig = this.plusConfig;
        hashCode = (hashCode + (plusConfig != null ? plusConfig.hashCode() : 0)) * 31;
        SuperLikeConfig superLikeConfig = this.superLikeConfig;
        hashCode = (hashCode + (superLikeConfig != null ? superLikeConfig.hashCode() : 0)) * 31;
        ProfileConfig profileConfig = this.profileConfig;
        hashCode = (hashCode + (profileConfig != null ? profileConfig.hashCode() : 0)) * 31;
        SelectConfig selectConfig = this.selectConfig;
        hashCode = (hashCode + (selectConfig != null ? selectConfig.hashCode() : 0)) * 31;
        FeedbackConfig feedbackConfig = this.feedbackConfig;
        if (feedbackConfig != null) {
            i = feedbackConfig.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MetaV2Response(clientResources=");
        stringBuilder.append(this.clientResources);
        stringBuilder.append(", boostConfig=");
        stringBuilder.append(this.boostConfig);
        stringBuilder.append(", fastMatchConfig=");
        stringBuilder.append(this.fastMatchConfig);
        stringBuilder.append(", recsConfig=");
        stringBuilder.append(this.recsConfig);
        stringBuilder.append(", plusConfig=");
        stringBuilder.append(this.plusConfig);
        stringBuilder.append(", superLikeConfig=");
        stringBuilder.append(this.superLikeConfig);
        stringBuilder.append(", profileConfig=");
        stringBuilder.append(this.profileConfig);
        stringBuilder.append(", selectConfig=");
        stringBuilder.append(this.selectConfig);
        stringBuilder.append(", feedbackConfig=");
        stringBuilder.append(this.feedbackConfig);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public MetaV2Response(@Nullable @Json(name = "client_resources") ClientResources clientResources, @Nullable @Json(name = "boost") BoostConfig boostConfig, @Nullable @Json(name = "fast_match") FastMatchConfig fastMatchConfig, @Nullable @Json(name = "recs") RecsConfig recsConfig, @Nullable @Json(name = "tinder_plus") PlusConfig plusConfig, @Nullable @Json(name = "super_like") SuperLikeConfig superLikeConfig, @Nullable @Json(name = "profile") ProfileConfig profileConfig, @Nullable @Json(name = "select") SelectConfig selectConfig, @Nullable @Json(name = "feedback") FeedbackConfig feedbackConfig) {
        this.clientResources = clientResources;
        this.boostConfig = boostConfig;
        this.fastMatchConfig = fastMatchConfig;
        this.recsConfig = recsConfig;
        this.plusConfig = plusConfig;
        this.superLikeConfig = superLikeConfig;
        this.profileConfig = profileConfig;
        this.selectConfig = selectConfig;
        this.feedbackConfig = feedbackConfig;
    }

    @Nullable
    public final ClientResources getClientResources() {
        return this.clientResources;
    }

    @Nullable
    public final BoostConfig getBoostConfig() {
        return this.boostConfig;
    }

    @Nullable
    public final FastMatchConfig getFastMatchConfig() {
        return this.fastMatchConfig;
    }

    @Nullable
    public final RecsConfig getRecsConfig() {
        return this.recsConfig;
    }

    @Nullable
    public final PlusConfig getPlusConfig() {
        return this.plusConfig;
    }

    @Nullable
    public final SuperLikeConfig getSuperLikeConfig() {
        return this.superLikeConfig;
    }

    @Nullable
    public final ProfileConfig getProfileConfig() {
        return this.profileConfig;
    }

    @Nullable
    public final SelectConfig getSelectConfig() {
        return this.selectConfig;
    }

    @Nullable
    public final FeedbackConfig getFeedbackConfig() {
        return this.feedbackConfig;
    }
}
