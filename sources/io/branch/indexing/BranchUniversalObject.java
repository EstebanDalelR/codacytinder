package io.branch.indexing;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import io.branch.referral.Branch;
import io.branch.referral.Branch$BranchLinkCreateListener;
import io.branch.referral.Branch$BranchLinkShareListener;
import io.branch.referral.Branch$ExtendedBranchLinkShareListener;
import io.branch.referral.Branch$IChannelProperties;
import io.branch.referral.Branch$c;
import io.branch.referral.C15583e;
import io.branch.referral.C17307g;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import io.branch.referral.util.C15600b;
import io.branch.referral.util.ContentMetadata;
import io.branch.referral.util.CurrencyType;
import io.branch.referral.util.LinkProperties;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BranchUniversalObject implements Parcelable {
    public static final Creator CREATOR = new C155521();
    private String canonicalIdentifier_;
    private String canonicalUrl_;
    private long creationTimeStamp_;
    private String description_;
    private long expirationInMilliSec_;
    private String imageUrl_;
    private CONTENT_INDEX_MODE indexMode_;
    private final ArrayList<String> keywords_;
    private CONTENT_INDEX_MODE localIndexMode_;
    private ContentMetadata metadata_;
    private String title_;

    /* renamed from: io.branch.indexing.BranchUniversalObject$1 */
    static class C155521 implements Creator {
        C155521() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m58081a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m58082a(i);
        }

        /* renamed from: a */
        public BranchUniversalObject m58081a(Parcel parcel) {
            return new BranchUniversalObject(parcel);
        }

        /* renamed from: a */
        public BranchUniversalObject[] m58082a(int i) {
            return new BranchUniversalObject[i];
        }
    }

    public enum CONTENT_INDEX_MODE {
        PUBLIC,
        PRIVATE
    }

    public interface RegisterViewStatusListener {
        void onRegisterViewFinished(boolean z, C15583e c15583e);
    }

    /* renamed from: io.branch.indexing.BranchUniversalObject$a */
    private class C17300a implements Branch$BranchLinkShareListener {
        /* renamed from: a */
        final /* synthetic */ BranchUniversalObject f52968a;
        /* renamed from: b */
        private final Branch$BranchLinkShareListener f52969b;
        /* renamed from: c */
        private final Branch$c f52970c;
        /* renamed from: d */
        private final LinkProperties f52971d;

        C17300a(BranchUniversalObject branchUniversalObject, Branch$BranchLinkShareListener branch$BranchLinkShareListener, Branch$c branch$c, LinkProperties linkProperties) {
            this.f52968a = branchUniversalObject;
            this.f52969b = branch$BranchLinkShareListener;
            this.f52970c = branch$c;
            this.f52971d = linkProperties;
        }

        public void onShareLinkDialogLaunched() {
            if (this.f52969b != null) {
                this.f52969b.onShareLinkDialogLaunched();
            }
        }

        public void onShareLinkDialogDismissed() {
            if (this.f52969b != null) {
                this.f52969b.onShareLinkDialogDismissed();
            }
        }

        public void onLinkShareResponse(String str, String str2, C15583e c15583e) {
            HashMap hashMap = new HashMap();
            if (c15583e == null) {
                hashMap.put(Jsonkey.SharedLink.getKey(), str);
            } else {
                hashMap.put(Jsonkey.ShareError.getKey(), c15583e.m58330a());
            }
            this.f52968a.userCompletedAction(BRANCH_STANDARD_EVENT.SHARE.getName(), hashMap);
            if (this.f52969b != null) {
                this.f52969b.onLinkShareResponse(str, str2, c15583e);
            }
        }

        public void onChannelSelected(String str) {
            if (this.f52969b != null) {
                this.f52969b.onChannelSelected(str);
            }
            if ((this.f52969b instanceof Branch$ExtendedBranchLinkShareListener) && ((Branch$ExtendedBranchLinkShareListener) this.f52969b).onChannelSelected(str, this.f52968a, this.f52971d) != null) {
                this.f52970c.m58148a(this.f52968a.getLinkBuilder(this.f52970c.m58170p(), this.f52971d));
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getCurrencyType() {
        return null;
    }

    public double getPrice() {
        return 0.0d;
    }

    public String getType() {
        return null;
    }

    public BranchUniversalObject setContentType(String str) {
        return this;
    }

    public BranchUniversalObject setPrice(double d, CurrencyType currencyType) {
        return this;
    }

    public BranchUniversalObject() {
        this.metadata_ = new ContentMetadata();
        this.keywords_ = new ArrayList();
        this.canonicalIdentifier_ = "";
        this.canonicalUrl_ = "";
        this.title_ = "";
        this.description_ = "";
        this.indexMode_ = CONTENT_INDEX_MODE.PUBLIC;
        this.localIndexMode_ = CONTENT_INDEX_MODE.PUBLIC;
        this.expirationInMilliSec_ = 0;
        this.creationTimeStamp_ = System.currentTimeMillis();
    }

    public BranchUniversalObject setCanonicalIdentifier(@NonNull String str) {
        this.canonicalIdentifier_ = str;
        return this;
    }

    public BranchUniversalObject setCanonicalUrl(@NonNull String str) {
        this.canonicalUrl_ = str;
        return this;
    }

    public BranchUniversalObject setTitle(@NonNull String str) {
        this.title_ = str;
        return this;
    }

    public BranchUniversalObject setContentDescription(String str) {
        this.description_ = str;
        return this;
    }

    public BranchUniversalObject setContentImageUrl(@NonNull String str) {
        this.imageUrl_ = str;
        return this;
    }

    public BranchUniversalObject addContentMetadata(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.metadata_.addCustomMetadata(str, (String) hashMap.get(str));
            }
        }
        return this;
    }

    public BranchUniversalObject addContentMetadata(String str, String str2) {
        this.metadata_.addCustomMetadata(str, str2);
        return this;
    }

    public BranchUniversalObject setContentMetadata(ContentMetadata contentMetadata) {
        this.metadata_ = contentMetadata;
        return this;
    }

    public BranchUniversalObject setContentIndexingMode(CONTENT_INDEX_MODE content_index_mode) {
        this.indexMode_ = content_index_mode;
        return this;
    }

    public BranchUniversalObject setLocalIndexMode(CONTENT_INDEX_MODE content_index_mode) {
        this.localIndexMode_ = content_index_mode;
        return this;
    }

    public BranchUniversalObject addKeyWords(ArrayList<String> arrayList) {
        this.keywords_.addAll(arrayList);
        return this;
    }

    public BranchUniversalObject addKeyWord(String str) {
        this.keywords_.add(str);
        return this;
    }

    public BranchUniversalObject setContentExpiration(Date date) {
        this.expirationInMilliSec_ = date.getTime();
        return this;
    }

    public void listOnGoogleSearch(Context context) {
        C15555a.m58085a(context, this, null);
    }

    public void listOnGoogleSearch(Context context, LinkProperties linkProperties) {
        C15555a.m58085a(context, this, linkProperties);
    }

    public void removeFromLocalIndexing(Context context) {
        C15555a.m58089b(context, this, null);
    }

    public void removeFromLocalIndexing(Context context, LinkProperties linkProperties) {
        C15555a.m58089b(context, this, linkProperties);
    }

    public void userCompletedAction(String str) {
        userCompletedAction(str, null);
    }

    public void userCompletedAction(BRANCH_STANDARD_EVENT branch_standard_event) {
        userCompletedAction(branch_standard_event.getName(), null);
    }

    public void userCompletedAction(java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.String> r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0043 }
        r1.<init>();	 Catch:{ JSONException -> 0x0043 }
        r2 = r4.canonicalIdentifier_;	 Catch:{ JSONException -> 0x0043 }
        r1.put(r2);	 Catch:{ JSONException -> 0x0043 }
        r1 = r4.canonicalIdentifier_;	 Catch:{ JSONException -> 0x0043 }
        r2 = r4.convertToJson();	 Catch:{ JSONException -> 0x0043 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0043 }
        if (r6 == 0) goto L_0x0036;	 Catch:{ JSONException -> 0x0043 }
    L_0x001a:
        r1 = r6.keySet();	 Catch:{ JSONException -> 0x0043 }
        r1 = r1.iterator();	 Catch:{ JSONException -> 0x0043 }
    L_0x0022:
        r2 = r1.hasNext();	 Catch:{ JSONException -> 0x0043 }
        if (r2 == 0) goto L_0x0036;	 Catch:{ JSONException -> 0x0043 }
    L_0x0028:
        r2 = r1.next();	 Catch:{ JSONException -> 0x0043 }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x0043 }
        r3 = r6.get(r2);	 Catch:{ JSONException -> 0x0043 }
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x0043 }
        goto L_0x0022;	 Catch:{ JSONException -> 0x0043 }
    L_0x0036:
        r6 = io.branch.referral.Branch.b();	 Catch:{ JSONException -> 0x0043 }
        if (r6 == 0) goto L_0x0043;	 Catch:{ JSONException -> 0x0043 }
    L_0x003c:
        r6 = io.branch.referral.Branch.b();	 Catch:{ JSONException -> 0x0043 }
        r6.a(r5, r0);	 Catch:{ JSONException -> 0x0043 }
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.BranchUniversalObject.userCompletedAction(java.lang.String, java.util.HashMap):void");
    }

    public void userCompletedAction(BRANCH_STANDARD_EVENT branch_standard_event, HashMap<String, String> hashMap) {
        userCompletedAction(branch_standard_event.getName(), (HashMap) hashMap);
    }

    public boolean isPublicallyIndexable() {
        return this.indexMode_ == CONTENT_INDEX_MODE.PUBLIC;
    }

    public boolean isLocallyIndexable() {
        return this.localIndexMode_ == CONTENT_INDEX_MODE.PUBLIC;
    }

    public HashMap<String, String> getMetadata() {
        return this.metadata_.getCustomMetadata();
    }

    public ContentMetadata getContentMetadata() {
        return this.metadata_;
    }

    public long getExpirationTime() {
        return this.expirationInMilliSec_;
    }

    public String getCanonicalIdentifier() {
        return this.canonicalIdentifier_;
    }

    public String getCanonicalUrl() {
        return this.canonicalUrl_;
    }

    public String getDescription() {
        return this.description_;
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public String getTitle() {
        return this.title_;
    }

    public JSONArray getKeywordsJsonArray() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.keywords_.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    public ArrayList<String> getKeywords() {
        return this.keywords_;
    }

    public void registerView() {
        registerView(null);
    }

    public void registerView(@Nullable RegisterViewStatusListener registerViewStatusListener) {
        if (Branch.b() != null) {
            Branch.b().a(this, registerViewStatusListener);
        } else if (registerViewStatusListener != null) {
            registerViewStatusListener.onRegisterViewFinished(false, new C15583e("Register view error", -109));
        }
    }

    public String getShortUrl(@NonNull Context context, @NonNull LinkProperties linkProperties) {
        return getLinkBuilder(context, linkProperties).m63275a();
    }

    public String getShortUrl(@NonNull Context context, @NonNull LinkProperties linkProperties, boolean z) {
        return ((C17307g) getLinkBuilder(context, linkProperties).m58360a(z)).m63275a();
    }

    public void generateShortUrl(@NonNull Context context, @NonNull LinkProperties linkProperties, @Nullable Branch$BranchLinkCreateListener branch$BranchLinkCreateListener) {
        getLinkBuilder(context, linkProperties).m63276a(branch$BranchLinkCreateListener);
    }

    public void generateShortUrl(@NonNull Context context, @NonNull LinkProperties linkProperties, @Nullable Branch$BranchLinkCreateListener branch$BranchLinkCreateListener, boolean z) {
        ((C17307g) getLinkBuilder(context, linkProperties).m58360a(z)).m63276a(branch$BranchLinkCreateListener);
    }

    public void showShareSheet(@NonNull Activity activity, @NonNull LinkProperties linkProperties, @NonNull C15600b c15600b, @Nullable Branch$BranchLinkShareListener branch$BranchLinkShareListener) {
        showShareSheet(activity, linkProperties, c15600b, branch$BranchLinkShareListener, null);
    }

    public void showShareSheet(@NonNull Activity activity, @NonNull LinkProperties linkProperties, @NonNull C15600b c15600b, @Nullable Branch$BranchLinkShareListener branch$BranchLinkShareListener, Branch$IChannelProperties branch$IChannelProperties) {
        if (Branch.b() != null) {
            Branch$c branch$c = new Branch$c(activity, getLinkBuilder((Context) activity, linkProperties));
            branch$c.m58141a(new C17300a(this, branch$BranchLinkShareListener, branch$c, linkProperties)).m58142a(branch$IChannelProperties).m58151b(c15600b.m58514g()).m58143a(c15600b.m58513f());
            if (c15600b.m58511d() != null) {
                branch$c.m58139a(c15600b.m58511d(), c15600b.m58515h(), c15600b.m58518k());
            }
            if (c15600b.m58512e() != null) {
                branch$c.m58138a(c15600b.m58512e(), c15600b.m58517j());
            }
            if (c15600b.m58516i() != null) {
                branch$c.m58154c(c15600b.m58516i());
            }
            if (c15600b.m58510c().size() > null) {
                branch$c.m58144a(c15600b.m58510c());
            }
            if (c15600b.m58524q() > null) {
                branch$c.m58158d(c15600b.m58524q());
            }
            branch$c.m58150b(c15600b.m58519l());
            branch$c.m58146a(c15600b.m58522o());
            branch$c.m58137a(c15600b.m58523p());
            branch$c.m58156d(c15600b.m58520m());
            branch$c.m58140a(c15600b.m58521n());
            branch$c.m58153c(c15600b.m58525r());
            if (c15600b.m58509b() != null && c15600b.m58509b().size() > null) {
                branch$c.m58152b(c15600b.m58509b());
            }
            if (c15600b.m58508a() != null && c15600b.m58508a().size() > null) {
                branch$c.m58145a(c15600b.m58508a());
            }
            branch$c.m58147a();
        } else if (branch$BranchLinkShareListener != null) {
            branch$BranchLinkShareListener.onLinkShareResponse(null, null, new C15583e("Trouble sharing link. ", -109));
        } else {
            Log.e("BranchSDK", "Sharing error. Branch instance is not created yet. Make sure you have initialised Branch.");
        }
    }

    private C17307g getLinkBuilder(@NonNull Context context, @NonNull LinkProperties linkProperties) {
        return getLinkBuilder(new C17307g(context), linkProperties);
    }

    private C17307g getLinkBuilder(@NonNull C17307g c17307g, @NonNull LinkProperties linkProperties) {
        String key;
        StringBuilder stringBuilder;
        if (linkProperties.getTags() != null) {
            c17307g.m58359a(linkProperties.getTags());
        }
        if (linkProperties.getFeature() != null) {
            c17307g.m63279c(linkProperties.getFeature());
        }
        if (linkProperties.getAlias() != null) {
            c17307g.m63274a(linkProperties.getAlias());
        }
        if (linkProperties.getChannel() != null) {
            c17307g.m63278b(linkProperties.getChannel());
        }
        if (linkProperties.getStage() != null) {
            c17307g.m63280d(linkProperties.getStage());
        }
        if (linkProperties.getCampaign() != null) {
            c17307g.m63281e(linkProperties.getCampaign());
        }
        if (linkProperties.getMatchDuration() > 0) {
            c17307g.m63273a(linkProperties.getMatchDuration());
        }
        if (!TextUtils.isEmpty(this.title_)) {
            c17307g.m58358a(Jsonkey.ContentTitle.getKey(), this.title_);
        }
        if (!TextUtils.isEmpty(this.canonicalIdentifier_)) {
            c17307g.m58358a(Jsonkey.CanonicalIdentifier.getKey(), this.canonicalIdentifier_);
        }
        if (!TextUtils.isEmpty(this.canonicalUrl_)) {
            c17307g.m58358a(Jsonkey.CanonicalUrl.getKey(), this.canonicalUrl_);
        }
        JSONArray keywordsJsonArray = getKeywordsJsonArray();
        if (keywordsJsonArray.length() > 0) {
            c17307g.m58358a(Jsonkey.ContentKeyWords.getKey(), keywordsJsonArray);
        }
        if (!TextUtils.isEmpty(this.description_)) {
            c17307g.m58358a(Jsonkey.ContentDesc.getKey(), this.description_);
        }
        if (!TextUtils.isEmpty(this.imageUrl_)) {
            c17307g.m58358a(Jsonkey.ContentImgUrl.getKey(), this.imageUrl_);
        }
        if (this.expirationInMilliSec_ > 0) {
            key = Jsonkey.ContentExpiryTime.getKey();
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.expirationInMilliSec_);
            c17307g.m58358a(key, stringBuilder.toString());
        }
        key = Jsonkey.PublicallyIndexable.getKey();
        stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(isPublicallyIndexable());
        c17307g.m58358a(key, stringBuilder.toString());
        JSONObject convertToJson = this.metadata_.convertToJson();
        try {
            Iterator keys = convertToJson.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                c17307g.m58358a(str, convertToJson.get(str));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        linkProperties = linkProperties.getControlParams();
        for (String str2 : linkProperties.keySet()) {
            c17307g.m58358a(str2, linkProperties.get(str2));
        }
        return c17307g;
    }

    public static io.branch.indexing.BranchUniversalObject getReferredBranchUniversalObject() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = io.branch.referral.Branch.b();
        r1 = 0;
        if (r0 == 0) goto L_0x0048;
    L_0x0007:
        r2 = r0.i();	 Catch:{ Exception -> 0x0048 }
        if (r2 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x0048 }
    L_0x000d:
        r2 = r0.i();	 Catch:{ Exception -> 0x0048 }
        r3 = "+clicked_branch_link";	 Catch:{ Exception -> 0x0048 }
        r2 = r2.has(r3);	 Catch:{ Exception -> 0x0048 }
        if (r2 == 0) goto L_0x002f;	 Catch:{ Exception -> 0x0048 }
    L_0x0019:
        r2 = r0.i();	 Catch:{ Exception -> 0x0048 }
        r3 = "+clicked_branch_link";	 Catch:{ Exception -> 0x0048 }
        r2 = r2.getBoolean(r3);	 Catch:{ Exception -> 0x0048 }
        if (r2 == 0) goto L_0x002f;	 Catch:{ Exception -> 0x0048 }
    L_0x0025:
        r0 = r0.i();	 Catch:{ Exception -> 0x0048 }
        r0 = createInstance(r0);	 Catch:{ Exception -> 0x0048 }
    L_0x002d:
        r1 = r0;	 Catch:{ Exception -> 0x0048 }
        goto L_0x0048;	 Catch:{ Exception -> 0x0048 }
    L_0x002f:
        r2 = r0.j();	 Catch:{ Exception -> 0x0048 }
        if (r2 == 0) goto L_0x0048;	 Catch:{ Exception -> 0x0048 }
    L_0x0035:
        r2 = r0.j();	 Catch:{ Exception -> 0x0048 }
        r2 = r2.length();	 Catch:{ Exception -> 0x0048 }
        if (r2 <= 0) goto L_0x0048;	 Catch:{ Exception -> 0x0048 }
    L_0x003f:
        r0 = r0.i();	 Catch:{ Exception -> 0x0048 }
        r0 = createInstance(r0);	 Catch:{ Exception -> 0x0048 }
        goto L_0x002d;
    L_0x0048:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.BranchUniversalObject.getReferredBranchUniversalObject():io.branch.indexing.BranchUniversalObject");
    }

    public static io.branch.indexing.BranchUniversalObject createInstance(org.json.JSONObject r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = new io.branch.indexing.BranchUniversalObject;	 Catch:{ Exception -> 0x00fc }
        r1.<init>();	 Catch:{ Exception -> 0x00fc }
        r2 = new io.branch.referral.j$a;	 Catch:{ Exception -> 0x00fd }
        r2.<init>(r5);	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.Defines.Jsonkey.ContentTitle;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58366a(r5);	 Catch:{ Exception -> 0x00fd }
        r1.title_ = r5;	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.Defines.Jsonkey.CanonicalIdentifier;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58366a(r5);	 Catch:{ Exception -> 0x00fd }
        r1.canonicalIdentifier_ = r5;	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.Defines.Jsonkey.CanonicalUrl;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58366a(r5);	 Catch:{ Exception -> 0x00fd }
        r1.canonicalUrl_ = r5;	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.Defines.Jsonkey.ContentDesc;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58366a(r5);	 Catch:{ Exception -> 0x00fd }
        r1.description_ = r5;	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.Defines.Jsonkey.ContentImgUrl;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58366a(r5);	 Catch:{ Exception -> 0x00fd }
        r1.imageUrl_ = r5;	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.Defines.Jsonkey.ContentExpiryTime;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r3 = r2.m58368b(r5);	 Catch:{ Exception -> 0x00fd }
        r1.expirationInMilliSec_ = r3;	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.Defines.Jsonkey.ContentKeyWords;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58371e(r5);	 Catch:{ Exception -> 0x00fd }
        r3 = r5 instanceof org.json.JSONArray;	 Catch:{ Exception -> 0x00fd }
        if (r3 == 0) goto L_0x0065;	 Catch:{ Exception -> 0x00fd }
    L_0x0061:
        r0 = r5;	 Catch:{ Exception -> 0x00fd }
        r0 = (org.json.JSONArray) r0;	 Catch:{ Exception -> 0x00fd }
        goto L_0x0070;	 Catch:{ Exception -> 0x00fd }
    L_0x0065:
        r3 = r5 instanceof java.lang.String;	 Catch:{ Exception -> 0x00fd }
        if (r3 == 0) goto L_0x0070;	 Catch:{ Exception -> 0x00fd }
    L_0x0069:
        r0 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00fd }
        r5 = (java.lang.String) r5;	 Catch:{ Exception -> 0x00fd }
        r0.<init>(r5);	 Catch:{ Exception -> 0x00fd }
    L_0x0070:
        if (r0 == 0) goto L_0x0087;	 Catch:{ Exception -> 0x00fd }
    L_0x0072:
        r5 = 0;	 Catch:{ Exception -> 0x00fd }
    L_0x0073:
        r3 = r0.length();	 Catch:{ Exception -> 0x00fd }
        if (r5 >= r3) goto L_0x0087;	 Catch:{ Exception -> 0x00fd }
    L_0x0079:
        r3 = r1.keywords_;	 Catch:{ Exception -> 0x00fd }
        r4 = r0.get(r5);	 Catch:{ Exception -> 0x00fd }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x00fd }
        r3.add(r4);	 Catch:{ Exception -> 0x00fd }
        r5 = r5 + 1;	 Catch:{ Exception -> 0x00fd }
        goto L_0x0073;	 Catch:{ Exception -> 0x00fd }
    L_0x0087:
        r5 = io.branch.referral.Defines.Jsonkey.PublicallyIndexable;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58371e(r5);	 Catch:{ Exception -> 0x00fd }
        r0 = r5 instanceof java.lang.Boolean;	 Catch:{ Exception -> 0x00fd }
        if (r0 == 0) goto L_0x00a5;	 Catch:{ Exception -> 0x00fd }
    L_0x0095:
        r5 = (java.lang.Boolean) r5;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.booleanValue();	 Catch:{ Exception -> 0x00fd }
        if (r5 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x00fd }
    L_0x009d:
        r5 = io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC;	 Catch:{ Exception -> 0x00fd }
        goto L_0x00a2;	 Catch:{ Exception -> 0x00fd }
    L_0x00a0:
        r5 = io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PRIVATE;	 Catch:{ Exception -> 0x00fd }
    L_0x00a2:
        r1.indexMode_ = r5;	 Catch:{ Exception -> 0x00fd }
        goto L_0x00b9;	 Catch:{ Exception -> 0x00fd }
    L_0x00a5:
        r0 = r5 instanceof java.lang.Integer;	 Catch:{ Exception -> 0x00fd }
        if (r0 == 0) goto L_0x00b9;	 Catch:{ Exception -> 0x00fd }
    L_0x00a9:
        r5 = (java.lang.Integer) r5;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.intValue();	 Catch:{ Exception -> 0x00fd }
        r0 = 1;	 Catch:{ Exception -> 0x00fd }
        if (r5 != r0) goto L_0x00b5;	 Catch:{ Exception -> 0x00fd }
    L_0x00b2:
        r5 = io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC;	 Catch:{ Exception -> 0x00fd }
        goto L_0x00b7;	 Catch:{ Exception -> 0x00fd }
    L_0x00b5:
        r5 = io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PRIVATE;	 Catch:{ Exception -> 0x00fd }
    L_0x00b7:
        r1.indexMode_ = r5;	 Catch:{ Exception -> 0x00fd }
    L_0x00b9:
        r5 = io.branch.referral.Defines.Jsonkey.LocallyIndexable;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58369c(r5);	 Catch:{ Exception -> 0x00fd }
        if (r5 == 0) goto L_0x00c8;	 Catch:{ Exception -> 0x00fd }
    L_0x00c5:
        r5 = io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PUBLIC;	 Catch:{ Exception -> 0x00fd }
        goto L_0x00ca;	 Catch:{ Exception -> 0x00fd }
    L_0x00c8:
        r5 = io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE.PRIVATE;	 Catch:{ Exception -> 0x00fd }
    L_0x00ca:
        r1.localIndexMode_ = r5;	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.Defines.Jsonkey.CreationTimestamp;	 Catch:{ Exception -> 0x00fd }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x00fd }
        r3 = r2.m58368b(r5);	 Catch:{ Exception -> 0x00fd }
        r1.creationTimeStamp_ = r3;	 Catch:{ Exception -> 0x00fd }
        r5 = io.branch.referral.util.ContentMetadata.createFromJson(r2);	 Catch:{ Exception -> 0x00fd }
        r1.metadata_ = r5;	 Catch:{ Exception -> 0x00fd }
        r5 = r2.m58367a();	 Catch:{ Exception -> 0x00fd }
        r0 = r5.keys();	 Catch:{ Exception -> 0x00fd }
    L_0x00e6:
        r2 = r0.hasNext();	 Catch:{ Exception -> 0x00fd }
        if (r2 == 0) goto L_0x00fd;	 Catch:{ Exception -> 0x00fd }
    L_0x00ec:
        r2 = r0.next();	 Catch:{ Exception -> 0x00fd }
        r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x00fd }
        r3 = r1.metadata_;	 Catch:{ Exception -> 0x00fd }
        r4 = r5.optString(r2);	 Catch:{ Exception -> 0x00fd }
        r3.addCustomMetadata(r2, r4);	 Catch:{ Exception -> 0x00fd }
        goto L_0x00e6;
    L_0x00fc:
        r1 = r0;
    L_0x00fd:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.BranchUniversalObject.createInstance(org.json.JSONObject):io.branch.indexing.BranchUniversalObject");
    }

    public org.json.JSONObject convertToJson() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r6.metadata_;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.convertToJson();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r1.keys();	 Catch:{ JSONException -> 0x00e6 }
    L_0x000f:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x00e6 }
        if (r3 == 0) goto L_0x0023;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0015:
        r3 = r2.next();	 Catch:{ JSONException -> 0x00e6 }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x00e6 }
        r4 = r1.get(r3);	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r3, r4);	 Catch:{ JSONException -> 0x00e6 }
        goto L_0x000f;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0023:
        r1 = r6.title_;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x0036;	 Catch:{ JSONException -> 0x00e6 }
    L_0x002b:
        r1 = io.branch.referral.Defines.Jsonkey.ContentTitle;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.title_;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x0036:
        r1 = r6.canonicalIdentifier_;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x0049;	 Catch:{ JSONException -> 0x00e6 }
    L_0x003e:
        r1 = io.branch.referral.Defines.Jsonkey.CanonicalIdentifier;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.canonicalIdentifier_;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x0049:
        r1 = r6.canonicalUrl_;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x005c;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0051:
        r1 = io.branch.referral.Defines.Jsonkey.CanonicalUrl;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.canonicalUrl_;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x005c:
        r1 = r6.keywords_;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.size();	 Catch:{ JSONException -> 0x00e6 }
        if (r1 <= 0) goto L_0x0088;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0064:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x00e6 }
        r1.<init>();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.keywords_;	 Catch:{ JSONException -> 0x00e6 }
        r2 = r2.iterator();	 Catch:{ JSONException -> 0x00e6 }
    L_0x006f:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x00e6 }
        if (r3 == 0) goto L_0x007f;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0075:
        r3 = r2.next();	 Catch:{ JSONException -> 0x00e6 }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x00e6 }
        r1.put(r3);	 Catch:{ JSONException -> 0x00e6 }
        goto L_0x006f;	 Catch:{ JSONException -> 0x00e6 }
    L_0x007f:
        r2 = io.branch.referral.Defines.Jsonkey.ContentKeyWords;	 Catch:{ JSONException -> 0x00e6 }
        r2 = r2.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00e6 }
    L_0x0088:
        r1 = r6.description_;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x009b;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0090:
        r1 = io.branch.referral.Defines.Jsonkey.ContentDesc;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.description_;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x009b:
        r1 = r6.imageUrl_;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x00ae;	 Catch:{ JSONException -> 0x00e6 }
    L_0x00a3:
        r1 = io.branch.referral.Defines.Jsonkey.ContentImgUrl;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.imageUrl_;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x00ae:
        r1 = r6.expirationInMilliSec_;	 Catch:{ JSONException -> 0x00e6 }
        r3 = 0;	 Catch:{ JSONException -> 0x00e6 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ JSONException -> 0x00e6 }
        if (r5 <= 0) goto L_0x00c1;	 Catch:{ JSONException -> 0x00e6 }
    L_0x00b6:
        r1 = io.branch.referral.Defines.Jsonkey.ContentExpiryTime;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.expirationInMilliSec_;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x00c1:
        r1 = io.branch.referral.Defines.Jsonkey.PublicallyIndexable;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.isPublicallyIndexable();	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
        r1 = io.branch.referral.Defines.Jsonkey.LocallyIndexable;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.isLocallyIndexable();	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
        r1 = io.branch.referral.Defines.Jsonkey.CreationTimestamp;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.getKey();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.creationTimeStamp_;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x00e6:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.BranchUniversalObject.convertToJson():org.json.JSONObject");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.creationTimeStamp_);
        parcel.writeString(this.canonicalIdentifier_);
        parcel.writeString(this.canonicalUrl_);
        parcel.writeString(this.title_);
        parcel.writeString(this.description_);
        parcel.writeString(this.imageUrl_);
        parcel.writeLong(this.expirationInMilliSec_);
        parcel.writeInt(this.indexMode_.ordinal());
        parcel.writeSerializable(this.keywords_);
        parcel.writeParcelable(this.metadata_, i);
        parcel.writeInt(this.localIndexMode_.ordinal());
    }

    private BranchUniversalObject(Parcel parcel) {
        this();
        this.creationTimeStamp_ = parcel.readLong();
        this.canonicalIdentifier_ = parcel.readString();
        this.canonicalUrl_ = parcel.readString();
        this.title_ = parcel.readString();
        this.description_ = parcel.readString();
        this.imageUrl_ = parcel.readString();
        this.expirationInMilliSec_ = parcel.readLong();
        this.indexMode_ = CONTENT_INDEX_MODE.values()[parcel.readInt()];
        ArrayList arrayList = (ArrayList) parcel.readSerializable();
        if (arrayList != null) {
            this.keywords_.addAll(arrayList);
        }
        this.metadata_ = (ContentMetadata) parcel.readParcelable(ContentMetadata.class.getClassLoader());
        this.localIndexMode_ = CONTENT_INDEX_MODE.values()[parcel.readInt()];
    }
}
