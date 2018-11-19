package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.C1749x;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.share.internal.h */
public class C1837h {
    /* renamed from: a */
    private static C1836a f5023a;
    /* renamed from: b */
    private static C1836a f5024b;

    /* renamed from: com.facebook.share.internal.h$a */
    private static class C1836a {
        /* renamed from: a */
        private boolean f5022a;

        private C1836a() {
            this.f5022a = false;
        }

        /* renamed from: a */
        public void m6393a(ShareLinkContent shareLinkContent) {
            C1837h.m6434b(shareLinkContent, this);
        }

        /* renamed from: a */
        public void m6404a(SharePhotoContent sharePhotoContent) {
            C1837h.m6444b(sharePhotoContent, this);
        }

        /* renamed from: a */
        public void mo1904a(ShareVideoContent shareVideoContent) {
            C1837h.m6446b(shareVideoContent, this);
        }

        /* renamed from: a */
        public void mo1902a(ShareMediaContent shareMediaContent) {
            C1837h.m6435b(shareMediaContent, this);
        }

        /* renamed from: a */
        public void m6392a(ShareCameraEffectContent shareCameraEffectContent) {
            C1837h.m6432b(shareCameraEffectContent, this);
        }

        /* renamed from: a */
        public void m6400a(ShareOpenGraphContent shareOpenGraphContent) {
            this.f5022a = true;
            C1837h.m6440b(shareOpenGraphContent, this);
        }

        /* renamed from: a */
        public void m6399a(ShareOpenGraphAction shareOpenGraphAction) {
            C1837h.m6439b(shareOpenGraphAction, this);
        }

        /* renamed from: a */
        public void m6401a(ShareOpenGraphObject shareOpenGraphObject) {
            C1837h.m6441b(shareOpenGraphObject, this);
        }

        /* renamed from: a */
        public void m6402a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z) {
            C1837h.m6442b(shareOpenGraphValueContainer, this, z);
        }

        /* renamed from: a */
        public void mo1903a(SharePhoto sharePhoto) {
            C1837h.m6448d(sharePhoto, this);
        }

        /* renamed from: a */
        public void m6405a(ShareVideo shareVideo) {
            C1837h.m6445b(shareVideo, this);
        }

        /* renamed from: a */
        public void m6394a(ShareMedia shareMedia) {
            C1837h.m6413a(shareMedia, this);
        }

