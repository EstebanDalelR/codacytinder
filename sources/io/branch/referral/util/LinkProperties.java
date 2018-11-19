package io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class LinkProperties implements Parcelable {
    public static final Creator CREATOR = new C155981();
    private String alias_;
    private String campaign_;
    private String channel_;
    private final HashMap<String, String> controlParams_;
    private String feature_;
    private int matchDuration_;
    private String stage_;
    private final ArrayList<String> tags_;

    /* renamed from: io.branch.referral.util.LinkProperties$1 */
    static class C155981 implements Creator {
        C155981() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m58499a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m58500a(i);
        }

        /* renamed from: a */
        public LinkProperties m58499a(Parcel parcel) {
            return new LinkProperties(parcel);
        }

        /* renamed from: a */
        public LinkProperties[] m58500a(int i) {
            return new LinkProperties[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public LinkProperties() {
        this.tags_ = new ArrayList();
        this.feature_ = "Share";
        this.controlParams_ = new HashMap();
        this.alias_ = "";
        this.stage_ = "";
        this.matchDuration_ = 0;
        this.channel_ = "";
        this.campaign_ = "";
    }

    public LinkProperties setAlias(String str) {
        this.alias_ = str;
        return this;
    }

    public LinkProperties addTag(String str) {
        this.tags_.add(str);
        return this;
    }

    public LinkProperties addControlParameter(String str, String str2) {
        this.controlParams_.put(str, str2);
        return this;
    }

    public LinkProperties setFeature(String str) {
        this.feature_ = str;
        return this;
    }

    public LinkProperties setDuration(int i) {
        this.matchDuration_ = i;
        return this;
    }

    public LinkProperties setStage(String str) {
        this.stage_ = str;
        return this;
    }

    public LinkProperties setChannel(String str) {
        this.channel_ = str;
        return this;
    }

    public LinkProperties setCampaign(String str) {
        this.campaign_ = str;
        return this;
    }

    public ArrayList<String> getTags() {
        return this.tags_;
    }

    public HashMap<String, String> getControlParams() {
        return this.controlParams_;
    }

    public int getMatchDuration() {
        return this.matchDuration_;
    }

    public String getAlias() {
        return this.alias_;
    }

    public String getFeature() {
        return this.feature_;
    }

    public String getStage() {
        return this.stage_;
    }

    public String getChannel() {
        return this.channel_;
    }

    public String getCampaign() {
        return this.campaign_;
    }

    public static io.branch.referral.util.LinkProperties getReferredLinkProperties() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = io.branch.referral.Branch.b();
        r1 = 0;
        if (r0 == 0) goto L_0x00cc;
    L_0x0007:
        r2 = r0.i();
        if (r2 == 0) goto L_0x00cc;
    L_0x000d:
        r0 = r0.i();
        r2 = "+clicked_branch_link";	 Catch:{ Exception -> 0x00cc }
        r2 = r0.has(r2);	 Catch:{ Exception -> 0x00cc }
        if (r2 == 0) goto L_0x00cc;	 Catch:{ Exception -> 0x00cc }
    L_0x0019:
        r2 = "+clicked_branch_link";	 Catch:{ Exception -> 0x00cc }
        r2 = r0.getBoolean(r2);	 Catch:{ Exception -> 0x00cc }
        if (r2 == 0) goto L_0x00cc;	 Catch:{ Exception -> 0x00cc }
    L_0x0021:
        r2 = new io.branch.referral.util.LinkProperties;	 Catch:{ Exception -> 0x00cc }
        r2.<init>();	 Catch:{ Exception -> 0x00cc }
        r1 = "~channel";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00cb }
        if (r1 == 0) goto L_0x0037;	 Catch:{ Exception -> 0x00cb }
    L_0x002e:
        r1 = "~channel";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.getString(r1);	 Catch:{ Exception -> 0x00cb }
        r2.setChannel(r1);	 Catch:{ Exception -> 0x00cb }
    L_0x0037:
        r1 = "~feature";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00cb }
        if (r1 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x00cb }
    L_0x003f:
        r1 = "~feature";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.getString(r1);	 Catch:{ Exception -> 0x00cb }
        r2.setFeature(r1);	 Catch:{ Exception -> 0x00cb }
    L_0x0048:
        r1 = "~stage";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00cb }
        if (r1 == 0) goto L_0x0059;	 Catch:{ Exception -> 0x00cb }
    L_0x0050:
        r1 = "~stage";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.getString(r1);	 Catch:{ Exception -> 0x00cb }
        r2.setStage(r1);	 Catch:{ Exception -> 0x00cb }
    L_0x0059:
        r1 = "~campaign";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00cb }
        if (r1 == 0) goto L_0x006a;	 Catch:{ Exception -> 0x00cb }
    L_0x0061:
        r1 = "~campaign";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.getString(r1);	 Catch:{ Exception -> 0x00cb }
        r2.setCampaign(r1);	 Catch:{ Exception -> 0x00cb }
    L_0x006a:
        r1 = "~duration";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00cb }
        if (r1 == 0) goto L_0x007b;	 Catch:{ Exception -> 0x00cb }
    L_0x0072:
        r1 = "~duration";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.getInt(r1);	 Catch:{ Exception -> 0x00cb }
        r2.setDuration(r1);	 Catch:{ Exception -> 0x00cb }
    L_0x007b:
        r1 = "$match_duration";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00cb }
        if (r1 == 0) goto L_0x008c;	 Catch:{ Exception -> 0x00cb }
    L_0x0083:
        r1 = "$match_duration";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.getInt(r1);	 Catch:{ Exception -> 0x00cb }
        r2.setDuration(r1);	 Catch:{ Exception -> 0x00cb }
    L_0x008c:
        r1 = "~tags";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.has(r1);	 Catch:{ Exception -> 0x00cb }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ Exception -> 0x00cb }
    L_0x0094:
        r1 = "~tags";	 Catch:{ Exception -> 0x00cb }
        r1 = r0.getJSONArray(r1);	 Catch:{ Exception -> 0x00cb }
        r3 = 0;	 Catch:{ Exception -> 0x00cb }
    L_0x009b:
        r4 = r1.length();	 Catch:{ Exception -> 0x00cb }
        if (r3 >= r4) goto L_0x00ab;	 Catch:{ Exception -> 0x00cb }
    L_0x00a1:
        r4 = r1.getString(r3);	 Catch:{ Exception -> 0x00cb }
        r2.addTag(r4);	 Catch:{ Exception -> 0x00cb }
        r3 = r3 + 1;	 Catch:{ Exception -> 0x00cb }
        goto L_0x009b;	 Catch:{ Exception -> 0x00cb }
    L_0x00ab:
        r1 = r0.keys();	 Catch:{ Exception -> 0x00cb }
    L_0x00af:
        r3 = r1.hasNext();	 Catch:{ Exception -> 0x00cb }
        if (r3 == 0) goto L_0x00cb;	 Catch:{ Exception -> 0x00cb }
    L_0x00b5:
        r3 = r1.next();	 Catch:{ Exception -> 0x00cb }
        r3 = (java.lang.String) r3;	 Catch:{ Exception -> 0x00cb }
        r4 = "$";	 Catch:{ Exception -> 0x00cb }
        r4 = r3.startsWith(r4);	 Catch:{ Exception -> 0x00cb }
        if (r4 == 0) goto L_0x00af;	 Catch:{ Exception -> 0x00cb }
    L_0x00c3:
        r4 = r0.getString(r3);	 Catch:{ Exception -> 0x00cb }
        r2.addControlParameter(r3, r4);	 Catch:{ Exception -> 0x00cb }
        goto L_0x00af;
    L_0x00cb:
        r1 = r2;
    L_0x00cc:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.util.LinkProperties.getReferredLinkProperties():io.branch.referral.util.LinkProperties");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.feature_);
        parcel.writeString(this.alias_);
        parcel.writeString(this.stage_);
        parcel.writeString(this.channel_);
        parcel.writeString(this.campaign_);
        parcel.writeInt(this.matchDuration_);
        parcel.writeSerializable(this.tags_);
        parcel.writeInt(this.controlParams_.size());
        for (Entry entry : this.controlParams_.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    private LinkProperties(Parcel parcel) {
        this();
        this.feature_ = parcel.readString();
        this.alias_ = parcel.readString();
        this.stage_ = parcel.readString();
        this.channel_ = parcel.readString();
        this.campaign_ = parcel.readString();
        this.matchDuration_ = parcel.readInt();
        this.tags_.addAll((ArrayList) parcel.readSerializable());
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.controlParams_.put(parcel.readString(), parcel.readString());
        }
    }
}
