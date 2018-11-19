package io.paperdb;

import android.content.Context;
import android.util.Log;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Kryo.DefaultInstantiatorStrategy;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer;
import de.javakaffee.kryoserializers.ArraysAsListSerializer;
import de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer;
import de.javakaffee.kryoserializers.UUIDSerializer;
import de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer;
import io.paperdb.serializer.NoArgCollectionSerializer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.objenesis.strategy.C19645c;

public class DbStoragePlainFile implements Storage {
    private final Context mContext;
    private final HashMap<Class, Serializer> mCustomSerializers;
    private final String mDbName;
    private String mFilesDir;
    private final ThreadLocal<Kryo> mKryo = new C156681();
    private boolean mPaperDirIsCreated;

    /* renamed from: io.paperdb.DbStoragePlainFile$1 */
    class C156681 extends ThreadLocal<Kryo> {
        C156681() {
        }

        protected Kryo initialValue() {
            return DbStoragePlainFile.this.createKryoInstance(false);
        }
    }

    private Kryo getKryo() {
        return (Kryo) this.mKryo.get();
    }

    private Kryo createKryoInstance(boolean z) {
        Kryo kryo = new Kryo();
        if (z) {
            kryo.getFieldSerializerConfig().setOptimizedGenerics(true);
        }
        kryo.register(PaperTable.class);
        kryo.setDefaultSerializer(CompatibleFieldSerializer.class);
        kryo.setReferences(false);
        kryo.register(Arrays.asList(new String[]{""}).getClass(), new ArraysAsListSerializer());
        UnmodifiableCollectionsSerializer.registerSerializers(kryo);
        SynchronizedCollectionsSerializer.registerSerializers(kryo);
        kryo.addDefaultSerializer(new ArrayList().subList(0, 0).getClass(), new NoArgCollectionSerializer());
        kryo.addDefaultSerializer(new LinkedList().subList(0, 0).getClass(), new NoArgCollectionSerializer());
        kryo.register(UUID.class, new UUIDSerializer());
        for (Class cls : this.mCustomSerializers.keySet()) {
            kryo.register(cls, (Serializer) this.mCustomSerializers.get(cls));
        }
        kryo.setInstantiatorStrategy(new DefaultInstantiatorStrategy(new C19645c()));
        return kryo;
    }

    DbStoragePlainFile(Context context, String str, HashMap<Class, Serializer> hashMap) {
        this.mContext = context;
        this.mDbName = str;
        this.mCustomSerializers = hashMap;
    }

    public synchronized void destroy() {
        assertInit();
        String dbPath = getDbPath(this.mContext, this.mDbName);
        if (!deleteDirectory(dbPath)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't delete Paper dir ");
            stringBuilder.append(dbPath);
            Log.e("paperdb", stringBuilder.toString());
        }
        this.mPaperDirIsCreated = false;
    }

    public synchronized <E> void insert(String str, E e) {
        assertInit();
        PaperTable paperTable = new PaperTable(e);
        e = getOriginalFile(str);
        File makeBackupFile = makeBackupFile(e);
        if (e.exists()) {
            if (makeBackupFile.exists()) {
                e.delete();
            } else if (!e.renameTo(makeBackupFile)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't rename file ");
                stringBuilder.append(e);
                stringBuilder.append(" to backup file ");
                stringBuilder.append(makeBackupFile);
                throw new PaperDbException(stringBuilder.toString());
            }
        }
        writeTableFile(str, paperTable, e, makeBackupFile);
    }

    public synchronized <E> E select(String str) {
        assertInit();
        File originalFile = getOriginalFile(str);
        File makeBackupFile = makeBackupFile(originalFile);
        if (makeBackupFile.exists()) {
            originalFile.delete();
            makeBackupFile.renameTo(originalFile);
        }
        if (!exist(str)) {
            return null;
        }
        return readTableFile(str, originalFile);
    }

    public synchronized boolean exist(String str) {
        assertInit();
        return getOriginalFile(str).exists();
    }

    public synchronized long lastModified(String str) {
        assertInit();
        str = getOriginalFile(str);
        return str.exists() ? str.lastModified() : -1;
    }

