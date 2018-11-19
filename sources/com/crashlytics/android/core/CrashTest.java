package com.crashlytics.android.core;

import android.os.AsyncTask;
import io.fabric.sdk.android.C15608c;
import io.fabric.sdk.android.Logger;

public class CrashTest {
    public void throwRuntimeException(String str) {
        throw new RuntimeException(str);
    }

    public int stackOverflow() {
        return stackOverflow() + ((int) Math.random());
    }

    public void indexOutOfBounds() {
        int i = new int[2][10];
        Logger h = C15608c.h();
        String str = CrashlyticsCore.TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Out of bounds value: ");
        stringBuilder.append(i);
        h.d(str, stringBuilder.toString());
    }

    public void crashAsyncTask(final long j) {
        new AsyncTask<Void, Void, Void>() {
            protected java.lang.Void doInBackground(java.lang.Void... r3) {
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
                r2 = this;
                r0 = r3;	 Catch:{ InterruptedException -> 0x0005 }
                java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0005 }
            L_0x0005:
                r3 = com.crashlytics.android.core.CrashTest.this;
                r0 = "Background thread crash";
                r3.throwRuntimeException(r0);
                r3 = 0;
                return r3;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashTest.1.doInBackground(java.lang.Void[]):java.lang.Void");
            }
        }.execute(new Void[]{(Void) null});
    }

    public void throwFiveChainedExceptions() {
        try {
            privateMethodThatThrowsException("1");
        } catch (Throwable e) {
            throw new RuntimeException("2", e);
        } catch (Throwable e2) {
            try {
                throw new RuntimeException("3", e2);
            } catch (Throwable e22) {
                try {
                    throw new RuntimeException("4", e22);
                } catch (Throwable e222) {
                    throw new RuntimeException("5", e222);
                }
            }
        }
    }

    private void privateMethodThatThrowsException(String str) {
        throw new RuntimeException(str);
    }
}
