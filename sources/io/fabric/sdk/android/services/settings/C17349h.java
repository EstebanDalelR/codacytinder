package io.fabric.sdk.android.services.settings;

import com.tinder.api.ManagerWebServices;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.C15611g;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.persistence.C17346a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;

/* renamed from: io.fabric.sdk.android.services.settings.h */
class C17349h implements CachedSettingsIo {
    /* renamed from: a */
    private final C15611g f53078a;

    public C17349h(C15611g c15611g) {
        this.f53078a = c15611g;
    }

    public JSONObject readCachedSettings() {
        Throwable e;
        C15608c.m58560h().mo12791d("Fabric", "Reading cached settings...");
        Closeable closeable = null;
        Closeable fileInputStream;
        try {
            JSONObject jSONObject;
            File file = new File(new C17346a(this.f53078a).getFilesDir(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(CommonUtils.m58592a((InputStream) fileInputStream));
                    closeable = fileInputStream;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C15608c.m58560h().mo12794e("Fabric", "Failed to fetch cached settings", e);
                        CommonUtils.m58603a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        e = th;
                        closeable = fileInputStream;
                        CommonUtils.m58603a(closeable, "Error while closing settings cache file.");
                        throw e;
                    }
                }
            }
            C15608c.m58560h().mo12791d("Fabric", "No cached settings found.");
            jSONObject = null;
            CommonUtils.m58603a(closeable, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C15608c.m58560h().mo12794e("Fabric", "Failed to fetch cached settings", e);
            CommonUtils.m58603a(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            e = th2;
            CommonUtils.m58603a(closeable, "Error while closing settings cache file.");
            throw e;
        }
    }

    public void writeCachedSettings(long j, JSONObject jSONObject) {
        Throwable e;
        C15608c.m58560h().mo12791d("Fabric", "Writing settings to cache file...");
        if (jSONObject != null) {
            Closeable closeable = null;
            try {
                jSONObject.put(ManagerWebServices.PARAM_EXPIRES_AT, j);
                Closeable fileWriter = new FileWriter(new File(new C17346a(this.f53078a).getFilesDir(), "com.crashlytics.settings.json"));
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                    CommonUtils.m58603a(fileWriter, "Failed to close settings writer.");
                } catch (Exception e2) {
                    e = e2;
                    closeable = fileWriter;
                    try {
                        C15608c.m58560h().mo12794e("Fabric", "Failed to cache settings", e);
                        CommonUtils.m58603a(closeable, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        e = th;
                        CommonUtils.m58603a(closeable, "Failed to close settings writer.");
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    closeable = fileWriter;
                    CommonUtils.m58603a(closeable, "Failed to close settings writer.");
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                C15608c.m58560h().mo12794e("Fabric", "Failed to cache settings", e);
                CommonUtils.m58603a(closeable, "Failed to close settings writer.");
            }
        }
    }
}