    public List<String> getAllKeys() {
        assertInit();
        String[] list = new File(this.mFilesDir).list();
        if (list == null) {
            return new ArrayList();
        }
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i].replace(".pt", "");
        }
        return Arrays.asList(list);
    }

    public synchronized void deleteIfExists(String str) {
        assertInit();
        File originalFile = getOriginalFile(str);
        if (!originalFile.exists()) {
            return;
        }
        if (!originalFile.delete()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't delete file ");
            stringBuilder.append(originalFile);
            stringBuilder.append(" for table ");
            stringBuilder.append(str);
            throw new PaperDbException(stringBuilder.toString());
        }
    }

    public void setLogLevel(int i) {
        com.esotericsoftware.minlog.Log.set(i);
    }

    private File getOriginalFile(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mFilesDir);
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        stringBuilder.append(".pt");
        return new File(stringBuilder.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <E> void writeTableFile(java.lang.String r4, io.paperdb.PaperTable<E> r5, java.io.File r6, java.io.File r7) {
        /*
        r3 = this;
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r0.<init>(r6);	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r1 = new com.esotericsoftware.kryo.io.Output;	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r2 = r3.getKryo();	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r2.writeObject(r1, r5);	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r1.flush();	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r0.flush();	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        sync(r0);	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r1.close();	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        r7.delete();	 Catch:{ IOException -> 0x0021, IOException -> 0x0021 }
        return;
    L_0x0021:
        r5 = move-exception;
        r7 = r6.exists();
        if (r7 == 0) goto L_0x0045;
    L_0x0028:
        r7 = r6.delete();
        if (r7 != 0) goto L_0x0045;
    L_0x002e:
        r4 = new io.paperdb.PaperDbException;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r0 = "Couldn't clean up partially-written file ";
        r7.append(r0);
        r7.append(r6);
        r6 = r7.toString();
        r4.<init>(r6, r5);
        throw r4;
    L_0x0045:
        r6 = new io.paperdb.PaperDbException;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r0 = "Couldn't save table: ";
        r7.append(r0);
        r7.append(r4);
        r4 = ". Backed up table will be used on next read attempt";
        r7.append(r4);
        r4 = r7.toString();
        r6.<init>(r4, r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.paperdb.DbStoragePlainFile.writeTableFile(java.lang.String, io.paperdb.PaperTable, java.io.File, java.io.File):void");
    }

    private <E> E readTableFile(String str, File file) {
        StringBuilder stringBuilder;
        try {
            return readContent(file, getKryo());
        } catch (FileNotFoundException e) {
            Throwable e2 = e;
            if (e2 instanceof KryoException) {
                try {
                    return readContent(file, createKryoInstance(true));
                } catch (FileNotFoundException e3) {
                    e2 = e3;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Couldn't read/deserialize file ");
                    stringBuilder.append(file);
                    stringBuilder.append(" for table ");
                    stringBuilder.append(str);
                    throw new PaperDbException(stringBuilder.toString(), e2);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't read/deserialize file ");
            stringBuilder.append(file);
            stringBuilder.append(" for table ");
            stringBuilder.append(str);
            throw new PaperDbException(stringBuilder.toString(), e2);
        }
    }

    private <E> E readContent(File file, Kryo kryo) throws FileNotFoundException, KryoException {
        Input input = new Input(new FileInputStream(file));
        try {
            file = ((PaperTable) kryo.readObject(input, PaperTable.class)).mContent;
            return file;
        } finally {
            input.close();
        }
    }

    private String getDbPath(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getFilesDir());
        stringBuilder.append(File.separator);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    private void assertInit() {
        if (!this.mPaperDirIsCreated) {
            createPaperDir();
            this.mPaperDirIsCreated = true;
        }
    }

    private void createPaperDir() {
        this.mFilesDir = getDbPath(this.mContext, this.mDbName);
        if (!new File(this.mFilesDir).exists() && !new File(this.mFilesDir).mkdirs()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't create Paper dir: ");
            stringBuilder.append(this.mFilesDir);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static boolean deleteDirectory(String str) {
        File file = new File(str);
        if (file.exists() != null) {
            str = file.listFiles();
            if (str != null) {
                for (File file2 : str) {
                    if (file2.isDirectory()) {
                        deleteDirectory(file2.toString());
                    } else {
                        file2.delete();
                    }
                }
            }
        }
        return file.delete();
    }

    private File makeBackupFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getPath());
        stringBuilder.append(".bak");
        return new File(stringBuilder.toString());
    }

    private static void sync(java.io.FileOutputStream r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r0 == 0) goto L_0x0009;
    L_0x0002:
        r0 = r0.getFD();	 Catch:{ IOException -> 0x0009 }
        r0.sync();	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.paperdb.DbStoragePlainFile.sync(java.io.FileOutputStream):void");
    }
}
