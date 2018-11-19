package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.GeoFence;
import com.foursquare.api.types.ResponseV2;
import com.foursquare.api.types.Venue;
import com.foursquare.internal.network.C1923d;
import com.foursquare.internal.network.C1932g;
import com.foursquare.internal.network.FoursquareError;
import com.foursquare.internal.util.C1941c;
import com.foursquare.pilgrim.PilgrimLogger.PilgrimLogEntry;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import java.util.List;
import java.util.concurrent.TimeUnit;

class bl extends C1979c {
    /* renamed from: b */
    private String f10640b;
    /* renamed from: c */
    private boolean f10641c;

    bl() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    protected final void mo2050a(android.content.Context r22, com.foursquare.api.FoursquareLocation r23, com.foursquare.pilgrim.C1979c.C1978a r24, com.foursquare.pilgrim.PilgrimLogger.PilgrimLogEntry r25, @android.support.annotation.NonNull com.foursquare.pilgrim.BackgroundWakeupSource r26) throws java.lang.Exception {
        /*
        r21 = this;
        r7 = r21;
        r8 = r22;
        r6 = r23;
        r1 = r24;
        r5 = r25;
        r2 = r26;
        r4 = com.foursquare.pilgrim.PilgrimSdk.get();
        r3 = com.foursquare.pilgrim.ax.m7003a();
        r9 = r23.getAccuracy();
        r10 = 1140457472; // 0x43fa0000 float:500.0 double:5.634608575E-315;
        r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r9 < 0) goto L_0x003c;
    L_0x001e:
        r1 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.DEBUG;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = "Processing location with very low accuracy, not very useful. ";
        r3.append(r5);
        r5 = r23.getAccuracy();
        r3.append(r5);
        r3 = r3.toString();
        r4.log(r1, r3);
        r7.m13368a(r6, r2);
        return;
    L_0x003c:
        r9 = r7.f10640b;
        r9 = android.text.TextUtils.isEmpty(r9);
        if (r9 == 0) goto L_0x0056;
    L_0x0044:
        r9 = com.foursquare.pilgrim.al.m6934b(r22);
        if (r9 == 0) goto L_0x0056;
    L_0x004a:
        r10 = r9.getId();
        r7.f10640b = r10;
        r9 = r9.isLimitAdTrackingEnabled();
        r7.f10641c = r9;
    L_0x0056:
        r9 = com.foursquare.internal.util.C1942d.m6822a(r22);
        r11 = com.foursquare.pilgrim.ap.m6952a(r8, r9);
        if (r11 == 0) goto L_0x0068;
    L_0x0060:
        r10 = com.foursquare.pilgrim.ap.m6954a(r25);
        r1.m7158a(r10);
        goto L_0x006f;
    L_0x0068:
        r10 = com.foursquare.pilgrim.ap.m6955b(r25);
        r1.m7158a(r10);
    L_0x006f:
        r10 = r3.m7038h();
        r10 = com.foursquare.pilgrim.BaseSpeedStrategy.C1950a.m6845a(r8, r10);
        r12 = r10.mo2054a(r6);
        r13 = r10.mo2056c();
        if (r12 == 0) goto L_0x00a0;
    L_0x0081:
        r14 = com.foursquare.pilgrim.bi.f5362a;
        r14 = r14.f5363b;
        r15 = com.foursquare.internal.network.C1923d.m6723a();
        r15 = r15.m6737b();
        r10.mo2053a(r6, r14, r15, r3);
        r10.mo2052a(r8);
        r14 = r10.mo2051a();
        r15 = r10.mo2056c();
        r15 = r7.m13363a(r14, r15, r13, r5);
        goto L_0x00a1;
    L_0x00a0:
        r15 = 0;
    L_0x00a1:
        com.foursquare.pilgrim.C1979c.m7161a(r5, r6, r15, r10, r9);
        if (r12 == 0) goto L_0x00aa;
    L_0x00a6:
        r7.m13369a(r6, r15, r2);
        goto L_0x00ad;
    L_0x00aa:
        r7.m13368a(r6, r2);
    L_0x00ad:
        r2 = com.foursquare.pilgrim.bb.m7069a(r22, r23);
        r9 = "exit";
        r9 = r9.equals(r15);
        if (r9 == 0) goto L_0x0202;
    L_0x00b9:
        r1 = com.foursquare.pilgrim.CurrentPlace.m6855a(r22);
        if (r1 == 0) goto L_0x01f2;
    L_0x00bf:
        r9 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.DEBUG;
        r10 = "The user has left their current place.";
        r4.log(r9, r10);
        r9 = r23.getTime();
        r1.m6858a(r9);
        r16 = 0;
        r17 = 0;
        r18 = 1;
        r9 = r1.getType();	 Catch:{ Exception -> 0x0177, all -> 0x016f }
        r9 = r9.isHomeOrWork();	 Catch:{ Exception -> 0x0177, all -> 0x016f }
        if (r9 == 0) goto L_0x00ff;
    L_0x00dd:
        if (r2 == 0) goto L_0x00ff;
    L_0x00df:
        r2 = r2.f5292d;	 Catch:{ Exception -> 0x00f5, all -> 0x00ec }
        r9 = r1.getType();	 Catch:{ Exception -> 0x00f5, all -> 0x00ec }
        if (r2 != r9) goto L_0x00ff;
    L_0x00e7:
        r15 = r16;
        r2 = 0;
        r10 = 1;
        goto L_0x012c;
    L_0x00ec:
        r0 = move-exception;
        r10 = r0;
        r9 = r1;
        r14 = r3;
        r12 = r4;
        r13 = r6;
        r11 = 0;
        goto L_0x01c6;
    L_0x00f5:
        r0 = move-exception;
        r9 = r1;
        r14 = r3;
        r12 = r4;
        r13 = r6;
        r10 = 0;
        r11 = 0;
    L_0x00fc:
        r1 = r0;
        goto L_0x017f;
    L_0x00ff:
        r9 = r4.f5254b;	 Catch:{ Exception -> 0x0177, all -> 0x016f }
        r12 = 0;
        r13 = 1;
        r14 = r7.f10640b;	 Catch:{ Exception -> 0x0177, all -> 0x016f }
        r15 = r7.f10641c;	 Catch:{ Exception -> 0x0177, all -> 0x016f }
        r10 = r6;
        r11 = r1;
        r2 = 0;
        r9 = r9.mo2047a(r10, r11, r12, r13, r14, r15);	 Catch:{ Exception -> 0x0168, all -> 0x0161 }
        r10 = r7.m13373a(r8, r1, r9, r5);	 Catch:{ Exception -> 0x0168, all -> 0x0161 }
        if (r9 == 0) goto L_0x012b;
    L_0x0114:
        r9 = r9.m6774c();	 Catch:{ Exception -> 0x0124, all -> 0x011c }
        r15 = r9;
        r15 = (com.foursquare.pilgrim.ay) r15;	 Catch:{ Exception -> 0x0124, all -> 0x011c }
        goto L_0x012c;
    L_0x011c:
        r0 = move-exception;
        r9 = r1;
        r11 = r2;
        r14 = r3;
        r12 = r4;
        r13 = r6;
        goto L_0x01c3;
    L_0x0124:
        r0 = move-exception;
        r9 = r1;
        r11 = r2;
        r14 = r3;
        r12 = r4;
        r13 = r6;
        goto L_0x00fc;
    L_0x012b:
        r15 = r2;
    L_0x012c:
        if (r10 != 0) goto L_0x013c;
    L_0x012e:
        r9 = r1;
        r1 = r7;
        r11 = r2;
        r2 = r8;
        r14 = r3;
        r3 = r9;
        r12 = r4;
        r4 = r6;
        r13 = r6;
        r6 = r15;
        r1.m13372a(r2, r3, r4, r5, r6);
        goto L_0x0140;
    L_0x013c:
        r11 = r2;
        r14 = r3;
        r12 = r4;
        r13 = r6;
    L_0x0140:
        if (r10 == 0) goto L_0x0159;
    L_0x0142:
        r1 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.DEBUG;
        r2 = "Still at the previous location";
        r12.log(r1, r2);
        r1 = com.foursquare.pilgrim.ap.m6949a(r23);
        r14.m7024a(r1);
        r1 = r1.getGeoFence();
        r14.m7023a(r1);
        goto L_0x01ff;
    L_0x0159:
        com.foursquare.pilgrim.CurrentPlace.m6856a(r8, r11);
        r14.m7023a(r11);
        goto L_0x01ff;
    L_0x0161:
        r0 = move-exception;
        r9 = r1;
        r11 = r2;
        r14 = r3;
        r12 = r4;
        r13 = r6;
        goto L_0x0175;
    L_0x0168:
        r0 = move-exception;
        r9 = r1;
        r11 = r2;
        r14 = r3;
        r12 = r4;
        r13 = r6;
        goto L_0x017d;
    L_0x016f:
        r0 = move-exception;
        r9 = r1;
        r14 = r3;
        r12 = r4;
        r13 = r6;
        r11 = 0;
    L_0x0175:
        r10 = r0;
        goto L_0x01c6;
    L_0x0177:
        r0 = move-exception;
        r9 = r1;
        r14 = r3;
        r12 = r4;
        r13 = r6;
        r11 = 0;
    L_0x017d:
        r1 = r0;
        r10 = 0;
    L_0x017f:
        r2 = com.foursquare.pilgrim.PilgrimSdk.get();	 Catch:{ all -> 0x01c2 }
        r3 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.ERROR;	 Catch:{ all -> 0x01c2 }
        r4 = "Something went wrong while leaving a place.";
        r2.log(r3, r4, r1);	 Catch:{ all -> 0x01c2 }
        com.foursquare.pilgrim.C1979c.m7162a(r1, r5);	 Catch:{ all -> 0x01c2 }
        r2 = r1 instanceof java.lang.IllegalAccessException;	 Catch:{ all -> 0x01c2 }
        if (r2 == 0) goto L_0x01a2;
    L_0x0191:
        r2 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.DEBUG;	 Catch:{ all -> 0x01c2 }
        r3 = "Your consumer is not authorized to use the Pilgrim SDK";
        r12.log(r2, r3);	 Catch:{ all -> 0x01c2 }
        r21.m13364a();	 Catch:{ all -> 0x019c }
        goto L_0x01a4;
    L_0x019c:
        r0 = move-exception;
        r17 = r10;
        r18 = 0;
        goto L_0x0175;
    L_0x01a2:
        r17 = 1;
    L_0x01a4:
        r2 = new com.foursquare.pilgrim.RealExceptionReporter;	 Catch:{ all -> 0x01be }
        r2.<init>();	 Catch:{ all -> 0x01be }
        r2.reportException(r1);	 Catch:{ all -> 0x01be }
        com.foursquare.pilgrim.C3570x.m13421a(r9, r13);	 Catch:{ all -> 0x01be }
        if (r17 == 0) goto L_0x01bb;
    L_0x01b1:
        if (r10 != 0) goto L_0x01bb;
    L_0x01b3:
        r6 = 0;
        r1 = r7;
        r2 = r8;
        r3 = r9;
        r4 = r13;
        r1.m13372a(r2, r3, r4, r5, r6);
    L_0x01bb:
        if (r10 == 0) goto L_0x0159;
    L_0x01bd:
        goto L_0x0142;
    L_0x01be:
        r0 = move-exception;
        r18 = r17;
        goto L_0x01c3;
    L_0x01c2:
        r0 = move-exception;
    L_0x01c3:
        r17 = r10;
        goto L_0x0175;
    L_0x01c6:
        if (r18 == 0) goto L_0x01d3;
    L_0x01c8:
        if (r17 != 0) goto L_0x01d3;
    L_0x01ca:
        r1 = r7;
        r2 = r8;
        r3 = r9;
        r4 = r13;
        r6 = r16;
        r1.m13372a(r2, r3, r4, r5, r6);
    L_0x01d3:
        if (r17 == 0) goto L_0x01eb;
    L_0x01d5:
        r1 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.DEBUG;
        r2 = "Still at the previous location";
        r12.log(r1, r2);
        r1 = com.foursquare.pilgrim.ap.m6949a(r23);
        r14.m7024a(r1);
        r1 = r1.getGeoFence();
        r14.m7023a(r1);
        goto L_0x01f1;
    L_0x01eb:
        com.foursquare.pilgrim.CurrentPlace.m6856a(r8, r11);
        r14.m7023a(r11);
    L_0x01f1:
        throw r10;
    L_0x01f2:
        r14 = r3;
        r12 = r4;
        r11 = 0;
        r1 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.DEBUG;
        r2 = "User exited but their current place was corrupted.";
        r12.log(r1, r2);
        r14.m7023a(r11);
    L_0x01ff:
        r12 = r14;
        goto L_0x02b5;
    L_0x0202:
        r14 = r3;
        r12 = r4;
        r13 = r6;
        r3 = "stop";
        r3 = r3.equals(r15);
        if (r3 == 0) goto L_0x029c;
    L_0x020d:
        r3 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.DEBUG;
        r4 = "User stopped. Getting the place.";
        r12.log(r3, r4);
        if (r2 != 0) goto L_0x0219;
    L_0x0216:
        r2 = com.foursquare.pilgrim.RegionType.UNKNOWN;
        goto L_0x021b;
    L_0x0219:
        r2 = r2.f5292d;
    L_0x021b:
        r9 = r12.f5254b;	 Catch:{ Exception -> 0x0236 }
        r3 = r7.f10640b;	 Catch:{ Exception -> 0x0236 }
        r15 = r7.f10641c;	 Catch:{ Exception -> 0x0236 }
        r10 = r13;
        r12 = r5;
        r4 = r13;
        r13 = r2;
        r6 = r14;
        r14 = r3;
        r3 = r9.mo2048a(r10, r11, r12, r13, r14, r15);	 Catch:{ Exception -> 0x0234 }
        r3 = r7.m13371a(r8, r3, r4, r5);	 Catch:{ Exception -> 0x0234 }
        r1.m7158a(r3);	 Catch:{ Exception -> 0x0234 }
        goto L_0x029a;
    L_0x0234:
        r0 = move-exception;
        goto L_0x0239;
    L_0x0236:
        r0 = move-exception;
        r4 = r13;
        r6 = r14;
    L_0x0239:
        r1 = r0;
        com.foursquare.pilgrim.C1979c.m7162a(r1, r5);
        r3 = new com.foursquare.pilgrim.RealExceptionReporter;
        r3.<init>();
        r3.reportException(r1);
        r1 = r1 instanceof java.lang.IllegalAccessException;
        if (r1 != 0) goto L_0x029a;
    L_0x0249:
        r3 = new com.foursquare.pilgrim.CurrentPlace;
        r10 = 0;
        r1 = r2.isHomeOrWork();
        if (r1 == 0) goto L_0x0254;
    L_0x0252:
        r11 = r2;
        goto L_0x0257;
    L_0x0254:
        r1 = com.foursquare.pilgrim.RegionType.NONE;
        r11 = r1;
    L_0x0257:
        r12 = r23.getTime();
        r1 = r2.isHomeOrWork();
        if (r1 == 0) goto L_0x0265;
    L_0x0261:
        r1 = com.foursquare.pilgrim.Confidence.HIGH;
    L_0x0263:
        r14 = r1;
        goto L_0x0268;
    L_0x0265:
        r1 = com.foursquare.pilgrim.Confidence.NONE;
        goto L_0x0263;
    L_0x0268:
        r15 = 0;
        r1 = com.foursquare.internal.network.C1923d.m6723a();
        r17 = r1.m6741f();
        r18 = 0;
        r19 = 0;
        r9 = r3;
        r16 = r4;
        r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19);
        r1 = com.foursquare.pilgrim.ap.m6949a(r23);
        r6.m7024a(r1);
        r1 = r1.getGeoFence();
        r6.m7023a(r1);
        r9 = 0;
        r1 = r7;
        r2 = r8;
        r10 = r3;
        r12 = r6;
        r6 = r9;
        r1 = r1.m13372a(r2, r3, r4, r5, r6);
        r10.m6864a(r1);
        com.foursquare.pilgrim.CurrentPlace.m6856a(r8, r10);
        goto L_0x02b5;
    L_0x029a:
        r12 = r6;
        goto L_0x02b5;
    L_0x029c:
        r12 = r14;
        r1 = r10.mo2056c();
        r2 = com.foursquare.pilgrim.BaseSpeedStrategy.MotionState.STOPPED;
        if (r1 != r2) goto L_0x02b5;
    L_0x02a5:
        r2 = com.foursquare.pilgrim.CurrentPlace.m6855a(r22);
        r6 = r7.f10640b;
        r9 = r7.f10641c;
        r1 = r8;
        r3 = r5;
        r4 = r11;
        r5 = r6;
        r6 = r9;
        m13366a(r1, r2, r3, r4, r5, r6);
    L_0x02b5:
        r12.m7032b(r8);
        r21.m13365a(r22);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.bl.a(android.content.Context, com.foursquare.api.FoursquareLocation, com.foursquare.pilgrim.c$a, com.foursquare.pilgrim.PilgrimLogger$PilgrimLogEntry, com.foursquare.pilgrim.BackgroundWakeupSource):void");
    }

    /* renamed from: a */
    private void m13365a(Context context) {
        ad.m13308a(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        C3550e.m13382a(context);
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - bh.m7108a()) > 1) {
            bb.m7075a(context, bb.m7072a(bc.m13346c()));
            bh.m7110a(System.currentTimeMillis());
            bc.m13345b();
        }
    }

