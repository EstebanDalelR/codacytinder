package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

public final class yu {
    /* renamed from: a */
    private ECPublicKey f16649a;

    public yu(ECPublicKey eCPublicKey) {
        this.f16649a = eCPublicKey;
    }

    /* renamed from: a */
    public final yv m20270a(String str, byte[] bArr, byte[] bArr2, int i, zzdus zzdus) throws GeneralSecurityException {
        byte[] bArr3;
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) yz.f16657d.m20279a("EC");
        keyPairGenerator.initialize(this.f16649a.getParams());
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        yw.m20276a(this.f16649a.getW(), this.f16649a.getParams().getCurve());
        KeyAgreement keyAgreement = (KeyAgreement) yz.f16656c.m20279a("ECDH");
        keyAgreement.init(eCPrivateKey);
        keyAgreement.doPhase(this.f16649a, true);
        byte[] generateSecret = keyAgreement.generateSecret();
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        yw.m20276a(w, curve);
        int a = yw.m20273a(curve);
        Object obj;
        switch (yx.f16652a[zzdus.ordinal()]) {
            case 1:
                int i2 = (a * 2) + 1;
                obj = new byte[i2];
                Object toByteArray = w.getAffineX().toByteArray();
                Object toByteArray2 = w.getAffineY().toByteArray();
                System.arraycopy(toByteArray2, 0, obj, i2 - toByteArray2.length, toByteArray2.length);
                System.arraycopy(toByteArray, 0, obj, (a + 1) - toByteArray.length, toByteArray.length);
                obj[0] = (byte) 4;
                bArr3 = obj;
                break;
            case 2:
                a++;
                bArr3 = new byte[a];
                obj = w.getAffineX().toByteArray();
                System.arraycopy(obj, 0, bArr3, a - obj.length, obj.length);
                bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                break;
            default:
                String valueOf = String.valueOf(zzdus);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15);
                stringBuilder.append("invalid format:");
                stringBuilder.append(valueOf);
                throw new GeneralSecurityException(stringBuilder.toString());
        }
        return new yv(bArr3, zi.m20280a(str, yi.m20267a(bArr3, generateSecret), bArr, bArr2, i));
    }
}
