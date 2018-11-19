package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;

@zzzv
public final class ki implements zzt<zzamp> {
    /* renamed from: a */
    private boolean f23392a;

    /* renamed from: a */
    private static int m27415a(android.content.Context r1, java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3, int r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = r2.get(r3);
        r2 = (java.lang.String) r2;
        if (r2 == 0) goto L_0x0043;
    L_0x0008:
        com.google.android.gms.internal.aja.m19216a();	 Catch:{ NumberFormatException -> 0x0014 }
        r0 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0014 }
        r1 = com.google.android.gms.internal.hn.m19861a(r1, r0);	 Catch:{ NumberFormatException -> 0x0014 }
        return r1;
    L_0x0014:
        r1 = java.lang.String.valueOf(r3);
        r1 = r1.length();
        r1 = r1 + 34;
        r0 = java.lang.String.valueOf(r2);
        r0 = r0.length();
        r1 = r1 + r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>(r1);
        r1 = "Could not parse ";
        r0.append(r1);
        r0.append(r3);
        r1 = " in a video GMSG: ";
        r0.append(r1);
        r0.append(r2);
        r1 = r0.toString();
        com.google.android.gms.internal.hx.m19916e(r1);
    L_0x0043:
        r1 = r4;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ki.a(android.content.Context, java.util.Map, java.lang.String, int):int");
    }

    /* renamed from: a */
    private static void m27416a(com.google.android.gms.internal.jr r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = "minBufferMs";
        r3 = r4.get(r3);
        r3 = (java.lang.String) r3;
        r0 = "maxBufferMs";
        r0 = r4.get(r0);
        r0 = (java.lang.String) r0;
        r1 = "bufferForPlaybackMs";
        r1 = r4.get(r1);
        r1 = (java.lang.String) r1;
        r2 = "bufferForPlaybackAfterRebufferMs";
        r4 = r4.get(r2);
        r4 = (java.lang.String) r4;
        if (r3 == 0) goto L_0x0025;
    L_0x0022:
        java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x0025:
        if (r0 == 0) goto L_0x002a;	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x0027:
        java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x002a:
        if (r1 == 0) goto L_0x002f;	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x002c:
        java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x002f:
        if (r4 == 0) goto L_0x0047;	 Catch:{ NumberFormatException -> 0x0035 }
    L_0x0031:
        java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x0035 }
        return;
    L_0x0035:
        r4 = "Could not parse buffer parameters in loadControl video GMSG: (%s, %s)";
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r1[r2] = r3;
        r3 = 1;
        r1[r3] = r0;
        r3 = java.lang.String.format(r4, r1);
        com.google.android.gms.internal.hx.m19916e(r3);
    L_0x0047:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ki.a(com.google.android.gms.internal.jr, java.util.Map):void");
    }

    public final /* synthetic */ void zza(java.lang.Object r12, java.util.Map r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r12 = (com.google.android.gms.internal.zzamp) r12;
        r0 = "action";
        r0 = r13.get(r0);
        r0 = (java.lang.String) r0;
        if (r0 != 0) goto L_0x0012;
    L_0x000c:
        r12 = "Action missing from video GMSG.";
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x0012:
        r1 = 3;
        r1 = com.google.android.gms.internal.hx.m19910a(r1);
        if (r1 == 0) goto L_0x0056;
    L_0x0019:
        r1 = new org.json.JSONObject;
        r1.<init>(r13);
        r2 = "google.afma.Notify_dt";
        r1.remove(r2);
        r1 = r1.toString();
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 13;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r2 = r2 + r3;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Video GMSG: ";
        r3.append(r2);
        r3.append(r0);
        r2 = " ";
        r3.append(r2);
        r3.append(r1);
        r1 = r3.toString();
        com.google.android.gms.internal.hx.m19911b(r1);
    L_0x0056:
        r1 = "background";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0080;
    L_0x005e:
        r0 = "color";
        r13 = r13.get(r0);
        r13 = (java.lang.String) r13;
        r0 = android.text.TextUtils.isEmpty(r13);
        if (r0 == 0) goto L_0x0072;
    L_0x006c:
        r12 = "Color parameter missing from color video GMSG.";
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x0072:
        r13 = android.graphics.Color.parseColor(r13);	 Catch:{ IllegalArgumentException -> 0x007a }
        r12.setBackgroundColor(r13);	 Catch:{ IllegalArgumentException -> 0x007a }
        return;
    L_0x007a:
        r12 = "Invalid color parameter in video GMSG.";
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x0080:
        r1 = "decoderProps";
        r1 = r1.equals(r0);
        r2 = 0;
        if (r1 == 0) goto L_0x00d1;
    L_0x0089:
        r0 = "mimeTypes";
        r13 = r13.get(r0);
        r13 = (java.lang.String) r13;
        if (r13 != 0) goto L_0x009e;
    L_0x0093:
        r13 = "No MIME types specified for decoder properties inspection.";
        com.google.android.gms.internal.hx.m19916e(r13);
        r13 = "missingMimeTypes";
        com.google.android.gms.internal.jr.m27382a(r12, r13);
        return;
    L_0x009e:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 >= r1) goto L_0x00af;
    L_0x00a4:
        r13 = "Video decoder properties available on API versions >= 16.";
        com.google.android.gms.internal.hx.m19916e(r13);
        r13 = "deficientApiVersion";
        com.google.android.gms.internal.jr.m27382a(r12, r13);
        return;
    L_0x00af:
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = ",";
        r13 = r13.split(r1);
        r1 = r13.length;
    L_0x00bb:
        if (r2 >= r1) goto L_0x00cd;
    L_0x00bd:
        r3 = r13[r2];
        r4 = r3.trim();
        r4 = com.google.android.gms.internal.hl.m19852a(r4);
        r0.put(r3, r4);
        r2 = r2 + 1;
        goto L_0x00bb;
    L_0x00cd:
        com.google.android.gms.internal.jr.m27383a(r12, r0);
        return;
    L_0x00d1:
        r1 = r12.zzsf();
        if (r1 != 0) goto L_0x00dd;
    L_0x00d7:
        r12 = "Could not get underlay container for a video GMSG.";
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x00dd:
        r3 = "new";
        r3 = r3.equals(r0);
        r4 = "position";
        r4 = r4.equals(r0);
        if (r3 != 0) goto L_0x0268;
    L_0x00eb:
        if (r4 == 0) goto L_0x00ef;
    L_0x00ed:
        goto L_0x0268;
    L_0x00ef:
        r1 = r1.m19946a();
        if (r1 != 0) goto L_0x00f9;
    L_0x00f5:
        com.google.android.gms.internal.jr.m27381a(r12);
        return;
    L_0x00f9:
        r3 = "click";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0125;
    L_0x0101:
        r12 = r12.getContext();
        r0 = "x";
        r0 = m27415a(r12, r13, r0, r2);
        r3 = "y";
        r12 = m27415a(r12, r13, r3, r2);
        r4 = android.os.SystemClock.uptimeMillis();
        r6 = 0;
        r7 = (float) r0;
        r8 = (float) r12;
        r9 = 0;
        r2 = r4;
        r12 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9);
        r1.m27392a(r12);
        r12.recycle();
        return;
    L_0x0125:
        r3 = "currentTime";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0164;
    L_0x012d:
        r12 = "time";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        if (r12 != 0) goto L_0x013d;
    L_0x0137:
        r12 = "Time parameter missing from currentTime video GMSG.";
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x013d:
        r13 = java.lang.Float.parseFloat(r12);	 Catch:{ NumberFormatException -> 0x014a }
        r0 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;	 Catch:{ NumberFormatException -> 0x014a }
        r13 = r13 * r0;	 Catch:{ NumberFormatException -> 0x014a }
        r13 = (int) r13;	 Catch:{ NumberFormatException -> 0x014a }
        r1.m27390a(r13);	 Catch:{ NumberFormatException -> 0x014a }
        return;
    L_0x014a:
        r13 = "Could not parse time parameter from currentTime video GMSG: ";
        r12 = java.lang.String.valueOf(r12);
        r0 = r12.length();
        if (r0 == 0) goto L_0x015b;
    L_0x0156:
        r12 = r13.concat(r12);
        goto L_0x0160;
    L_0x015b:
        r12 = new java.lang.String;
        r12.<init>(r13);
    L_0x0160:
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x0164:
        r3 = "hide";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0171;
    L_0x016c:
        r12 = 4;
        r1.setVisibility(r12);
        return;
    L_0x0171:
        r3 = "load";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x017d;
    L_0x0179:
        r1.m27387a();
        return;
    L_0x017d:
        r3 = "loadControl";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0189;
    L_0x0185:
        m27416a(r1, r13);
        return;
    L_0x0189:
        r3 = "muted";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01a7;
    L_0x0191:
        r12 = "muted";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        r12 = java.lang.Boolean.parseBoolean(r12);
        if (r12 == 0) goto L_0x01a3;
    L_0x019f:
        r1.m27396d();
        return;
    L_0x01a3:
        r1.m27397e();
        return;
    L_0x01a7:
        r3 = "pause";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b3;
    L_0x01af:
        r1.m27394b();
        return;
    L_0x01b3:
        r3 = "play";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01bf;
    L_0x01bb:
        r1.m27395c();
        return;
    L_0x01bf:
        r3 = "show";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01cb;
    L_0x01c7:
        r1.setVisibility(r2);
        return;
    L_0x01cb:
        r3 = "src";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01df;
    L_0x01d3:
        r12 = "src";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        r1.m27393a(r12);
        return;
    L_0x01df:
        r3 = "touchMove";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0207;
    L_0x01e7:
        r0 = r12.getContext();
        r3 = "dx";
        r3 = m27415a(r0, r13, r3, r2);
        r4 = "dy";
        r13 = m27415a(r0, r13, r4, r2);
        r0 = (float) r3;
        r13 = (float) r13;
        r1.m27389a(r0, r13);
        r13 = r11.f23392a;
        if (r13 != 0) goto L_0x0206;
    L_0x0200:
        r12.zzna();
        r12 = 1;
        r11.f23392a = r12;
    L_0x0206:
        return;
    L_0x0207:
        r12 = "volume";
        r12 = r12.equals(r0);
        if (r12 == 0) goto L_0x0241;
    L_0x020f:
        r12 = "volume";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        if (r12 != 0) goto L_0x021f;
    L_0x0219:
        r12 = "Level parameter missing from volume video GMSG.";
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x021f:
        r13 = java.lang.Float.parseFloat(r12);	 Catch:{ NumberFormatException -> 0x0227 }
        r1.m27388a(r13);	 Catch:{ NumberFormatException -> 0x0227 }
        return;
    L_0x0227:
        r13 = "Could not parse volume parameter from volume video GMSG: ";
        r12 = java.lang.String.valueOf(r12);
        r0 = r12.length();
        if (r0 == 0) goto L_0x0238;
    L_0x0233:
        r12 = r13.concat(r12);
        goto L_0x023d;
    L_0x0238:
        r12 = new java.lang.String;
        r12.<init>(r13);
    L_0x023d:
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x0241:
        r12 = "watermark";
        r12 = r12.equals(r0);
        if (r12 == 0) goto L_0x024d;
    L_0x0249:
        r1.m27398f();
        return;
    L_0x024d:
        r12 = "Unknown video action: ";
        r13 = java.lang.String.valueOf(r0);
        r0 = r13.length();
        if (r0 == 0) goto L_0x025e;
    L_0x0259:
        r12 = r12.concat(r13);
        goto L_0x0264;
    L_0x025e:
        r13 = new java.lang.String;
        r13.<init>(r12);
        r12 = r13;
    L_0x0264:
        com.google.android.gms.internal.hx.m19916e(r12);
        return;
    L_0x0268:
        r0 = r12.getContext();
        r4 = "x";
        r4 = m27415a(r0, r13, r4, r2);
        r5 = "y";
        r5 = m27415a(r0, r13, r5, r2);
        r6 = "w";
        r7 = -1;
        r6 = m27415a(r0, r13, r6, r7);
        r8 = "h";
        r0 = m27415a(r0, r13, r8, r7);
        r7 = com.google.android.gms.internal.alo.bR;
        r8 = com.google.android.gms.internal.aja.m19221f();
        r7 = r8.m19334a(r7);
        r7 = (java.lang.Boolean) r7;
        r7 = r7.booleanValue();
        if (r7 == 0) goto L_0x02ab;
    L_0x0297:
        r7 = r12.zzsm();
        r7 = r7 - r4;
        r6 = java.lang.Math.min(r6, r7);
        r12 = r12.zzsl();
        r12 = r12 - r5;
        r12 = java.lang.Math.min(r0, r12);
        r7 = r12;
        goto L_0x02ac;
    L_0x02ab:
        r7 = r0;
    L_0x02ac:
        r12 = "player";	 Catch:{ NumberFormatException -> 0x02ba }
        r12 = r13.get(r12);	 Catch:{ NumberFormatException -> 0x02ba }
        r12 = (java.lang.String) r12;	 Catch:{ NumberFormatException -> 0x02ba }
        r12 = java.lang.Integer.parseInt(r12);	 Catch:{ NumberFormatException -> 0x02ba }
        r8 = r12;
        goto L_0x02bb;
    L_0x02ba:
        r8 = 0;
    L_0x02bb:
        r12 = "spherical";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        r9 = java.lang.Boolean.parseBoolean(r12);
        if (r3 == 0) goto L_0x02ea;
    L_0x02c9:
        r12 = r1.m19946a();
        if (r12 != 0) goto L_0x02ea;
    L_0x02cf:
        r10 = new com.google.android.gms.internal.kc;
        r12 = "flags";
        r12 = r13.get(r12);
        r12 = (java.lang.String) r12;
        r10.<init>(r12);
        r3 = r1;
        r3.m19948a(r4, r5, r6, r7, r8, r9, r10);
        r12 = r1.m19946a();
        if (r12 == 0) goto L_0x02e9;
    L_0x02e6:
        m27416a(r12, r13);
    L_0x02e9:
        return;
    L_0x02ea:
        r1.m19947a(r4, r5, r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ki.zza(java.lang.Object, java.util.Map):void");
    }
}
