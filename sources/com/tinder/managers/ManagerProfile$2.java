package com.tinder.managers;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.tinder.api.ManagerWebServices;
import com.tinder.listeners.ListenerPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.p257g.C9648e;
import com.tinder.utils.ad;
import io.fabric.sdk.android.services.common.C15616a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.C15958m;
import okhttp3.C15963q.C15962a;
import okhttp3.C15964r;
import okio.BufferedSink;
import org.json.JSONArray;
import org.json.JSONObject;

class ManagerProfile$2 extends AsyncTask<Void, Void, Boolean> {
    /* renamed from: a */
    final /* synthetic */ JSONObject f32573a;
    /* renamed from: b */
    final /* synthetic */ boolean f32574b;
    /* renamed from: c */
    final /* synthetic */ boolean f32575c;
    /* renamed from: d */
    final /* synthetic */ int f32576d;
    /* renamed from: e */
    final /* synthetic */ int f32577e;
    /* renamed from: f */
    final /* synthetic */ String f32578f;
    /* renamed from: g */
    final /* synthetic */ ListenerPhoto f32579g;
    /* renamed from: h */
    final /* synthetic */ ProfilePhoto f32580h;
    /* renamed from: i */
    final /* synthetic */ int f32581i;
    /* renamed from: j */
    final /* synthetic */ ManagerProfile f32582j;

    /* renamed from: com.tinder.managers.ManagerProfile$2$1 */
    class C120191 extends C15964r {
        /* renamed from: a */
        final /* synthetic */ ManagerProfile$2 f38988a;

        C120191(ManagerProfile$2 managerProfile$2) {
            this.f38988a = managerProfile$2;
        }

        public C15958m contentType() {
            return C15958m.a(C15616a.ACCEPT_JSON_VALUE);
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f38988a.f32573a.toString().getBytes());
        }
    }

    ManagerProfile$2(ManagerProfile managerProfile, JSONObject jSONObject, boolean z, boolean z2, int i, int i2, String str, ListenerPhoto listenerPhoto, ProfilePhoto profilePhoto, int i3) {
        this.f32582j = managerProfile;
        this.f32573a = jSONObject;
        this.f32574b = z;
        this.f32575c = z2;
        this.f32576d = i;
        this.f32577e = i2;
        this.f32578f = str;
        this.f32579g = listenerPhoto;
        this.f32580h = profilePhoto;
        this.f32581i = i3;
    }

    @NonNull
    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m40494a((Void[]) objArr);
    }

    public /* synthetic */ void onPostExecute(Object obj) {
        m40495a((Boolean) obj);
    }

    @NonNull
    /* renamed from: a */
    protected Boolean m40494a(Void... voidArr) {
        voidArr = new C15962a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ManagerProfile.a(this.f32582j).getUrlBase());
        stringBuilder.append(ManagerWebServices.PATH_MEDIA);
        try {
            voidArr = ManagerProfile.b(this.f32582j).newCall(voidArr.a(stringBuilder.toString()).a("DELETE", new C120191(this)).d()).execute();
            if ((voidArr != null ? voidArr.j().c() : -1) != Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                return Boolean.valueOf(false);
            }
            try {
                voidArr = voidArr.h().string();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("DELETE RESPONSE: ");
                stringBuilder2.append(voidArr);
                ad.a(stringBuilder2.toString());
                List arrayList = new ArrayList(6);
                try {
                    C9648e.m40045a(new JSONArray(voidArr), arrayList);
                    this.f32582j.a(arrayList);
                    return Boolean.valueOf(1);
                } catch (Void[] voidArr2) {
                    ad.a("Failed to parse into json delete photo response", voidArr2);
                    return Boolean.valueOf(false);
                }
            } catch (Void[] voidArr22) {
                ad.a("Failed to parse body of photo delete to string", voidArr22);
                return Boolean.valueOf(false);
            }
        } catch (Void[] voidArr222) {
            ad.a("Failed to delete photo", voidArr222);
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    public void m40495a(Boolean bool) {
        if (bool.booleanValue() != null) {
            ad.a("DELETE photo success");
            if (this.f32574b == null) {
                this.f32579g.onDeletePhotoSuccess(this.f32577e);
                return;
            } else if (this.f32575c != null) {
                this.f32582j.a(this.f32576d, this.f32577e, this.f32578f, this.f32582j.c().getOtherPhotoIds(this.f32578f), this.f32579g, true, this.f32580h, this.f32581i);
                return;
            } else {
                this.f32579g.onAddPhotoSuccess(this.f32577e, this.f32580h, this.f32581i);
                return;
            }
        }
        ad.a("DELETE photo BAD_REQUEST");
        if (this.f32574b != null) {
            this.f32579g.onAddPhotoFailure(this.f32577e, this.f32580h);
        } else {
            this.f32579g.onDeletePhotoFailure(this.f32577e);
        }
    }
}
