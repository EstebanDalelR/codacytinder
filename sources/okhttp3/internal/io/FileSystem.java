package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.C15976k;
import okio.Sink;
import okio.Source;

public interface FileSystem {
    /* renamed from: a */
    public static final FileSystem f49457a = new C176821();

    /* renamed from: okhttp3.internal.io.FileSystem$1 */
    class C176821 implements FileSystem {
        C176821() {
        }

        public Source source(File file) throws FileNotFoundException {
            return C15976k.m60614a(file);
        }

        public okio.Sink sink(java.io.File r2) throws java.io.FileNotFoundException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = okio.C15976k.m60618b(r2);	 Catch:{ FileNotFoundException -> 0x0005 }
            return r0;
        L_0x0005:
            r0 = r2.getParentFile();
            r0.mkdirs();
            r2 = okio.C15976k.m60618b(r2);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.io.FileSystem.1.sink(java.io.File):okio.Sink");
        }

        public okio.Sink appendingSink(java.io.File r2) throws java.io.FileNotFoundException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = okio.C15976k.m60620c(r2);	 Catch:{ FileNotFoundException -> 0x0005 }
            return r0;
        L_0x0005:
            r0 = r2.getParentFile();
            r0.mkdirs();
            r2 = okio.C15976k.m60620c(r2);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.io.FileSystem.1.appendingSink(java.io.File):okio.Sink");
        }

        public void delete(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("failed to delete ");
                stringBuilder.append(file);
                throw new IOException(stringBuilder.toString());
            }
        }

        public boolean exists(File file) {
            return file.exists();
        }

        public long size(File file) {
            return file.length();
        }

        public void rename(File file, File file2) throws IOException {
            delete(file2);
            if (!file.renameTo(file2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("failed to rename ");
                stringBuilder.append(file);
                stringBuilder.append(" to ");
                stringBuilder.append(file2);
                throw new IOException(stringBuilder.toString());
            }
        }

        public void deleteContents(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("not a readable directory: ");
                stringBuilder.append(file);
                throw new IOException(stringBuilder.toString());
            }
            file = listFiles.length;
            int i = 0;
            while (i < file) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("failed to delete ");
                    stringBuilder2.append(file2);
                    throw new IOException(stringBuilder2.toString());
                }
            }
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
