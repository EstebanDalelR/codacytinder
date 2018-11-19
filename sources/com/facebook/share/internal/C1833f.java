package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import com.snapchat.kit.sdk.bitmoji.models.Sticker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.f */
public class C1833f {
    /* renamed from: a */
    public static Bundle m6388a(UUID uuid, ShareContent shareContent, boolean z) {
        C1749x.m6064a((Object) shareContent, "shareContent");
        C1749x.m6064a((Object) uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return C1833f.m6380a((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return C1833f.m6386a(sharePhotoContent, C1838i.m6462a(sharePhotoContent, uuid), z);
        } else if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            return C1833f.m6387a(shareVideoContent, C1838i.m6460a(shareVideoContent, uuid), z);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                return C1833f.m6385a(shareOpenGraphContent, C1838i.m6466a(C1838i.m6465a(uuid, shareOpenGraphContent), false), z);
            } catch (UUID uuid2) {
                z = new StringBuilder();
                z.append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                z.append(uuid2.getMessage());
                throw new FacebookException(z.toString());
            }
        } else if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            return C1833f.m6381a(shareMediaContent, C1838i.m6461a(shareMediaContent, uuid2), z);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return C1833f.m6378a(shareCameraEffectContent, C1838i.m6450a(shareCameraEffectContent, uuid2), z);
        } else if ((shareContent instanceof ShareMessengerGenericTemplateContent) != null) {
            return C1833f.m6382a((ShareMessengerGenericTemplateContent) shareContent, z);
        } else {
            if ((shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) != null) {
                return C1833f.m6384a((ShareMessengerOpenGraphMusicTemplateContent) shareContent, z);
            }
            return (shareContent instanceof ShareMessengerMediaTemplateContent) != null ? C1833f.m6383a((ShareMessengerMediaTemplateContent) shareContent, z) : null;
        }
    }

    /* renamed from: a */
    private static Bundle m6378a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z) {
        Bundle a = C1833f.m6379a((ShareContent) shareCameraEffectContent, z);
        Utility.m5772a(a, "effect_id", shareCameraEffectContent.getEffectId());
        if (bundle != null) {
            a.putBundle("effect_textures", bundle);
        }
        try {
            shareCameraEffectContent = CameraEffectJSONUtility.m6260a(shareCameraEffectContent.getArguments());
            if (shareCameraEffectContent != null) {
                Utility.m5772a(a, "effect_arguments", shareCameraEffectContent.toString());
            }
            return a;
        } catch (ShareCameraEffectContent shareCameraEffectContent2) {
            z = new StringBuilder();
            z.append("Unable to create a JSON Object from the provided CameraEffectArguments: ");
            z.append(shareCameraEffectContent2.getMessage());
            throw new FacebookException(z.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m6380a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle a = C1833f.m6379a((ShareContent) shareLinkContent, z);
        Utility.m5772a(a, "TITLE", shareLinkContent.getContentTitle());
        Utility.m5772a(a, "DESCRIPTION", shareLinkContent.getContentDescription());
        Utility.m5771a(a, "IMAGE", shareLinkContent.getImageUrl());
        Utility.m5772a(a, "QUOTE", shareLinkContent.getQuote());
        Utility.m5771a(a, "MESSENGER_LINK", shareLinkContent.getContentUrl());
        Utility.m5771a(a, "TARGET_DISPLAY", shareLinkContent.getContentUrl());
        return a;
    }

    /* renamed from: a */
    private static Bundle m6386a(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        sharePhotoContent = C1833f.m6379a((ShareContent) sharePhotoContent, z);
        sharePhotoContent.putStringArrayList("PHOTOS", new ArrayList(list));
        return sharePhotoContent;
    }

    /* renamed from: a */
    private static Bundle m6387a(ShareVideoContent shareVideoContent, String str, boolean z) {
        Bundle a = C1833f.m6379a((ShareContent) shareVideoContent, z);
        Utility.m5772a(a, "TITLE", shareVideoContent.getContentTitle());
        Utility.m5772a(a, "DESCRIPTION", shareVideoContent.getContentDescription());
        Utility.m5772a(a, "VIDEO", str);
        return a;
    }

    /* renamed from: a */
    private static Bundle m6381a(ShareMediaContent shareMediaContent, List<Bundle> list, boolean z) {
        shareMediaContent = C1833f.m6379a((ShareContent) shareMediaContent, z);
        shareMediaContent.putParcelableArrayList("MEDIA", new ArrayList(list));
        return shareMediaContent;
    }

    /* renamed from: a */
    private static Bundle m6385a(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle a = C1833f.m6379a((ShareContent) shareOpenGraphContent, z);
        Utility.m5772a(a, "PREVIEW_PROPERTY_NAME", (String) C1838i.m6451a(shareOpenGraphContent.getPreviewPropertyName()).second);
        Utility.m5772a(a, "ACTION_TYPE", shareOpenGraphContent.getAction().getActionType());
        Utility.m5772a(a, "ACTION", jSONObject.toString());
        return a;
    }

    /* renamed from: a */
    private static Bundle m6382a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent, boolean z) {
        Bundle a = C1833f.m6379a((ShareContent) shareMessengerGenericTemplateContent, z);
        try {
            C1832e.m6369a(a, shareMessengerGenericTemplateContent);
            return a;
        } catch (ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
            stringBuilder.append(shareMessengerGenericTemplateContent2.getMessage());
            throw new FacebookException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m6384a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent, boolean z) {
        Bundle a = C1833f.m6379a((ShareContent) shareMessengerOpenGraphMusicTemplateContent, z);
        try {
            C1832e.m6372a(a, shareMessengerOpenGraphMusicTemplateContent);
            return a;
        } catch (ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
            stringBuilder.append(shareMessengerOpenGraphMusicTemplateContent2.getMessage());
            throw new FacebookException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m6383a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent, boolean z) {
        Bundle a = C1833f.m6379a((ShareContent) shareMessengerMediaTemplateContent, z);
        try {
            C1832e.m6371a(a, shareMessengerMediaTemplateContent);
            return a;
        } catch (ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
            stringBuilder.append(shareMessengerMediaTemplateContent2.getMessage());
            throw new FacebookException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m6379a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        Utility.m5771a(bundle, "LINK", shareContent.getContentUrl());
        Utility.m5772a(bundle, "PLACE", shareContent.getPlaceId());
        Utility.m5772a(bundle, "PAGE", shareContent.getPageId());
        Utility.m5772a(bundle, "REF", shareContent.getRef());
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        Collection peopleIds = shareContent.getPeopleIds();
        if (!Utility.m5786a(peopleIds)) {
            bundle.putStringArrayList(Sticker.FRIENDS_CAPABILITY, new ArrayList(peopleIds));
        }
        shareContent = shareContent.getShareHashtag();
        if (shareContent != null) {
            Utility.m5772a(bundle, "HASHTAG", shareContent.getHashtag());
        }
        return bundle;
    }
}
