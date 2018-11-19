package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class tc {
    /* renamed from: b */
    private static Cipher f16526b;
    /* renamed from: c */
    private static final Object f16527c = new Object();
    /* renamed from: d */
    private static final Object f16528d = new Object();
    /* renamed from: a */
    private final SecureRandom f16529a = null;

    public tc(SecureRandom secureRandom) {
    }

    /* renamed from: a */
    private static Cipher m20184a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f16528d) {
            if (f16526b == null) {
                f16526b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f16526b;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String m20185a(byte[] bArr, byte[] bArr2) throws zzcy {
        if (bArr.length != 16) {
            throw new zzcy(this);
        }
        try {
            byte[] iv;
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f16527c) {
                m20184a().init(1, secretKeySpec, null);
                bArr2 = m20184a().doFinal(bArr2);
                iv = m20184a().getIV();
            }
            int length = bArr2.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length);
            allocate.put(iv).put(bArr2);
            allocate.flip();
            bArr = new byte[length];
            allocate.get(bArr);
            return pn.m20136a(bArr, false);
        } catch (Throwable e) {
            throw new zzcy(this, e);
        } catch (Throwable e2) {
            throw new zzcy(this, e2);
        } catch (Throwable e22) {
            throw new zzcy(this, e22);
        } catch (Throwable e222) {
            throw new zzcy(this, e222);
        } catch (Throwable e2222) {
            throw new zzcy(this, e2222);
        }
    }

    /* renamed from: a */
    public final byte[] m20186a(String str) throws zzcy {
        int i = 0;
        try {
            byte[] a = pn.m20137a(str, false);
            if (a.length != 32) {
                throw new zzcy(this);
            }
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(a, 4, 16).get(bArr);
            while (i < 16) {
                bArr[i] = (byte) (bArr[i] ^ 68);
                i++;
            }
            return bArr;
        } catch (Throwable e) {
            throw new zzcy(this, e);
        }
    }

    /* renamed from: a */
    public final byte[] m20187a(byte[] bArr, String str) throws zzcy {
        if (bArr.length != 16) {
            throw new zzcy(this);
        }
        try {
            byte[] a = pn.m20137a(str, false);
            if (a.length <= 16) {
                throw new zzcy(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(a.length);
            allocate.put(a);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            a = new byte[(a.length - 16)];
            allocate.get(bArr2);
            allocate.get(a);
            Key secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f16527c) {
                m20184a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                a = m20184a().doFinal(a);
            }
            return a;
        } catch (Throwable e) {
            throw new zzcy(this, e);
        } catch (Throwable e2) {
            throw new zzcy(this, e2);
        } catch (Throwable e22) {
            throw new zzcy(this, e22);
        } catch (Throwable e222) {
            throw new zzcy(this, e222);
        } catch (Throwable e2222) {
            throw new zzcy(this, e2222);
        } catch (Throwable e22222) {
            throw new zzcy(this, e22222);
        } catch (Throwable e222222) {
            throw new zzcy(this, e222222);
        }
    }
}
