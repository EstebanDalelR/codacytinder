package android.support.multidex;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: android.support.multidex.b */
final class C0276b {

    /* renamed from: android.support.multidex.b$a */
    static class C0275a {
        /* renamed from: a */
        long f979a;
        /* renamed from: b */
        long f980b;

        C0275a() {
        }
    }

    /* renamed from: a */
    static long m1018a(File file) throws IOException {
        long j = "r";
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, j);
        try {
            j = C0276b.m1019a(randomAccessFile, C0276b.m1020a(randomAccessFile));
            return j;
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static C0275a m1020a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("File too short to be a zip file: ");
            stringBuilder.append(randomAccessFile.length());
            throw new ZipException(stringBuilder.toString());
        }
        long j2 = length - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        if (j2 >= 0) {
            j = j2;
        }
        int reverseBytes = Integer.reverseBytes(101010256);
        while (true) {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C0275a c0275a = new C0275a();
                c0275a.f980b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                c0275a.f979a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return c0275a;
            }
            long j3 = length - 1;
            if (j3 < j) {
                throw new ZipException("End Of Central Directory signature not found");
            }
            length = j3;
        }
    }

    /* renamed from: a */
    static long m1019a(RandomAccessFile randomAccessFile, C0275a c0275a) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = c0275a.f980b;
        randomAccessFile.seek(c0275a.f979a);
        byte[] bArr = new byte[16384];
        c0275a = randomAccessFile.read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j));
        while (c0275a != -1) {
            crc32.update(bArr, 0, c0275a);
            long j2 = j - ((long) c0275a);
            if (j2 == 0) {
                break;
            }
            c0275a = randomAccessFile.read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j2));
            j = j2;
        }
        return crc32.getValue();
    }
}
