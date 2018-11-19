package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C1697a;
import com.facebook.internal.C1741s;
import com.facebook.internal.C1741s.C1740a;
import com.facebook.internal.C1745t;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.Mapper;
import com.facebook.share.Sharer.C1814a;
import com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.widget.LikeView.ObjectType;
import com.tinder.api.ManagerWebServices;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.i */
public final class C1838i {

    /* renamed from: com.facebook.share.internal.i$4 */
    static class C34704 implements Mapper<C1740a, String> {
        C34704() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m13195a((C1740a) obj);
        }

        /* renamed from: a */
        public String m13195a(C1740a c1740a) {
            return c1740a.m5995a();
        }
    }

    /* renamed from: com.facebook.share.internal.i$7 */
    static class C34737 implements PhotoJSONProcessor {
        C34737() {
        }

        public JSONObject toJSONObject(SharePhoto sharePhoto) {
            Uri imageUrl = sharePhoto.getImageUrl();
            if (Utility.m5794b(imageUrl)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", imageUrl.toString());
                    return jSONObject;
                } catch (Throwable e) {
                    throw new FacebookException("Unable to attach images", e);
                }
            }
            throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
        }
    }

    /* renamed from: a */
    public static String m6459a(Bundle bundle) {
        if (bundle.containsKey("completionGesture")) {
            return bundle.getString("completionGesture");
        }
        return bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    /* renamed from: b */
    public static String m6473b(Bundle bundle) {
        if (bundle.containsKey("postId")) {
            return bundle.getString("postId");
        }
        if (bundle.containsKey("com.facebook.platform.extra.POST_ID")) {
            return bundle.getString("com.facebook.platform.extra.POST_ID");
        }
        return bundle.getString("post_id");
    }

    /* renamed from: a */
    public static boolean m6471a(int i, int i2, Intent intent, C1834g c1834g) {
        C1697a a = C1838i.m6454a(i, i2, intent);
        if (a == 0) {
            return false;
        }
        C1741s.m6005a(a.m5861c());
        if (c1834g == null) {
            return true;
        }
        FacebookException a2 = C1745t.m6028a(C1745t.m6049g(intent));
        if (a2 == null) {
            c1834g.mo1894a(a, C1745t.m6045e(intent));
        } else if ((a2 instanceof FacebookOperationCanceledException) != null) {
            c1834g.mo1893a(a);
        } else {
            c1834g.mo1895a(a, a2);
        }
        return true;
    }

    /* renamed from: a */
    public static C1834g m6457a(final FacebookCallback<C1814a> facebookCallback) {
        return new C1834g(facebookCallback) {
            /* renamed from: a */
            public void mo1894a(C1697a c1697a, Bundle bundle) {
                if (bundle != null) {
                    c1697a = C1838i.m6459a(bundle);
                    if (c1697a != null) {
                        if (!"post".equalsIgnoreCase(c1697a)) {
                            if ("cancel".equalsIgnoreCase(c1697a) != null) {
                                C1838i.m6474b(facebookCallback);
                                return;
                            } else {
                                C1838i.m6468a(facebookCallback, new FacebookException("UnknownError"));
                                return;
                            }
                        }
                    }
                    C1838i.m6469a(facebookCallback, C1838i.m6473b(bundle));
                }
            }

            /* renamed from: a */
            public void mo1893a(C1697a c1697a) {
                C1838i.m6474b(facebookCallback);
            }

            /* renamed from: a */
            public void mo1895a(C1697a c1697a, FacebookException facebookException) {
                C1838i.m6468a(facebookCallback, facebookException);
            }
        };
    }

    /* renamed from: a */
    private static C1697a m6454a(int i, int i2, Intent intent) {
        i2 = C1745t.m6038b(intent);
        if (i2 == 0) {
            return 0;
        }
        return C1697a.m5857a(i2, i);
    }

    /* renamed from: a */
    public static void m6467a(final int i, CallbackManager callbackManager, final FacebookCallback<C1814a> facebookCallback) {
        if (callbackManager instanceof CallbackManagerImpl) {
            ((CallbackManagerImpl) callbackManager).m13083b(i, new Callback() {
                public boolean onActivityResult(int i, Intent intent) {
                    return C1838i.m6471a(i, i, intent, C1838i.m6457a(facebookCallback));
                }
            });
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }

    /* renamed from: a */
    public static List<String> m6462a(SharePhotoContent sharePhotoContent, final UUID uuid) {
        if (sharePhotoContent != null) {
            List photos = sharePhotoContent.getPhotos();
            if (photos != null) {
                Collection a = Utility.m5767a(photos, new Mapper<SharePhoto, C1740a>() {
                    public /* synthetic */ Object apply(Object obj) {
                        return m13194a((SharePhoto) obj);
                    }

                    /* renamed from: a */
                    public C1740a m13194a(SharePhoto sharePhoto) {
                        return C1838i.m6472b(uuid, sharePhoto);
                    }
                });
                uuid = Utility.m5767a((List) a, new C34704());
                C1741s.m6004a(a);
                return uuid;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m6460a(ShareVideoContent shareVideoContent, UUID uuid) {
        if (shareVideoContent != null) {
            if (shareVideoContent.getVideo() != null) {
                shareVideoContent = C1741s.m5997a(uuid, shareVideoContent.getVideo().getLocalUrl());
                Collection arrayList = new ArrayList(1);
                arrayList.add(shareVideoContent);
                C1741s.m6004a(arrayList);
                return shareVideoContent.m5995a();
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<Bundle> m6461a(ShareMediaContent shareMediaContent, final UUID uuid) {
        if (shareMediaContent != null) {
            List media = shareMediaContent.getMedia();
            if (media != null) {
                final Collection arrayList = new ArrayList();
                shareMediaContent = Utility.m5767a(media, new Mapper<ShareMedia, Bundle>() {
                    public /* synthetic */ Object apply(Object obj) {
                        return m13196a((ShareMedia) obj);
                    }

                    /* renamed from: a */
                    public Bundle m13196a(ShareMedia shareMedia) {
                        C1740a a = C1838i.m6472b(uuid, shareMedia);
                        arrayList.add(a);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", shareMedia.getMediaType().name());
                        bundle.putString(ManagerWebServices.PARAM_SPOTIFY_URI, a.m5995a());
                        return bundle;
                    }
                });
                C1741s.m6004a(arrayList);
                return shareMediaContent;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Bundle m6450a(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        if (shareCameraEffectContent != null) {
            shareCameraEffectContent = shareCameraEffectContent.getTextures();
            if (shareCameraEffectContent != null) {
                Bundle bundle = new Bundle();
                Collection arrayList = new ArrayList();
                for (String str : shareCameraEffectContent.keySet()) {
                    C1740a a = C1838i.m6455a(uuid, shareCameraEffectContent.getTextureUri(str), shareCameraEffectContent.getTextureBitmap(str));
                    arrayList.add(a);
                    bundle.putString(str, a.m5995a());
                }
                C1741s.m6004a(arrayList);
                return bundle;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONObject m6465a(final UUID uuid, ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        ShareOpenGraphAction action = shareOpenGraphContent.getAction();
        final Collection arrayList = new ArrayList();
        uuid = OpenGraphJSONUtility.m6346a(action, new PhotoJSONProcessor() {
            public JSONObject toJSONObject(SharePhoto sharePhoto) {
                C1740a a = C1838i.m6472b(uuid, sharePhoto);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a.m5995a());
                    if (sharePhoto.getUserGenerated() != null) {
                        jSONObject.put("user_generated", true);
                    }
                    return jSONObject;
                } catch (Throwable e) {
                    throw new FacebookException("Unable to attach images", e);
                }
            }
        });
        C1741s.m6004a(arrayList);
        if (shareOpenGraphContent.getPlaceId() != null && Utility.m5785a(uuid.optString("place"))) {
            uuid.put("place", shareOpenGraphContent.getPlaceId());
        }
        if (shareOpenGraphContent.getPeopleIds() != null) {
            Collection hashSet;
            JSONArray optJSONArray = uuid.optJSONArray("tags");
            if (optJSONArray == null) {
                hashSet = new HashSet();
            } else {
                hashSet = Utility.m5789b(optJSONArray);
            }
            for (String add : shareOpenGraphContent.getPeopleIds()) {
                hashSet.add(add);
            }
            uuid.put("tags", new JSONArray(hashSet));
        }
        return uuid;
    }

    /* renamed from: a */
    public static JSONObject m6464a(ShareOpenGraphContent shareOpenGraphContent) throws JSONException {
        return OpenGraphJSONUtility.m6346a(shareOpenGraphContent.getAction(), new C34737());
    }

    /* renamed from: a */
    public static JSONArray m6463a(JSONArray jSONArray, boolean z) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = C1838i.m6463a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = C1838i.m6466a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static org.json.JSONObject m6466a(org.json.JSONObject r9, boolean r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        if (r9 != 0) goto L_0x0004;
    L_0x0002:
        r9 = 0;
        return r9;
    L_0x0004:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0086 }
        r0.<init>();	 Catch:{ JSONException -> 0x0086 }
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0086 }
        r1.<init>();	 Catch:{ JSONException -> 0x0086 }
        r2 = r9.names();	 Catch:{ JSONException -> 0x0086 }
        r3 = 0;	 Catch:{ JSONException -> 0x0086 }
    L_0x0013:
        r4 = r2.length();	 Catch:{ JSONException -> 0x0086 }
        if (r3 >= r4) goto L_0x007a;	 Catch:{ JSONException -> 0x0086 }
    L_0x0019:
        r4 = r2.getString(r3);	 Catch:{ JSONException -> 0x0086 }
        r5 = r9.get(r4);	 Catch:{ JSONException -> 0x0086 }
        r6 = r5 instanceof org.json.JSONObject;	 Catch:{ JSONException -> 0x0086 }
        r7 = 1;	 Catch:{ JSONException -> 0x0086 }
        if (r6 == 0) goto L_0x002d;	 Catch:{ JSONException -> 0x0086 }
    L_0x0026:
        r5 = (org.json.JSONObject) r5;	 Catch:{ JSONException -> 0x0086 }
        r5 = com.facebook.share.internal.C1838i.m6466a(r5, r7);	 Catch:{ JSONException -> 0x0086 }
        goto L_0x0037;	 Catch:{ JSONException -> 0x0086 }
    L_0x002d:
        r6 = r5 instanceof org.json.JSONArray;	 Catch:{ JSONException -> 0x0086 }
        if (r6 == 0) goto L_0x0037;	 Catch:{ JSONException -> 0x0086 }
    L_0x0031:
        r5 = (org.json.JSONArray) r5;	 Catch:{ JSONException -> 0x0086 }
        r5 = com.facebook.share.internal.C1838i.m6463a(r5, r7);	 Catch:{ JSONException -> 0x0086 }
    L_0x0037:
        r6 = com.facebook.share.internal.C1838i.m6451a(r4);	 Catch:{ JSONException -> 0x0086 }
        r7 = r6.first;	 Catch:{ JSONException -> 0x0086 }
        r7 = (java.lang.String) r7;	 Catch:{ JSONException -> 0x0086 }
        r6 = r6.second;	 Catch:{ JSONException -> 0x0086 }
        r6 = (java.lang.String) r6;	 Catch:{ JSONException -> 0x0086 }
        if (r10 == 0) goto L_0x0066;	 Catch:{ JSONException -> 0x0086 }
    L_0x0045:
        if (r7 == 0) goto L_0x0053;	 Catch:{ JSONException -> 0x0086 }
    L_0x0047:
        r8 = "fbsdk";	 Catch:{ JSONException -> 0x0086 }
        r8 = r7.equals(r8);	 Catch:{ JSONException -> 0x0086 }
        if (r8 == 0) goto L_0x0053;	 Catch:{ JSONException -> 0x0086 }
    L_0x004f:
        r0.put(r4, r5);	 Catch:{ JSONException -> 0x0086 }
        goto L_0x0077;	 Catch:{ JSONException -> 0x0086 }
    L_0x0053:
        if (r7 == 0) goto L_0x0062;	 Catch:{ JSONException -> 0x0086 }
    L_0x0055:
        r4 = "og";	 Catch:{ JSONException -> 0x0086 }
        r4 = r7.equals(r4);	 Catch:{ JSONException -> 0x0086 }
        if (r4 == 0) goto L_0x005e;	 Catch:{ JSONException -> 0x0086 }
    L_0x005d:
        goto L_0x0062;	 Catch:{ JSONException -> 0x0086 }
    L_0x005e:
        r1.put(r6, r5);	 Catch:{ JSONException -> 0x0086 }
        goto L_0x0077;	 Catch:{ JSONException -> 0x0086 }
    L_0x0062:
        r0.put(r6, r5);	 Catch:{ JSONException -> 0x0086 }
        goto L_0x0077;	 Catch:{ JSONException -> 0x0086 }
    L_0x0066:
        if (r7 == 0) goto L_0x0074;	 Catch:{ JSONException -> 0x0086 }
    L_0x0068:
        r8 = "fb";	 Catch:{ JSONException -> 0x0086 }
        r7 = r7.equals(r8);	 Catch:{ JSONException -> 0x0086 }
        if (r7 == 0) goto L_0x0074;	 Catch:{ JSONException -> 0x0086 }
    L_0x0070:
        r0.put(r4, r5);	 Catch:{ JSONException -> 0x0086 }
        goto L_0x0077;	 Catch:{ JSONException -> 0x0086 }
    L_0x0074:
        r0.put(r6, r5);	 Catch:{ JSONException -> 0x0086 }
    L_0x0077:
        r3 = r3 + 1;	 Catch:{ JSONException -> 0x0086 }
        goto L_0x0013;	 Catch:{ JSONException -> 0x0086 }
    L_0x007a:
        r9 = r1.length();	 Catch:{ JSONException -> 0x0086 }
        if (r9 <= 0) goto L_0x0085;	 Catch:{ JSONException -> 0x0086 }
    L_0x0080:
        r9 = "data";	 Catch:{ JSONException -> 0x0086 }
        r0.put(r9, r1);	 Catch:{ JSONException -> 0x0086 }
    L_0x0085:
        return r0;
    L_0x0086:
        r9 = new com.facebook.FacebookException;
        r10 = "Failed to create json object from share content";
        r9.<init>(r10);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.i.a(org.json.JSONObject, boolean):org.json.JSONObject");
    }

    /* renamed from: a */
    public static Pair<String, String> m6451a(String str) {
        Object substring;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str.length() > i) {
                substring = str.substring(0, indexOf);
                str = str.substring(i);
                return new Pair(substring, str);
            }
        }
        substring = null;
        return new Pair(substring, str);
    }

    /* renamed from: b */
    private static C1740a m6472b(UUID uuid, ShareMedia shareMedia) {
        Uri imageUrl;
        Bitmap bitmap = null;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.getBitmap();
            imageUrl = sharePhoto.getImageUrl();
        } else {
            imageUrl = shareMedia instanceof ShareVideo ? ((ShareVideo) shareMedia).getLocalUrl() : null;
        }
        return C1838i.m6455a(uuid, imageUrl, bitmap);
    }

    /* renamed from: a */
    private static C1740a m6455a(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return C1741s.m5996a(uuid, bitmap);
        }
        return uri != null ? C1741s.m5997a(uuid, uri) : null;
    }

    /* renamed from: b */
    static void m6474b(FacebookCallback<C1814a> facebookCallback) {
        C1838i.m6470a("cancelled", null);
        if (facebookCallback != null) {
            facebookCallback.onCancel();
        }
    }

    /* renamed from: a */
    static void m6469a(FacebookCallback<C1814a> facebookCallback, String str) {
        C1838i.m6470a("succeeded", null);
        if (facebookCallback != null) {
            facebookCallback.onSuccess(new C1814a(str));
        }
    }

    /* renamed from: a */
    static void m6468a(FacebookCallback<C1814a> facebookCallback, FacebookException facebookException) {
        C1838i.m6470a("error", facebookException.getMessage());
        if (facebookCallback != null) {
            facebookCallback.onError(facebookException);
        }
    }

    /* renamed from: a */
    private static void m6470a(String str, String str2) {
        AppEventsLogger newLogger = AppEventsLogger.newLogger(FacebookSdk.m3994e());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        newLogger.logSdkEvent("fb_share_dialog_result", null, bundle);
    }

    /* renamed from: a */
    public static GraphRequest m6453a(AccessToken accessToken, File file, GraphRequest.Callback callback) throws FileNotFoundException {
        Parcelable parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(ManagerWebServices.PARAM_FILE, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, callback);
    }

    /* renamed from: a */
    public static GraphRequest m6452a(AccessToken accessToken, Uri uri, GraphRequest.Callback callback) throws FileNotFoundException {
        if (Utility.m5804d(uri)) {
            return C1838i.m6453a(accessToken, new File(uri.getPath()), callback);
        }
        if (Utility.m5800c(uri)) {
            Parcelable parcelableResourceWithMimeType = new ParcelableResourceWithMimeType((Parcelable) uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(ManagerWebServices.PARAM_FILE, parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, callback);
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }

    @Nullable
    /* renamed from: a */
    public static ObjectType m6458a(ObjectType objectType, ObjectType objectType2) {
        if (objectType == objectType2) {
            return objectType;
        }
        if (objectType == ObjectType.UNKNOWN) {
            return objectType2;
        }
        return objectType2 == ObjectType.UNKNOWN ? objectType : null;
    }
}
