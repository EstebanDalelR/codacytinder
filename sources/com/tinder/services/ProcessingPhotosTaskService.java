package com.tinder.services;

import android.support.annotation.Nullable;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.google.android.gms.gcm.C2544a;
import com.google.android.gms.gcm.C2546c;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.PeriodicTask.C3845a;
import com.google.gson.stream.JsonReader;
import com.tinder.api.JsonReaderRequest;
import com.tinder.api.ManagerNetwork;
import com.tinder.api.ManagerWebServices;
import com.tinder.events.EventPhotosProcessed;
import com.tinder.managers.C2652a;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerProfile;
import com.tinder.model.ProcessingPhotos;
import com.tinder.module.Default;
import com.tinder.p257g.C9649g;
import com.tinder.utils.ad;
import de.greenrobot.event.C2664c;
import javax.inject.Inject;

public class ProcessingPhotosTaskService extends GcmTaskService {
    @Inject
    /* renamed from: a */
    ManagerProfile f51268a;
    @Inject
    /* renamed from: b */
    ManagerNetwork f51269b;
    @Default
    @Inject
    /* renamed from: c */
    C2664c f51270c;

    /* renamed from: com.tinder.services.ProcessingPhotosTaskService$1 */
    class C165721 implements ErrorListener {
        /* renamed from: a */
        int f51266a = null;
        /* renamed from: b */
        final /* synthetic */ ProcessingPhotosTaskService f51267b;

        C165721(ProcessingPhotosTaskService processingPhotosTaskService) {
            this.f51267b = processingPhotosTaskService;
        }

        public void onErrorResponse(VolleyError volleyError) {
            if (this.f51266a == 10) {
                C2544a.a(this.f51267b).a("ProcessingPhotosTaskService", ProcessingPhotosTaskService.class);
                C2544a.a(this.f51267b).a(new C3845a().a(ProcessingPhotosTaskService.class).a("ProcessingPhotosTaskService").a(300).b(30).b(false).b());
            }
            this.f51266a++;
            ad.a("Failed to request processed photos", volleyError);
        }
    }

    public ProcessingPhotosTaskService() {
        ManagerApp.e().inject(this);
    }

    /* renamed from: a */
    public int m61999a(C2546c c2546c) {
        this.f51269b.addRequest(new JsonReaderRequest<ProcessingPhotos>(this, 0, ManagerWebServices.URL_PROCESSING_PHOTOS, C2652a.a(), new C16574d(this), new C165721(this)) {
            /* renamed from: a */
            final /* synthetic */ ProcessingPhotosTaskService f56056a;

            @Nullable
            public /* synthetic */ Object readJson(JsonReader jsonReader) throws Exception {
                return m65524a(jsonReader);
            }

            @Nullable
            /* renamed from: a */
            public ProcessingPhotos m65524a(JsonReader jsonReader) throws Exception {
                return C9649g.a(jsonReader);
            }
        });
        return null;
    }

    /* renamed from: a */
    final /* synthetic */ void m62000a(ProcessingPhotos processingPhotos) {
        if (!processingPhotos.isPhotoProcessing()) {
            this.f51268a.a(processingPhotos.getProfilePhotos());
            this.f51268a.a(false);
            this.f51270c.d(new EventPhotosProcessed(processingPhotos.getProfilePhotos()));
            C2544a.a(this).a("ProcessingPhotosTaskService", ProcessingPhotosTaskService.class);
        }
    }
}
