package com.google.android.gms.internal;

import com.facebook.ads.AdError;
import com.google.android.gms.internal.zzffu.C4479g;
import com.google.android.gms.internal.zzffu.C7363b;
import com.google.android.gms.internal.zzffu.C8036a;
import java.io.IOException;

public final class zziu {

    public static final class zza extends zzffu<zza, C8194a> implements zzfhg {
        /* renamed from: d */
        private static final zza f29329d;
        /* renamed from: e */
        private static volatile zzfhk<zza> f29330e;

        public enum zzb implements zzfga {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(AdError.NETWORK_ERROR_CODE),
            REQUEST_DID_UPDATE_GMS_SIGNALS(AdError.NO_FILL_ERROR_CODE),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE),
            REQUEST_FAILED_TO_BUILD_URL(1003),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(1004),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005);
            
            private static final zzfgb<zzb> zzbcl = null;
            private final int value;

            static {
                zzbcl = new ahy();
            }

            private zzb(int i) {
                this.value = i;
            }

            public final int zzhq() {
                return this.value;
            }
        }

        /* renamed from: com.google.android.gms.internal.zziu$zza$a */
        public static final class C8194a extends C8036a<zza, C8194a> implements zzfhg {
            private C8194a() {
                super(zza.f29329d);
            }
        }

        static {
            zzffu zza = new zza();
            f29329d = zza;
            zza.mo7626a(C4479g.f16690f, null, null);
            zza.f28829b.m18929c();
        }

        private zza() {
        }

        /* renamed from: a */
        protected final Object mo7626a(int i, Object obj, Object obj2) {
            switch (ahx.f15283a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return f29329d;
                case 3:
                    return null;
                case 4:
                    return new C8194a();
                case 5:
                    return this;
                case 6:
                    abk abk = (abk) obj;
                    if (((abq) obj2) != null) {
                        Object obj3 = null;
                        while (obj3 == null) {
                            try {
                                int a = abk.mo4174a();
                                if (a == 0 || !m34113a(a, abk)) {
                                    obj3 = 1;
                                }
                            } catch (zzfge e) {
                                throw new RuntimeException(e.m20323a(this));
                            } catch (IOException e2) {
                                throw new RuntimeException(new zzfge(e2.getMessage()).m20323a(this));
                            }
                        }
                        break;
                    }
                    throw new NullPointerException();
                    break;
                case 7:
                    break;
                case 8:
                    if (f29330e == null) {
                        synchronized (zza.class) {
                            if (f29330e == null) {
                                f29330e = new C7363b(f29329d);
                            }
                        }
                    }
                    return f29330e;
                case 9:
                    return Byte.valueOf((byte) 1);
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return f29329d;
        }

        public final void zza(zzffg zzffg) throws IOException {
            this.b.m18926a(zzffg);
        }

        public final int zzho() {
            int i = this.c;
            if (i != -1) {
                return i;
            }
            i = this.b.m18931e() + 0;
            this.c = i;
            return i;
        }
    }
}
