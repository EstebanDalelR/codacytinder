package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio;
import com.mapbox.mapboxsdk.style.layers.Property;
import com.tinder.api.ManagerWebServices;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.e */
public class C1832e {
    /* renamed from: a */
    public static final Pattern f5020a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* renamed from: com.facebook.share.internal.e$1 */
    static /* synthetic */ class C18311 {
        /* renamed from: b */
        static final /* synthetic */ int[] f5018b = new int[ImageAspectRatio.values().length];
        /* renamed from: c */
        static final /* synthetic */ int[] f5019c = new int[MediaType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f5019c = r0;
            r0 = 1;
            r1 = f5019c;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.VIDEO;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.values();
            r1 = r1.length;
            r1 = new int[r1];
            f5018b = r1;
            r1 = f5018b;	 Catch:{ NoSuchFieldError -> 0x0027 }
            r2 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.SQUARE;	 Catch:{ NoSuchFieldError -> 0x0027 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0027 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0027 }
        L_0x0027:
            r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.values();
            r1 = r1.length;
            r1 = new int[r1];
            f5017a = r1;
            r1 = f5017a;	 Catch:{ NoSuchFieldError -> 0x003a }
            r2 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioCompact;	 Catch:{ NoSuchFieldError -> 0x003a }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x003a }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x003a }
        L_0x003a:
            r0 = f5017a;	 Catch:{ NoSuchFieldError -> 0x0045 }
            r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioTall;	 Catch:{ NoSuchFieldError -> 0x0045 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0045 }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x0045 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0045 }
        L_0x0045:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.e.1.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m6369a(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        C1832e.m6370a(bundle, shareMessengerGenericTemplateContent.getGenericTemplateElement());
        Utility.m5782a(bundle, "MESSENGER_PLATFORM_CONTENT", C1832e.m6363a(shareMessengerGenericTemplateContent));
    }

    /* renamed from: a */
    public static void m6372a(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        C1832e.m6377b(bundle, shareMessengerOpenGraphMusicTemplateContent);
        Utility.m5782a(bundle, "MESSENGER_PLATFORM_CONTENT", C1832e.m6366a(shareMessengerOpenGraphMusicTemplateContent));
    }

    /* renamed from: a */
    public static void m6371a(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        C1832e.m6376b(bundle, shareMessengerMediaTemplateContent);
        Utility.m5782a(bundle, "MESSENGER_PLATFORM_CONTENT", C1832e.m6365a(shareMessengerMediaTemplateContent));
    }

    /* renamed from: a */
    private static void m6370a(Bundle bundle, ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        if (shareMessengerGenericTemplateElement.getButton() != null) {
            C1832e.m6368a(bundle, shareMessengerGenericTemplateElement.getButton(), false);
        } else if (shareMessengerGenericTemplateElement.getDefaultAction() != null) {
            C1832e.m6368a(bundle, shareMessengerGenericTemplateElement.getDefaultAction(), true);
        }
        Utility.m5771a(bundle, "IMAGE", shareMessengerGenericTemplateElement.getImageUrl());
        Utility.m5772a(bundle, "PREVIEW_TYPE", "DEFAULT");
        Utility.m5772a(bundle, "TITLE", shareMessengerGenericTemplateElement.getTitle());
        Utility.m5772a(bundle, "SUBTITLE", shareMessengerGenericTemplateElement.getSubtitle());
    }

    /* renamed from: b */
    private static void m6377b(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        C1832e.m6368a(bundle, shareMessengerOpenGraphMusicTemplateContent.getButton(), false);
        Utility.m5772a(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
        Utility.m5771a(bundle, "OPEN_GRAPH_URL", shareMessengerOpenGraphMusicTemplateContent.getUrl());
    }

    /* renamed from: b */
    private static void m6376b(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        C1832e.m6368a(bundle, shareMessengerMediaTemplateContent.getButton(), false);
        Utility.m5772a(bundle, "PREVIEW_TYPE", "DEFAULT");
        Utility.m5772a(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.getAttachmentId());
        if (shareMessengerMediaTemplateContent.getMediaUrl() != null) {
            Utility.m5771a(bundle, C1832e.m6356a(shareMessengerMediaTemplateContent.getMediaUrl()), shareMessengerMediaTemplateContent.getMediaUrl());
        }
        Utility.m5772a(bundle, "type", C1832e.m6358a(shareMessengerMediaTemplateContent.getMediaType()));
    }

    /* renamed from: a */
    private static void m6368a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (shareMessengerActionButton != null && (shareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
            C1832e.m6373a(bundle, (ShareMessengerURLActionButton) shareMessengerActionButton, z);
        }
    }

    /* renamed from: a */
    private static void m6373a(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String a;
        if (z) {
            a = Utility.m5756a(shareMessengerURLActionButton.getUrl());
        } else {
            z = new StringBuilder();
            z.append(shareMessengerURLActionButton.getTitle());
            z.append(" - ");
            z.append(Utility.m5756a(shareMessengerURLActionButton.getUrl()));
            a = z.toString();
        }
        Utility.m5772a(bundle, "TARGET_DISPLAY", a);
        Utility.m5771a(bundle, "ITEM_URL", shareMessengerURLActionButton.getUrl());
    }

    /* renamed from: a */
    private static JSONObject m6363a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) throws JSONException {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.getIsSharable()).put("image_aspect_ratio", C1832e.m6357a(shareMessengerGenericTemplateContent.getImageAspectRatio())).put("elements", new JSONArray().put(C1832e.m6364a(shareMessengerGenericTemplateContent.getGenericTemplateElement())))));
    }

    /* renamed from: a */
    private static JSONObject m6366a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", new JSONArray().put(C1832e.m6375b(shareMessengerOpenGraphMusicTemplateContent)))));
    }

    /* renamed from: a */
    private static JSONObject m6365a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", ManagerWebServices.PARAM_MEDIA).put("elements", new JSONArray().put(C1832e.m6374b(shareMessengerMediaTemplateContent)))));
    }

    /* renamed from: a */
    private static JSONObject m6364a(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) throws JSONException {
        JSONObject put = new JSONObject().put(ManagerWebServices.PARAM_JOB_TITLE, shareMessengerGenericTemplateElement.getTitle()).put("subtitle", shareMessengerGenericTemplateElement.getSubtitle()).put("image_url", Utility.m5756a(shareMessengerGenericTemplateElement.getImageUrl()));
        if (shareMessengerGenericTemplateElement.getButton() != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(C1832e.m6361a(shareMessengerGenericTemplateElement.getButton()));
            put.put("buttons", jSONArray);
        }
        if (shareMessengerGenericTemplateElement.getDefaultAction() != null) {
            put.put("default_action", C1832e.m6362a(shareMessengerGenericTemplateElement.getDefaultAction(), true));
        }
        return put;
    }

    /* renamed from: b */
    private static JSONObject m6375b(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) throws JSONException {
        JSONObject put = new JSONObject().put("url", Utility.m5756a(shareMessengerOpenGraphMusicTemplateContent.getUrl()));
        if (shareMessengerOpenGraphMusicTemplateContent.getButton() != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(C1832e.m6361a(shareMessengerOpenGraphMusicTemplateContent.getButton()));
            put.put("buttons", jSONArray);
        }
        return put;
    }

    /* renamed from: b */
    private static JSONObject m6374b(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) throws JSONException {
        JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.getAttachmentId()).put("url", Utility.m5756a(shareMessengerMediaTemplateContent.getMediaUrl())).put("media_type", C1832e.m6358a(shareMessengerMediaTemplateContent.getMediaType()));
        if (shareMessengerMediaTemplateContent.getButton() != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(C1832e.m6361a(shareMessengerMediaTemplateContent.getButton()));
            put.put("buttons", jSONArray);
        }
        return put;
    }

    /* renamed from: a */
    private static JSONObject m6361a(ShareMessengerActionButton shareMessengerActionButton) throws JSONException {
        return C1832e.m6362a(shareMessengerActionButton, false);
    }

    /* renamed from: a */
    private static JSONObject m6362a(ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        return shareMessengerActionButton instanceof ShareMessengerURLActionButton ? C1832e.m6367a((ShareMessengerURLActionButton) shareMessengerActionButton, z) : null;
    }

    /* renamed from: a */
    private static JSONObject m6367a(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        JSONObject put = new JSONObject().put("type", "web_url");
        String str = ManagerWebServices.PARAM_JOB_TITLE;
        if (z) {
            z = false;
        } else {
            z = shareMessengerURLActionButton.getTitle();
        }
        return put.put(str, z).put("url", Utility.m5756a(shareMessengerURLActionButton.getUrl())).put("webview_height_ratio", C1832e.m6359a(shareMessengerURLActionButton.getWebviewHeightRatio())).put("messenger_extensions", shareMessengerURLActionButton.getIsMessengerExtensionURL()).put("fallback_url", Utility.m5756a(shareMessengerURLActionButton.getFallbackUrl())).put("webview_share_button", C1832e.m6360a(shareMessengerURLActionButton));
    }

    /* renamed from: a */
    private static String m6356a(Uri uri) {
        String host = uri.getHost();
        return (Utility.m5785a(host) || f5020a.matcher(host).matches() == null) ? "IMAGE" : ManagerWebServices.PARAM_SPOTIFY_URI;
    }

    /* renamed from: a */
    private static String m6359a(WebviewHeightRatio webviewHeightRatio) {
        if (webviewHeightRatio == null) {
            return "full";
        }
        switch (webviewHeightRatio) {
            case WebviewHeightRatioCompact:
                return "compact";
            case WebviewHeightRatioTall:
                return "tall";
            default:
                return "full";
        }
    }

    /* renamed from: a */
    private static String m6357a(ImageAspectRatio imageAspectRatio) {
        if (imageAspectRatio == null) {
            return "horizontal";
        }
        return C18311.f5018b[imageAspectRatio.ordinal()] != 1 ? "horizontal" : Property.LINE_CAP_SQUARE;
    }

    /* renamed from: a */
    private static String m6358a(MediaType mediaType) {
        if (mediaType == null) {
            return ManagerWebServices.IG_PARAM_IMAGE;
        }
        return C18311.f5019c[mediaType.ordinal()] != 1 ? ManagerWebServices.IG_PARAM_IMAGE : "video";
    }

    /* renamed from: a */
    private static String m6360a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        return shareMessengerURLActionButton.getShouldHideWebviewShareButton() != null ? "hide" : null;
    }
}
