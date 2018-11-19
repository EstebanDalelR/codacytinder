package com.facebook.ads.internal.p047k;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.facebook.ads.internal.p041h.C3296p;
import com.tinder.api.ManagerWebServices;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.k.p */
public class C1502p {
    /* renamed from: a */
    private static final String f4161a = "com.facebook.ads.internal.k.p";
    /* renamed from: b */
    private static final Object f4162b = new Object();

    /* renamed from: a */
    public static com.facebook.ads.internal.p041h.C3296p m5285a(java.lang.Exception r5, android.content.Context r6) {
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
        r0 = 0;
        r1 = new com.facebook.ads.internal.g.i;	 Catch:{ Exception -> 0x0026 }
        r2 = 0;	 Catch:{ Exception -> 0x0026 }
        r1.<init>(r6, r2);	 Catch:{ Exception -> 0x0026 }
        r1 = r1.m4929b();	 Catch:{ Exception -> 0x0026 }
        r2 = new com.facebook.ads.internal.k.o;	 Catch:{ Exception -> 0x0026 }
        r5 = com.facebook.ads.internal.p047k.ah.m5181a(r5);	 Catch:{ Exception -> 0x0026 }
        r3 = 1;	 Catch:{ Exception -> 0x0026 }
        r2.<init>(r5, r1, r3);	 Catch:{ Exception -> 0x0026 }
        r5 = new com.facebook.ads.internal.h.p;	 Catch:{ Exception -> 0x0026 }
        r3 = com.facebook.ads.internal.p040g.C1414h.m4921b();	 Catch:{ Exception -> 0x0026 }
        r1 = com.facebook.ads.internal.p040g.C1414h.m4922c();	 Catch:{ Exception -> 0x0026 }
        r5.<init>(r3, r1, r2);	 Catch:{ Exception -> 0x0026 }
        com.facebook.ads.internal.p047k.C1502p.m5288a(r5, r6);	 Catch:{ Exception -> 0x0027 }
        return r5;
    L_0x0026:
        r5 = r0;
    L_0x0027:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.p.a(java.lang.Exception, android.content.Context):com.facebook.ads.internal.h.p");
    }

    @WorkerThread
    /* renamed from: a */
    public static JSONArray m5286a(Context context) {
        FileInputStream openFileInput;
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;
        Throwable th;
        JSONArray jSONArray = new JSONArray();
        synchronized (f4162b) {
            BufferedReader bufferedReader = null;
            try {
                String readLine;
                if (new File(context.getFilesDir(), "crasheslog").exists()) {
                    openFileInput = context.openFileInput("crasheslog");
                    try {
                        inputStreamReader = new InputStreamReader(openFileInput);
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
                                    readLine = bufferedReader2.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    jSONArray.put(new JSONObject(readLine));
                                } catch (Throwable e) {
                                    BufferedReader bufferedReader3 = bufferedReader2;
                                    fileInputStream = openFileInput;
                                    th = e;
                                    bufferedReader = bufferedReader3;
                                } catch (Throwable th2) {
                                    jSONArray = th2;
                                    bufferedReader = bufferedReader2;
                                }
                            }
                            bufferedReader = bufferedReader2;
                        } catch (Throwable e2) {
                            Throwable th3 = e2;
                            fileInputStream = openFileInput;
                            th = th3;
                            try {
                                Log.e(f4161a, "Failed to read crashes", th);
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e3) {
                                        th = e3;
                                        readLine = f4161a;
                                        String str = "Failed to close buffers";
                                        Log.e(readLine, str, th);
                                        return jSONArray;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return jSONArray;
                            } catch (Throwable th4) {
                                jSONArray = th4;
                                openFileInput = fileInputStream;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th5) {
                                        Log.e(f4161a, "Failed to close buffers", th5);
                                        throw jSONArray;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                if (openFileInput != null) {
                                    openFileInput.close();
                                }
                                throw jSONArray;
                            }
                        } catch (Throwable th6) {
                            jSONArray = th6;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (openFileInput != null) {
                                openFileInput.close();
                            }
                            throw jSONArray;
                        }
                    } catch (Throwable e4) {
                        fileInputStream = openFileInput;
                        th5 = e4;
                        inputStreamReader = null;
                        Log.e(f4161a, "Failed to read crashes", th5);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return jSONArray;
                    } catch (Throwable th7) {
                        jSONArray = th7;
                        inputStreamReader = null;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (openFileInput != null) {
                            openFileInput.close();
                        }
                        throw jSONArray;
                    }
                }
                openFileInput = null;
                inputStreamReader = openFileInput;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        th5 = e5;
                        readLine = f4161a;
                        str = "Failed to close buffers";
                        Log.e(readLine, str, th5);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (openFileInput != null) {
                    openFileInput.close();
                }
            } catch (Exception e6) {
                th5 = e6;
                inputStreamReader = null;
                fileInputStream = inputStreamReader;
                Log.e(f4161a, "Failed to read crashes", th5);
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return jSONArray;
            } catch (Throwable th8) {
                jSONArray = th8;
                openFileInput = null;
                inputStreamReader = openFileInput;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (openFileInput != null) {
                    openFileInput.close();
                }
                throw jSONArray;
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static JSONObject m5287a(C3296p c3296p) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", UUID.randomUUID().toString());
        jSONObject.put("type", c3296p.mo1736b());
        jSONObject.put("time", C1490h.m5241a(c3296p.m4960e()));
        jSONObject.put("session_time", C1490h.m5241a(c3296p.m4961f()));
        jSONObject.put("session_id", c3296p.m4962g());
        jSONObject.put(ManagerWebServices.FB_DATA, c3296p.m4963h() != null ? new JSONObject(c3296p.m4963h()) : new JSONObject());
        return jSONObject;
    }

    /* renamed from: a */
    public static void m5288a(C3296p c3296p, Context context) {
        if (c3296p != null && context != null) {
            synchronized (f4162b) {
                try {
                    JSONObject a = C1502p.m5287a(c3296p);
                    FileOutputStream openFileOutput = context.openFileOutput("crasheslog", 32768);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a.toString());
                    stringBuilder.append("\n");
                    openFileOutput.write(stringBuilder.toString().getBytes());
                    openFileOutput.close();
                } catch (Throwable e) {
                    Log.e(f4161a, "Failed to store crash", e);
                }
            }
        }
    }

    @WorkerThread
    /* renamed from: b */
    public static void m5289b(Context context) {
        synchronized (f4162b) {
            File file = new File(context.getFilesDir(), "crasheslog");
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
