package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.Mapper;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.tinder.api.ManagerWebServices;

/* renamed from: com.facebook.share.internal.j */
public class C1839j {

    /* renamed from: com.facebook.share.internal.j$1 */
    static class C34741 implements Mapper<SharePhoto, String> {
        C34741() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m13197a((SharePhoto) obj);
        }

        /* renamed from: a */
        public String m13197a(SharePhoto sharePhoto) {
            return sharePhoto.getImageUrl().toString();
        }
    }

    /* renamed from: a */
    public static Bundle m6477a(ShareLinkContent shareLinkContent) {
        Bundle a = C1839j.m6476a((ShareContent) shareLinkContent);
        Utility.m5771a(a, "href", shareLinkContent.getContentUrl());
        Utility.m5772a(a, "quote", shareLinkContent.getQuote());
        return a;
    }

    /* renamed from: a */
    public static Bundle m6478a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = C1839j.m6476a((ShareContent) shareOpenGraphContent);
        Utility.m5772a(a, "action_type", shareOpenGraphContent.getAction().getActionType());
        try {
            shareOpenGraphContent = C1838i.m6466a(C1838i.m6464a(shareOpenGraphContent), false);
            if (shareOpenGraphContent != null) {
                Utility.m5772a(a, "action_properties", shareOpenGraphContent.toString());
            }
            return a;
        } catch (Throwable e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e);
        }
    }

    /* renamed from: a */
    public static Bundle m6479a(SharePhotoContent sharePhotoContent) {
        Bundle a = C1839j.m6476a((ShareContent) sharePhotoContent);
        String[] strArr = new String[sharePhotoContent.getPhotos().size()];
        Utility.m5767a(sharePhotoContent.getPhotos(), new C34741()).toArray(strArr);
        a.putStringArray(ManagerWebServices.PARAM_MEDIA, strArr);
        return a;
    }

    /* renamed from: a */
    public static Bundle m6476a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        shareContent = shareContent.getShareHashtag();
        if (shareContent != null) {
            Utility.m5772a(bundle, "hashtag", shareContent.getHashtag());
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m6480b(ShareLinkContent shareLinkContent) {
        Bundle bundle = new Bundle();
        Utility.m5772a(bundle, "name", shareLinkContent.getContentTitle());
        Utility.m5772a(bundle, ManagerWebServices.PARAM_BADGE_DESC, shareLinkContent.getContentDescription());
        Utility.m5772a(bundle, ManagerWebServices.IG_PARAM_LINK, Utility.m5756a(shareLinkContent.getContentUrl()));
        Utility.m5772a(bundle, "picture", Utility.m5756a(shareLinkContent.getImageUrl()));
        Utility.m5772a(bundle, "quote", shareLinkContent.getQuote());
        if (shareLinkContent.getShareHashtag() != null) {
            Utility.m5772a(bundle, "hashtag", shareLinkContent.getShareHashtag().getHashtag());
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m6475a(ShareFeedContent shareFeedContent) {
        Bundle bundle = new Bundle();
        Utility.m5772a(bundle, "to", shareFeedContent.getToId());
        Utility.m5772a(bundle, ManagerWebServices.IG_PARAM_LINK, shareFeedContent.getLink());
        Utility.m5772a(bundle, "picture", shareFeedContent.getPicture());
        Utility.m5772a(bundle, "source", shareFeedContent.getMediaSource());
        Utility.m5772a(bundle, "name", shareFeedContent.getLinkName());
        Utility.m5772a(bundle, "caption", shareFeedContent.getLinkCaption());
        Utility.m5772a(bundle, ManagerWebServices.PARAM_BADGE_DESC, shareFeedContent.getLinkDescription());
        return bundle;
    }
}
