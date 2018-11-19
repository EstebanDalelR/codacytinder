package com.crashlytics.android.core;

import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.C15623g;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ReportUploader {
    static final Map<String, String> HEADER_INVALID_CLS_FILE = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final short[] RETRY_INTERVALS = new short[]{(short) 10, (short) 20, (short) 30, (short) 60, (short) 120, (short) 300};
    private final String apiKey;
    private final CreateReportSpiCall createReportCall;
    private final Object fileAccessLock = new Object();
    private final HandlingExceptionCheck handlingExceptionCheck;
    private final ReportFilesProvider reportFilesProvider;
    private Thread uploadThread;

    interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    interface ReportFilesProvider {
        File[] getCompleteSessionFiles();

        File[] getInvalidSessionFiles();

        File[] getNativeReportFiles();
    }

    interface SendCheck {
        boolean canSendReports();
    }

    static final class AlwaysSendCheck implements SendCheck {
        public boolean canSendReports() {
            return true;
        }

        AlwaysSendCheck() {
        }
    }

    private class Worker extends C15623g {
        private final float delay;
        private final SendCheck sendCheck;

        Worker(float f, SendCheck sendCheck) {
            this.delay = f;
            this.sendCheck = sendCheck;
        }

        public void onRun() {
            try {
                attemptUploadWithRetry();
            } catch (Throwable e) {
                C15608c.h().e(CrashlyticsCore.TAG, "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            ReportUploader.this.uploadThread = null;
        }

        private void attemptUploadWithRetry() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r8 = this;
            r0 = io.fabric.sdk.android.C15608c.h();
            r1 = "CrashlyticsCore";
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = "Starting report processing in ";
            r2.append(r3);
            r3 = r8.delay;
            r2.append(r3);
            r3 = " second(s)...";
            r2.append(r3);
            r2 = r2.toString();
            r0.d(r1, r2);
            r0 = r8.delay;
            r1 = 0;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 <= 0) goto L_0x003b;
        L_0x0028:
            r0 = r8.delay;	 Catch:{ InterruptedException -> 0x0033 }
            r1 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;	 Catch:{ InterruptedException -> 0x0033 }
            r0 = r0 * r1;	 Catch:{ InterruptedException -> 0x0033 }
            r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0033 }
            java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0033 }
            goto L_0x003b;
        L_0x0033:
            r0 = java.lang.Thread.currentThread();
            r0.interrupt();
            return;
        L_0x003b:
            r0 = com.crashlytics.android.core.ReportUploader.this;
            r0 = r0.findReports();
            r1 = com.crashlytics.android.core.ReportUploader.this;
            r1 = r1.handlingExceptionCheck;
            r1 = r1.isHandlingException();
            if (r1 == 0) goto L_0x004e;
        L_0x004d:
            return;
        L_0x004e:
            r1 = r0.isEmpty();
            if (r1 != 0) goto L_0x0094;
        L_0x0054:
            r1 = r8.sendCheck;
            r1 = r1.canSendReports();
            if (r1 != 0) goto L_0x0094;
        L_0x005c:
            r1 = io.fabric.sdk.android.C15608c.h();
            r2 = "CrashlyticsCore";
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r4 = "User declined to send. Removing ";
            r3.append(r4);
            r4 = r0.size();
            r3.append(r4);
            r4 = " Report(s).";
            r3.append(r4);
            r3 = r3.toString();
            r1.d(r2, r3);
            r0 = r0.iterator();
        L_0x0083:
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0093;
        L_0x0089:
            r1 = r0.next();
            r1 = (com.crashlytics.android.core.Report) r1;
            r1.remove();
            goto L_0x0083;
        L_0x0093:
            return;
        L_0x0094:
            r1 = 0;
        L_0x0095:
            r2 = r0.isEmpty();
            if (r2 != 0) goto L_0x0132;
        L_0x009b:
            r2 = com.crashlytics.android.core.ReportUploader.this;
            r2 = r2.handlingExceptionCheck;
            r2 = r2.isHandlingException();
            if (r2 == 0) goto L_0x00a8;
        L_0x00a7:
            return;
        L_0x00a8:
            r2 = io.fabric.sdk.android.C15608c.h();
            r3 = "CrashlyticsCore";
            r4 = new java.lang.StringBuilder;
            r4.<init>();
            r5 = "Attempting to send ";
            r4.append(r5);
            r5 = r0.size();
            r4.append(r5);
            r5 = " report(s)";
            r4.append(r5);
            r4 = r4.toString();
            r2.d(r3, r4);
            r0 = r0.iterator();
        L_0x00cf:
            r2 = r0.hasNext();
            if (r2 == 0) goto L_0x00e1;
        L_0x00d5:
            r2 = r0.next();
            r2 = (com.crashlytics.android.core.Report) r2;
            r3 = com.crashlytics.android.core.ReportUploader.this;
            r3.forceUpload(r2);
            goto L_0x00cf;
        L_0x00e1:
            r0 = com.crashlytics.android.core.ReportUploader.this;
            r0 = r0.findReports();
            r2 = r0.isEmpty();
            if (r2 != 0) goto L_0x0095;
        L_0x00ed:
            r2 = com.crashlytics.android.core.ReportUploader.RETRY_INTERVALS;
            r3 = r1 + 1;
            r4 = com.crashlytics.android.core.ReportUploader.RETRY_INTERVALS;
            r4 = r4.length;
            r4 = r4 + -1;
            r1 = java.lang.Math.min(r1, r4);
            r1 = r2[r1];
            r1 = (long) r1;
            r4 = io.fabric.sdk.android.C15608c.h();
            r5 = "CrashlyticsCore";
            r6 = new java.lang.StringBuilder;
            r6.<init>();
            r7 = "Report submisson: scheduling delayed retry in ";
            r6.append(r7);
            r6.append(r1);
            r7 = " seconds";
            r6.append(r7);
            r6 = r6.toString();
            r4.d(r5, r6);
            r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r1 = r1 * r4;
            java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x012a }
            r1 = r3;
            goto L_0x0095;
        L_0x012a:
            r0 = java.lang.Thread.currentThread();
            r0.interrupt();
            return;
        L_0x0132:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.ReportUploader.Worker.attemptUploadWithRetry():void");
        }
    }

    public ReportUploader(String str, CreateReportSpiCall createReportSpiCall, ReportFilesProvider reportFilesProvider, HandlingExceptionCheck handlingExceptionCheck) {
        if (createReportSpiCall == null) {
            throw new IllegalArgumentException("createReportCall must not be null.");
        }
        this.createReportCall = createReportSpiCall;
        this.apiKey = str;
        this.reportFilesProvider = reportFilesProvider;
        this.handlingExceptionCheck = handlingExceptionCheck;
    }

    public synchronized void uploadReports(float f, SendCheck sendCheck) {
        if (this.uploadThread != null) {
            C15608c.h().d(CrashlyticsCore.TAG, "Report upload has already been started.");
            return;
        }
        this.uploadThread = new Thread(new Worker(f, sendCheck), "Crashlytics Report Uploader");
        this.uploadThread.start();
    }

    boolean isUploading() {
        return this.uploadThread != null;
    }

    boolean forceUpload(Report report) {
        boolean z;
        synchronized (this.fileAccessLock) {
            z = false;
            try {
                boolean invoke = this.createReportCall.invoke(new CreateReportRequest(this.apiKey, report));
                Logger h = C15608c.h();
                String str = CrashlyticsCore.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Crashlytics report upload ");
                stringBuilder.append(invoke ? "complete: " : "FAILED: ");
                stringBuilder.append(report.getIdentifier());
                h.i(str, stringBuilder.toString());
                if (invoke) {
                    report.remove();
                    z = true;
                }
            } catch (Throwable e) {
                h = C15608c.h();
                str = CrashlyticsCore.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error occurred sending report ");
                stringBuilder.append(report);
                h.e(str, stringBuilder.toString(), e);
            }
        }
        return z;
    }

    List<Report> findReports() {
        C15608c.h().d(CrashlyticsCore.TAG, "Checking for crash reports...");
        synchronized (this.fileAccessLock) {
            File[] completeSessionFiles = this.reportFilesProvider.getCompleteSessionFiles();
            File[] invalidSessionFiles = this.reportFilesProvider.getInvalidSessionFiles();
            File[] nativeReportFiles = this.reportFilesProvider.getNativeReportFiles();
        }
        List<Report> linkedList = new LinkedList();
        if (completeSessionFiles != null) {
            for (File file : completeSessionFiles) {
                Logger h = C15608c.h();
                String str = CrashlyticsCore.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found crash report ");
                stringBuilder.append(file.getPath());
                h.d(str, stringBuilder.toString());
                linkedList.add(new SessionReport(file));
            }
        }
        Map hashMap = new HashMap();
        if (invalidSessionFiles != null) {
            for (File file2 : invalidSessionFiles) {
                String sessionIdFromSessionFile = CrashlyticsController.getSessionIdFromSessionFile(file2);
                if (!hashMap.containsKey(sessionIdFromSessionFile)) {
                    hashMap.put(sessionIdFromSessionFile, new LinkedList());
                }
                ((List) hashMap.get(sessionIdFromSessionFile)).add(file2);
            }
        }
        for (String str2 : hashMap.keySet()) {
            Logger h2 = C15608c.h();
            String str3 = CrashlyticsCore.TAG;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Found invalid session: ");
            stringBuilder2.append(str2);
            h2.d(str3, stringBuilder2.toString());
            List list = (List) hashMap.get(str2);
            linkedList.add(new InvalidSessionReport(str2, (File[]) list.toArray(new File[list.size()])));
        }
        if (nativeReportFiles != null) {
            for (File nativeSessionReport : nativeReportFiles) {
                linkedList.add(new NativeSessionReport(nativeSessionReport));
            }
        }
        if (linkedList.isEmpty()) {
            C15608c.h().d(CrashlyticsCore.TAG, "No reports found.");
        }
        return linkedList;
    }
}
