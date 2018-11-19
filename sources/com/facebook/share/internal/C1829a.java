package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.a */
public class C1829a {
    /* renamed from: a */
    private static Bundle m6354a(ShareVideoContent shareVideoContent, boolean z) {
        return null;
    }

    /* renamed from: a */
    public static Bundle m6355a(UUID uuid, ShareContent shareContent, boolean z) {
        C1749x.m6064a((Object) shareContent, "shareContent");
        C1749x.m6064a((Object) uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return C1829a.m6351a((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return C1829a.m6353a(sharePhotoContent, C1838i.m6462a(sharePhotoContent, uuid), z);
        } else if (shareContent instanceof ShareVideoContent) {
            return C1829a.m6354a((ShareVideoContent) shareContent, z);
        } else {
            if (!(shareContent instanceof ShareOpenGraphContent)) {
                return null;
            }
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                return C1829a.m6352a(shareOpenGraphContent, C1838i.m6465a(uuid, shareOpenGraphContent), z);
            } catch (UUID uuid2) {
                z = new StringBuilder();
                z.append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                z.append(uuid2.getMessage());
                throw new FacebookException(z.toString());
            }
        }
    }

    /* renamed from: a */
    private static Bundle m6351a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle a = C1829a.m6350a((ShareContent) shareLinkContent, z);
        Utility.m5772a(a, "com.facebook.platform.extra.TITLE", shareLinkContent.getContentTitle());
        Utility.m5772a(a, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.getContentDescription());
        Utility.m5771a(a, "com.facebook.platform.extra.IMAGE", shareLinkContent.getImageUrl());
        return a;
    }

    /* renamed from: a */
    private static Bundle m6353a(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        sharePhotoContent = C1829a.m6350a((ShareContent) sharePhotoContent, z);
        sharePhotoContent.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(list));
        return sharePhotoContent;
    }

    /* renamed from: a */
    private static Bundle m6352a(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle a = C1829a.m6350a((ShareContent) shareOpenGraphContent, z);
        Utility.m5772a(a, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.getPreviewPropertyName());
        Utility.m5772a(a, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.getAction().getActionType());
        Utility.m5772a(a, "com.facebook.platform.extra.ACTION", jSONObject.toString());
        return a;
    }

    /* renamed from: a */
    private static Bundle m6350a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        Utility.m5771a(bundle, "com.facebook.platform.extra.LINK", shareContent.getContentUrl());
        Utility.m5772a(bundle, "com.facebook.platform.extra.PLACE", shareContent.getPlaceId());
        Utility.m5772a(bundle, "com.facebook.platform.extra.REF", shareContent.getRef());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        Collection peopleIds = shareContent.getPeopleIds();
        if (!Utility.m5786a(peopleIds)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(peopleIds));
        }
        return bundle;
    }
}
