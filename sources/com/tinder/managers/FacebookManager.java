package com.tinder.managers;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.volley.C3001b;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.C4079e;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.auth.repository.C10350m;
import com.tinder.interfaces.PhotoGalleryModel.ListenerFacebookPhotos;
import com.tinder.model.auth.facebook.FacebookPermission;
import com.tinder.p257g.C9645b;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONObject;

public class FacebookManager {
    /* renamed from: a */
    private final ManagerNetwork f32555a;
    /* renamed from: b */
    private final C10350m f32556b;

    public interface FacebookUserFetchListener {
        void onFailure();

        void onSuccess(String str, String str2, String str3);
    }

    public interface ListenerFacebookEmailRequest {
        void onError();

        void onFbEmailResponse(@Nullable String str);
    }

    @Inject
    public FacebookManager(ManagerNetwork managerNetwork, C10350m c10350m) {
        this.f32556b = c10350m;
        this.f32555a = managerNetwork;
    }

    @NonNull
    /* renamed from: a */
    public static String m40464a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ManagerWebServices.URL_FACEBOOK_GRAPH_HTTPS);
        stringBuilder.append(str);
        stringBuilder.append('/');
        stringBuilder.append(ManagerWebServices.FB_PARAM_PHOTOS);
        stringBuilder.append(ManagerWebServices.FB_PARAM_LIMIT);
        stringBuilder.append(5000);
        stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
        stringBuilder.append(ManagerWebServices.FB_PARAM_FIELDS);
        stringBuilder.append("id");
        stringBuilder.append(',');
        stringBuilder.append("source");
        stringBuilder.append(',');
        stringBuilder.append("picture");
        stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
        stringBuilder.append(ManagerWebServices.FB_PARAM_TOKEN);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    @NonNull
    /* renamed from: a */
    public static String m40463a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://graph.facebook.com/me/photos?limit=5000&fields=id,source,picture&access_token=");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    @NonNull
    /* renamed from: b */
    public static String m40469b(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://graph.facebook.com/me?fields=albums.limit(5000).fields(id,name,count),photos.limit(5000).fields(id,picture)&access_token=");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    @NonNull
    /* renamed from: b */
    public static String m40470b(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ManagerWebServices.URL_FACEBOOK_GRAPH_HTTPS);
        stringBuilder.append(str);
        stringBuilder.append(ManagerWebServices.FB_PIC_ALBUM);
        stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
        stringBuilder.append(ManagerWebServices.FB_PARAM_TOKEN);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    @Nullable
    /* renamed from: a */
    public static String m40462a() {
        if (AccessToken.getCurrentAccessToken() == null) {
            return null;
        }
        return AccessToken.getCurrentAccessToken().getToken();
    }

    /* renamed from: a */
    public void m40473a(@NonNull ListenerFacebookEmailRequest listenerFacebookEmailRequest) {
        listenerFacebookEmailRequest = GraphRequest.a(AccessToken.getCurrentAccessToken(), new C12025i(listenerFacebookEmailRequest));
        Bundle bundle = new Bundle();
        bundle.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "email");
        listenerFacebookEmailRequest.a(bundle);
        listenerFacebookEmailRequest.j();
    }

    /* renamed from: a */
    static final /* synthetic */ void m40467a(@NonNull ListenerFacebookEmailRequest listenerFacebookEmailRequest, JSONObject jSONObject, GraphResponse graphResponse) {
        if (jSONObject == null) {
            ad.b("Got no response, device may not have network.");
            listenerFacebookEmailRequest.onError();
            return;
        }
        jSONObject = jSONObject.optString("email", null);
        graphResponse = new StringBuilder();
        graphResponse.append("fb email: ");
        graphResponse.append(jSONObject);
        ad.a(graphResponse.toString());
        listenerFacebookEmailRequest.onFbEmailResponse(jSONObject);
    }

    /* renamed from: a */
    public void m40472a(FacebookUserFetchListener facebookUserFetchListener) {
        ad.a("making api call to fb graph");
        Bundle bundle = new Bundle();
        bundle.putString(ManagerWebServices.FB_PARAM_BATCH_FIELDS, "first_name, email, birthday");
        new GraphRequest(AccessToken.getCurrentAccessToken(), "/me", bundle, HttpMethod.GET, new C12026j(facebookUserFetchListener)).j();
    }

    /* renamed from: a */
    static final /* synthetic */ void m40466a(FacebookUserFetchListener facebookUserFetchListener, GraphResponse graphResponse) {
        graphResponse = graphResponse.b();
        if (graphResponse != null) {
            facebookUserFetchListener.onSuccess(graphResponse.optString(ManagerWebServices.FB_PARAM_NAME_FIRST), graphResponse.optString("email"), graphResponse.optString(ManagerWebServices.FB_PARAM_BIRTH_DATE));
        } else {
            facebookUserFetchListener.onFailure();
        }
    }

    /* renamed from: a */
    public void m40471a(ListenerFacebookPhotos listenerFacebookPhotos) {
        if (this.f32556b.m42161b().contains(FacebookPermission.USER_PHOTOS)) {
            String a = m40462a();
            Request c4079e = new C4079e(m40469b(a), null, new C12027k(a, listenerFacebookPhotos), new C12028l(listenerFacebookPhotos));
            c4079e.setRetryPolicy(new C3001b(10000, 0, 1.0f));
            this.f32555a.addRequest(c4079e);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m40468a(String str, ListenerFacebookPhotos listenerFacebookPhotos, JSONObject jSONObject) {
        List arrayList = new ArrayList();
        try {
            arrayList.addAll(C9645b.m40035a(jSONObject, str));
            str = C9645b.m40034a(jSONObject);
            if (listenerFacebookPhotos != null) {
                listenerFacebookPhotos.onSuccess(arrayList, str);
            }
        } catch (String str2) {
            ad.b("fetching fb album", str2.getMessage());
            if (listenerFacebookPhotos != null) {
                listenerFacebookPhotos.onFailure();
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m40465a(ListenerFacebookPhotos listenerFacebookPhotos, VolleyError volleyError) {
        if (volleyError != null && volleyError.getMessage() != null) {
            ad.a("fetching fb album", volleyError);
            if (listenerFacebookPhotos != null) {
                listenerFacebookPhotos.onFailure();
            }
        }
    }
}
