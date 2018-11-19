package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.C4243a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.metadata.MetadataDecoderException;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.a */
public final class C3669a implements MetadataDecoder {
    /* renamed from: a */
    private final C2302k f11335a = new C2302k();
    /* renamed from: b */
    private final C2301j f11336b = new C2301j();
    /* renamed from: c */
    private C2310s f11337c;

    public Metadata decode(C4243a c4243a) throws MetadataDecoderException {
        if (this.f11337c == null || c4243a.f13638d != this.f11337c.m8442c()) {
            this.f11337c = new C2310s(c4243a.c);
            this.f11337c.m8443c(c4243a.c - c4243a.f13638d);
        }
        c4243a = c4243a.b;
        byte[] array = c4243a.array();
        int limit = c4243a.limit();
        this.f11335a.m8383a(array, limit);
        this.f11336b.m8367a(array, limit);
        this.f11336b.m8370b(39);
        long c = (((long) this.f11336b.m8373c(1)) << 32) | ((long) this.f11336b.m8373c(32));
        this.f11336b.m8370b(20);
        c4243a = this.f11336b.m8373c(12);
        int c2 = this.f11336b.m8373c(8);
        TimeSignalCommand timeSignalCommand = null;
        this.f11335a.m8390d(14);
        if (c2 == 0) {
            timeSignalCommand = new SpliceNullCommand();
        } else if (c2 != 255) {
            switch (c2) {
                case 4:
                    timeSignalCommand = SpliceScheduleCommand.parseFromSection(this.f11335a);
                    break;
                case 5:
                    timeSignalCommand = SpliceInsertCommand.parseFromSection(this.f11335a, c, this.f11337c);
                    break;
                case 6:
                    timeSignalCommand = TimeSignalCommand.parseFromSection(this.f11335a, c, this.f11337c);
                    break;
                default:
                    break;
            }
        } else {
            timeSignalCommand = PrivateCommand.parseFromSection(this.f11335a, c4243a, c);
        }
        if (timeSignalCommand == null) {
            return new Metadata(new Entry[0]);
        }
        return new Metadata(timeSignalCommand);
    }
}
