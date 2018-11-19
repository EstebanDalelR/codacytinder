package com.mapbox.mapboxsdk.maps.renderer.egl;

import android.os.Build;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.utils.Compare;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import p000a.p001a.C0001a;

public class EGLConfigChooser implements android.opengl.GLSurfaceView.EGLConfigChooser {
    private static final int EGL_CONFORMANT = 12354;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private boolean translucentSurface;

    /* renamed from: com.mapbox.mapboxsdk.maps.renderer.egl.EGLConfigChooser$1Config */
    class AnonymousClass1Config implements Comparable<AnonymousClass1Config> {
        private final BufferFormat bufferFormat;
        private final EGLConfig config;
        private final DepthStencilFormat depthStencilFormat;
        private final int index;
        private final boolean isCaveat;
        private final boolean isNotConformant;

        public AnonymousClass1Config(BufferFormat bufferFormat, DepthStencilFormat depthStencilFormat, boolean z, boolean z2, int i, EGLConfig eGLConfig) {
            this.bufferFormat = bufferFormat;
            this.depthStencilFormat = depthStencilFormat;
            this.isNotConformant = z;
            this.isCaveat = z2;
            this.index = i;
            this.config = eGLConfig;
        }

        public int compareTo(@NonNull AnonymousClass1Config anonymousClass1Config) {
            int compare = Compare.compare(this.bufferFormat.value, anonymousClass1Config.bufferFormat.value);
            if (compare != 0) {
                return compare;
            }
            compare = Compare.compare(this.depthStencilFormat.value, anonymousClass1Config.depthStencilFormat.value);
            if (compare != 0) {
                return compare;
            }
            compare = Compare.compare(this.isNotConformant, anonymousClass1Config.isNotConformant);
            if (compare != 0) {
                return compare;
            }
            compare = Compare.compare(this.isCaveat, anonymousClass1Config.isCaveat);
            if (compare != 0) {
                return compare;
            }
            anonymousClass1Config = Compare.compare(this.index, anonymousClass1Config.index);
            return anonymousClass1Config != null ? anonymousClass1Config : null;
        }
    }

    enum BufferFormat {
        Format16Bit(3),
        Format32BitNoAlpha(1),
        Format32BitAlpha(2),
        Format24Bit(0),
        Unknown(4);
        
        int value;

        private BufferFormat(int i) {
            this.value = i;
        }
    }

    enum DepthStencilFormat {
        Format16Depth8Stencil(1),
        Format24Depth8Stencil(0);
        
        int value;

        private DepthStencilFormat(int i) {
            this.value = i;
        }
    }

    public EGLConfigChooser() {
        this(false);
    }

