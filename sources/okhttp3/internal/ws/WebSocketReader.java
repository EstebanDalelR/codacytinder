package okhttp3.internal.ws;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.BufferedSource;
import okio.ByteString;
import okio.C18549c;
import okio.C18549c.C15975a;

final class WebSocketReader {
    /* renamed from: a */
    final boolean f49467a;
    /* renamed from: b */
    final BufferedSource f49468b;
    /* renamed from: c */
    final FrameCallback f49469c;
    /* renamed from: d */
    boolean f49470d;
    /* renamed from: e */
    int f49471e;
    /* renamed from: f */
    long f49472f;
    /* renamed from: g */
    boolean f49473g;
    /* renamed from: h */
    boolean f49474h;
    /* renamed from: i */
    private final C18549c f49475i = new C18549c();
    /* renamed from: j */
    private final C18549c f49476j = new C18549c();
    /* renamed from: k */
    private final byte[] f49477k;
    /* renamed from: l */
    private final C15975a f49478l;

    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;

        void onReadMessage(ByteString byteString) throws IOException;

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    WebSocketReader(boolean z, BufferedSource bufferedSource, FrameCallback frameCallback) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        } else if (frameCallback == null) {
            throw new NullPointerException("frameCallback == null");
        } else {
            this.f49467a = z;
            this.f49468b = bufferedSource;
            this.f49469c = frameCallback;
            bufferedSource = null;
            if (z) {
                frameCallback = null;
            } else {
                frameCallback = new byte[4];
            }
            this.f49477k = frameCallback;
            if (!z) {
                bufferedSource = new C15975a();
            }
            this.f49478l = bufferedSource;
        }
    }

    /* renamed from: a */
    void m60444a() throws IOException {
        m60439b();
        if (this.f49474h) {
            m60440c();
        } else {
            m60441d();
        }
    }

    /* renamed from: b */
    private void m60439b() throws IOException {
        if (this.f49470d) {
            throw new IOException("closed");
        }
        long n_ = this.f49468b.timeout().n_();
        this.f49468b.timeout().p_();
        try {
            int readByte = this.f49468b.readByte() & 255;
            this.f49473g = n_ != null;
            this.f49474h = (readByte & 8) != 0;
            if (!this.f49474h || this.f49473g) {
                Object obj = (readByte & 64) != 0 ? 1 : null;
                Object obj2 = (readByte & 32) != 0 ? 1 : null;
                Object obj3 = (readByte & 16) != 0 ? 1 : null;
                if (obj == null && obj2 == null) {
                    if (obj3 == null) {
                        int readByte2 = this.f49468b.readByte() & 255;
                        if ((readByte2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
                        }
                        if (true == this.f49467a) {
                            throw new ProtocolException(this.f49467a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                        }
                        this.f49472f = (long) (readByte2 & 127);
                        if (this.f49472f == 126) {
                            this.f49472f = ((long) this.f49468b.readShort()) & 65535;
                        } else if (this.f49472f == 127) {
                            this.f49472f = this.f49468b.readLong();
                            if (this.f49472f < 0) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Frame length 0x");
                                stringBuilder.append(Long.toHexString(this.f49472f));
                                stringBuilder.append(" > 0x7FFFFFFFFFFFFFFF");
                                throw new ProtocolException(stringBuilder.toString());
                            }
                        }
                        if (this.f49474h && this.f49472f > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        } else if (1 != null) {
                            this.f49468b.readFully(this.f49477k);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            throw new ProtocolException("Control frames must be final.");
        } finally {
            this.f49468b.timeout().mo13437a(n_, TimeUnit.NANOSECONDS);
        }
    }

    /* renamed from: c */
    private void m60440c() throws IOException {
        if (this.f49472f > 0) {
            this.f49468b.readFully(this.f49475i, this.f49472f);
            if (!this.f49467a) {
                this.f49475i.m66946a(this.f49478l);
                this.f49478l.m60607a(0);
                C15952b.m60446a(this.f49478l, this.f49477k);
                this.f49478l.close();
            }
        }
        switch (this.f49471e) {
            case 8:
                int i = 1005;
                String str = "";
                long a = this.f49475i.m66945a();
                if (a == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (a != 0) {
                    i = this.f49475i.readShort();
                    str = this.f49475i.readUtf8();
                    String a2 = C15952b.m60445a(i);
                    if (a2 != null) {
                        throw new ProtocolException(a2);
                    }
                }
                this.f49469c.onReadClose(i, str);
                this.f49470d = true;
                return;
            case 9:
                this.f49469c.onReadPing(this.f49475i.readByteString());
                return;
            case 10:
                this.f49469c.onReadPong(this.f49475i.readByteString());
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown control opcode: ");
                stringBuilder.append(Integer.toHexString(this.f49471e));
                throw new ProtocolException(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    private void m60441d() throws IOException {
        int i = this.f49471e;
        if (i == 1 || i == 2) {
            m60443f();
            if (i == 1) {
                this.f49469c.onReadMessage(this.f49476j.readUtf8());
                return;
            } else {
                this.f49469c.onReadMessage(this.f49476j.readByteString());
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown opcode: ");
        stringBuilder.append(Integer.toHexString(i));
        throw new ProtocolException(stringBuilder.toString());
    }

    /* renamed from: e */
    private void m60442e() throws IOException {
        while (!this.f49470d) {
            m60439b();
            if (this.f49474h) {
                m60440c();
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private void m60443f() throws IOException {
        while (!this.f49470d) {
            if (this.f49472f > 0) {
                this.f49468b.readFully(this.f49476j, this.f49472f);
                if (!this.f49467a) {
                    this.f49476j.m66946a(this.f49478l);
                    this.f49478l.m60607a(this.f49476j.m66945a() - this.f49472f);
                    C15952b.m60446a(this.f49478l, this.f49477k);
                    this.f49478l.close();
                }
            }
            if (!this.f49473g) {
                m60442e();
                if (this.f49471e != 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected continuation opcode. Got: ");
                    stringBuilder.append(Integer.toHexString(this.f49471e));
                    throw new ProtocolException(stringBuilder.toString());
                }
            }
            return;
        }
        throw new IOException("closed");
    }
}
