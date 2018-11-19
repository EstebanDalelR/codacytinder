package com.facebook.share.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C1697a;
import com.facebook.internal.C1741s;
import com.facebook.internal.C1741s.C1740a;
import com.facebook.internal.C3412d;
import com.facebook.internal.C3412d.C1703a;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.Sharer.C1814a;
import com.facebook.share.internal.C1829a;
import com.facebook.share.internal.C1833f;
import com.facebook.share.internal.C1837h;
import com.facebook.share.internal.C1838i;
import com.facebook.share.internal.C1839j;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto.C4366a;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.C4367a;
import com.facebook.share.model.ShareVideoContent;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public final class ShareDialog extends C3412d<ShareContent, C1814a> implements Sharer {
    /* renamed from: b */
    private static final String f13503b = "ShareDialog";
    /* renamed from: c */
    private static final int f13504c = RequestCodeOffset.Share.toRequestCode();
    /* renamed from: d */
    private boolean f13505d;
    /* renamed from: e */
    private boolean f13506e;

    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$a */
    private class C3477a extends C1703a {
        /* renamed from: b */
        final /* synthetic */ ShareDialog f10505b;

        private C3477a(ShareDialog shareDialog) {
            this.f10505b = shareDialog;
            super(shareDialog);
        }

        /* renamed from: a */
        public Object mo1907a() {
            return Mode.NATIVE;
        }

        /* renamed from: a */
        public boolean m13202a(ShareContent shareContent, boolean z) {
            return (!(shareContent instanceof ShareCameraEffectContent) || ShareDialog.m16781c(shareContent.getClass()) == null) ? null : true;
        }

        /* renamed from: a */
        public C1697a m13199a(final ShareContent shareContent) {
            C1837h.m6410a(shareContent);
            final C1697a d = this.f10505b.mo3371d();
            final boolean shouldFailOnDataError = this.f10505b.getShouldFailOnDataError();
            DialogPresenter.m5715a(d, new ParameterProvider(this) {
                /* renamed from: d */
                final /* synthetic */ C3477a f10504d;

                public Bundle getParameters() {
                    return C1833f.m6388a(d.m5861c(), shareContent, shouldFailOnDataError);
                }

                public Bundle getLegacyParameters() {
                    return C1829a.m6355a(d.m5861c(), shareContent, shouldFailOnDataError);
                }
            }, ShareDialog.m16783e(shareContent.getClass()));
            return d;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$b */
    private class C3478b extends C1703a {
        /* renamed from: b */
        final /* synthetic */ ShareDialog f10506b;

        private C3478b(ShareDialog shareDialog) {
            this.f10506b = shareDialog;
            super(shareDialog);
        }

        /* renamed from: a */
        public Object mo1907a() {
            return Mode.FEED;
        }

        /* renamed from: a */
        public boolean m13207a(ShareContent shareContent, boolean z) {
            if (!(shareContent instanceof ShareLinkContent)) {
                if ((shareContent instanceof ShareFeedContent) == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: a */
        public C1697a m13204a(ShareContent shareContent) {
            Bundle b;
            this.f10506b.m16773a(this.f10506b.m13094b(), shareContent, Mode.FEED);
            C1697a d = this.f10506b.mo3371d();
            if (shareContent instanceof ShareLinkContent) {
                shareContent = (ShareLinkContent) shareContent;
                C1837h.m6433b(shareContent);
                b = C1839j.m6480b(shareContent);
            } else {
                b = C1839j.m6475a((ShareFeedContent) shareContent);
            }
            DialogPresenter.m5717a(d, "feed", b);
            return d;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$c */
    private class C3480c extends C1703a {
        /* renamed from: b */
        final /* synthetic */ ShareDialog f10511b;

        private C3480c(ShareDialog shareDialog) {
            this.f10511b = shareDialog;
            super(shareDialog);
        }

        /* renamed from: a */
        public Object mo1907a() {
            return Mode.NATIVE;
        }

        /* renamed from: a */
        public boolean m13212a(ShareContent shareContent, boolean z) {
            boolean z2 = false;
            if (shareContent != null) {
                if (!(shareContent instanceof ShareCameraEffectContent)) {
                    if (z) {
                        z = true;
                    } else {
                        z = shareContent.getShareHashtag() ? DialogPresenter.m5718a(ShareDialogFeature.HASHTAG) : true;
                        if ((shareContent instanceof ShareLinkContent) && !Utility.m5785a(((ShareLinkContent) shareContent).getQuote())) {
                            z &= DialogPresenter.m5718a(ShareDialogFeature.LINK_SHARE_QUOTES);
                        }
                    }
                    if (z && ShareDialog.m16781c(shareContent.getClass()) != null) {
                        z2 = true;
                    }
                    return z2;
                }
            }
            return false;
        }

        /* renamed from: a */
        public C1697a m13209a(final ShareContent shareContent) {
            this.f10511b.m16773a(this.f10511b.m13094b(), shareContent, Mode.NATIVE);
            C1837h.m6410a(shareContent);
            final C1697a d = this.f10511b.mo3371d();
            final boolean shouldFailOnDataError = this.f10511b.getShouldFailOnDataError();
            DialogPresenter.m5715a(d, new ParameterProvider(this) {
                /* renamed from: d */
                final /* synthetic */ C3480c f10510d;

                public Bundle getParameters() {
                    return C1833f.m6388a(d.m5861c(), shareContent, shouldFailOnDataError);
                }

                public Bundle getLegacyParameters() {
                    return C1829a.m6355a(d.m5861c(), shareContent, shouldFailOnDataError);
                }
            }, ShareDialog.m16783e(shareContent.getClass()));
            return d;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$d */
    private class C3481d extends C1703a {
        /* renamed from: b */
        final /* synthetic */ ShareDialog f10512b;

        private C3481d(ShareDialog shareDialog) {
            this.f10512b = shareDialog;
            super(shareDialog);
        }

        /* renamed from: a */
        public Object mo1907a() {
            return Mode.WEB;
        }

        /* renamed from: a */
        public boolean m13219a(ShareContent shareContent, boolean z) {
            return (shareContent == null || ShareDialog.m16779b(shareContent) == null) ? null : true;
        }

        /* renamed from: a */
        public C1697a m13216a(ShareContent shareContent) {
            Bundle a;
            this.f10512b.m16773a(this.f10512b.m13094b(), shareContent, Mode.WEB);
            C1697a d = this.f10512b.mo3371d();
            C1837h.m6433b(shareContent);
            if (shareContent instanceof ShareLinkContent) {
                a = C1839j.m6477a((ShareLinkContent) shareContent);
            } else if (shareContent instanceof SharePhotoContent) {
                a = C1839j.m6479a(m13214a((SharePhotoContent) shareContent, d.m5861c()));
            } else {
                a = C1839j.m6478a((ShareOpenGraphContent) shareContent);
            }
            DialogPresenter.m5717a(d, m13215b(shareContent), a);
            return d;
        }

        /* renamed from: b */
        private String m13215b(ShareContent shareContent) {
            if (!(shareContent instanceof ShareLinkContent)) {
                if (!(shareContent instanceof SharePhotoContent)) {
                    return (shareContent instanceof ShareOpenGraphContent) != null ? "share_open_graph" : null;
                }
            }
            return "share";
        }

        /* renamed from: a */
        private SharePhotoContent m13214a(SharePhotoContent sharePhotoContent, UUID uuid) {
            C4367a a = new C4367a().m17910a(sharePhotoContent);
            List arrayList = new ArrayList();
            Collection arrayList2 = new ArrayList();
            for (int i = 0; i < sharePhotoContent.getPhotos().size(); i++) {
                Object obj = (SharePhoto) sharePhotoContent.getPhotos().get(i);
                Bitmap bitmap = obj.getBitmap();
                if (bitmap != null) {
                    C1740a a2 = C1741s.m5996a(uuid, bitmap);
                    obj = new C4366a().m17901a((SharePhoto) obj).m17900a(Uri.parse(a2.m5995a())).m17899a(null).m17906c();
                    arrayList2.add(a2);
                }
                arrayList.add(obj);
            }
            a.m17913c(arrayList);
            C1741s.m6004a(arrayList2);
            return a.m17911a();
        }
    }

    /* renamed from: c */
    private static boolean m16781c(Class<? extends ShareContent> cls) {
        DialogFeature e = m16783e(cls);
        return (e == null || DialogPresenter.m5718a(e) == null) ? null : true;
    }

    /* renamed from: d */
    private static boolean m16782d(Class<? extends ShareContent> cls) {
        if (!(ShareLinkContent.class.isAssignableFrom(cls) || ShareOpenGraphContent.class.isAssignableFrom(cls))) {
            if (SharePhotoContent.class.isAssignableFrom(cls) == null || AccessToken.isCurrentAccessTokenActive() == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m16779b(ShareContent shareContent) {
        if (!m16782d(shareContent.getClass())) {
            return false;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                C1838i.m6464a((ShareOpenGraphContent) shareContent);
            } catch (ShareContent shareContent2) {
                Log.d(f13503b, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", shareContent2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    protected void mo3369a(CallbackManagerImpl callbackManagerImpl, FacebookCallback<C1814a> facebookCallback) {
        C1838i.m6467a(m13090a(), (CallbackManager) callbackManagerImpl, (FacebookCallback) facebookCallback);
    }

    public boolean getShouldFailOnDataError() {
        return this.f13505d;
    }

    public void setShouldFailOnDataError(boolean z) {
        this.f13505d = z;
    }

    /* renamed from: d */
    protected C1697a mo3371d() {
        return new C1697a(m13090a());
    }

    /* renamed from: c */
    protected List<C1703a> mo3370c() {
        List arrayList = new ArrayList();
        arrayList.add(new C3480c());
        arrayList.add(new C3478b());
        arrayList.add(new C3481d());
        arrayList.add(new C3477a());
        return arrayList;
    }

    /* renamed from: e */
    private static DialogFeature m16783e(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        return ShareCameraEffectContent.class.isAssignableFrom(cls) != null ? CameraEffectFeature.SHARE_CAMERA_EFFECT : null;
    }

    /* renamed from: a */
    private void m16773a(Context context, ShareContent shareContent, Mode mode) {
        if (this.f13506e) {
            mode = Mode.AUTOMATIC;
        }
        switch (mode) {
            case AUTOMATIC:
                mode = "automatic";
                break;
            case WEB:
                mode = "web";
                break;
            case NATIVE:
                mode = "native";
                break;
            default:
                mode = "unknown";
                break;
        }
        shareContent = m16783e(shareContent.getClass());
        shareContent = shareContent == ShareDialogFeature.SHARE_DIALOG ? "status" : shareContent == ShareDialogFeature.PHOTOS ? ManagerWebServices.PARAM_PHOTO : shareContent == ShareDialogFeature.VIDEO ? "video" : shareContent == OpenGraphActionDialogFeature.OG_ACTION_DIALOG ? "open_graph" : "unknown";
        context = AppEventsLogger.newLogger(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", mode);
        bundle.putString("fb_share_dialog_content_type", shareContent);
        context.logSdkEvent("fb_share_dialog_show", null, bundle);
    }
}
