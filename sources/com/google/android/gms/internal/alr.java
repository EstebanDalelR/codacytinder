package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

@zzzv
public final class alr {
    /* renamed from: a */
    private BlockingQueue<amb> f15482a;
    /* renamed from: b */
    private ExecutorService f15483b;
    /* renamed from: c */
    private LinkedHashMap<String, String> f15484c = new LinkedHashMap();
    /* renamed from: d */
    private Map<String, alv> f15485d = new HashMap();
    /* renamed from: e */
    private String f15486e;
    /* renamed from: f */
    private Context f15487f;
    /* renamed from: g */
    private String f15488g;
    /* renamed from: h */
    private AtomicBoolean f15489h;
    /* renamed from: i */
    private File f15490i;

    public alr(Context context, String str, String str2, Map<String, String> map) {
        this.f15487f = context;
        this.f15488g = str;
        this.f15486e = str2;
        this.f15489h = new AtomicBoolean(false);
        this.f15489h.set(((Boolean) aja.m19221f().m19334a(alo.f15432J)).booleanValue());
        if (this.f15489h.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.f15490i = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f15484c.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.f15482a = new ArrayBlockingQueue(30);
        this.f15483b = Executors.newSingleThreadExecutor();
        this.f15483b.execute(new als(this));
        this.f15485d.put("action", alv.f15493b);
        this.f15485d.put("ad_format", alv.f15493b);
        this.f15485d.put("e", alv.f15494c);
    }

    /* renamed from: a */
    private final void m19345a() {
        FileOutputStream fileOutputStream;
        Throwable e;
        while (true) {
            try {
                amb amb = (amb) this.f15482a.take();
                Object b = amb.m19368b();
                if (!TextUtils.isEmpty(b)) {
                    Map a = m19348a(this.f15484c, amb.m19369c());
                    Builder buildUpon = Uri.parse(this.f15486e).buildUpon();
                    for (Entry entry : a.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    StringBuilder stringBuilder = new StringBuilder(buildUpon.build().toString());
                    stringBuilder.append("&it=");
                    stringBuilder.append(b);
                    String stringBuilder2 = stringBuilder.toString();
                    if (this.f15489h.get()) {
                        File file = this.f15490i;
                        if (file != null) {
                            fileOutputStream = null;
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                                try {
                                    fileOutputStream2.write(stringBuilder2.getBytes());
                                    fileOutputStream2.write(10);
                                } catch (IOException e2) {
                                    e = e2;
                                    fileOutputStream = fileOutputStream2;
                                    try {
                                        hx.m19914c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                    } catch (Throwable th) {
                                        e = th;
                                    }
                                } catch (Throwable th2) {
                                    e = th2;
                                    fileOutputStream = fileOutputStream2;
                                }
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable e3) {
                                    hx.m19914c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                }
                            } catch (IOException e4) {
                                e3 = e4;
                                hx.m19914c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e3);
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                        } else {
                            hx.m19916e("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        ar.e();
                        fk.m19717b(this.f15487f, this.f15488g, stringBuilder2);
                    }
                }
            } catch (Throwable e32) {
                hx.m19914c("CsiReporter:reporter interrupted", e32);
                return;
            }
        }
        throw e32;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable e5) {
                hx.m19914c("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
            }
        }
        throw e32;
    }

    /* renamed from: a */
    public final alv m19347a(String str) {
        alv alv = (alv) this.f15485d.get(str);
        return alv != null ? alv : alv.f15492a;
    }

    /* renamed from: a */
    final Map<String, String> m19348a(Map<String, String> map, @Nullable Map<String, String> map2) {
        Map<String, String> linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, m19347a(str).mo4353a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void m19349a(@Nullable List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f15484c.put("e", TextUtils.join(",", list));
        }
    }

    /* renamed from: a */
    public final boolean m19350a(amb amb) {
        return this.f15482a.offer(amb);
    }
}