        /* renamed from: a */
        public void m6398a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
            C1837h.m6438b(shareMessengerOpenGraphMusicTemplateContent);
        }

        /* renamed from: a */
        public void m6396a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
            C1837h.m6436b(shareMessengerGenericTemplateContent);
        }

        /* renamed from: a */
        public void m6397a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
            C1837h.m6437b(shareMessengerMediaTemplateContent);
        }

        /* renamed from: a */
        public boolean m6407a() {
            return this.f5022a;
        }
    }

    /* renamed from: com.facebook.share.internal.h$b */
    private static class C3466b extends C1836a {
        private C3466b() {
            super();
        }

        /* renamed from: a */
        public void mo1904a(ShareVideoContent shareVideoContent) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        /* renamed from: a */
        public void mo1902a(ShareMediaContent shareMediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        /* renamed from: a */
        public void mo1903a(SharePhoto sharePhoto) {
            C1837h.m6449e(sharePhoto, this);
        }
    }

    /* renamed from: a */
    public static void m6410a(ShareContent shareContent) {
        C1837h.m6411a(shareContent, C1837h.m6408a());
    }

    /* renamed from: b */
    public static void m6433b(ShareContent shareContent) {
        C1837h.m6411a(shareContent, C1837h.m6431b());
    }

    /* renamed from: a */
    private static C1836a m6408a() {
        if (f5024b == null) {
            f5024b = new C1836a();
        }
        return f5024b;
    }

    /* renamed from: b */
    private static C1836a m6431b() {
        if (f5023a == null) {
            f5023a = new C3466b();
        }
        return f5023a;
    }

    /* renamed from: a */
    private static void m6411a(ShareContent shareContent, C1836a c1836a) throws FacebookException {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            c1836a.m6393a((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            c1836a.m6404a((SharePhotoContent) shareContent);
        } else if (shareContent instanceof ShareVideoContent) {
            c1836a.mo1904a((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            c1836a.m6400a((ShareOpenGraphContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            c1836a.mo1902a((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            c1836a.m6392a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            c1836a.m6398a((ShareMessengerOpenGraphMusicTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            c1836a.m6397a((ShareMessengerMediaTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            c1836a.m6396a((ShareMessengerGenericTemplateContent) shareContent);
        }
    }

    /* renamed from: b */
    private static void m6434b(ShareLinkContent shareLinkContent, C1836a c1836a) {
        Uri imageUrl = shareLinkContent.getImageUrl();
        if (imageUrl != null && Utility.m5794b(imageUrl) == null) {
            throw new FacebookException("Image Url must be an http:// or https:// url");
        }
    }

    /* renamed from: b */
    private static void m6444b(SharePhotoContent sharePhotoContent, C1836a c1836a) {
        SharePhotoContent<SharePhoto> photos = sharePhotoContent.getPhotos();
        if (photos != null) {
            if (!photos.isEmpty()) {
                if (photos.size() > 6) {
                    throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{Integer.valueOf(6)}));
                }
                for (SharePhoto a : photos) {
                    c1836a.mo1903a(a);
                }
                return;
            }
        }
        throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
    }

    /* renamed from: a */
    private static void m6424a(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        Bitmap bitmap = sharePhoto.getBitmap();
        sharePhoto = sharePhoto.getImageUrl();
        if (bitmap == null && sharePhoto == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* renamed from: c */
    private static void m6447c(SharePhoto sharePhoto, C1836a c1836a) {
        C1837h.m6424a(sharePhoto);
        Bitmap bitmap = sharePhoto.getBitmap();
        Uri imageUrl = sharePhoto.getImageUrl();
        if (bitmap == null && Utility.m5794b(imageUrl) != null && c1836a.m6407a() == null) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* renamed from: d */
    private static void m6448d(SharePhoto sharePhoto, C1836a c1836a) {
        C1837h.m6447c(sharePhoto, c1836a);
        if (sharePhoto.getBitmap() != null || Utility.m5794b(sharePhoto.getImageUrl()) == null) {
            C1749x.m6074d(FacebookSdk.m3994e());
        }
    }

    /* renamed from: e */
    private static void m6449e(SharePhoto sharePhoto, C1836a c1836a) {
        C1837h.m6424a(sharePhoto);
    }

    /* renamed from: b */
    private static void m6446b(ShareVideoContent shareVideoContent, C1836a c1836a) {
        c1836a.m6405a(shareVideoContent.getVideo());
        SharePhoto previewPhoto = shareVideoContent.getPreviewPhoto();
        if (previewPhoto != null) {
            c1836a.mo1903a(previewPhoto);
        }
    }

    /* renamed from: b */
    private static void m6445b(ShareVideo shareVideo, C1836a c1836a) {
        if (shareVideo == null) {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
        Uri localUrl = shareVideo.getLocalUrl();
        if (localUrl == null) {
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        } else if (Utility.m5800c(localUrl) == null && Utility.m5804d(localUrl) == null) {
            throw new FacebookException("ShareVideo must reference a video that is on the device");
        }
    }

    /* renamed from: b */
    private static void m6435b(ShareMediaContent shareMediaContent, C1836a c1836a) {
        ShareMediaContent<ShareMedia> media = shareMediaContent.getMedia();
        if (media != null) {
            if (!media.isEmpty()) {
                if (media.size() > 6) {
                    throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", new Object[]{Integer.valueOf(6)}));
                }
                for (ShareMedia a : media) {
                    c1836a.m6394a(a);
                }
                return;
            }
        }
        throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
    }

    /* renamed from: a */
    public static void m6413a(ShareMedia shareMedia, C1836a c1836a) {
        if (shareMedia instanceof SharePhoto) {
            c1836a.mo1903a((SharePhoto) shareMedia);
        } else if (shareMedia instanceof ShareVideo) {
            c1836a.m6405a((ShareVideo) shareMedia);
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
        }
    }

    /* renamed from: b */
    private static void m6432b(ShareCameraEffectContent shareCameraEffectContent, C1836a c1836a) {
        if (Utility.m5785a(shareCameraEffectContent.getEffectId()) != null) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    /* renamed from: b */
    private static void m6440b(ShareOpenGraphContent shareOpenGraphContent, C1836a c1836a) {
        c1836a.m6399a(shareOpenGraphContent.getAction());
        String previewPropertyName = shareOpenGraphContent.getPreviewPropertyName();
        if (Utility.m5785a(previewPropertyName)) {
            throw new FacebookException("Must specify a previewPropertyName.");
        } else if (shareOpenGraphContent.getAction().get(previewPropertyName) == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Property \"");
            stringBuilder.append(previewPropertyName);
            stringBuilder.append("\" was not found on the action. The name of the preview property must match the name of an action property.");
            throw new FacebookException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private static void m6439b(ShareOpenGraphAction shareOpenGraphAction, C1836a c1836a) {
        if (shareOpenGraphAction == null) {
            throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
        } else if (Utility.m5785a(shareOpenGraphAction.getActionType())) {
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        } else {
            c1836a.m6402a(shareOpenGraphAction, false);
        }
    }

    /* renamed from: b */
    private static void m6441b(ShareOpenGraphObject shareOpenGraphObject, C1836a c1836a) {
        if (shareOpenGraphObject == null) {
            throw new FacebookException("Cannot share a null ShareOpenGraphObject");
        }
        c1836a.m6402a(shareOpenGraphObject, true);
    }

    /* renamed from: b */
    private static void m6442b(ShareOpenGraphValueContainer shareOpenGraphValueContainer, C1836a c1836a, boolean z) {
        for (String str : shareOpenGraphValueContainer.keySet()) {
            C1837h.m6430a(str, z);
            Object obj = shareOpenGraphValueContainer.get(str);
            if (obj instanceof List) {
                for (Object next : (List) obj) {
                    if (next == null) {
                        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                    C1837h.m6429a(next, c1836a);
                }
                continue;
            } else {
                C1837h.m6429a(obj, c1836a);
            }
        }
    }

    /* renamed from: b */
    private static void m6438b(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (Utility.m5785a(shareMessengerOpenGraphMusicTemplateContent.getPageId())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (shareMessengerOpenGraphMusicTemplateContent.getUrl() == null) {
            throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        } else {
            C1837h.m6415a(shareMessengerOpenGraphMusicTemplateContent.getButton());
        }
    }

    /* renamed from: b */
    private static void m6436b(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (Utility.m5785a(shareMessengerGenericTemplateContent.getPageId())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.getGenericTemplateElement() == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (Utility.m5785a(shareMessengerGenericTemplateContent.getGenericTemplateElement().getTitle())) {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        } else {
            C1837h.m6415a(shareMessengerGenericTemplateContent.getGenericTemplateElement().getButton());
        }
    }

    /* renamed from: b */
    private static void m6437b(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (Utility.m5785a(shareMessengerMediaTemplateContent.getPageId())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.getMediaUrl() == null && Utility.m5785a(shareMessengerMediaTemplateContent.getAttachmentId())) {
            throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        } else {
            C1837h.m6415a(shareMessengerMediaTemplateContent.getButton());
        }
    }

    /* renamed from: a */
    private static void m6415a(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton != null) {
            if (Utility.m5785a(shareMessengerActionButton.getTitle())) {
                throw new FacebookException("Must specify title for ShareMessengerActionButton");
            }
            if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                C1837h.m6419a((ShareMessengerURLActionButton) shareMessengerActionButton);
            }
        }
    }

    /* renamed from: a */
    private static void m6419a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.getUrl() == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* renamed from: a */
    private static void m6430a(String str, boolean z) {
        if (z) {
            z = str.split(":");
            if (z.length < 2) {
                throw new FacebookException("Open Graph keys must be namespaced: %s", str);
            }
            for (String isEmpty : z) {
                if (isEmpty.isEmpty()) {
                    throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m6429a(Object obj, C1836a c1836a) {
        if (obj instanceof ShareOpenGraphObject) {
            c1836a.m6401a((ShareOpenGraphObject) obj);
        } else if (obj instanceof SharePhoto) {
            c1836a.mo1903a((SharePhoto) obj);
        }
    }
}
