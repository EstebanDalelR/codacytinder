package com.tinder.managers;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.tinder.api.ManagerWebServices;
import com.tinder.listeners.ListenerPhoto;
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

class ManagerProfile$3 extends AsyncTask<Void, Void, Boolean> {
    /* renamed from: a */
    final /* synthetic */ JSONObject f32583a;
    /* renamed from: b */
    final /* synthetic */ ArrayList f32584b;
    /* renamed from: c */
    final /* synthetic */ ListenerPhoto f32585c;
    /* renamed from: d */
    final /* synthetic */ ArrayList f32586d;
    /* renamed from: e */
    final /* synthetic */ ManagerProfile f32587e;

    /* renamed from: com.tinder.managers.ManagerProfile$3$1 */
    class C120201 extends C15964r {
        /* renamed from: a */
        final /* synthetic */ ManagerProfile$3 f38989a;

        C120201(ManagerProfile$3 managerProfile$3) {
            this.f38989a = managerProfile$3;
        }

        public C15958m contentType() {
            return C15958m.a(C15616a.ACCEPT_JSON_VALUE);
        }

        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f38989a.f32583a.toString().getBytes());
        }
    }

    ManagerProfile$3(ManagerProfile managerProfile, JSONObject jSONObject, ArrayList arrayList, ListenerPhoto listenerPhoto, ArrayList arrayList2) {
        this.f32587e = managerProfile;
        this.f32583a = jSONObject;
        this.f32584b = arrayList;
        this.f32585c = listenerPhoto;
        this.f32586d = arrayList2;
    }

    @NonNull
    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m40496a((Void[]) objArr);
    }

    public /* synthetic */ void onPostExecute(Object obj) {
        m40497a((Boolean) obj);
    }

    @NonNull
    /* renamed from: a */
    protected Boolean m40496a(Void... voidArr) {
        voidArr = new C15962a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ManagerProfile.a(this.f32587e).getUrlBase());
        stringBuilder.append(ManagerWebServices.PATH_MEDIA);
        try {
            voidArr = ManagerProfile.b(this.f32587e).newCall(voidArr.a(stringBuilder.toString()).a("DELETE", new C120201(this)).d()).execute();
            if ((voidArr != null ? voidArr.j().c() : -1) != Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                return Boolean.valueOf(false);
            }
            try {
                voidArr = voidArr.h().string();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("DELETE RESPONSE: ");
                stringBuilder2.append(voidArr);
                ad.a(stringBuilder2.toString());
                if (this.f32587e.c() == null) {
                    return Boolean.valueOf(false);
                }
                List arrayList = new ArrayList(6);
                try {
                    C9648e.m40045a(new JSONArray(voidArr), arrayList);
                    this.f32587e.a(arrayList);
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
    public void m40497a(Boolean bool) {
        int i = 0;
        if (bool.booleanValue() != null) {
            ad.a("DELETE photo success");
            if (this.f32584b.size() == 1) {
                this.f32585c.onDeletePhotoSuccess(((Integer) this.f32586d.get(0)).intValue());
                return;
            } else {
                this.f32585c.onDeletePhotosSuccess(this.f32586d);
                return;
            }
        }
        ad.a("DELETE photo FAIL");
        while (i < this.f32584b.size()) {
            this.f32585c.onDeletePhotoFailure(((Integer) this.f32586d.get(i)).intValue());
            i++;
        }
    }
}