    public EGLConfigChooser(boolean z) {
        this.translucentSurface = z;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] configAttributes = getConfigAttributes();
        int[] numberOfConfigurations = getNumberOfConfigurations(egl10, eGLDisplay, configAttributes);
        if (numberOfConfigurations[0] < 1) {
            C0001a.e("eglChooseConfig() returned no configs.", new Object[0]);
            throw new EGLConfigException("eglChooseConfig() failed");
        }
        egl10 = chooseBestMatchConfig(egl10, eGLDisplay, getPossibleConfigurations(egl10, eGLDisplay, configAttributes, numberOfConfigurations));
        if (egl10 != null) {
            return egl10;
        }
        C0001a.e("No config chosen", new Object[0]);
        throw new EGLConfigException("No config chosen");
    }

    private int[] getNumberOfConfigurations(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr) {
        int[] iArr2 = new int[1];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2) != null) {
            return iArr2;
        }
        C0001a.e("eglChooseConfig(NULL) returned error %d", new Object[]{Integer.valueOf(egl10.eglGetError())});
        throw new EGLConfigException("eglChooseConfig() failed");
    }

    private EGLConfig[] getPossibleConfigurations(EGL10 egl10, EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
        EGLConfig[] eGLConfigArr = new EGLConfig[iArr2[0]];
        if (egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, iArr2[0], iArr2) != null) {
            return eGLConfigArr;
        }
        C0001a.e("eglChooseConfig() returned error %d", new Object[]{Integer.valueOf(egl10.eglGetError())});
        throw new EGLConfigException("eglChooseConfig() failed");
    }

    private EGLConfig chooseBestMatchConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        EGLConfigChooser eGLConfigChooser = this;
        EGL10 egl102 = egl10;
        EGLDisplay eGLDisplay2 = eGLDisplay;
        EGLConfig[] eGLConfigArr2 = eGLConfigArr;
        List arrayList = new ArrayList();
        int length = eGLConfigArr2.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            BufferFormat bufferFormat;
            BufferFormat bufferFormat2;
            DepthStencilFormat depthStencilFormat;
            DepthStencilFormat depthStencilFormat2;
            boolean z;
            boolean z2;
            EGLConfig eGLConfig = eGLConfigArr2[i2];
            int i4 = i + 1;
            i = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12327);
            int configAttr = getConfigAttr(egl102, eGLDisplay2, eGLConfig, EGL_CONFORMANT);
            int configAttr2 = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12320);
            int configAttr3 = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12324);
            int configAttr4 = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12323);
            int configAttr5 = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12322);
            int configAttr6 = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12321);
            getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12350);
            int configAttr7 = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12325);
            int configAttr8 = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12326);
            int i5 = length;
            length = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12338);
            int i6 = i2;
            i2 = getConfigAttr(egl102, eGLDisplay2, eGLConfig, 12337);
            if (configAttr7 != 24) {
                if (configAttr7 != 16) {
                    i3 = 0;
                    if ((((i3 & (configAttr8 != 8 ? 1 : 0)) & (length != 0 ? 1 : 0)) & (i2 != 0 ? 1 : 0)) == 0) {
                        if (configAttr2 != 16 && configAttr3 == 5 && configAttr4 == 6 && configAttr5 == 5 && configAttr6 == 0) {
                            bufferFormat = BufferFormat.Format16Bit;
                        } else if (configAttr2 != 32 && configAttr3 == 8 && configAttr4 == 8 && configAttr5 == 8 && configAttr6 == 0) {
                            bufferFormat = BufferFormat.Format32BitNoAlpha;
                        } else if (configAttr2 != 32 && configAttr3 == 8 && configAttr4 == 8 && configAttr5 == 8 && configAttr6 == 8) {
                            bufferFormat = BufferFormat.Format32BitAlpha;
                        } else if (configAttr2 != 24 && configAttr3 == 8 && configAttr4 == 8 && configAttr5 == 8 && configAttr6 == 0) {
                            bufferFormat = BufferFormat.Format24Bit;
                        } else {
                            bufferFormat = BufferFormat.Unknown;
                        }
                        bufferFormat2 = bufferFormat;
                        if (configAttr7 == 16 || configAttr8 != 8) {
                            depthStencilFormat = DepthStencilFormat.Format24Depth8Stencil;
                        } else {
                            depthStencilFormat = DepthStencilFormat.Format16Depth8Stencil;
                        }
                        depthStencilFormat2 = depthStencilFormat;
                        z = (configAttr & 4) == 4;
                        z2 = i == 12344;
                        if (bufferFormat2 != BufferFormat.Unknown) {
                            arrayList.add(new AnonymousClass1Config(bufferFormat2, depthStencilFormat2, z, z2, i4, eGLConfig));
                        }
                    }
                    i2 = i6 + 1;
                    i = i4;
                    length = i5;
                    egl102 = egl10;
                    eGLDisplay2 = eGLDisplay;
                    eGLConfigArr2 = eGLConfigArr;
                }
            }
            i3 = 1;
            if (configAttr8 != 8) {
            }
            if (length != 0) {
            }
            if (i2 != 0) {
            }
            if ((((i3 & (configAttr8 != 8 ? 1 : 0)) & (length != 0 ? 1 : 0)) & (i2 != 0 ? 1 : 0)) == 0) {
                if (configAttr2 != 16) {
                }
                if (configAttr2 != 32) {
                }
                if (configAttr2 != 32) {
                }
                if (configAttr2 != 24) {
                }
                bufferFormat = BufferFormat.Unknown;
                bufferFormat2 = bufferFormat;
                if (configAttr7 == 16) {
                }
                depthStencilFormat = DepthStencilFormat.Format24Depth8Stencil;
                depthStencilFormat2 = depthStencilFormat;
                if ((configAttr & 4) == 4) {
                }
                if (i == 12344) {
                }
                if (bufferFormat2 != BufferFormat.Unknown) {
                    arrayList.add(new AnonymousClass1Config(bufferFormat2, depthStencilFormat2, z, z2, i4, eGLConfig));
                }
            }
            i2 = i6 + 1;
            i = i4;
            length = i5;
            egl102 = egl10;
            eGLDisplay2 = eGLDisplay;
            eGLConfigArr2 = eGLConfigArr;
        }
        Collections.sort(arrayList);
        if (arrayList.size() == 0) {
            throw new EGLConfigException("No matching configurations after filtering");
        }
        AnonymousClass1Config anonymousClass1Config = (AnonymousClass1Config) arrayList.get(0);
        if (anonymousClass1Config.isCaveat) {
            C0001a.d("Chosen config has a caveat.", new Object[0]);
        }
        if (anonymousClass1Config.isNotConformant) {
            C0001a.d("Chosen config is not conformant.", new Object[0]);
        }
        return anonymousClass1Config.config;
    }

    private int getConfigAttr(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr) != null) {
            return iArr[0];
        }
        C0001a.e("eglGetConfigAttrib(%d) returned error %d", new Object[]{Integer.valueOf(i), Integer.valueOf(egl10.eglGetError())});
        throw new EGLConfigException("eglGetConfigAttrib() failed");
    }

    private int[] getConfigAttributes() {
        boolean z;
        int[] iArr;
        int i = 0;
        if (!inEmulator()) {
            if (!inGenymotion()) {
                z = false;
                C0001a.c("In emulator: %s", new Object[]{Boolean.valueOf(z)});
                iArr = new int[25];
                iArr[0] = 12327;
                iArr[1] = 12344;
                iArr[2] = 12339;
                iArr[3] = 4;
                iArr[4] = 12320;
                iArr[5] = 16;
                iArr[6] = 12324;
                iArr[7] = 5;
                iArr[8] = 12323;
                iArr[9] = 6;
                iArr[10] = 12322;
                iArr[11] = 5;
                iArr[12] = 12321;
                if (this.translucentSurface) {
                    i = 8;
                }
                iArr[13] = i;
                iArr[14] = 12325;
                iArr[15] = 16;
                iArr[16] = 12326;
                iArr[17] = 8;
                iArr[18] = z ? 12344 : EGL_CONFORMANT;
                iArr[19] = 4;
                iArr[20] = z ? 12344 : 12351;
                iArr[21] = 12430;
                iArr[22] = 12352;
                iArr[23] = 4;
                iArr[24] = 12344;
                return iArr;
            }
        }
        z = true;
        C0001a.c("In emulator: %s", new Object[]{Boolean.valueOf(z)});
        iArr = new int[25];
        iArr[0] = 12327;
        iArr[1] = 12344;
        iArr[2] = 12339;
        iArr[3] = 4;
        iArr[4] = 12320;
        iArr[5] = 16;
        iArr[6] = 12324;
        iArr[7] = 5;
        iArr[8] = 12323;
        iArr[9] = 6;
        iArr[10] = 12322;
        iArr[11] = 5;
        iArr[12] = 12321;
        if (this.translucentSurface) {
            i = 8;
        }
        iArr[13] = i;
        iArr[14] = 12325;
        iArr[15] = 16;
        iArr[16] = 12326;
        iArr[17] = 8;
        if (z) {
        }
        iArr[18] = z ? 12344 : EGL_CONFORMANT;
        iArr[19] = 4;
        if (z) {
        }
        iArr[20] = z ? 12344 : 12351;
        iArr[21] = 12430;
        iArr[22] = 12352;
        iArr[23] = 4;
        iArr[24] = 12344;
        return iArr;
    }

    private boolean inEmulator() {
        return System.getProperty("ro.kernel.qemu") != null;
    }

    private boolean inGenymotion() {
        return Build.MANUFACTURER.contains("Genymotion");
    }
}