    /* renamed from: a */
    private void m13364a() {
        ad.m13311b();
        bh.m7124d(0);
        bh.m7109a(0);
    }

    /* renamed from: a */
    private void m13369a(FoursquareLocation foursquareLocation, String str, @NonNull BackgroundWakeupSource backgroundWakeupSource) {
        Object obj;
        if (!"stop".equals(str)) {
            if (!ax.m7003a().m7041k()) {
                obj = null;
                ad.m13309a(foursquareLocation, obj == null ? C1923d.m6723a().m6740e() : null, str, bi.f5362a.f5363b, true, backgroundWakeupSource);
                if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - bc.m13342a()) >= 15) {
                    bc.m13344a(foursquareLocation);
                }
            }
        }
        obj = 1;
        if (obj == null) {
        }
        ad.m13309a(foursquareLocation, obj == null ? C1923d.m6723a().m6740e() : null, str, bi.f5362a.f5363b, true, backgroundWakeupSource);
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - bc.m13342a()) >= 15) {
            bc.m13344a(foursquareLocation);
        }
    }

    /* renamed from: a */
    private void m13368a(FoursquareLocation foursquareLocation, @NonNull BackgroundWakeupSource backgroundWakeupSource) {
        ad.m13309a(foursquareLocation, ax.m7003a().m7041k() ? C1923d.m6723a().m6740e() : null, null, bi.f5362a.f5363b, false, backgroundWakeupSource);
    }

    /* renamed from: a */
    private String m13363a(FoursquareLocation foursquareLocation, MotionState motionState, MotionState motionState2, PilgrimLogEntry pilgrimLogEntry) {
        if (ax.m7003a().m7048r() && motionState2 == MotionState.STOPPED && motionState == MotionState.MOVING) {
            return "exit";
        }
        Object obj;
        GeoFence f = ax.m7003a().m7036f();
        Object obj2 = 1;
        if (motionState != MotionState.MOVING) {
            if (motionState2 != MotionState.MOVING) {
                obj = null;
                if (obj != null || !ap.m6953a(foursquareLocation, 1.0d, f, ax.m7003a())) {
                    obj2 = null;
                }
                foursquareLocation = ap.m6953a(foursquareLocation, 2.0d, f, ax.m7003a());
                if (obj2 == null) {
                    if (foursquareLocation != null) {
                        if (ax.m7003a().m7036f() != null) {
                            if (motionState != MotionState.MOVING) {
                                pilgrimLogEntry.addNote("We are moving, won't ping server until we stop moving.");
                            } else if (motionState == MotionState.STOPPED && motionState != motionState2) {
                                foursquareLocation = "stop";
                                return foursquareLocation;
                            }
                        }
                        foursquareLocation = null;
                        return foursquareLocation;
                    }
                }
                foursquareLocation = "exit";
                motionState2 = MotionState.STOPPED;
                return foursquareLocation;
            }
        }
        obj = 1;
        if (obj != null) {
        }
        obj2 = null;
        foursquareLocation = ap.m6953a(foursquareLocation, 2.0d, f, ax.m7003a());
        if (obj2 == null) {
            if (foursquareLocation != null) {
                if (ax.m7003a().m7036f() != null) {
                    if (motionState != MotionState.MOVING) {
                        foursquareLocation = "stop";
                        return foursquareLocation;
                    }
                    pilgrimLogEntry.addNote("We are moving, won't ping server until we stop moving.");
                }
                foursquareLocation = null;
                return foursquareLocation;
            }
        }
        foursquareLocation = "exit";
        motionState2 = MotionState.STOPPED;
        return foursquareLocation;
    }

    /* renamed from: a */
    private boolean m13373a(Context context, CurrentPlace currentPlace, C1932g<ay> c1932g, PilgrimLogEntry pilgrimLogEntry) throws Exception {
        ay ayVar = (ay) m13362a((C1932g) c1932g, pilgrimLogEntry);
        if (TextUtils.isEmpty(ayVar.m16797e()) == null) {
            currentPlace.m6862a(ayVar.m16797e());
        }
        if (ayVar.m16802j() != null) {
            currentPlace.m6860a(ayVar.m16799g());
            currentPlace.m6859a(ayVar.m16801i());
            currentPlace.m6863a(ayVar.m16803k());
        }
        CurrentPlace.m6856a(context, currentPlace);
        if (ayVar.m13375a() != null) {
            PilgrimSdk.stop(context);
        }
        m13364a();
        return ayVar.m16798f();
    }

    /* renamed from: a */
    private boolean m13371a(Context context, C1932g<aw> c1932g, FoursquareLocation foursquareLocation, PilgrimLogEntry pilgrimLogEntry) throws Exception {
        Context context2 = context;
        PilgrimLogEntry pilgrimLogEntry2 = pilgrimLogEntry;
        C3549d c3549d = (aw) m13362a((C1932g) c1932g, pilgrimLogEntry2);
        if (c3549d.m13375a()) {
            PilgrimSdk.stop(context);
        }
        if (((long) c3549d.m16794j()) > 0) {
            ax.m7003a().m7031b(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis((long) c3549d.m16794j()));
        }
        if (c3549d.m13378d() != null) {
            bh.m7112a(c3549d.m16795k());
            ag.m6911a(context).m6913a(context2, c3549d.m13378d());
        }
        boolean a = ax.m7003a().m7028a(context2, c3549d.m13377c(), true);
        CurrentPlace currentPlace = new CurrentPlace(c3549d.m16789e(), c3549d.m16796l(), foursquareLocation.getTime(), c3549d.m16792h(), c3549d.m16793i(), foursquareLocation, C1923d.m6723a().m6741f(), c3549d.m16790f(), false);
        boolean a2 = m13372a(context2, currentPlace, foursquareLocation, pilgrimLogEntry2, c3549d);
        m13367a(context2, c3549d.m16791g(), pilgrimLogEntry2);
        currentPlace.m6864a(a2);
        CurrentPlace.m6856a(context2, currentPlace);
        m13364a();
        return a;
    }

    @NonNull
    /* renamed from: a */
    private static <T extends FoursquareType> T m13362a(C1932g<T> c1932g, PilgrimLogEntry pilgrimLogEntry) throws Exception {
        if (c1932g == null) {
            throw new C1992y("Server ping response was null!");
        }
        ResponseV2 b = c1932g.m6772b();
        ax.m7003a().m7021a(System.currentTimeMillis());
        m13370a(b, pilgrimLogEntry);
        if (c1932g.m6777f() != null) {
            return b.getResult();
        }
        pilgrimLogEntry = c1932g.m6776e();
        FoursquareError d = c1932g.m6775d();
        c1932g = c1932g.m6767a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Server responded with an error! HTTP(");
        stringBuilder.append(c1932g);
        stringBuilder.append(")");
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        if (d != null) {
            stringBuilder2.append(" ");
            stringBuilder2.append(d.toString());
        }
        if (TextUtils.isEmpty(pilgrimLogEntry) == null) {
            stringBuilder2.append(" ");
            stringBuilder2.append(pilgrimLogEntry);
        }
        throw new C1992y(stringBuilder2.toString());
    }

    /* renamed from: a */
    private static void m13370a(ResponseV2 responseV2, PilgrimLogEntry pilgrimLogEntry) throws IllegalAccessException {
        if (responseV2 != null && responseV2.getMeta() != null && responseV2.getMeta().getCode() == 403) {
            PilgrimSdk.get().log(LogLevel.ERROR, "Your application is not authorized to use the Pilgrim SDK.");
            ax.m7003a().m7023a((GeoFence) null);
            throw new IllegalAccessException("Your consumer is not authorized");
        }
    }

    /* renamed from: a */
    private boolean m13372a(@android.support.annotation.NonNull android.content.Context r4, @android.support.annotation.NonNull com.foursquare.pilgrim.CurrentPlace r5, com.foursquare.api.FoursquareLocation r6, @android.support.annotation.Nullable com.foursquare.pilgrim.PilgrimLogger.PilgrimLogEntry r7, @android.support.annotation.Nullable com.foursquare.pilgrim.C3549d r8) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r7 = com.foursquare.pilgrim.ag.m6911a(r4);
        r7 = r7.m6914a(r5);
        r0 = 0;
        r1 = 1;
        if (r8 != 0) goto L_0x0010;
    L_0x000c:
        if (r7 == 0) goto L_0x0010;
    L_0x000e:
        r2 = 1;
        goto L_0x0011;
    L_0x0010:
        r2 = 0;
    L_0x0011:
        if (r8 == 0) goto L_0x001b;
    L_0x0013:
        r8 = r8.m13376b();
        if (r8 == 0) goto L_0x001b;
    L_0x0019:
        r8 = 1;
        goto L_0x001c;
    L_0x001b:
        r8 = 0;
    L_0x001c:
        if (r7 == 0) goto L_0x002c;
    L_0x001e:
        r7 = r5.hasExited();
        if (r7 == 0) goto L_0x002c;
    L_0x0024:
        r7 = r5.m6865b();
        if (r7 == 0) goto L_0x002c;
    L_0x002a:
        r7 = 1;
        goto L_0x002d;
    L_0x002c:
        r7 = 0;
    L_0x002d:
        if (r2 != 0) goto L_0x0040;
    L_0x002f:
        if (r8 != 0) goto L_0x0040;
    L_0x0031:
        if (r7 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0040;
    L_0x0034:
        r4 = com.foursquare.pilgrim.PilgrimSdk.get();
        r5 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.INFO;
        r6 = "Attempting to send a notification but no triggers matched.";
        r4.log(r5, r6);
        return r0;
    L_0x0040:
        r7 = com.foursquare.pilgrim.PilgrimSdk.get();
        r8 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.INFO;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "Sending a notification. Exit: ";
        r0.append(r2);
        r2 = r5.hasExited();
        r0.append(r2);
        r0 = r0.toString();
        r7.log(r8, r0);
        r7 = new com.foursquare.pilgrim.PilgrimSdkPlaceNotification;
        r7.<init>(r5, r6);
        r5 = com.foursquare.pilgrim.PilgrimSdk.get();	 Catch:{ Exception -> 0x0071 }
        r5 = r5.f5255c;	 Catch:{ Exception -> 0x0071 }
        r5 = r5.m6997f();	 Catch:{ Exception -> 0x0071 }
        r5.handlePlaceNotification(r4, r7);	 Catch:{ Exception -> 0x0071 }
        goto L_0x0092;
    L_0x0071:
        r4 = move-exception;
        r5 = new com.foursquare.pilgrim.RealExceptionReporter;
        r5.<init>();
        r5.reportException(r4);
        r5 = com.foursquare.pilgrim.PilgrimSdk.get();	 Catch:{ Exception -> 0x0087 }
        r5 = r5.f5255c;	 Catch:{ Exception -> 0x0087 }
        r5 = r5.m6996e();	 Catch:{ Exception -> 0x0087 }
        r5.logException(r4);	 Catch:{ Exception -> 0x0087 }
    L_0x0087:
        r5 = com.foursquare.pilgrim.PilgrimSdk.get();
        r6 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.ERROR;
        r7 = "There was an exception while handling a notification";
        r5.log(r6, r7, r4);
    L_0x0092:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.bl.a(android.content.Context, com.foursquare.pilgrim.CurrentPlace, com.foursquare.api.FoursquareLocation, com.foursquare.pilgrim.PilgrimLogger$PilgrimLogEntry, com.foursquare.pilgrim.d):boolean");
    }

    /* renamed from: a */
    private void m13367a(android.content.Context r2, java.util.List<com.foursquare.pilgrim.NearbyVenue> r3, com.foursquare.pilgrim.PilgrimLogger.PilgrimLogEntry r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        if (r3 == 0) goto L_0x0043;
    L_0x0002:
        r4 = r3.size();
        if (r4 != 0) goto L_0x0009;
    L_0x0008:
        goto L_0x0043;
    L_0x0009:
        r4 = new com.foursquare.pilgrim.PilgrimSdkNearbyNotification;
        r0 = new java.util.ArrayList;
        r0.<init>(r3);
        r4.<init>(r0);
        r3 = com.foursquare.pilgrim.PilgrimSdk.get();	 Catch:{ Exception -> 0x0021 }
        r3 = r3.f5255c;	 Catch:{ Exception -> 0x0021 }
        r3 = r3.m6997f();	 Catch:{ Exception -> 0x0021 }
        r3.handleNearbyNotification(r2, r4);	 Catch:{ Exception -> 0x0021 }
        goto L_0x0042;
    L_0x0021:
        r2 = move-exception;
        r3 = new com.foursquare.pilgrim.RealExceptionReporter;
        r3.<init>();
        r3.reportException(r2);
        r3 = com.foursquare.pilgrim.PilgrimSdk.get();	 Catch:{ Exception -> 0x0037 }
        r3 = r3.f5255c;	 Catch:{ Exception -> 0x0037 }
        r3 = r3.m6996e();	 Catch:{ Exception -> 0x0037 }
        r3.logException(r2);	 Catch:{ Exception -> 0x0037 }
    L_0x0037:
        r3 = com.foursquare.pilgrim.PilgrimSdk.get();
        r4 = com.foursquare.pilgrim.PilgrimSdk.LogLevel.ERROR;
        r0 = "There was an exception while handling a nearby notification";
        r3.log(r4, r0, r2);
    L_0x0042:
        return;
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.bl.a(android.content.Context, java.util.List, com.foursquare.pilgrim.PilgrimLogger$PilgrimLogEntry):void");
    }

    /* renamed from: a */
    private static void m13366a(Context context, CurrentPlace currentPlace, PilgrimLogEntry pilgrimLogEntry, boolean z, String str, boolean z2) {
        Context context2 = context;
        if (currentPlace != null) {
            if (TextUtils.isEmpty(currentPlace.getPilgrimVisitId())) {
                FoursquareLocation location = currentPlace.getLocation();
                int f = bh.m7129f();
                long g = bh.m7131g();
                if (f > 0) {
                    try {
                        if (!C1941c.m6821a(g, f)) {
                            return;
                        }
                    } catch (Exception e) {
                        if (!(e instanceof C1992y)) {
                            if (f == 0) {
                                bh.m7124d(System.currentTimeMillis());
                            }
                            bh.m7109a(f + 1);
                        }
                    }
                }
                RegionType type = currentPlace.getType();
                if (type == RegionType.NONE) {
                    type = RegionType.UNKNOWN;
                }
                C1932g a = PilgrimSdk.get().f5254b.mo2048a(location, z, pilgrimLogEntry, type, str, z2);
                if (a == null || a.m6774c() == null || TextUtils.isEmpty(((aw) a.m6774c()).m16793i())) {
                    if (f == 0) {
                        bh.m7124d(System.currentTimeMillis());
                    }
                    bh.m7109a(f + 1);
                }
                PilgrimSdk.get().log(LogLevel.DEBUG, "Filled in info at your current stop");
                aw awVar = (aw) a.m6774c();
                Venue e2 = awVar.m16789e();
                RegionType l = awVar.m16796l();
                long arrival = currentPlace.getArrival();
                Confidence h = awVar.m16792h();
                String i = awVar.m16793i();
                FoursquareLocation location2 = currentPlace.getLocation();
                String a2 = currentPlace.m6857a();
                List f2 = awVar.m16790f();
                CurrentPlace currentPlace2 = r5;
                CurrentPlace currentPlace3 = new CurrentPlace(e2, l, arrival, h, i, location2, a2, f2, currentPlace.isBackfill());
                CurrentPlace.m6856a(context2, currentPlace2);
                PilgrimSdk.get().f5255c.m6997f().handleBackfillNotification(context2, new PilgrimSdkBackfillNotification(currentPlace2));
                bh.m7109a(0);
                bh.m7124d(0);
            }
        }
    }
}
