package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.fabric.sdk.android.services.events.a */
public abstract class C15645a<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    protected final Context context;
    protected final CurrentTimeProvider currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    protected final EventsStorage eventStorage;
    protected volatile long lastRollOverTime;
    protected final List<EventsStorageListener> rollOverListeners = new CopyOnWriteArrayList();
    protected final EventTransform<T> transform;

    /* renamed from: io.fabric.sdk.android.services.events.a$1 */
    class C156431 implements Comparator<C15644a> {
        /* renamed from: a */
        final /* synthetic */ C15645a f48416a;

        C156431(C15645a c15645a) {
            this.f48416a = c15645a;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m58744a((C15644a) obj, (C15644a) obj2);
        }

        /* renamed from: a */
        public int m58744a(C15644a c15644a, C15644a c15644a2) {
            return (int) (c15644a.f48418b - c15644a2.f48418b);
        }
    }

    /* renamed from: io.fabric.sdk.android.services.events.a$a */
    static class C15644a {
        /* renamed from: a */
        final File f48417a;
        /* renamed from: b */
        final long f48418b;

        public C15644a(File file, long j) {
            this.f48417a = file;
            this.f48418b = j;
        }
    }

    protected abstract String generateUniqueRollOverFileName();

    protected int getMaxByteSizePerFile() {
        return MAX_BYTE_SIZE_PER_FILE;
    }

    public C15645a(Context context, EventTransform<T> eventTransform, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage, int i) throws IOException {
        this.context = context.getApplicationContext();
        this.transform = eventTransform;
        this.eventStorage = eventsStorage;
        this.currentTimeProvider = currentTimeProvider;
        this.lastRollOverTime = this.currentTimeProvider.getCurrentTimeMillis();
        this.defaultMaxFilesToKeep = i;
    }

    public void writeEvent(T t) throws IOException {
        t = this.transform.toBytes(t);
        rollFileOverIfNeeded(t.length);
        this.eventStorage.add(t);
    }

    public void registerRollOverListener(EventsStorageListener eventsStorageListener) {
        if (eventsStorageListener != null) {
            this.rollOverListeners.add(eventsStorageListener);
        }
    }

    public boolean rollFileOver() throws IOException {
        String str;
        boolean z = true;
        if (this.eventStorage.isWorkingFileEmpty()) {
            str = null;
            z = false;
        } else {
            str = generateUniqueRollOverFileName();
            this.eventStorage.rollOver(str);
            CommonUtils.m58599a(this.context, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.lastRollOverTime = this.currentTimeProvider.getCurrentTimeMillis();
        }
        triggerRollOverOnListeners(str);
        return z;
    }

    private void rollFileOverIfNeeded(int i) throws IOException {
        if (!this.eventStorage.canWorkingFileStore(i, getMaxByteSizePerFile())) {
            CommonUtils.m58599a(this.context, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.eventStorage.getWorkingFileUsedSizeInBytes()), Integer.valueOf(i), Integer.valueOf(getMaxByteSizePerFile())}));
            rollFileOver();
        }
    }

    protected int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    private void triggerRollOverOnListeners(String str) {
        for (EventsStorageListener onRollOver : this.rollOverListeners) {
            try {
                onRollOver.onRollOver(str);
            } catch (Throwable e) {
                CommonUtils.m58601a(this.context, "One of the roll over listeners threw an exception", e);
            }
        }
    }

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.getBatchOfFilesToSend(1);
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.deleteFilesInRollOverDirectory(list);
    }

    public void deleteAllEventsFiles() {
        this.eventStorage.deleteFilesInRollOverDirectory(this.eventStorage.getAllFilesInRollOverDirectory());
        this.eventStorage.deleteWorkingFile();
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> allFilesInRollOverDirectory = this.eventStorage.getAllFilesInRollOverDirectory();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (allFilesInRollOverDirectory.size() > maxFilesToKeep) {
            int size = allFilesInRollOverDirectory.size() - maxFilesToKeep;
            CommonUtils.m58600a(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(allFilesInRollOverDirectory.size()), Integer.valueOf(maxFilesToKeep), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new C156431(this));
            for (File file : allFilesInRollOverDirectory) {
                treeSet.add(new C15644a(file, parseCreationTimestampFromFileName(file.getName())));
            }
            List allFilesInRollOverDirectory2 = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                allFilesInRollOverDirectory2.add(((C15644a) it.next()).f48417a);
                if (allFilesInRollOverDirectory2.size() == size) {
                    break;
                }
            }
            this.eventStorage.deleteFilesInRollOverDirectory(allFilesInRollOverDirectory2);
        }
    }

    public long parseCreationTimestampFromFileName(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = "_";
        r6 = r6.split(r0);
        r0 = r6.length;
        r1 = 0;
        r3 = 3;
        if (r0 == r3) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = 2;
        r6 = r6[r0];	 Catch:{ NumberFormatException -> 0x0019 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ NumberFormatException -> 0x0019 }
        r3 = r6.longValue();	 Catch:{ NumberFormatException -> 0x0019 }
        return r3;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.events.a.parseCreationTimestampFromFileName(java.lang.String):long");
    }
}
