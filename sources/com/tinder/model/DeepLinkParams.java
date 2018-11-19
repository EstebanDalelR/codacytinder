package com.tinder.model;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

public class DeepLinkParams {
    @SerializedName("+click_timestamp")
    private long mClickTimestamp;
    @SerializedName("+clicked_branch_link")
    private boolean mClickedBranchLink;
    @SerializedName("deeplink_from")
    private String mDeeplinkFrom;
    @SerializedName("$deeplink_path")
    private String mDeeplinkPath;
    @SerializedName("~feature")
    private String mFeature;
    @SerializedName("~id")
    private long mId;
    @SerializedName("+is_first_session")
    private boolean mIsFirstSession;
    @SerializedName("~marketing")
    private boolean mMarketing;
    @SerializedName("$marketing_title")
    private String mMarketingTitle;
    @SerializedName("+match_guaranteed")
    private boolean mMatchGuaranteed;
    @SerializedName("~referring_link")
    private String mReferringLink;

    public static DeepLinkParams fromUri(@NonNull Uri uri) {
        DeepLinkParams deepLinkParams = new DeepLinkParams();
        deepLinkParams.mReferringLink = uri.toString();
        return deepLinkParams;
    }

    public boolean isFirstSession() {
        return this.mIsFirstSession;
    }

    public boolean isClickedBranchLink() {
        return this.mClickedBranchLink;
    }

    public boolean isMatchGuaranteed() {
        return this.mMatchGuaranteed;
    }

    public String getDeeplinkPath() {
        return this.mDeeplinkPath;
    }

    public String getMarketingTitle() {
        return this.mMarketingTitle;
    }

    public String getFeature() {
        return this.mFeature;
    }

    public long getId() {
        return this.mId;
    }

    public boolean isMarketing() {
        return this.mMarketing;
    }

    public long getClickTimestamp() {
        return this.mClickTimestamp;
    }

    public String getReferringLink() {
        return this.mReferringLink;
    }

    public String getDeeplinkFrom() {
        return this.mDeeplinkFrom;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeepLinkParams{mIsFirstSession=");
        stringBuilder.append(this.mIsFirstSession);
        stringBuilder.append(", mClickedBranchLink=");
        stringBuilder.append(this.mClickedBranchLink);
        stringBuilder.append(", mMatchGuaranteed=");
        stringBuilder.append(this.mMatchGuaranteed);
        stringBuilder.append(", mDeeplinkPath='");
        stringBuilder.append(this.mDeeplinkPath);
        stringBuilder.append('\'');
        stringBuilder.append(", mMarketingTitle='");
        stringBuilder.append(this.mMarketingTitle);
        stringBuilder.append('\'');
        stringBuilder.append(", mFeature='");
        stringBuilder.append(this.mFeature);
        stringBuilder.append('\'');
        stringBuilder.append(", mId=");
        stringBuilder.append(this.mId);
        stringBuilder.append(", mMarketing=");
        stringBuilder.append(this.mMarketing);
        stringBuilder.append(", mClickTimestamp=");
        stringBuilder.append(this.mClickTimestamp);
        stringBuilder.append(", mReferringLink='");
        stringBuilder.append(this.mReferringLink);
        stringBuilder.append('\'');
        stringBuilder.append(", mDeeplinkFrom='");
        stringBuilder.append(this.mDeeplinkFrom);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
