package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.C3667a;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.scte35.C3669a;

public interface MetadataDecoderFactory {
    /* renamed from: a */
    public static final MetadataDecoderFactory f6129a = new C36661();

    /* renamed from: com.google.android.exoplayer2.metadata.MetadataDecoderFactory$1 */
    static class C36661 implements MetadataDecoderFactory {
        C36661() {
        }

        public boolean supportsFormat(Format format) {
            format = format.sampleMimeType;
            if (!("application/id3".equals(format) || "application/x-emsg".equals(format))) {
                if ("application/x-scte35".equals(format) == null) {
                    return null;
                }
            }
            return true;
        }

        public MetadataDecoder createDecoder(Format format) {
            format = format.sampleMimeType;
            int hashCode = format.hashCode();
            if (hashCode != -1248341703) {
                if (hashCode != 1154383568) {
                    if (hashCode == 1652648887) {
                        if (format.equals("application/x-scte35") != null) {
                            format = 2;
                            switch (format) {
                                case null:
                                    return new Id3Decoder();
                                case 1:
                                    return new C3667a();
                                case 2:
                                    return new C3669a();
                                default:
                                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
                            }
                        }
                    }
                } else if (format.equals("application/x-emsg") != null) {
                    format = true;
                    switch (format) {
                        case null:
                            return new Id3Decoder();
                        case 1:
                            return new C3667a();
                        case 2:
                            return new C3669a();
                        default:
                            throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
                    }
                }
            } else if (format.equals("application/id3") != null) {
                format = null;
                switch (format) {
                    case null:
                        return new Id3Decoder();
                    case 1:
                        return new C3667a();
                    case 2:
                        return new C3669a();
                    default:
                        throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
                }
            }
            format = -1;
            switch (format) {
                case null:
                    return new Id3Decoder();
                case 1:
                    return new C3667a();
                case 2:
                    return new C3669a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
