package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

public final class yw {
    /* renamed from: a */
    public static int m20273a(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (m20277b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: a */
    public static ECParameterSpec m20274a(zzdur zzdur) throws NoSuchAlgorithmException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (yx.f16653b[zzdur.ordinal()]) {
            case 1:
                str = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
                str2 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
                str3 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
                str4 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
                str5 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
                break;
            case 2:
                str = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
                str2 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
                str3 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
                str4 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
                str5 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
                break;
            case 3:
                str = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
                str2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
                str3 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
                str4 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
                str5 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
                break;
            default:
                str = String.valueOf(zzdur);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
                stringBuilder.append("curve not implemented:");
                stringBuilder.append(str);
                throw new NoSuchAlgorithmException(stringBuilder.toString());
        }
        return m20275a(str, str2, str3, str4, str5);
    }

    /* renamed from: a */
    private static ECParameterSpec m20275a(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: a */
    public static void m20276a(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger b = m20277b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX != null) {
            if (affineY != null) {
                if (affineX.signum() != -1) {
                    if (affineX.compareTo(b) == -1) {
                        if (affineY.signum() != -1) {
                            if (affineY.compareTo(b) == -1) {
                                if (!affineY.multiply(affineY).mod(b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(b))) {
                                    throw new GeneralSecurityException("Point is not on curve");
                                }
                                return;
                            }
                        }
                        throw new GeneralSecurityException("y is out of range");
                    }
                }
                throw new GeneralSecurityException("x is out of range");
            }
        }
        throw new GeneralSecurityException("point is at infinity");
    }

    /* renamed from: b */
    private static BigInteger m20277b(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }
}
