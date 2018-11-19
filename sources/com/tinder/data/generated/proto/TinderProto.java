package com.tinder.data.generated.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite.MergeFromVisitor;
import com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import com.google.protobuf.GeneratedMessageLite.Visitor;
import com.google.protobuf.Internal.ProtobufList;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class TinderProto {

    /* renamed from: com.tinder.data.generated.proto.TinderProto$1 */
    static /* synthetic */ class C86671 {
        /* renamed from: a */
        static final /* synthetic */ int[] f30521a = new int[MethodToInvoke.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values();
            r0 = r0.length;
            r0 = new int[r0];
            f30521a = r0;
            r0 = f30521a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f30521a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f30521a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f30521a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f30521a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.VISIT;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = f30521a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = f30521a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r0 = f30521a;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.1.<clinit>():void");
        }
    }

    public interface ActivityFeedImageOrBuilder extends MessageLiteOrBuilder {
        int getHeight();

        String getName();

        ByteString getNameBytes();

        String getUrl();

        ByteString getUrlBytes();

        int getWidth();

        boolean hasHeight();

        boolean hasName();

        boolean hasUrl();

        boolean hasWidth();
    }

    public interface ActivityFeedImagesOrBuilder extends MessageLiteOrBuilder {
        C14245a getImages(int i);

        int getImagesCount();

        List<C14245a> getImagesList();
    }

    public interface ActivityFeedJobOrBuilder extends MessageLiteOrBuilder {
        String getCompany();

        ByteString getCompanyBytes();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasCompany();

        boolean hasTitle();
    }

    public interface ActivityFeedJobsOrBuilder extends MessageLiteOrBuilder {
        C14249c getJob(int i);

        int getJobCount();

        List<C14249c> getJobList();
    }

    public interface ActivityFeedLoopOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();

        C14245a getThumbnailImages(int i);

        int getThumbnailImagesCount();

        List<C14245a> getThumbnailImagesList();

        C14265k getVideos(int i);

        int getVideosCount();

        List<C14265k> getVideosList();

        boolean hasId();
    }

    public interface ActivityFeedLoopsOrBuilder extends MessageLiteOrBuilder {
        C14253e getLoops(int i);

        int getLoopsCount();

        List<C14253e> getLoopsList();
    }

    public interface ActivityFeedPhotoOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();

        C14245a getImages(int i);

        int getImagesCount();

        List<C14245a> getImagesList();

        C14265k getVideos(int i);

        int getVideosCount();

        List<C14265k> getVideosList();

        boolean hasId();
    }

    public interface ActivityFeedPhotosOrBuilder extends MessageLiteOrBuilder {
        C14257g getPhotos(int i);

        int getPhotosCount();

        List<C14257g> getPhotosList();
    }

    public interface ActivityFeedSchoolOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        String getType();

        ByteString getTypeBytes();

        String getYear();

        ByteString getYearBytes();

        boolean hasName();

        boolean hasType();

        boolean hasYear();
    }

    public interface ActivityFeedSchoolsOrBuilder extends MessageLiteOrBuilder {
        C14261i getSchools(int i);

        int getSchoolsCount();

        List<C14261i> getSchoolsList();
    }

    public interface ActivityFeedVideoOrBuilder extends MessageLiteOrBuilder {
        int getHeight();

        String getName();

        ByteString getNameBytes();

        String getUrl();

        ByteString getUrlBytes();

        int getWidth();

        boolean hasHeight();

        boolean hasName();

        boolean hasUrl();

        boolean hasWidth();
    }

    public interface BadgeOrBuilder extends MessageLiteOrBuilder {
        String getColor();

        ByteString getColorBytes();

        String getDescription();

        ByteString getDescriptionBytes();

        String getType();

        ByteString getTypeBytes();

        boolean hasColor();

        boolean hasDescription();

        boolean hasType();
    }

    public interface BadgesOrBuilder extends MessageLiteOrBuilder {
        C14267l getBadges(int i);

        int getBadgesCount();

        List<C14267l> getBadgesList();
    }

    public interface GenderOrBuilder extends MessageLiteOrBuilder {
        String getCustomGender();

        ByteString getCustomGenderBytes();

        int getGender();

        boolean hasCustomGender();

        boolean hasGender();
    }

    public interface InstagramMediaOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();

        C14245a getImages(int i);

        int getImagesCount();

        List<C14245a> getImagesList();

        C14265k getVideos(int i);

        int getVideosCount();

        List<C14265k> getVideosList();

        boolean hasId();
    }

    public interface InstagramMediasOrBuilder extends MessageLiteOrBuilder {
        C14273o getMedias(int i);

        int getMediasCount();

        List<C14273o> getMediasList();
    }

    public interface JobOrBuilder extends MessageLiteOrBuilder {
        boolean getCompanyDisplayed();

        String getCompanyId();

        ByteString getCompanyIdBytes();

        String getCompanyName();

        ByteString getCompanyNameBytes();

        boolean getTitleDisplayed();

        String getTitleId();

        ByteString getTitleIdBytes();

        String getTitleName();

        ByteString getTitleNameBytes();

        boolean hasCompanyDisplayed();

        boolean hasCompanyId();

        boolean hasCompanyName();

        boolean hasTitleDisplayed();

        boolean hasTitleId();

        boolean hasTitleName();
    }

    public interface JobsOrBuilder extends MessageLiteOrBuilder {
        C14277q getJobs(int i);

        int getJobsCount();

        List<C14277q> getJobsList();
    }

    public interface PhotoOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();

        C14243b getRenders(int i);

        int getRendersCount();

        List<C14243b> getRendersList();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasId();

        boolean hasUrl();
    }

    public interface PhotosOrBuilder extends MessageLiteOrBuilder {
        Photo getPhotos(int i);

        int getPhotosCount();

        List<Photo> getPhotosList();
    }

    public interface SchoolOrBuilder extends MessageLiteOrBuilder {
        boolean getDisplayed();

        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        boolean hasDisplayed();

        boolean hasId();

        boolean hasName();
    }

    public interface SchoolsOrBuilder extends MessageLiteOrBuilder {
        C14283t getSchools(int i);

        int getSchoolsCount();

        List<C14283t> getSchoolsList();
    }

    public interface TagOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();

        String getName();

        ByteString getNameBytes();

        String getRegion();

        ByteString getRegionBytes();

        boolean hasId();

        boolean hasName();

        boolean hasRegion();
    }

    public interface TagsOrBuilder extends MessageLiteOrBuilder {
        C14287v getTags(int i);

        int getTagsCount();

        List<C14287v> getTagsList();
    }

    public static final class Photo extends GeneratedMessageLite<Photo, C14241a> implements PhotoOrBuilder {
        /* renamed from: f */
        private static final Photo f45140f;
        /* renamed from: g */
        private static volatile Parser<Photo> f45141g;
        /* renamed from: a */
        private int f45142a;
        /* renamed from: b */
        private String f45143b = "";
        /* renamed from: c */
        private ProtobufList<C14243b> f45144c = emptyProtobufList();
        /* renamed from: d */
        private String f45145d = "";
        /* renamed from: e */
        private byte f45146e = (byte) -1;

        public interface RenderOrBuilder extends MessageLiteOrBuilder {
            int getHeight();

            String getUrl();

            ByteString getUrlBytes();

            int getWidth();

            boolean hasHeight();

            boolean hasUrl();

            boolean hasWidth();
        }

        /* renamed from: com.tinder.data.generated.proto.TinderProto$Photo$a */
        public static final class C14241a extends Builder<Photo, C14241a> implements PhotoOrBuilder {
            private C14241a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = com.tinder.data.generated.proto.TinderProto.Photo.f45140f;
                r1.<init>(r0);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.<init>():void");
            }

            public boolean hasUrl() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0 = r0.hasUrl();
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.hasUrl():boolean");
            }

            public java.lang.String getUrl() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0 = r0.getUrl();
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.getUrl():java.lang.String");
            }

            public com.google.protobuf.ByteString getUrlBytes() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0 = r0.getUrlBytes();
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.getUrlBytes():com.google.protobuf.ByteString");
            }

            /* renamed from: a */
            public com.tinder.data.generated.proto.TinderProto.Photo.C14241a m54068a(java.lang.String r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r1.copyOnWrite();
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0.m54086a(r2);
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.a(java.lang.String):com.tinder.data.generated.proto.TinderProto$Photo$a");
            }

            public java.util.List<com.tinder.data.generated.proto.TinderProto.Photo.C14243b> getRendersList() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0 = r0.getRendersList();
                r0 = java.util.Collections.unmodifiableList(r0);
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.getRendersList():java.util.List<com.tinder.data.generated.proto.TinderProto$Photo$b>");
            }

            public int getRendersCount() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0 = r0.getRendersCount();
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.getRendersCount():int");
            }

            public com.tinder.data.generated.proto.TinderProto.Photo.C14243b getRenders(int r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r2 = r0.getRenders(r2);
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.getRenders(int):com.tinder.data.generated.proto.TinderProto$Photo$b");
            }

            /* renamed from: a */
            public com.tinder.data.generated.proto.TinderProto.Photo.C14241a m54067a(com.tinder.data.generated.proto.TinderProto.Photo.C14243b.C14242a r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r1.copyOnWrite();
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0.m54083a(r2);
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.a(com.tinder.data.generated.proto.TinderProto$Photo$b$a):com.tinder.data.generated.proto.TinderProto$Photo$a");
            }

            public boolean hasId() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0 = r0.hasId();
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.hasId():boolean");
            }

            public java.lang.String getId() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0 = r0.getId();
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.getId():java.lang.String");
            }

            public com.google.protobuf.ByteString getIdBytes() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0 = r0.getIdBytes();
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.getIdBytes():com.google.protobuf.ByteString");
            }

            /* renamed from: b */
            public com.tinder.data.generated.proto.TinderProto.Photo.C14241a m54069b(java.lang.String r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r1.copyOnWrite();
                r0 = r1.instance;
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo) r0;
                r0.m54089b(r2);
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a.b(java.lang.String):com.tinder.data.generated.proto.TinderProto$Photo$a");
            }
        }

        /* renamed from: com.tinder.data.generated.proto.TinderProto$Photo$b */
        public static final class C14243b extends GeneratedMessageLite<C14243b, C14242a> implements RenderOrBuilder {
            /* renamed from: f */
            private static final C14243b f45133f;
            /* renamed from: g */
            private static volatile Parser<C14243b> f45134g;
            /* renamed from: a */
            private int f45135a;
            /* renamed from: b */
            private int f45136b;
            /* renamed from: c */
            private int f45137c;
            /* renamed from: d */
            private String f45138d = "";
            /* renamed from: e */
            private byte f45139e = (byte) -1;

            /* renamed from: com.tinder.data.generated.proto.TinderProto$Photo$b$a */
            public static final class C14242a extends Builder<C14243b, C14242a> implements RenderOrBuilder {
                private C14242a() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = com.tinder.data.generated.proto.TinderProto.Photo.C14243b.f45133f;
                    r1.<init>(r0);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.<init>():void");
                }

                public boolean hasWidth() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0 = r0.hasWidth();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.hasWidth():boolean");
                }

                public int getWidth() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0 = r0.getWidth();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.getWidth():int");
                }

                /* renamed from: a */
                public com.tinder.data.generated.proto.TinderProto.Photo.C14243b.C14242a m54070a(int r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r1.copyOnWrite();
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0.m54074a(r2);
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.a(int):com.tinder.data.generated.proto.TinderProto$Photo$b$a");
                }

                public boolean hasHeight() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0 = r0.hasHeight();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.hasHeight():boolean");
                }

                public int getHeight() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0 = r0.getHeight();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.getHeight():int");
                }

                /* renamed from: b */
                public com.tinder.data.generated.proto.TinderProto.Photo.C14243b.C14242a m54072b(int r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r1.copyOnWrite();
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0.m54079b(r2);
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.b(int):com.tinder.data.generated.proto.TinderProto$Photo$b$a");
                }

                public boolean hasUrl() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0 = r0.hasUrl();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.hasUrl():boolean");
                }

                public java.lang.String getUrl() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0 = r0.getUrl();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.getUrl():java.lang.String");
                }

                public com.google.protobuf.ByteString getUrlBytes() {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0 = r0.getUrlBytes();
                    return r0;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.getUrlBytes():com.google.protobuf.ByteString");
                }

                /* renamed from: a */
                public com.tinder.data.generated.proto.TinderProto.Photo.C14243b.C14242a m54071a(java.lang.String r2) {
                    /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                    /*
                    r1 = this;
                    r1.copyOnWrite();
                    r0 = r1.instance;
                    r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r0;
                    r0.m54077a(r2);
                    return r1;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a.a(java.lang.String):com.tinder.data.generated.proto.TinderProto$Photo$b$a");
                }
            }

            private C14243b() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r1.<init>();
                r0 = -1;
                r1.f45139e = r0;
                r0 = "";
                r1.f45138d = r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.<init>():void");
            }

            public boolean hasWidth() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r2 = this;
                r0 = r2.f45135a;
                r1 = 1;
                r0 = r0 & r1;
                if (r0 != r1) goto L_0x0007;
            L_0x0006:
                goto L_0x0008;
            L_0x0007:
                r1 = 0;
            L_0x0008:
                return r1;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.hasWidth():boolean");
            }

            public int getWidth() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.f45136b;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.getWidth():int");
            }

            /* renamed from: a */
            private void m54074a(int r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.f45135a;
                r0 = r0 | 1;
                r1.f45135a = r0;
                r1.f45136b = r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a(int):void");
            }

            public boolean hasHeight() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r2 = this;
                r0 = r2.f45135a;
                r1 = 2;
                r0 = r0 & r1;
                if (r0 != r1) goto L_0x0008;
            L_0x0006:
                r0 = 1;
                goto L_0x0009;
            L_0x0008:
                r0 = 0;
            L_0x0009:
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.hasHeight():boolean");
            }

            public int getHeight() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.f45137c;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.getHeight():int");
            }

            /* renamed from: b */
            private void m54079b(int r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.f45135a;
                r0 = r0 | 2;
                r1.f45135a = r0;
                r1.f45137c = r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.b(int):void");
            }

            public boolean hasUrl() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r2 = this;
                r0 = r2.f45135a;
                r1 = 4;
                r0 = r0 & r1;
                if (r0 != r1) goto L_0x0008;
            L_0x0006:
                r0 = 1;
                goto L_0x0009;
            L_0x0008:
                r0 = 0;
            L_0x0009:
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.hasUrl():boolean");
            }

            public java.lang.String getUrl() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.f45138d;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.getUrl():java.lang.String");
            }

            public com.google.protobuf.ByteString getUrlBytes() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                r0 = r1.f45138d;
                r0 = com.google.protobuf.ByteString.copyFromUtf8(r0);
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.getUrlBytes():com.google.protobuf.ByteString");
            }

            /* renamed from: a */
            private void m54077a(java.lang.String r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r1 = this;
                if (r2 != 0) goto L_0x0008;
            L_0x0002:
                r2 = new java.lang.NullPointerException;
                r2.<init>();
                throw r2;
            L_0x0008:
                r0 = r1.f45135a;
                r0 = r0 | 4;
                r1.f45135a = r0;
                r1.f45138d = r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a(java.lang.String):void");
            }

            public void writeTo(com.google.protobuf.CodedOutputStream r3) throws java.io.IOException {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r2 = this;
                r0 = r2.f45135a;
                r1 = 1;
                r0 = r0 & r1;
                if (r0 != r1) goto L_0x000b;
            L_0x0006:
                r0 = r2.f45136b;
                r3.writeInt32(r1, r0);
            L_0x000b:
                r0 = r2.f45135a;
                r1 = 2;
                r0 = r0 & r1;
                if (r0 != r1) goto L_0x0016;
            L_0x0011:
                r0 = r2.f45137c;
                r3.writeInt32(r1, r0);
            L_0x0016:
                r0 = r2.f45135a;
                r1 = 4;
                r0 = r0 & r1;
                if (r0 != r1) goto L_0x0024;
            L_0x001c:
                r0 = 3;
                r1 = r2.getUrl();
                r3.writeString(r0, r1);
            L_0x0024:
                r0 = r2.unknownFields;
                r0.writeTo(r3);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.writeTo(com.google.protobuf.CodedOutputStream):void");
            }

            public int getSerializedSize() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r3 = this;
                r0 = r3.memoizedSerializedSize;
                r1 = -1;
                if (r0 == r1) goto L_0x0006;
            L_0x0005:
                return r0;
            L_0x0006:
                r0 = 0;
                r1 = r3.f45135a;
                r2 = 1;
                r1 = r1 & r2;
                if (r1 != r2) goto L_0x0014;
            L_0x000d:
                r1 = r3.f45136b;
                r1 = com.google.protobuf.CodedOutputStream.computeInt32Size(r2, r1);
                r0 = r0 + r1;
            L_0x0014:
                r1 = r3.f45135a;
                r2 = 2;
                r1 = r1 & r2;
                if (r1 != r2) goto L_0x0021;
            L_0x001a:
                r1 = r3.f45137c;
                r1 = com.google.protobuf.CodedOutputStream.computeInt32Size(r2, r1);
                r0 = r0 + r1;
            L_0x0021:
                r1 = r3.f45135a;
                r2 = 4;
                r1 = r1 & r2;
                if (r1 != r2) goto L_0x0031;
            L_0x0027:
                r1 = 3;
                r2 = r3.getUrl();
                r1 = com.google.protobuf.CodedOutputStream.computeStringSize(r1, r2);
                r0 = r0 + r1;
            L_0x0031:
                r1 = r3.unknownFields;
                r1 = r1.getSerializedSize();
                r0 = r0 + r1;
                r3.memoizedSerializedSize = r0;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.getSerializedSize():int");
            }

            /* renamed from: a */
            public static com.tinder.data.generated.proto.TinderProto.Photo.C14243b.C14242a m54073a() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r0 = f45133f;
                r0 = r0.toBuilder();
                r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b.C14242a) r0;
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.a():com.tinder.data.generated.proto.TinderProto$Photo$b$a");
            }

            protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke r4, java.lang.Object r5, java.lang.Object r6) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r3 = this;
                r0 = com.tinder.data.generated.proto.TinderProto.C86671.f30521a;
                r4 = r4.ordinal();
                r4 = r0[r4];
                r0 = 0;
                r1 = 1;
                r2 = 0;
                switch(r4) {
                    case 1: goto L_0x0121;
                    case 2: goto L_0x00e9;
                    case 3: goto L_0x00e8;
                    case 4: goto L_0x00e2;
                    case 5: goto L_0x009c;
                    case 6: goto L_0x0030;
                    case 7: goto L_0x0099;
                    case 8: goto L_0x0014;
                    default: goto L_0x000e;
                };
            L_0x000e:
                r4 = new java.lang.UnsupportedOperationException;
                r4.<init>();
                throw r4;
            L_0x0014:
                r4 = f45134g;
                if (r4 != 0) goto L_0x002d;
            L_0x0018:
                r4 = com.tinder.data.generated.proto.TinderProto.Photo.C14243b.class;
                monitor-enter(r4);
                r5 = f45134g;
                if (r5 != 0) goto L_0x0028;
            L_0x001f:
                r5 = new com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
                r6 = f45133f;
                r5.<init>(r6);
                f45134g = r5;
            L_0x0028:
                monitor-exit(r4);
                goto L_0x002d;
            L_0x002a:
                r5 = move-exception;
                monitor-exit(r4);
                throw r5;
            L_0x002d:
                r4 = f45134g;
                return r4;
            L_0x0030:
                r5 = (com.google.protobuf.CodedInputStream) r5;
                r6 = (com.google.protobuf.ExtensionRegistryLite) r6;
            L_0x0034:
                if (r0 != 0) goto L_0x0099;
            L_0x0036:
                r4 = r5.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                if (r4 == 0) goto L_0x0075;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x003c:
                r6 = 8;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                if (r4 == r6) goto L_0x0069;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x0040:
                r6 = 16;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                if (r4 == r6) goto L_0x005c;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x0044:
                r6 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                if (r4 == r6) goto L_0x004f;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x0048:
                r4 = r3.parseUnknownField(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                if (r4 != 0) goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x004e:
                goto L_0x0075;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x004f:
                r4 = r5.readString();	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r6 = r3.f45135a;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r6 = r6 | 4;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r3.f45135a = r6;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r3.f45138d = r4;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x005c:
                r4 = r3.f45135a;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r4 = r4 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r3.f45135a = r4;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r4 = r5.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r3.f45137c = r4;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x0069:
                r4 = r3.f45135a;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r4 = r4 | r1;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r3.f45135a = r4;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r4 = r5.readInt32();	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r3.f45136b = r4;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                goto L_0x0034;
            L_0x0075:
                r0 = 1;
                goto L_0x0034;
            L_0x0077:
                r4 = move-exception;
                goto L_0x0098;
            L_0x0079:
                r4 = move-exception;
                r5 = new java.lang.RuntimeException;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r6 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r4 = r4.getMessage();	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r6.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r4 = r6.setUnfinishedMessage(r3);	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r5.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                throw r5;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x008d:
                r4 = move-exception;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r5 = new java.lang.RuntimeException;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r4 = r4.setUnfinishedMessage(r3);	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                r5.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
                throw r5;	 Catch:{ InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079, InvalidProtocolBufferException -> 0x008d, IOException -> 0x0079 }
            L_0x0098:
                throw r4;
            L_0x0099:
                r4 = f45133f;
                return r4;
            L_0x009c:
                r5 = (com.google.protobuf.GeneratedMessageLite.Visitor) r5;
                r6 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r6;
                r4 = r3.hasWidth();
                r0 = r3.f45136b;
                r1 = r6.hasWidth();
                r2 = r6.f45136b;
                r4 = r5.visitInt(r4, r0, r1, r2);
                r3.f45136b = r4;
                r4 = r3.hasHeight();
                r0 = r3.f45137c;
                r1 = r6.hasHeight();
                r2 = r6.f45137c;
                r4 = r5.visitInt(r4, r0, r1, r2);
                r3.f45137c = r4;
                r4 = r3.hasUrl();
                r0 = r3.f45138d;
                r1 = r6.hasUrl();
                r2 = r6.f45138d;
                r4 = r5.visitString(r4, r0, r1, r2);
                r3.f45138d = r4;
                r4 = com.google.protobuf.GeneratedMessageLite.MergeFromVisitor.INSTANCE;
                if (r5 != r4) goto L_0x00e1;
            L_0x00da:
                r4 = r3.f45135a;
                r5 = r6.f45135a;
                r4 = r4 | r5;
                r3.f45135a = r4;
            L_0x00e1:
                return r3;
            L_0x00e2:
                r4 = new com.tinder.data.generated.proto.TinderProto$Photo$b$a;
                r4.<init>(r2);
                return r4;
            L_0x00e8:
                return r2;
            L_0x00e9:
                r4 = r3.f45139e;
                if (r4 != r1) goto L_0x00f0;
            L_0x00ed:
                r4 = f45133f;
                return r4;
            L_0x00f0:
                if (r4 != 0) goto L_0x00f3;
            L_0x00f2:
                return r2;
            L_0x00f3:
                r5 = (java.lang.Boolean) r5;
                r4 = r5.booleanValue();
                r5 = r3.hasWidth();
                if (r5 != 0) goto L_0x0104;
            L_0x00ff:
                if (r4 == 0) goto L_0x0103;
            L_0x0101:
                r3.f45139e = r0;
            L_0x0103:
                return r2;
            L_0x0104:
                r5 = r3.hasHeight();
                if (r5 != 0) goto L_0x010f;
            L_0x010a:
                if (r4 == 0) goto L_0x010e;
            L_0x010c:
                r3.f45139e = r0;
            L_0x010e:
                return r2;
            L_0x010f:
                r5 = r3.hasUrl();
                if (r5 != 0) goto L_0x011a;
            L_0x0115:
                if (r4 == 0) goto L_0x0119;
            L_0x0117:
                r3.f45139e = r0;
            L_0x0119:
                return r2;
            L_0x011a:
                if (r4 == 0) goto L_0x011e;
            L_0x011c:
                r3.f45139e = r1;
            L_0x011e:
                r4 = f45133f;
                return r4;
            L_0x0121:
                r4 = new com.tinder.data.generated.proto.TinderProto$Photo$b;
                r4.<init>();
                return r4;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
            }

            static {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r0 = new com.tinder.data.generated.proto.TinderProto$Photo$b;
                r0.<init>();
                f45133f = r0;
                r0 = f45133f;
                r0.makeImmutable();
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.<clinit>():void");
            }

            /* renamed from: b */
            public static com.google.protobuf.Parser<com.tinder.data.generated.proto.TinderProto.Photo.C14243b> m54078b() {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r0 = f45133f;
                r0 = r0.getParserForType();
                return r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b.b():com.google.protobuf.Parser<com.tinder.data.generated.proto.TinderProto$Photo$b>");
            }
        }

        private Photo() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r1.<init>();
            r0 = -1;
            r1.f45146e = r0;
            r0 = "";
            r1.f45143b = r0;
            r0 = emptyProtobufList();
            r1.f45144c = r0;
            r0 = "";
            r1.f45145d = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.<init>():void");
        }

        public boolean hasUrl() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f45142a;
            r1 = 1;
            r0 = r0 & r1;
            if (r0 != r1) goto L_0x0007;
        L_0x0006:
            goto L_0x0008;
        L_0x0007:
            r1 = 0;
        L_0x0008:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.hasUrl():boolean");
        }

        public java.lang.String getUrl() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f45143b;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.getUrl():java.lang.String");
        }

        public com.google.protobuf.ByteString getUrlBytes() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f45143b;
            r0 = com.google.protobuf.ByteString.copyFromUtf8(r0);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.getUrlBytes():com.google.protobuf.ByteString");
        }

        /* renamed from: a */
        private void m54086a(java.lang.String r2) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            if (r2 != 0) goto L_0x0008;
        L_0x0002:
            r2 = new java.lang.NullPointerException;
            r2.<init>();
            throw r2;
        L_0x0008:
            r0 = r1.f45142a;
            r0 = r0 | 1;
            r1.f45142a = r0;
            r1.f45143b = r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a(java.lang.String):void");
        }

        public java.util.List<com.tinder.data.generated.proto.TinderProto.Photo.C14243b> getRendersList() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f45144c;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.getRendersList():java.util.List<com.tinder.data.generated.proto.TinderProto$Photo$b>");
        }

        public int getRendersCount() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f45144c;
            r0 = r0.size();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.getRendersCount():int");
        }

        public com.tinder.data.generated.proto.TinderProto.Photo.C14243b getRenders(int r2) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f45144c;
            r2 = r0.get(r2);
            r2 = (com.tinder.data.generated.proto.TinderProto.Photo.C14243b) r2;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.getRenders(int):com.tinder.data.generated.proto.TinderProto$Photo$b");
        }

        /* renamed from: d */
        private void m54091d() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f45144c;
            r0 = r0.isModifiable();
            if (r0 != 0) goto L_0x0010;
        L_0x0008:
            r0 = r1.f45144c;
            r0 = com.google.protobuf.GeneratedMessageLite.mutableCopy(r0);
            r1.f45144c = r0;
        L_0x0010:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.d():void");
        }

        /* renamed from: a */
        private void m54083a(com.tinder.data.generated.proto.TinderProto.Photo.C14243b.C14242a r2) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r1.m54091d();
            r0 = r1.f45144c;
            r2 = r2.build();
            r0.add(r2);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a(com.tinder.data.generated.proto.TinderProto$Photo$b$a):void");
        }

        public boolean hasId() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r2 = this;
            r0 = r2.f45142a;
            r1 = 2;
            r0 = r0 & r1;
            if (r0 != r1) goto L_0x0008;
        L_0x0006:
            r0 = 1;
            goto L_0x0009;
        L_0x0008:
            r0 = 0;
        L_0x0009:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.hasId():boolean");
        }

        public java.lang.String getId() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f45145d;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.getId():java.lang.String");
        }

        public com.google.protobuf.ByteString getIdBytes() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f45145d;
            r0 = com.google.protobuf.ByteString.copyFromUtf8(r0);
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.getIdBytes():com.google.protobuf.ByteString");
        }

        /* renamed from: b */
        private void m54089b(java.lang.String r2) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r1 = this;
            if (r2 != 0) goto L_0x0008;
        L_0x0002:
            r2 = new java.lang.NullPointerException;
            r2.<init>();
            throw r2;
        L_0x0008:
            r0 = r1.f45142a;
            r0 = r0 | 2;
            r1.f45142a = r0;
            r1.f45145d = r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b(java.lang.String):void");
        }

        public void writeTo(com.google.protobuf.CodedOutputStream r4) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = r3.f45142a;
            r1 = 1;
            r0 = r0 & r1;
            if (r0 != r1) goto L_0x000d;
        L_0x0006:
            r0 = r3.getUrl();
            r4.writeString(r1, r0);
        L_0x000d:
            r0 = 0;
        L_0x000e:
            r1 = r3.f45144c;
            r1 = r1.size();
            r2 = 2;
            if (r0 >= r1) goto L_0x0025;
        L_0x0017:
            r1 = r3.f45144c;
            r1 = r1.get(r0);
            r1 = (com.google.protobuf.MessageLite) r1;
            r4.writeMessage(r2, r1);
            r0 = r0 + 1;
            goto L_0x000e;
        L_0x0025:
            r0 = r3.f45142a;
            r0 = r0 & r2;
            if (r0 != r2) goto L_0x0032;
        L_0x002a:
            r0 = 3;
            r1 = r3.getId();
            r4.writeString(r0, r1);
        L_0x0032:
            r0 = r3.unknownFields;
            r0.writeTo(r4);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.writeTo(com.google.protobuf.CodedOutputStream):void");
        }

        public int getSerializedSize() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = r4.memoizedSerializedSize;
            r1 = -1;
            if (r0 == r1) goto L_0x0006;
        L_0x0005:
            return r0;
        L_0x0006:
            r0 = r4.f45142a;
            r1 = 1;
            r0 = r0 & r1;
            r2 = 0;
            if (r0 != r1) goto L_0x0017;
        L_0x000d:
            r0 = r4.getUrl();
            r0 = com.google.protobuf.CodedOutputStream.computeStringSize(r1, r0);
            r0 = r0 + r2;
            goto L_0x0018;
        L_0x0017:
            r0 = 0;
        L_0x0018:
            r1 = r4.f45144c;
            r1 = r1.size();
            r3 = 2;
            if (r2 >= r1) goto L_0x0031;
        L_0x0021:
            r1 = r4.f45144c;
            r1 = r1.get(r2);
            r1 = (com.google.protobuf.MessageLite) r1;
            r1 = com.google.protobuf.CodedOutputStream.computeMessageSize(r3, r1);
            r0 = r0 + r1;
            r2 = r2 + 1;
            goto L_0x0018;
        L_0x0031:
            r1 = r4.f45142a;
            r1 = r1 & r3;
            if (r1 != r3) goto L_0x0040;
        L_0x0036:
            r1 = 3;
            r2 = r4.getId();
            r1 = com.google.protobuf.CodedOutputStream.computeStringSize(r1, r2);
            r0 = r0 + r1;
        L_0x0040:
            r1 = r4.unknownFields;
            r1 = r1.getSerializedSize();
            r0 = r0 + r1;
            r4.memoizedSerializedSize = r0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.getSerializedSize():int");
        }

        /* renamed from: a */
        public static com.tinder.data.generated.proto.TinderProto.Photo.C14241a m54082a() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = f45140f;
            r0 = r0.toBuilder();
            r0 = (com.tinder.data.generated.proto.TinderProto.Photo.C14241a) r0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.a():com.tinder.data.generated.proto.TinderProto$Photo$a");
        }

        protected final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke r4, java.lang.Object r5, java.lang.Object r6) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = com.tinder.data.generated.proto.TinderProto.C86671.f30521a;
            r4 = r4.ordinal();
            r4 = r0[r4];
            r0 = 0;
            r1 = 0;
            r2 = 1;
            switch(r4) {
                case 1: goto L_0x013d;
                case 2: goto L_0x00f7;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00eb;
                case 5: goto L_0x00ad;
                case 6: goto L_0x0030;
                case 7: goto L_0x00aa;
                case 8: goto L_0x0014;
                default: goto L_0x000e;
            };
        L_0x000e:
            r4 = new java.lang.UnsupportedOperationException;
            r4.<init>();
            throw r4;
        L_0x0014:
            r4 = f45141g;
            if (r4 != 0) goto L_0x002d;
        L_0x0018:
            r4 = com.tinder.data.generated.proto.TinderProto.Photo.class;
            monitor-enter(r4);
            r5 = f45141g;
            if (r5 != 0) goto L_0x0028;
        L_0x001f:
            r5 = new com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
            r6 = f45140f;
            r5.<init>(r6);
            f45141g = r5;
        L_0x0028:
            monitor-exit(r4);
            goto L_0x002d;
        L_0x002a:
            r5 = move-exception;
            monitor-exit(r4);
            throw r5;
        L_0x002d:
            r4 = f45141g;
            return r4;
        L_0x0030:
            r5 = (com.google.protobuf.CodedInputStream) r5;
            r6 = (com.google.protobuf.ExtensionRegistryLite) r6;
        L_0x0034:
            if (r0 != 0) goto L_0x00aa;
        L_0x0036:
            r4 = r5.readTag();	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            if (r4 == 0) goto L_0x0086;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x003c:
            r1 = 10;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            if (r4 == r1) goto L_0x007a;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x0040:
            r1 = 18;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            if (r4 == r1) goto L_0x005c;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x0044:
            r1 = 26;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            if (r4 == r1) goto L_0x004f;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x0048:
            r4 = r3.parseUnknownField(r4, r5);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            if (r4 != 0) goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x004e:
            goto L_0x0086;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x004f:
            r4 = r5.readString();	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r1 = r3.f45142a;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r1 = r1 | 2;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r3.f45142a = r1;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r3.f45145d = r4;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x005c:
            r4 = r3.f45144c;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r4 = r4.isModifiable();	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            if (r4 != 0) goto L_0x006c;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x0064:
            r4 = r3.f45144c;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r4 = com.google.protobuf.GeneratedMessageLite.mutableCopy(r4);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r3.f45144c = r4;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x006c:
            r4 = r3.f45144c;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r1 = com.tinder.data.generated.proto.TinderProto.Photo.C14243b.m54078b();	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r1 = r5.readMessage(r1, r6);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r4.add(r1);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            goto L_0x0034;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x007a:
            r4 = r5.readString();	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r1 = r3.f45142a;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r1 = r1 | r2;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r3.f45142a = r1;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r3.f45143b = r4;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            goto L_0x0034;
        L_0x0086:
            r0 = 1;
            goto L_0x0034;
        L_0x0088:
            r4 = move-exception;
            goto L_0x00a9;
        L_0x008a:
            r4 = move-exception;
            r5 = new java.lang.RuntimeException;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r6 = new com.google.protobuf.InvalidProtocolBufferException;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r4 = r4.getMessage();	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r6.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r4 = r6.setUnfinishedMessage(r3);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r5.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            throw r5;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x009e:
            r4 = move-exception;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r5 = new java.lang.RuntimeException;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r4 = r4.setUnfinishedMessage(r3);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            r5.<init>(r4);	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
            throw r5;	 Catch:{ InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a, InvalidProtocolBufferException -> 0x009e, IOException -> 0x008a }
        L_0x00a9:
            throw r4;
        L_0x00aa:
            r4 = f45140f;
            return r4;
        L_0x00ad:
            r5 = (com.google.protobuf.GeneratedMessageLite.Visitor) r5;
            r6 = (com.tinder.data.generated.proto.TinderProto.Photo) r6;
            r4 = r3.hasUrl();
            r0 = r3.f45143b;
            r1 = r6.hasUrl();
            r2 = r6.f45143b;
            r4 = r5.visitString(r4, r0, r1, r2);
            r3.f45143b = r4;
            r4 = r3.f45144c;
            r0 = r6.f45144c;
            r4 = r5.visitList(r4, r0);
            r3.f45144c = r4;
            r4 = r3.hasId();
            r0 = r3.f45145d;
            r1 = r6.hasId();
            r2 = r6.f45145d;
            r4 = r5.visitString(r4, r0, r1, r2);
            r3.f45145d = r4;
            r4 = com.google.protobuf.GeneratedMessageLite.MergeFromVisitor.INSTANCE;
            if (r5 != r4) goto L_0x00ea;
        L_0x00e3:
            r4 = r3.f45142a;
            r5 = r6.f45142a;
            r4 = r4 | r5;
            r3.f45142a = r4;
        L_0x00ea:
            return r3;
        L_0x00eb:
            r4 = new com.tinder.data.generated.proto.TinderProto$Photo$a;
            r4.<init>(r1);
            return r4;
        L_0x00f1:
            r4 = r3.f45144c;
            r4.makeImmutable();
            return r1;
        L_0x00f7:
            r4 = r3.f45146e;
            if (r4 != r2) goto L_0x00fe;
        L_0x00fb:
            r4 = f45140f;
            return r4;
        L_0x00fe:
            if (r4 != 0) goto L_0x0101;
        L_0x0100:
            return r1;
        L_0x0101:
            r5 = (java.lang.Boolean) r5;
            r4 = r5.booleanValue();
            r5 = r3.hasUrl();
            if (r5 != 0) goto L_0x0112;
        L_0x010d:
            if (r4 == 0) goto L_0x0111;
        L_0x010f:
            r3.f45146e = r0;
        L_0x0111:
            return r1;
        L_0x0112:
            r5 = r3.hasId();
            if (r5 != 0) goto L_0x011d;
        L_0x0118:
            if (r4 == 0) goto L_0x011c;
        L_0x011a:
            r3.f45146e = r0;
        L_0x011c:
            return r1;
        L_0x011d:
            r5 = 0;
        L_0x011e:
            r6 = r3.getRendersCount();
            if (r5 >= r6) goto L_0x0136;
        L_0x0124:
            r6 = r3.getRenders(r5);
            r6 = r6.isInitialized();
            if (r6 != 0) goto L_0x0133;
        L_0x012e:
            if (r4 == 0) goto L_0x0132;
        L_0x0130:
            r3.f45146e = r0;
        L_0x0132:
            return r1;
        L_0x0133:
            r5 = r5 + 1;
            goto L_0x011e;
        L_0x0136:
            if (r4 == 0) goto L_0x013a;
        L_0x0138:
            r3.f45146e = r2;
        L_0x013a:
            r4 = f45140f;
            return r4;
        L_0x013d:
            r4 = new com.tinder.data.generated.proto.TinderProto$Photo;
            r4.<init>();
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.dynamicMethod(com.google.protobuf.GeneratedMessageLite$MethodToInvoke, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        static {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = new com.tinder.data.generated.proto.TinderProto$Photo;
            r0.<init>();
            f45140f = r0;
            r0 = f45140f;
            r0.makeImmutable();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.<clinit>():void");
        }

        /* renamed from: b */
        public static com.google.protobuf.Parser<com.tinder.data.generated.proto.TinderProto.Photo> m54087b() {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: SSA rename variables already executed
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:120)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = f45140f;
            r0 = r0.getParserForType();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.generated.proto.TinderProto.Photo.b():com.google.protobuf.Parser<com.tinder.data.generated.proto.TinderProto$Photo>");
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$a */
    public static final class C14245a extends GeneratedMessageLite<C14245a, C14244a> implements ActivityFeedImageOrBuilder {
        /* renamed from: g */
        private static final C14245a f45147g = new C14245a();
        /* renamed from: h */
        private static volatile Parser<C14245a> f45148h;
        /* renamed from: a */
        private int f45149a;
        /* renamed from: b */
        private String f45150b = "";
        /* renamed from: c */
        private String f45151c = "";
        /* renamed from: d */
        private int f45152d;
        /* renamed from: e */
        private int f45153e;
        /* renamed from: f */
        private byte f45154f = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$a$a */
        public static final class C14244a extends Builder<C14245a, C14244a> implements ActivityFeedImageOrBuilder {
            private C14244a() {
                super(C14245a.f45147g);
            }

            public boolean hasName() {
                return ((C14245a) this.instance).hasName();
            }

            public String getName() {
                return ((C14245a) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((C14245a) this.instance).getNameBytes();
            }

            /* renamed from: a */
            public C14244a m54093a(String str) {
                copyOnWrite();
                ((C14245a) this.instance).m54100a(str);
                return this;
            }

            public boolean hasUrl() {
                return ((C14245a) this.instance).hasUrl();
            }

            public String getUrl() {
                return ((C14245a) this.instance).getUrl();
            }

            public ByteString getUrlBytes() {
                return ((C14245a) this.instance).getUrlBytes();
            }

            /* renamed from: b */
            public C14244a m54095b(String str) {
                copyOnWrite();
                ((C14245a) this.instance).m54105b(str);
                return this;
            }

            public boolean hasWidth() {
                return ((C14245a) this.instance).hasWidth();
            }

            public int getWidth() {
                return ((C14245a) this.instance).getWidth();
            }

            /* renamed from: a */
            public C14244a m54092a(int i) {
                copyOnWrite();
                ((C14245a) this.instance).m54097a(i);
                return this;
            }

            public boolean hasHeight() {
                return ((C14245a) this.instance).hasHeight();
            }

            public int getHeight() {
                return ((C14245a) this.instance).getHeight();
            }

            /* renamed from: b */
            public C14244a m54094b(int i) {
                copyOnWrite();
                ((C14245a) this.instance).m54102b(i);
                return this;
            }
        }

        private C14245a() {
        }

        public boolean hasName() {
            return (this.f45149a & 1) == 1;
        }

        public String getName() {
            return this.f45150b;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.f45150b);
        }

        /* renamed from: a */
        private void m54100a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45149a |= 1;
            this.f45150b = str;
        }

        public boolean hasUrl() {
            return (this.f45149a & 2) == 2;
        }

        public String getUrl() {
            return this.f45151c;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.f45151c);
        }

        /* renamed from: b */
        private void m54105b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45149a |= 2;
            this.f45151c = str;
        }

        public boolean hasWidth() {
            return (this.f45149a & 4) == 4;
        }

        public int getWidth() {
            return this.f45152d;
        }

        /* renamed from: a */
        private void m54097a(int i) {
            this.f45149a |= 4;
            this.f45152d = i;
        }

        public boolean hasHeight() {
            return (this.f45149a & 8) == 8;
        }

        public int getHeight() {
            return this.f45153e;
        }

        /* renamed from: b */
        private void m54102b(int i) {
            this.f45149a |= 8;
            this.f45153e = i;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45149a & 1) == 1) {
                codedOutputStream.writeString(1, getName());
            }
            if ((this.f45149a & 2) == 2) {
                codedOutputStream.writeString(2, getUrl());
            }
            if ((this.f45149a & 4) == 4) {
                codedOutputStream.writeInt32(3, this.f45152d);
            }
            if ((this.f45149a & 8) == 8) {
                codedOutputStream.writeInt32(4, this.f45153e);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45149a & 1) == 1) {
                i = 0 + CodedOutputStream.computeStringSize(1, getName());
            }
            if ((this.f45149a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getUrl());
            }
            if ((this.f45149a & 4) == 4) {
                i += CodedOutputStream.computeInt32Size(3, this.f45152d);
            }
            if ((this.f45149a & 8) == 8) {
                i += CodedOutputStream.computeInt32Size(4, this.f45153e);
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14244a m54096a() {
            return (C14244a) f45147g.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14245a();
                case 2:
                    methodToInvoke = this.f45154f;
                    if (methodToInvoke == 1) {
                        return f45147g;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasName() == null) {
                        if (methodToInvoke != null) {
                            this.f45154f = (byte) 0;
                        }
                        return null;
                    } else if (hasUrl() == null) {
                        if (methodToInvoke != null) {
                            this.f45154f = (byte) 0;
                        }
                        return null;
                    } else if (hasWidth() == null) {
                        if (methodToInvoke != null) {
                            this.f45154f = (byte) 0;
                        }
                        return null;
                    } else if (hasHeight() == null) {
                        if (methodToInvoke != null) {
                            this.f45154f = (byte) 0;
                        }
                        return null;
                    } else {
                        if (methodToInvoke != null) {
                            this.f45154f = (byte) 1;
                        }
                        return f45147g;
                    }
                case 3:
                    return null;
                case 4:
                    return new C14244a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14245a c14245a = (C14245a) obj2;
                    this.f45150b = visitor.visitString(hasName(), this.f45150b, c14245a.hasName(), c14245a.f45150b);
                    this.f45151c = visitor.visitString(hasUrl(), this.f45151c, c14245a.hasUrl(), c14245a.f45151c);
                    this.f45152d = visitor.visitInt(hasWidth(), this.f45152d, c14245a.hasWidth(), c14245a.f45152d);
                    this.f45153e = visitor.visitInt(hasHeight(), this.f45153e, c14245a.hasHeight(), c14245a.f45153e);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45149a |= c14245a.f45149a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45149a |= 1;
                                    this.f45150b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45149a |= 2;
                                    this.f45151c = methodToInvoke;
                                } else if (methodToInvoke == 24) {
                                    this.f45149a |= 4;
                                    this.f45152d = codedInputStream.readInt32();
                                } else if (methodToInvoke == 32) {
                                    this.f45149a |= 8;
                                    this.f45153e = codedInputStream.readInt32();
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45148h == null) {
                        synchronized (C14245a.class) {
                            if (f45148h == null) {
                                f45148h = new DefaultInstanceBasedParser(f45147g);
                            }
                        }
                    }
                    return f45148h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45147g;
        }

        static {
            f45147g.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14245a> m54101b() {
            return f45147g.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$b */
    public static final class C14247b extends GeneratedMessageLite<C14247b, C14246a> implements ActivityFeedImagesOrBuilder {
        /* renamed from: c */
        private static final C14247b f45155c = new C14247b();
        /* renamed from: d */
        private static volatile Parser<C14247b> f45156d;
        /* renamed from: a */
        private ProtobufList<C14245a> f45157a = C14247b.emptyProtobufList();
        /* renamed from: b */
        private byte f45158b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$b$a */
        public static final class C14246a extends Builder<C14247b, C14246a> implements ActivityFeedImagesOrBuilder {
            private C14246a() {
                super(C14247b.f45155c);
            }

            public List<C14245a> getImagesList() {
                return Collections.unmodifiableList(((C14247b) this.instance).getImagesList());
            }

            public int getImagesCount() {
                return ((C14247b) this.instance).getImagesCount();
            }

            public C14245a getImages(int i) {
                return ((C14247b) this.instance).getImages(i);
            }

            /* renamed from: a */
            public C14246a m54107a(Iterable<? extends C14245a> iterable) {
                copyOnWrite();
                ((C14247b) this.instance).m54111a((Iterable) iterable);
                return this;
            }
        }

        private C14247b() {
        }

        public List<C14245a> getImagesList() {
            return this.f45157a;
        }

        public int getImagesCount() {
            return this.f45157a.size();
        }

        public C14245a getImages(int i) {
            return (C14245a) this.f45157a.get(i);
        }

        /* renamed from: c */
        private void m54113c() {
            if (!this.f45157a.isModifiable()) {
                this.f45157a = GeneratedMessageLite.mutableCopy(this.f45157a);
            }
        }

        /* renamed from: a */
        private void m54111a(Iterable<? extends C14245a> iterable) {
            m54113c();
            AbstractMessageLite.addAll(iterable, this.f45157a);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45157a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45157a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45157a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45157a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14247b m54109a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14247b) GeneratedMessageLite.parseFrom(f45155c, bArr);
        }

        /* renamed from: a */
        public static C14246a m54108a() {
            return (C14246a) f45155c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14247b();
                case 2:
                    methodToInvoke = this.f45158b;
                    if (methodToInvoke == 1) {
                        return f45155c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getImagesCount(); obj++) {
                        if (getImages(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45158b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45158b = (byte) 1;
                    }
                    return f45155c;
                case 3:
                    this.f45157a.makeImmutable();
                    return null;
                case 4:
                    return new C14246a();
                case 5:
                    this.f45157a = ((Visitor) obj).visitList(this.f45157a, ((C14247b) obj2).f45157a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45157a.isModifiable() == null) {
                                        this.f45157a = GeneratedMessageLite.mutableCopy(this.f45157a);
                                    }
                                    this.f45157a.add(codedInputStream.readMessage(C14245a.m54101b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45156d == null) {
                        synchronized (C14247b.class) {
                            if (f45156d == null) {
                                f45156d = new DefaultInstanceBasedParser(f45155c);
                            }
                        }
                    }
                    return f45156d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45155c;
        }

        static {
            f45155c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$c */
    public static final class C14249c extends GeneratedMessageLite<C14249c, C14248a> implements ActivityFeedJobOrBuilder {
        /* renamed from: e */
        private static final C14249c f45159e = new C14249c();
        /* renamed from: f */
        private static volatile Parser<C14249c> f45160f;
        /* renamed from: a */
        private int f45161a;
        /* renamed from: b */
        private String f45162b = "";
        /* renamed from: c */
        private String f45163c = "";
        /* renamed from: d */
        private byte f45164d = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$c$a */
        public static final class C14248a extends Builder<C14249c, C14248a> implements ActivityFeedJobOrBuilder {
            private C14248a() {
                super(C14249c.f45159e);
            }

            public boolean hasCompany() {
                return ((C14249c) this.instance).hasCompany();
            }

            public String getCompany() {
                return ((C14249c) this.instance).getCompany();
            }

            public ByteString getCompanyBytes() {
                return ((C14249c) this.instance).getCompanyBytes();
            }

            /* renamed from: a */
            public C14248a m54114a(String str) {
                copyOnWrite();
                ((C14249c) this.instance).m54118a(str);
                return this;
            }

            public boolean hasTitle() {
                return ((C14249c) this.instance).hasTitle();
            }

            public String getTitle() {
                return ((C14249c) this.instance).getTitle();
            }

            public ByteString getTitleBytes() {
                return ((C14249c) this.instance).getTitleBytes();
            }

            /* renamed from: b */
            public C14248a m54115b(String str) {
                copyOnWrite();
                ((C14249c) this.instance).m54121b(str);
                return this;
            }
        }

        private C14249c() {
        }

        public boolean hasCompany() {
            return (this.f45161a & 1) == 1;
        }

        public String getCompany() {
            return this.f45162b;
        }

        public ByteString getCompanyBytes() {
            return ByteString.copyFromUtf8(this.f45162b);
        }

        /* renamed from: a */
        private void m54118a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45161a |= 1;
            this.f45162b = str;
        }

        public boolean hasTitle() {
            return (this.f45161a & 2) == 2;
        }

        public String getTitle() {
            return this.f45163c;
        }

        public ByteString getTitleBytes() {
            return ByteString.copyFromUtf8(this.f45163c);
        }

        /* renamed from: b */
        private void m54121b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45161a |= 2;
            this.f45163c = str;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45161a & 1) == 1) {
                codedOutputStream.writeString(1, getCompany());
            }
            if ((this.f45161a & 2) == 2) {
                codedOutputStream.writeString(2, getTitle());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45161a & 1) == 1) {
                i = 0 + CodedOutputStream.computeStringSize(1, getCompany());
            }
            if ((this.f45161a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getTitle());
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14248a m54116a() {
            return (C14248a) f45159e.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14249c();
                case 2:
                    methodToInvoke = this.f45164d;
                    if (methodToInvoke == 1) {
                        return f45159e;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasCompany() == null) {
                        if (methodToInvoke != null) {
                            this.f45164d = (byte) 0;
                        }
                        return null;
                    } else if (hasTitle() == null) {
                        if (methodToInvoke != null) {
                            this.f45164d = (byte) 0;
                        }
                        return null;
                    } else {
                        if (methodToInvoke != null) {
                            this.f45164d = (byte) 1;
                        }
                        return f45159e;
                    }
                case 3:
                    return null;
                case 4:
                    return new C14248a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14249c c14249c = (C14249c) obj2;
                    this.f45162b = visitor.visitString(hasCompany(), this.f45162b, c14249c.hasCompany(), c14249c.f45162b);
                    this.f45163c = visitor.visitString(hasTitle(), this.f45163c, c14249c.hasTitle(), c14249c.f45163c);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45161a |= c14249c.f45161a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45161a |= 1;
                                    this.f45162b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45161a |= 2;
                                    this.f45163c = methodToInvoke;
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45160f == null) {
                        synchronized (C14249c.class) {
                            if (f45160f == null) {
                                f45160f = new DefaultInstanceBasedParser(f45159e);
                            }
                        }
                    }
                    return f45160f;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45159e;
        }

        static {
            f45159e.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14249c> m54119b() {
            return f45159e.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$d */
    public static final class C14251d extends GeneratedMessageLite<C14251d, C14250a> implements ActivityFeedJobsOrBuilder {
        /* renamed from: c */
        private static final C14251d f45165c = new C14251d();
        /* renamed from: d */
        private static volatile Parser<C14251d> f45166d;
        /* renamed from: a */
        private ProtobufList<C14249c> f45167a = C14251d.emptyProtobufList();
        /* renamed from: b */
        private byte f45168b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$d$a */
        public static final class C14250a extends Builder<C14251d, C14250a> implements ActivityFeedJobsOrBuilder {
            private C14250a() {
                super(C14251d.f45165c);
            }

            public List<C14249c> getJobList() {
                return Collections.unmodifiableList(((C14251d) this.instance).getJobList());
            }

            public int getJobCount() {
                return ((C14251d) this.instance).getJobCount();
            }

            public C14249c getJob(int i) {
                return ((C14251d) this.instance).getJob(i);
            }

            /* renamed from: a */
            public C14250a m54123a(Iterable<? extends C14249c> iterable) {
                copyOnWrite();
                ((C14251d) this.instance).m54127a((Iterable) iterable);
                return this;
            }
        }

        private C14251d() {
        }

        public List<C14249c> getJobList() {
            return this.f45167a;
        }

        public int getJobCount() {
            return this.f45167a.size();
        }

        public C14249c getJob(int i) {
            return (C14249c) this.f45167a.get(i);
        }

        /* renamed from: c */
        private void m54129c() {
            if (!this.f45167a.isModifiable()) {
                this.f45167a = GeneratedMessageLite.mutableCopy(this.f45167a);
            }
        }

        /* renamed from: a */
        private void m54127a(Iterable<? extends C14249c> iterable) {
            m54129c();
            AbstractMessageLite.addAll(iterable, this.f45167a);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45167a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45167a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45167a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45167a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14251d m54125a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14251d) GeneratedMessageLite.parseFrom(f45165c, bArr);
        }

        /* renamed from: a */
        public static C14250a m54124a() {
            return (C14250a) f45165c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14251d();
                case 2:
                    methodToInvoke = this.f45168b;
                    if (methodToInvoke == 1) {
                        return f45165c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getJobCount(); obj++) {
                        if (getJob(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45168b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45168b = (byte) 1;
                    }
                    return f45165c;
                case 3:
                    this.f45167a.makeImmutable();
                    return null;
                case 4:
                    return new C14250a();
                case 5:
                    this.f45167a = ((Visitor) obj).visitList(this.f45167a, ((C14251d) obj2).f45167a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45167a.isModifiable() == null) {
                                        this.f45167a = GeneratedMessageLite.mutableCopy(this.f45167a);
                                    }
                                    this.f45167a.add(codedInputStream.readMessage(C14249c.m54119b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45166d == null) {
                        synchronized (C14251d.class) {
                            if (f45166d == null) {
                                f45166d = new DefaultInstanceBasedParser(f45165c);
                            }
                        }
                    }
                    return f45166d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45165c;
        }

        static {
            f45165c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$e */
    public static final class C14253e extends GeneratedMessageLite<C14253e, C14252a> implements ActivityFeedLoopOrBuilder {
        /* renamed from: f */
        private static final C14253e f45169f = new C14253e();
        /* renamed from: g */
        private static volatile Parser<C14253e> f45170g;
        /* renamed from: a */
        private int f45171a;
        /* renamed from: b */
        private String f45172b = "";
        /* renamed from: c */
        private ProtobufList<C14245a> f45173c = C14253e.emptyProtobufList();
        /* renamed from: d */
        private ProtobufList<C14265k> f45174d = C14253e.emptyProtobufList();
        /* renamed from: e */
        private byte f45175e = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$e$a */
        public static final class C14252a extends Builder<C14253e, C14252a> implements ActivityFeedLoopOrBuilder {
            private C14252a() {
                super(C14253e.f45169f);
            }

            public boolean hasId() {
                return ((C14253e) this.instance).hasId();
            }

            public String getId() {
                return ((C14253e) this.instance).getId();
            }

            public ByteString getIdBytes() {
                return ((C14253e) this.instance).getIdBytes();
            }

            /* renamed from: a */
            public C14252a m54131a(String str) {
                copyOnWrite();
                ((C14253e) this.instance).m54137a(str);
                return this;
            }

            public List<C14245a> getThumbnailImagesList() {
                return Collections.unmodifiableList(((C14253e) this.instance).getThumbnailImagesList());
            }

            public int getThumbnailImagesCount() {
                return ((C14253e) this.instance).getThumbnailImagesCount();
            }

            public C14245a getThumbnailImages(int i) {
                return ((C14253e) this.instance).getThumbnailImages(i);
            }

            /* renamed from: a */
            public C14252a m54130a(Iterable<? extends C14245a> iterable) {
                copyOnWrite();
                ((C14253e) this.instance).m54136a((Iterable) iterable);
                return this;
            }

            public List<C14265k> getVideosList() {
                return Collections.unmodifiableList(((C14253e) this.instance).getVideosList());
            }

            public int getVideosCount() {
                return ((C14253e) this.instance).getVideosCount();
            }

            public C14265k getVideos(int i) {
                return ((C14253e) this.instance).getVideos(i);
            }

            /* renamed from: b */
            public C14252a m54132b(Iterable<? extends C14265k> iterable) {
                copyOnWrite();
                ((C14253e) this.instance).m54140b(iterable);
                return this;
            }
        }

        private C14253e() {
        }

        public boolean hasId() {
            return (this.f45171a & 1) == 1;
        }

        public String getId() {
            return this.f45172b;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.f45172b);
        }

        /* renamed from: a */
        private void m54137a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45171a |= 1;
            this.f45172b = str;
        }

        public List<C14245a> getThumbnailImagesList() {
            return this.f45173c;
        }

        public int getThumbnailImagesCount() {
            return this.f45173c.size();
        }

        public C14245a getThumbnailImages(int i) {
            return (C14245a) this.f45173c.get(i);
        }

        /* renamed from: d */
        private void m54142d() {
            if (!this.f45173c.isModifiable()) {
                this.f45173c = GeneratedMessageLite.mutableCopy(this.f45173c);
            }
        }

        /* renamed from: a */
        private void m54136a(Iterable<? extends C14245a> iterable) {
            m54142d();
            AbstractMessageLite.addAll(iterable, this.f45173c);
        }

        public List<C14265k> getVideosList() {
            return this.f45174d;
        }

        public int getVideosCount() {
            return this.f45174d.size();
        }

        public C14265k getVideos(int i) {
            return (C14265k) this.f45174d.get(i);
        }

        /* renamed from: e */
        private void m54143e() {
            if (!this.f45174d.isModifiable()) {
                this.f45174d = GeneratedMessageLite.mutableCopy(this.f45174d);
            }
        }

        /* renamed from: b */
        private void m54140b(Iterable<? extends C14265k> iterable) {
            m54143e();
            AbstractMessageLite.addAll(iterable, this.f45174d);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45171a & 1) == 1) {
                codedOutputStream.writeString(1, getId());
            }
            for (int i = 0; i < this.f45173c.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f45173c.get(i));
            }
            for (int i2 = 0; i2 < this.f45174d.size(); i2++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f45174d.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int computeStringSize = (this.f45171a & 1) == 1 ? CodedOutputStream.computeStringSize(1, getId()) + 0 : 0;
            for (i = 0; i < this.f45173c.size(); i++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f45173c.get(i));
            }
            while (i2 < this.f45174d.size()) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f45174d.get(i2));
                i2++;
            }
            computeStringSize += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = computeStringSize;
            return computeStringSize;
        }

        /* renamed from: a */
        public static C14252a m54133a() {
            return (C14252a) f45169f.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14253e();
                case 2:
                    methodToInvoke = this.f45175e;
                    if (methodToInvoke == 1) {
                        return f45169f;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasId() == null) {
                        if (methodToInvoke != null) {
                            this.f45175e = (byte) 0;
                        }
                        return null;
                    }
                    for (obj = null; obj < getThumbnailImagesCount(); obj++) {
                        if (getThumbnailImages(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45175e = (byte) 0;
                            }
                            return null;
                        }
                    }
                    for (obj = null; obj < getVideosCount(); obj++) {
                        if (getVideos(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45175e = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45175e = (byte) 1;
                    }
                    return f45169f;
                case 3:
                    this.f45173c.makeImmutable();
                    this.f45174d.makeImmutable();
                    return null;
                case 4:
                    return new C14252a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14253e c14253e = (C14253e) obj2;
                    this.f45172b = visitor.visitString(hasId(), this.f45172b, c14253e.hasId(), c14253e.f45172b);
                    this.f45173c = visitor.visitList(this.f45173c, c14253e.f45173c);
                    this.f45174d = visitor.visitList(this.f45174d, c14253e.f45174d);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45171a |= c14253e.f45171a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45171a |= 1;
                                    this.f45172b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    if (this.f45173c.isModifiable() == null) {
                                        this.f45173c = GeneratedMessageLite.mutableCopy(this.f45173c);
                                    }
                                    this.f45173c.add(codedInputStream.readMessage(C14245a.m54101b(), extensionRegistryLite));
                                } else if (methodToInvoke == 26) {
                                    if (this.f45174d.isModifiable() == null) {
                                        this.f45174d = GeneratedMessageLite.mutableCopy(this.f45174d);
                                    }
                                    this.f45174d.add(codedInputStream.readMessage(C14265k.m54200b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45170g == null) {
                        synchronized (C14253e.class) {
                            if (f45170g == null) {
                                f45170g = new DefaultInstanceBasedParser(f45169f);
                            }
                        }
                    }
                    return f45170g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45169f;
        }

        static {
            f45169f.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14253e> m54138b() {
            return f45169f.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$f */
    public static final class C14255f extends GeneratedMessageLite<C14255f, C14254a> implements ActivityFeedLoopsOrBuilder {
        /* renamed from: c */
        private static final C14255f f45176c = new C14255f();
        /* renamed from: d */
        private static volatile Parser<C14255f> f45177d;
        /* renamed from: a */
        private ProtobufList<C14253e> f45178a = C14255f.emptyProtobufList();
        /* renamed from: b */
        private byte f45179b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$f$a */
        public static final class C14254a extends Builder<C14255f, C14254a> implements ActivityFeedLoopsOrBuilder {
            private C14254a() {
                super(C14255f.f45176c);
            }

            public List<C14253e> getLoopsList() {
                return Collections.unmodifiableList(((C14255f) this.instance).getLoopsList());
            }

            public int getLoopsCount() {
                return ((C14255f) this.instance).getLoopsCount();
            }

            public C14253e getLoops(int i) {
                return ((C14255f) this.instance).getLoops(i);
            }

            /* renamed from: a */
            public C14254a m54144a(Iterable<? extends C14253e> iterable) {
                copyOnWrite();
                ((C14255f) this.instance).m54148a((Iterable) iterable);
                return this;
            }
        }

        private C14255f() {
        }

        public List<C14253e> getLoopsList() {
            return this.f45178a;
        }

        public int getLoopsCount() {
            return this.f45178a.size();
        }

        public C14253e getLoops(int i) {
            return (C14253e) this.f45178a.get(i);
        }

        /* renamed from: c */
        private void m54150c() {
            if (!this.f45178a.isModifiable()) {
                this.f45178a = GeneratedMessageLite.mutableCopy(this.f45178a);
            }
        }

        /* renamed from: a */
        private void m54148a(Iterable<? extends C14253e> iterable) {
            m54150c();
            AbstractMessageLite.addAll(iterable, this.f45178a);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45178a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45178a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45178a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45178a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14255f m54146a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14255f) GeneratedMessageLite.parseFrom(f45176c, bArr);
        }

        /* renamed from: a */
        public static C14254a m54145a() {
            return (C14254a) f45176c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14255f();
                case 2:
                    methodToInvoke = this.f45179b;
                    if (methodToInvoke == 1) {
                        return f45176c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getLoopsCount(); obj++) {
                        if (getLoops(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45179b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45179b = (byte) 1;
                    }
                    return f45176c;
                case 3:
                    this.f45178a.makeImmutable();
                    return null;
                case 4:
                    return new C14254a();
                case 5:
                    this.f45178a = ((Visitor) obj).visitList(this.f45178a, ((C14255f) obj2).f45178a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45178a.isModifiable() == null) {
                                        this.f45178a = GeneratedMessageLite.mutableCopy(this.f45178a);
                                    }
                                    this.f45178a.add(codedInputStream.readMessage(C14253e.m54138b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45177d == null) {
                        synchronized (C14255f.class) {
                            if (f45177d == null) {
                                f45177d = new DefaultInstanceBasedParser(f45176c);
                            }
                        }
                    }
                    return f45177d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45176c;
        }

        static {
            f45176c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$g */
    public static final class C14257g extends GeneratedMessageLite<C14257g, C14256a> implements ActivityFeedPhotoOrBuilder {
        /* renamed from: f */
        private static final C14257g f45180f = new C14257g();
        /* renamed from: g */
        private static volatile Parser<C14257g> f45181g;
        /* renamed from: a */
        private int f45182a;
        /* renamed from: b */
        private String f45183b = "";
        /* renamed from: c */
        private ProtobufList<C14245a> f45184c = C14257g.emptyProtobufList();
        /* renamed from: d */
        private ProtobufList<C14265k> f45185d = C14257g.emptyProtobufList();
        /* renamed from: e */
        private byte f45186e = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$g$a */
        public static final class C14256a extends Builder<C14257g, C14256a> implements ActivityFeedPhotoOrBuilder {
            private C14256a() {
                super(C14257g.f45180f);
            }

            public boolean hasId() {
                return ((C14257g) this.instance).hasId();
            }

            public String getId() {
                return ((C14257g) this.instance).getId();
            }

            public ByteString getIdBytes() {
                return ((C14257g) this.instance).getIdBytes();
            }

            /* renamed from: a */
            public C14256a m54152a(String str) {
                copyOnWrite();
                ((C14257g) this.instance).m54158a(str);
                return this;
            }

            public List<C14245a> getImagesList() {
                return Collections.unmodifiableList(((C14257g) this.instance).getImagesList());
            }

            public int getImagesCount() {
                return ((C14257g) this.instance).getImagesCount();
            }

            public C14245a getImages(int i) {
                return ((C14257g) this.instance).getImages(i);
            }

            /* renamed from: a */
            public C14256a m54151a(Iterable<? extends C14245a> iterable) {
                copyOnWrite();
                ((C14257g) this.instance).m54157a((Iterable) iterable);
                return this;
            }

            public List<C14265k> getVideosList() {
                return Collections.unmodifiableList(((C14257g) this.instance).getVideosList());
            }

            public int getVideosCount() {
                return ((C14257g) this.instance).getVideosCount();
            }

            public C14265k getVideos(int i) {
                return ((C14257g) this.instance).getVideos(i);
            }

            /* renamed from: b */
            public C14256a m54153b(Iterable<? extends C14265k> iterable) {
                copyOnWrite();
                ((C14257g) this.instance).m54161b(iterable);
                return this;
            }
        }

        private C14257g() {
        }

        public boolean hasId() {
            return (this.f45182a & 1) == 1;
        }

        public String getId() {
            return this.f45183b;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.f45183b);
        }

        /* renamed from: a */
        private void m54158a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45182a |= 1;
            this.f45183b = str;
        }

        public List<C14245a> getImagesList() {
            return this.f45184c;
        }

        public int getImagesCount() {
            return this.f45184c.size();
        }

        public C14245a getImages(int i) {
            return (C14245a) this.f45184c.get(i);
        }

        /* renamed from: d */
        private void m54163d() {
            if (!this.f45184c.isModifiable()) {
                this.f45184c = GeneratedMessageLite.mutableCopy(this.f45184c);
            }
        }

        /* renamed from: a */
        private void m54157a(Iterable<? extends C14245a> iterable) {
            m54163d();
            AbstractMessageLite.addAll(iterable, this.f45184c);
        }

        public List<C14265k> getVideosList() {
            return this.f45185d;
        }

        public int getVideosCount() {
            return this.f45185d.size();
        }

        public C14265k getVideos(int i) {
            return (C14265k) this.f45185d.get(i);
        }

        /* renamed from: e */
        private void m54164e() {
            if (!this.f45185d.isModifiable()) {
                this.f45185d = GeneratedMessageLite.mutableCopy(this.f45185d);
            }
        }

        /* renamed from: b */
        private void m54161b(Iterable<? extends C14265k> iterable) {
            m54164e();
            AbstractMessageLite.addAll(iterable, this.f45185d);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45182a & 1) == 1) {
                codedOutputStream.writeString(1, getId());
            }
            for (int i = 0; i < this.f45184c.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f45184c.get(i));
            }
            for (int i2 = 0; i2 < this.f45185d.size(); i2++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f45185d.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int computeStringSize = (this.f45182a & 1) == 1 ? CodedOutputStream.computeStringSize(1, getId()) + 0 : 0;
            for (i = 0; i < this.f45184c.size(); i++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f45184c.get(i));
            }
            while (i2 < this.f45185d.size()) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f45185d.get(i2));
                i2++;
            }
            computeStringSize += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = computeStringSize;
            return computeStringSize;
        }

        /* renamed from: a */
        public static C14256a m54154a() {
            return (C14256a) f45180f.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14257g();
                case 2:
                    methodToInvoke = this.f45186e;
                    if (methodToInvoke == 1) {
                        return f45180f;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasId() == null) {
                        if (methodToInvoke != null) {
                            this.f45186e = (byte) 0;
                        }
                        return null;
                    }
                    for (obj = null; obj < getImagesCount(); obj++) {
                        if (getImages(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45186e = (byte) 0;
                            }
                            return null;
                        }
                    }
                    for (obj = null; obj < getVideosCount(); obj++) {
                        if (getVideos(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45186e = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45186e = (byte) 1;
                    }
                    return f45180f;
                case 3:
                    this.f45184c.makeImmutable();
                    this.f45185d.makeImmutable();
                    return null;
                case 4:
                    return new C14256a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14257g c14257g = (C14257g) obj2;
                    this.f45183b = visitor.visitString(hasId(), this.f45183b, c14257g.hasId(), c14257g.f45183b);
                    this.f45184c = visitor.visitList(this.f45184c, c14257g.f45184c);
                    this.f45185d = visitor.visitList(this.f45185d, c14257g.f45185d);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45182a |= c14257g.f45182a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45182a |= 1;
                                    this.f45183b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    if (this.f45184c.isModifiable() == null) {
                                        this.f45184c = GeneratedMessageLite.mutableCopy(this.f45184c);
                                    }
                                    this.f45184c.add(codedInputStream.readMessage(C14245a.m54101b(), extensionRegistryLite));
                                } else if (methodToInvoke == 26) {
                                    if (this.f45185d.isModifiable() == null) {
                                        this.f45185d = GeneratedMessageLite.mutableCopy(this.f45185d);
                                    }
                                    this.f45185d.add(codedInputStream.readMessage(C14265k.m54200b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45181g == null) {
                        synchronized (C14257g.class) {
                            if (f45181g == null) {
                                f45181g = new DefaultInstanceBasedParser(f45180f);
                            }
                        }
                    }
                    return f45181g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45180f;
        }

        static {
            f45180f.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14257g> m54159b() {
            return f45180f.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$h */
    public static final class C14259h extends GeneratedMessageLite<C14259h, C14258a> implements ActivityFeedPhotosOrBuilder {
        /* renamed from: c */
        private static final C14259h f45187c = new C14259h();
        /* renamed from: d */
        private static volatile Parser<C14259h> f45188d;
        /* renamed from: a */
        private ProtobufList<C14257g> f45189a = C14259h.emptyProtobufList();
        /* renamed from: b */
        private byte f45190b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$h$a */
        public static final class C14258a extends Builder<C14259h, C14258a> implements ActivityFeedPhotosOrBuilder {
            private C14258a() {
                super(C14259h.f45187c);
            }

            public List<C14257g> getPhotosList() {
                return Collections.unmodifiableList(((C14259h) this.instance).getPhotosList());
            }

            public int getPhotosCount() {
                return ((C14259h) this.instance).getPhotosCount();
            }

            public C14257g getPhotos(int i) {
                return ((C14259h) this.instance).getPhotos(i);
            }

            /* renamed from: a */
            public C14258a m54165a(Iterable<? extends C14257g> iterable) {
                copyOnWrite();
                ((C14259h) this.instance).m54169a((Iterable) iterable);
                return this;
            }
        }

        private C14259h() {
        }

        public List<C14257g> getPhotosList() {
            return this.f45189a;
        }

        public int getPhotosCount() {
            return this.f45189a.size();
        }

        public C14257g getPhotos(int i) {
            return (C14257g) this.f45189a.get(i);
        }

        /* renamed from: c */
        private void m54171c() {
            if (!this.f45189a.isModifiable()) {
                this.f45189a = GeneratedMessageLite.mutableCopy(this.f45189a);
            }
        }

        /* renamed from: a */
        private void m54169a(Iterable<? extends C14257g> iterable) {
            m54171c();
            AbstractMessageLite.addAll(iterable, this.f45189a);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45189a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45189a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45189a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45189a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14259h m54167a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14259h) GeneratedMessageLite.parseFrom(f45187c, bArr);
        }

        /* renamed from: a */
        public static C14258a m54166a() {
            return (C14258a) f45187c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14259h();
                case 2:
                    methodToInvoke = this.f45190b;
                    if (methodToInvoke == 1) {
                        return f45187c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getPhotosCount(); obj++) {
                        if (getPhotos(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45190b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45190b = (byte) 1;
                    }
                    return f45187c;
                case 3:
                    this.f45189a.makeImmutable();
                    return null;
                case 4:
                    return new C14258a();
                case 5:
                    this.f45189a = ((Visitor) obj).visitList(this.f45189a, ((C14259h) obj2).f45189a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45189a.isModifiable() == null) {
                                        this.f45189a = GeneratedMessageLite.mutableCopy(this.f45189a);
                                    }
                                    this.f45189a.add(codedInputStream.readMessage(C14257g.m54159b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45188d == null) {
                        synchronized (C14259h.class) {
                            if (f45188d == null) {
                                f45188d = new DefaultInstanceBasedParser(f45187c);
                            }
                        }
                    }
                    return f45188d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45187c;
        }

        static {
            f45187c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$i */
    public static final class C14261i extends GeneratedMessageLite<C14261i, C14260a> implements ActivityFeedSchoolOrBuilder {
        /* renamed from: f */
        private static final C14261i f45191f = new C14261i();
        /* renamed from: g */
        private static volatile Parser<C14261i> f45192g;
        /* renamed from: a */
        private int f45193a;
        /* renamed from: b */
        private String f45194b = "";
        /* renamed from: c */
        private String f45195c = "";
        /* renamed from: d */
        private String f45196d = "";
        /* renamed from: e */
        private byte f45197e = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$i$a */
        public static final class C14260a extends Builder<C14261i, C14260a> implements ActivityFeedSchoolOrBuilder {
            private C14260a() {
                super(C14261i.f45191f);
            }

            public boolean hasName() {
                return ((C14261i) this.instance).hasName();
            }

            public String getName() {
                return ((C14261i) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((C14261i) this.instance).getNameBytes();
            }

            /* renamed from: a */
            public C14260a m54172a(String str) {
                copyOnWrite();
                ((C14261i) this.instance).m54177a(str);
                return this;
            }

            public boolean hasType() {
                return ((C14261i) this.instance).hasType();
            }

            public String getType() {
                return ((C14261i) this.instance).getType();
            }

            public ByteString getTypeBytes() {
                return ((C14261i) this.instance).getTypeBytes();
            }

            /* renamed from: b */
            public C14260a m54173b(String str) {
                copyOnWrite();
                ((C14261i) this.instance).m54180b(str);
                return this;
            }

            public boolean hasYear() {
                return ((C14261i) this.instance).hasYear();
            }

            public String getYear() {
                return ((C14261i) this.instance).getYear();
            }

            public ByteString getYearBytes() {
                return ((C14261i) this.instance).getYearBytes();
            }

            /* renamed from: c */
            public C14260a m54174c(String str) {
                copyOnWrite();
                ((C14261i) this.instance).m54183c(str);
                return this;
            }
        }

        private C14261i() {
        }

        public boolean hasName() {
            return (this.f45193a & 1) == 1;
        }

        public String getName() {
            return this.f45194b;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.f45194b);
        }

        /* renamed from: a */
        private void m54177a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45193a |= 1;
            this.f45194b = str;
        }

        public boolean hasType() {
            return (this.f45193a & 2) == 2;
        }

        public String getType() {
            return this.f45195c;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.f45195c);
        }

        /* renamed from: b */
        private void m54180b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45193a |= 2;
            this.f45195c = str;
        }

        public boolean hasYear() {
            return (this.f45193a & 4) == 4;
        }

        public String getYear() {
            return this.f45196d;
        }

        public ByteString getYearBytes() {
            return ByteString.copyFromUtf8(this.f45196d);
        }

        /* renamed from: c */
        private void m54183c(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45193a |= 4;
            this.f45196d = str;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45193a & 1) == 1) {
                codedOutputStream.writeString(1, getName());
            }
            if ((this.f45193a & 2) == 2) {
                codedOutputStream.writeString(2, getType());
            }
            if ((this.f45193a & 4) == 4) {
                codedOutputStream.writeString(3, getYear());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45193a & 1) == 1) {
                i = 0 + CodedOutputStream.computeStringSize(1, getName());
            }
            if ((this.f45193a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getType());
            }
            if ((this.f45193a & 4) == 4) {
                i += CodedOutputStream.computeStringSize(3, getYear());
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14260a m54175a() {
            return (C14260a) f45191f.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14261i();
                case 2:
                    methodToInvoke = this.f45197e;
                    if (methodToInvoke == 1) {
                        return f45191f;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasName() == null) {
                        if (methodToInvoke != null) {
                            this.f45197e = (byte) 0;
                        }
                        return null;
                    } else if (hasType() == null) {
                        if (methodToInvoke != null) {
                            this.f45197e = (byte) 0;
                        }
                        return null;
                    } else if (hasYear() == null) {
                        if (methodToInvoke != null) {
                            this.f45197e = (byte) 0;
                        }
                        return null;
                    } else {
                        if (methodToInvoke != null) {
                            this.f45197e = (byte) 1;
                        }
                        return f45191f;
                    }
                case 3:
                    return null;
                case 4:
                    return new C14260a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14261i c14261i = (C14261i) obj2;
                    this.f45194b = visitor.visitString(hasName(), this.f45194b, c14261i.hasName(), c14261i.f45194b);
                    this.f45195c = visitor.visitString(hasType(), this.f45195c, c14261i.hasType(), c14261i.f45195c);
                    this.f45196d = visitor.visitString(hasYear(), this.f45196d, c14261i.hasYear(), c14261i.f45196d);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45193a |= c14261i.f45193a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45193a |= 1;
                                    this.f45194b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45193a |= 2;
                                    this.f45195c = methodToInvoke;
                                } else if (methodToInvoke == 26) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45193a |= 4;
                                    this.f45196d = methodToInvoke;
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45192g == null) {
                        synchronized (C14261i.class) {
                            if (f45192g == null) {
                                f45192g = new DefaultInstanceBasedParser(f45191f);
                            }
                        }
                    }
                    return f45192g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45191f;
        }

        static {
            f45191f.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14261i> m54178b() {
            return f45191f.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$j */
    public static final class C14263j extends GeneratedMessageLite<C14263j, C14262a> implements ActivityFeedSchoolsOrBuilder {
        /* renamed from: c */
        private static final C14263j f45198c = new C14263j();
        /* renamed from: d */
        private static volatile Parser<C14263j> f45199d;
        /* renamed from: a */
        private ProtobufList<C14261i> f45200a = C14263j.emptyProtobufList();
        /* renamed from: b */
        private byte f45201b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$j$a */
        public static final class C14262a extends Builder<C14263j, C14262a> implements ActivityFeedSchoolsOrBuilder {
            private C14262a() {
                super(C14263j.f45198c);
            }

            public List<C14261i> getSchoolsList() {
                return Collections.unmodifiableList(((C14263j) this.instance).getSchoolsList());
            }

            public int getSchoolsCount() {
                return ((C14263j) this.instance).getSchoolsCount();
            }

            public C14261i getSchools(int i) {
                return ((C14263j) this.instance).getSchools(i);
            }

            /* renamed from: a */
            public C14262a m54184a(Iterable<? extends C14261i> iterable) {
                copyOnWrite();
                ((C14263j) this.instance).m54188a((Iterable) iterable);
                return this;
            }
        }

        private C14263j() {
        }

        public List<C14261i> getSchoolsList() {
            return this.f45200a;
        }

        public int getSchoolsCount() {
            return this.f45200a.size();
        }

        public C14261i getSchools(int i) {
            return (C14261i) this.f45200a.get(i);
        }

        /* renamed from: c */
        private void m54190c() {
            if (!this.f45200a.isModifiable()) {
                this.f45200a = GeneratedMessageLite.mutableCopy(this.f45200a);
            }
        }

        /* renamed from: a */
        private void m54188a(Iterable<? extends C14261i> iterable) {
            m54190c();
            AbstractMessageLite.addAll(iterable, this.f45200a);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45200a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45200a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45200a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45200a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14263j m54186a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14263j) GeneratedMessageLite.parseFrom(f45198c, bArr);
        }

        /* renamed from: a */
        public static C14262a m54185a() {
            return (C14262a) f45198c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14263j();
                case 2:
                    methodToInvoke = this.f45201b;
                    if (methodToInvoke == 1) {
                        return f45198c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getSchoolsCount(); obj++) {
                        if (getSchools(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45201b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45201b = (byte) 1;
                    }
                    return f45198c;
                case 3:
                    this.f45200a.makeImmutable();
                    return null;
                case 4:
                    return new C14262a();
                case 5:
                    this.f45200a = ((Visitor) obj).visitList(this.f45200a, ((C14263j) obj2).f45200a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45200a.isModifiable() == null) {
                                        this.f45200a = GeneratedMessageLite.mutableCopy(this.f45200a);
                                    }
                                    this.f45200a.add(codedInputStream.readMessage(C14261i.m54178b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45199d == null) {
                        synchronized (C14263j.class) {
                            if (f45199d == null) {
                                f45199d = new DefaultInstanceBasedParser(f45198c);
                            }
                        }
                    }
                    return f45199d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45198c;
        }

        static {
            f45198c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$k */
    public static final class C14265k extends GeneratedMessageLite<C14265k, C14264a> implements ActivityFeedVideoOrBuilder {
        /* renamed from: g */
        private static final C14265k f45202g = new C14265k();
        /* renamed from: h */
        private static volatile Parser<C14265k> f45203h;
        /* renamed from: a */
        private int f45204a;
        /* renamed from: b */
        private String f45205b = "";
        /* renamed from: c */
        private String f45206c = "";
        /* renamed from: d */
        private int f45207d;
        /* renamed from: e */
        private int f45208e;
        /* renamed from: f */
        private byte f45209f = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$k$a */
        public static final class C14264a extends Builder<C14265k, C14264a> implements ActivityFeedVideoOrBuilder {
            private C14264a() {
                super(C14265k.f45202g);
            }

            public boolean hasName() {
                return ((C14265k) this.instance).hasName();
            }

            public String getName() {
                return ((C14265k) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((C14265k) this.instance).getNameBytes();
            }

            /* renamed from: a */
            public C14264a m54192a(String str) {
                copyOnWrite();
                ((C14265k) this.instance).m54199a(str);
                return this;
            }

            public boolean hasUrl() {
                return ((C14265k) this.instance).hasUrl();
            }

            public String getUrl() {
                return ((C14265k) this.instance).getUrl();
            }

            public ByteString getUrlBytes() {
                return ((C14265k) this.instance).getUrlBytes();
            }

            /* renamed from: b */
            public C14264a m54194b(String str) {
                copyOnWrite();
                ((C14265k) this.instance).m54204b(str);
                return this;
            }

            public boolean hasWidth() {
                return ((C14265k) this.instance).hasWidth();
            }

            public int getWidth() {
                return ((C14265k) this.instance).getWidth();
            }

            /* renamed from: a */
            public C14264a m54191a(int i) {
                copyOnWrite();
                ((C14265k) this.instance).m54196a(i);
                return this;
            }

            public boolean hasHeight() {
                return ((C14265k) this.instance).hasHeight();
            }

            public int getHeight() {
                return ((C14265k) this.instance).getHeight();
            }

            /* renamed from: b */
            public C14264a m54193b(int i) {
                copyOnWrite();
                ((C14265k) this.instance).m54201b(i);
                return this;
            }
        }

        private C14265k() {
        }

        public boolean hasName() {
            return (this.f45204a & 1) == 1;
        }

        public String getName() {
            return this.f45205b;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.f45205b);
        }

        /* renamed from: a */
        private void m54199a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45204a |= 1;
            this.f45205b = str;
        }

        public boolean hasUrl() {
            return (this.f45204a & 2) == 2;
        }

        public String getUrl() {
            return this.f45206c;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.f45206c);
        }

        /* renamed from: b */
        private void m54204b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45204a |= 2;
            this.f45206c = str;
        }

        public boolean hasWidth() {
            return (this.f45204a & 4) == 4;
        }

        public int getWidth() {
            return this.f45207d;
        }

        /* renamed from: a */
        private void m54196a(int i) {
            this.f45204a |= 4;
            this.f45207d = i;
        }

        public boolean hasHeight() {
            return (this.f45204a & 8) == 8;
        }

        public int getHeight() {
            return this.f45208e;
        }

        /* renamed from: b */
        private void m54201b(int i) {
            this.f45204a |= 8;
            this.f45208e = i;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45204a & 1) == 1) {
                codedOutputStream.writeString(1, getName());
            }
            if ((this.f45204a & 2) == 2) {
                codedOutputStream.writeString(2, getUrl());
            }
            if ((this.f45204a & 4) == 4) {
                codedOutputStream.writeInt32(3, this.f45207d);
            }
            if ((this.f45204a & 8) == 8) {
                codedOutputStream.writeInt32(4, this.f45208e);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45204a & 1) == 1) {
                i = 0 + CodedOutputStream.computeStringSize(1, getName());
            }
            if ((this.f45204a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getUrl());
            }
            if ((this.f45204a & 4) == 4) {
                i += CodedOutputStream.computeInt32Size(3, this.f45207d);
            }
            if ((this.f45204a & 8) == 8) {
                i += CodedOutputStream.computeInt32Size(4, this.f45208e);
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14264a m54195a() {
            return (C14264a) f45202g.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14265k();
                case 2:
                    methodToInvoke = this.f45209f;
                    if (methodToInvoke == 1) {
                        return f45202g;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasName() == null) {
                        if (methodToInvoke != null) {
                            this.f45209f = (byte) 0;
                        }
                        return null;
                    } else if (hasUrl() == null) {
                        if (methodToInvoke != null) {
                            this.f45209f = (byte) 0;
                        }
                        return null;
                    } else if (hasWidth() == null) {
                        if (methodToInvoke != null) {
                            this.f45209f = (byte) 0;
                        }
                        return null;
                    } else if (hasHeight() == null) {
                        if (methodToInvoke != null) {
                            this.f45209f = (byte) 0;
                        }
                        return null;
                    } else {
                        if (methodToInvoke != null) {
                            this.f45209f = (byte) 1;
                        }
                        return f45202g;
                    }
                case 3:
                    return null;
                case 4:
                    return new C14264a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14265k c14265k = (C14265k) obj2;
                    this.f45205b = visitor.visitString(hasName(), this.f45205b, c14265k.hasName(), c14265k.f45205b);
                    this.f45206c = visitor.visitString(hasUrl(), this.f45206c, c14265k.hasUrl(), c14265k.f45206c);
                    this.f45207d = visitor.visitInt(hasWidth(), this.f45207d, c14265k.hasWidth(), c14265k.f45207d);
                    this.f45208e = visitor.visitInt(hasHeight(), this.f45208e, c14265k.hasHeight(), c14265k.f45208e);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45204a |= c14265k.f45204a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45204a |= 1;
                                    this.f45205b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45204a |= 2;
                                    this.f45206c = methodToInvoke;
                                } else if (methodToInvoke == 24) {
                                    this.f45204a |= 4;
                                    this.f45207d = codedInputStream.readInt32();
                                } else if (methodToInvoke == 32) {
                                    this.f45204a |= 8;
                                    this.f45208e = codedInputStream.readInt32();
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45203h == null) {
                        synchronized (C14265k.class) {
                            if (f45203h == null) {
                                f45203h = new DefaultInstanceBasedParser(f45202g);
                            }
                        }
                    }
                    return f45203h;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45202g;
        }

        static {
            f45202g.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14265k> m54200b() {
            return f45202g.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$l */
    public static final class C14267l extends GeneratedMessageLite<C14267l, C14266a> implements BadgeOrBuilder {
        /* renamed from: f */
        private static final C14267l f45210f = new C14267l();
        /* renamed from: g */
        private static volatile Parser<C14267l> f45211g;
        /* renamed from: a */
        private int f45212a;
        /* renamed from: b */
        private String f45213b = "";
        /* renamed from: c */
        private String f45214c = "";
        /* renamed from: d */
        private String f45215d = "";
        /* renamed from: e */
        private byte f45216e = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$l$a */
        public static final class C14266a extends Builder<C14267l, C14266a> implements BadgeOrBuilder {
            private C14266a() {
                super(C14267l.f45210f);
            }

            public boolean hasType() {
                return ((C14267l) this.instance).hasType();
            }

            public String getType() {
                return ((C14267l) this.instance).getType();
            }

            public ByteString getTypeBytes() {
                return ((C14267l) this.instance).getTypeBytes();
            }

            /* renamed from: a */
            public C14266a m54206a(String str) {
                copyOnWrite();
                ((C14267l) this.instance).m54211a(str);
                return this;
            }

            public boolean hasDescription() {
                return ((C14267l) this.instance).hasDescription();
            }

            public String getDescription() {
                return ((C14267l) this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((C14267l) this.instance).getDescriptionBytes();
            }

            /* renamed from: b */
            public C14266a m54207b(String str) {
                copyOnWrite();
                ((C14267l) this.instance).m54214b(str);
                return this;
            }

            public boolean hasColor() {
                return ((C14267l) this.instance).hasColor();
            }

            public String getColor() {
                return ((C14267l) this.instance).getColor();
            }

            public ByteString getColorBytes() {
                return ((C14267l) this.instance).getColorBytes();
            }

            /* renamed from: c */
            public C14266a m54208c(String str) {
                copyOnWrite();
                ((C14267l) this.instance).m54217c(str);
                return this;
            }
        }

        private C14267l() {
        }

        public boolean hasType() {
            return (this.f45212a & 1) == 1;
        }

        public String getType() {
            return this.f45213b;
        }

        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.f45213b);
        }

        /* renamed from: a */
        private void m54211a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45212a |= 1;
            this.f45213b = str;
        }

        public boolean hasDescription() {
            return (this.f45212a & 2) == 2;
        }

        public String getDescription() {
            return this.f45214c;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.f45214c);
        }

        /* renamed from: b */
        private void m54214b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45212a |= 2;
            this.f45214c = str;
        }

        public boolean hasColor() {
            return (this.f45212a & 4) == 4;
        }

        public String getColor() {
            return this.f45215d;
        }

        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.f45215d);
        }

        /* renamed from: c */
        private void m54217c(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45212a |= 4;
            this.f45215d = str;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45212a & 1) == 1) {
                codedOutputStream.writeString(1, getType());
            }
            if ((this.f45212a & 2) == 2) {
                codedOutputStream.writeString(2, getDescription());
            }
            if ((this.f45212a & 4) == 4) {
                codedOutputStream.writeString(3, getColor());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45212a & 1) == 1) {
                i = 0 + CodedOutputStream.computeStringSize(1, getType());
            }
            if ((this.f45212a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getDescription());
            }
            if ((this.f45212a & 4) == 4) {
                i += CodedOutputStream.computeStringSize(3, getColor());
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14266a m54209a() {
            return (C14266a) f45210f.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14267l();
                case 2:
                    methodToInvoke = this.f45216e;
                    if (methodToInvoke == 1) {
                        return f45210f;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasType() == null) {
                        if (methodToInvoke != null) {
                            this.f45216e = (byte) 0;
                        }
                        return null;
                    } else if (hasDescription() == null) {
                        if (methodToInvoke != null) {
                            this.f45216e = (byte) 0;
                        }
                        return null;
                    } else if (hasColor() == null) {
                        if (methodToInvoke != null) {
                            this.f45216e = (byte) 0;
                        }
                        return null;
                    } else {
                        if (methodToInvoke != null) {
                            this.f45216e = (byte) 1;
                        }
                        return f45210f;
                    }
                case 3:
                    return null;
                case 4:
                    return new C14266a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14267l c14267l = (C14267l) obj2;
                    this.f45213b = visitor.visitString(hasType(), this.f45213b, c14267l.hasType(), c14267l.f45213b);
                    this.f45214c = visitor.visitString(hasDescription(), this.f45214c, c14267l.hasDescription(), c14267l.f45214c);
                    this.f45215d = visitor.visitString(hasColor(), this.f45215d, c14267l.hasColor(), c14267l.f45215d);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45212a |= c14267l.f45212a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45212a |= 1;
                                    this.f45213b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45212a |= 2;
                                    this.f45214c = methodToInvoke;
                                } else if (methodToInvoke == 26) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45212a |= 4;
                                    this.f45215d = methodToInvoke;
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45211g == null) {
                        synchronized (C14267l.class) {
                            if (f45211g == null) {
                                f45211g = new DefaultInstanceBasedParser(f45210f);
                            }
                        }
                    }
                    return f45211g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45210f;
        }

        static {
            f45210f.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14267l> m54212b() {
            return f45210f.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$m */
    public static final class C14269m extends GeneratedMessageLite<C14269m, C14268a> implements BadgesOrBuilder {
        /* renamed from: c */
        private static final C14269m f45217c = new C14269m();
        /* renamed from: d */
        private static volatile Parser<C14269m> f45218d;
        /* renamed from: a */
        private ProtobufList<C14267l> f45219a = C14269m.emptyProtobufList();
        /* renamed from: b */
        private byte f45220b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$m$a */
        public static final class C14268a extends Builder<C14269m, C14268a> implements BadgesOrBuilder {
            private C14268a() {
                super(C14269m.f45217c);
            }

            public List<C14267l> getBadgesList() {
                return Collections.unmodifiableList(((C14269m) this.instance).getBadgesList());
            }

            public int getBadgesCount() {
                return ((C14269m) this.instance).getBadgesCount();
            }

            public C14267l getBadges(int i) {
                return ((C14269m) this.instance).getBadges(i);
            }

            /* renamed from: a */
            public C14268a m54218a(C14267l c14267l) {
                copyOnWrite();
                ((C14269m) this.instance).m54221a(c14267l);
                return this;
            }
        }

        private C14269m() {
        }

        public List<C14267l> getBadgesList() {
            return this.f45219a;
        }

        public int getBadgesCount() {
            return this.f45219a.size();
        }

        public C14267l getBadges(int i) {
            return (C14267l) this.f45219a.get(i);
        }

        /* renamed from: c */
        private void m54224c() {
            if (!this.f45219a.isModifiable()) {
                this.f45219a = GeneratedMessageLite.mutableCopy(this.f45219a);
            }
        }

        /* renamed from: a */
        private void m54221a(C14267l c14267l) {
            if (c14267l == null) {
                throw new NullPointerException();
            }
            m54224c();
            this.f45219a.add(c14267l);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45219a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45219a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45219a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45219a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14269m m54220a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14269m) GeneratedMessageLite.parseFrom(f45217c, bArr);
        }

        /* renamed from: a */
        public static C14268a m54219a() {
            return (C14268a) f45217c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14269m();
                case 2:
                    methodToInvoke = this.f45220b;
                    if (methodToInvoke == 1) {
                        return f45217c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getBadgesCount(); obj++) {
                        if (getBadges(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45220b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45220b = (byte) 1;
                    }
                    return f45217c;
                case 3:
                    this.f45219a.makeImmutable();
                    return null;
                case 4:
                    return new C14268a();
                case 5:
                    this.f45219a = ((Visitor) obj).visitList(this.f45219a, ((C14269m) obj2).f45219a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45219a.isModifiable() == null) {
                                        this.f45219a = GeneratedMessageLite.mutableCopy(this.f45219a);
                                    }
                                    this.f45219a.add(codedInputStream.readMessage(C14267l.m54212b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45218d == null) {
                        synchronized (C14269m.class) {
                            if (f45218d == null) {
                                f45218d = new DefaultInstanceBasedParser(f45217c);
                            }
                        }
                    }
                    return f45218d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45217c;
        }

        static {
            f45217c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$n */
    public static final class C14271n extends GeneratedMessageLite<C14271n, C14270a> implements GenderOrBuilder {
        /* renamed from: e */
        private static final C14271n f45221e = new C14271n();
        /* renamed from: f */
        private static volatile Parser<C14271n> f45222f;
        /* renamed from: a */
        private int f45223a;
        /* renamed from: b */
        private int f45224b;
        /* renamed from: c */
        private String f45225c = "";
        /* renamed from: d */
        private byte f45226d = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$n$a */
        public static final class C14270a extends Builder<C14271n, C14270a> implements GenderOrBuilder {
            private C14270a() {
                super(C14271n.f45221e);
            }

            public boolean hasGender() {
                return ((C14271n) this.instance).hasGender();
            }

            public int getGender() {
                return ((C14271n) this.instance).getGender();
            }

            /* renamed from: a */
            public C14270a m54225a(int i) {
                copyOnWrite();
                ((C14271n) this.instance).m54229a(i);
                return this;
            }

            public boolean hasCustomGender() {
                return ((C14271n) this.instance).hasCustomGender();
            }

            public String getCustomGender() {
                return ((C14271n) this.instance).getCustomGender();
            }

            public ByteString getCustomGenderBytes() {
                return ((C14271n) this.instance).getCustomGenderBytes();
            }

            /* renamed from: a */
            public C14270a m54226a(String str) {
                copyOnWrite();
                ((C14271n) this.instance).m54232a(str);
                return this;
            }
        }

        private C14271n() {
        }

        public boolean hasGender() {
            return (this.f45223a & 1) == 1;
        }

        public int getGender() {
            return this.f45224b;
        }

        /* renamed from: a */
        private void m54229a(int i) {
            this.f45223a |= 1;
            this.f45224b = i;
        }

        public boolean hasCustomGender() {
            return (this.f45223a & 2) == 2;
        }

        public String getCustomGender() {
            return this.f45225c;
        }

        public ByteString getCustomGenderBytes() {
            return ByteString.copyFromUtf8(this.f45225c);
        }

        /* renamed from: a */
        private void m54232a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45223a |= 2;
            this.f45225c = str;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45223a & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f45224b);
            }
            if ((this.f45223a & 2) == 2) {
                codedOutputStream.writeString(2, getCustomGender());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45223a & 1) == 1) {
                i = 0 + CodedOutputStream.computeInt32Size(1, this.f45224b);
            }
            if ((this.f45223a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getCustomGender());
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14271n m54228a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14271n) GeneratedMessageLite.parseFrom(f45221e, bArr);
        }

        /* renamed from: a */
        public static C14270a m54227a() {
            return (C14270a) f45221e.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14271n();
                case 2:
                    methodToInvoke = this.f45226d;
                    if (methodToInvoke == 1) {
                        return f45221e;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasGender() == null) {
                        if (methodToInvoke != null) {
                            this.f45226d = (byte) 0;
                        }
                        return null;
                    }
                    if (methodToInvoke != null) {
                        this.f45226d = (byte) 1;
                    }
                    return f45221e;
                case 3:
                    return null;
                case 4:
                    return new C14270a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14271n c14271n = (C14271n) obj2;
                    this.f45224b = visitor.visitInt(hasGender(), this.f45224b, c14271n.hasGender(), c14271n.f45224b);
                    this.f45225c = visitor.visitString(hasCustomGender(), this.f45225c, c14271n.hasCustomGender(), c14271n.f45225c);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45223a |= c14271n.f45223a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 8) {
                                    this.f45223a |= 1;
                                    this.f45224b = codedInputStream.readInt32();
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45223a |= 2;
                                    this.f45225c = methodToInvoke;
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45222f == null) {
                        synchronized (C14271n.class) {
                            if (f45222f == null) {
                                f45222f = new DefaultInstanceBasedParser(f45221e);
                            }
                        }
                    }
                    return f45222f;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45221e;
        }

        static {
            f45221e.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$o */
    public static final class C14273o extends GeneratedMessageLite<C14273o, C14272a> implements InstagramMediaOrBuilder {
        /* renamed from: f */
        private static final C14273o f45227f = new C14273o();
        /* renamed from: g */
        private static volatile Parser<C14273o> f45228g;
        /* renamed from: a */
        private int f45229a;
        /* renamed from: b */
        private String f45230b = "";
        /* renamed from: c */
        private ProtobufList<C14245a> f45231c = C14273o.emptyProtobufList();
        /* renamed from: d */
        private ProtobufList<C14265k> f45232d = C14273o.emptyProtobufList();
        /* renamed from: e */
        private byte f45233e = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$o$a */
        public static final class C14272a extends Builder<C14273o, C14272a> implements InstagramMediaOrBuilder {
            private C14272a() {
                super(C14273o.f45227f);
            }

            public boolean hasId() {
                return ((C14273o) this.instance).hasId();
            }

            public String getId() {
                return ((C14273o) this.instance).getId();
            }

            public ByteString getIdBytes() {
                return ((C14273o) this.instance).getIdBytes();
            }

            /* renamed from: a */
            public C14272a m54235a(String str) {
                copyOnWrite();
                ((C14273o) this.instance).m54241a(str);
                return this;
            }

            public List<C14245a> getImagesList() {
                return Collections.unmodifiableList(((C14273o) this.instance).getImagesList());
            }

            public int getImagesCount() {
                return ((C14273o) this.instance).getImagesCount();
            }

            public C14245a getImages(int i) {
                return ((C14273o) this.instance).getImages(i);
            }

            /* renamed from: a */
            public C14272a m54234a(Iterable<? extends C14245a> iterable) {
                copyOnWrite();
                ((C14273o) this.instance).m54240a((Iterable) iterable);
                return this;
            }

            public List<C14265k> getVideosList() {
                return Collections.unmodifiableList(((C14273o) this.instance).getVideosList());
            }

            public int getVideosCount() {
                return ((C14273o) this.instance).getVideosCount();
            }

            public C14265k getVideos(int i) {
                return ((C14273o) this.instance).getVideos(i);
            }

            /* renamed from: b */
            public C14272a m54236b(Iterable<? extends C14265k> iterable) {
                copyOnWrite();
                ((C14273o) this.instance).m54244b(iterable);
                return this;
            }
        }

        private C14273o() {
        }

        public boolean hasId() {
            return (this.f45229a & 1) == 1;
        }

        public String getId() {
            return this.f45230b;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.f45230b);
        }

        /* renamed from: a */
        private void m54241a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45229a |= 1;
            this.f45230b = str;
        }

        public List<C14245a> getImagesList() {
            return this.f45231c;
        }

        public int getImagesCount() {
            return this.f45231c.size();
        }

        public C14245a getImages(int i) {
            return (C14245a) this.f45231c.get(i);
        }

        /* renamed from: d */
        private void m54246d() {
            if (!this.f45231c.isModifiable()) {
                this.f45231c = GeneratedMessageLite.mutableCopy(this.f45231c);
            }
        }

        /* renamed from: a */
        private void m54240a(Iterable<? extends C14245a> iterable) {
            m54246d();
            AbstractMessageLite.addAll(iterable, this.f45231c);
        }

        public List<C14265k> getVideosList() {
            return this.f45232d;
        }

        public int getVideosCount() {
            return this.f45232d.size();
        }

        public C14265k getVideos(int i) {
            return (C14265k) this.f45232d.get(i);
        }

        /* renamed from: e */
        private void m54247e() {
            if (!this.f45232d.isModifiable()) {
                this.f45232d = GeneratedMessageLite.mutableCopy(this.f45232d);
            }
        }

        /* renamed from: b */
        private void m54244b(Iterable<? extends C14265k> iterable) {
            m54247e();
            AbstractMessageLite.addAll(iterable, this.f45232d);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45229a & 1) == 1) {
                codedOutputStream.writeString(1, getId());
            }
            for (int i = 0; i < this.f45231c.size(); i++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f45231c.get(i));
            }
            for (int i2 = 0; i2 < this.f45232d.size(); i2++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f45232d.get(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int computeStringSize = (this.f45229a & 1) == 1 ? CodedOutputStream.computeStringSize(1, getId()) + 0 : 0;
            for (i = 0; i < this.f45231c.size(); i++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f45231c.get(i));
            }
            while (i2 < this.f45232d.size()) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f45232d.get(i2));
                i2++;
            }
            computeStringSize += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = computeStringSize;
            return computeStringSize;
        }

        /* renamed from: a */
        public static C14272a m54237a() {
            return (C14272a) f45227f.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14273o();
                case 2:
                    methodToInvoke = this.f45233e;
                    if (methodToInvoke == 1) {
                        return f45227f;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasId() == null) {
                        if (methodToInvoke != null) {
                            this.f45233e = (byte) 0;
                        }
                        return null;
                    }
                    for (obj = null; obj < getImagesCount(); obj++) {
                        if (getImages(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45233e = (byte) 0;
                            }
                            return null;
                        }
                    }
                    for (obj = null; obj < getVideosCount(); obj++) {
                        if (getVideos(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45233e = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45233e = (byte) 1;
                    }
                    return f45227f;
                case 3:
                    this.f45231c.makeImmutable();
                    this.f45232d.makeImmutable();
                    return null;
                case 4:
                    return new C14272a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14273o c14273o = (C14273o) obj2;
                    this.f45230b = visitor.visitString(hasId(), this.f45230b, c14273o.hasId(), c14273o.f45230b);
                    this.f45231c = visitor.visitList(this.f45231c, c14273o.f45231c);
                    this.f45232d = visitor.visitList(this.f45232d, c14273o.f45232d);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45229a |= c14273o.f45229a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45229a |= 1;
                                    this.f45230b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    if (this.f45231c.isModifiable() == null) {
                                        this.f45231c = GeneratedMessageLite.mutableCopy(this.f45231c);
                                    }
                                    this.f45231c.add(codedInputStream.readMessage(C14245a.m54101b(), extensionRegistryLite));
                                } else if (methodToInvoke == 26) {
                                    if (this.f45232d.isModifiable() == null) {
                                        this.f45232d = GeneratedMessageLite.mutableCopy(this.f45232d);
                                    }
                                    this.f45232d.add(codedInputStream.readMessage(C14265k.m54200b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45228g == null) {
                        synchronized (C14273o.class) {
                            if (f45228g == null) {
                                f45228g = new DefaultInstanceBasedParser(f45227f);
                            }
                        }
                    }
                    return f45228g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45227f;
        }

        static {
            f45227f.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14273o> m54242b() {
            return f45227f.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$p */
    public static final class C14275p extends GeneratedMessageLite<C14275p, C14274a> implements InstagramMediasOrBuilder {
        /* renamed from: c */
        private static final C14275p f45234c = new C14275p();
        /* renamed from: d */
        private static volatile Parser<C14275p> f45235d;
        /* renamed from: a */
        private ProtobufList<C14273o> f45236a = C14275p.emptyProtobufList();
        /* renamed from: b */
        private byte f45237b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$p$a */
        public static final class C14274a extends Builder<C14275p, C14274a> implements InstagramMediasOrBuilder {
            private C14274a() {
                super(C14275p.f45234c);
            }

            public List<C14273o> getMediasList() {
                return Collections.unmodifiableList(((C14275p) this.instance).getMediasList());
            }

            public int getMediasCount() {
                return ((C14275p) this.instance).getMediasCount();
            }

            public C14273o getMedias(int i) {
                return ((C14275p) this.instance).getMedias(i);
            }

            /* renamed from: a */
            public C14274a m54248a(Iterable<? extends C14273o> iterable) {
                copyOnWrite();
                ((C14275p) this.instance).m54252a((Iterable) iterable);
                return this;
            }
        }

        private C14275p() {
        }

        public List<C14273o> getMediasList() {
            return this.f45236a;
        }

        public int getMediasCount() {
            return this.f45236a.size();
        }

        public C14273o getMedias(int i) {
            return (C14273o) this.f45236a.get(i);
        }

        /* renamed from: c */
        private void m54254c() {
            if (!this.f45236a.isModifiable()) {
                this.f45236a = GeneratedMessageLite.mutableCopy(this.f45236a);
            }
        }

        /* renamed from: a */
        private void m54252a(Iterable<? extends C14273o> iterable) {
            m54254c();
            AbstractMessageLite.addAll(iterable, this.f45236a);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45236a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45236a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45236a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45236a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14275p m54250a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14275p) GeneratedMessageLite.parseFrom(f45234c, bArr);
        }

        /* renamed from: a */
        public static C14274a m54249a() {
            return (C14274a) f45234c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14275p();
                case 2:
                    methodToInvoke = this.f45237b;
                    if (methodToInvoke == 1) {
                        return f45234c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getMediasCount(); obj++) {
                        if (getMedias(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45237b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45237b = (byte) 1;
                    }
                    return f45234c;
                case 3:
                    this.f45236a.makeImmutable();
                    return null;
                case 4:
                    return new C14274a();
                case 5:
                    this.f45236a = ((Visitor) obj).visitList(this.f45236a, ((C14275p) obj2).f45236a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45236a.isModifiable() == null) {
                                        this.f45236a = GeneratedMessageLite.mutableCopy(this.f45236a);
                                    }
                                    this.f45236a.add(codedInputStream.readMessage(C14273o.m54242b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45235d == null) {
                        synchronized (C14275p.class) {
                            if (f45235d == null) {
                                f45235d = new DefaultInstanceBasedParser(f45234c);
                            }
                        }
                    }
                    return f45235d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45234c;
        }

        static {
            f45234c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$q */
    public static final class C14277q extends GeneratedMessageLite<C14277q, C14276a> implements JobOrBuilder {
        /* renamed from: i */
        private static final C14277q f45238i = new C14277q();
        /* renamed from: j */
        private static volatile Parser<C14277q> f45239j;
        /* renamed from: a */
        private int f45240a;
        /* renamed from: b */
        private String f45241b = "";
        /* renamed from: c */
        private String f45242c = "";
        /* renamed from: d */
        private boolean f45243d;
        /* renamed from: e */
        private String f45244e = "";
        /* renamed from: f */
        private String f45245f = "";
        /* renamed from: g */
        private boolean f45246g;
        /* renamed from: h */
        private byte f45247h = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$q$a */
        public static final class C14276a extends Builder<C14277q, C14276a> implements JobOrBuilder {
            private C14276a() {
                super(C14277q.f45238i);
            }

            public boolean hasCompanyId() {
                return ((C14277q) this.instance).hasCompanyId();
            }

            public String getCompanyId() {
                return ((C14277q) this.instance).getCompanyId();
            }

            public ByteString getCompanyIdBytes() {
                return ((C14277q) this.instance).getCompanyIdBytes();
            }

            /* renamed from: a */
            public C14276a m54255a(String str) {
                copyOnWrite();
                ((C14277q) this.instance).m54264a(str);
                return this;
            }

            public boolean hasCompanyName() {
                return ((C14277q) this.instance).hasCompanyName();
            }

            public String getCompanyName() {
                return ((C14277q) this.instance).getCompanyName();
            }

            public ByteString getCompanyNameBytes() {
                return ((C14277q) this.instance).getCompanyNameBytes();
            }

            /* renamed from: b */
            public C14276a m54257b(String str) {
                copyOnWrite();
                ((C14277q) this.instance).m54269b(str);
                return this;
            }

            public boolean hasCompanyDisplayed() {
                return ((C14277q) this.instance).hasCompanyDisplayed();
            }

            public boolean getCompanyDisplayed() {
                return ((C14277q) this.instance).getCompanyDisplayed();
            }

            /* renamed from: a */
            public C14276a m54256a(boolean z) {
                copyOnWrite();
                ((C14277q) this.instance).m54265a(z);
                return this;
            }

            public boolean hasTitleId() {
                return ((C14277q) this.instance).hasTitleId();
            }

            public String getTitleId() {
                return ((C14277q) this.instance).getTitleId();
            }

            public ByteString getTitleIdBytes() {
                return ((C14277q) this.instance).getTitleIdBytes();
            }

            /* renamed from: c */
            public C14276a m54259c(String str) {
                copyOnWrite();
                ((C14277q) this.instance).m54273c(str);
                return this;
            }

            public boolean hasTitleName() {
                return ((C14277q) this.instance).hasTitleName();
            }

            public String getTitleName() {
                return ((C14277q) this.instance).getTitleName();
            }

            public ByteString getTitleNameBytes() {
                return ((C14277q) this.instance).getTitleNameBytes();
            }

            /* renamed from: d */
            public C14276a m54260d(String str) {
                copyOnWrite();
                ((C14277q) this.instance).m54275d(str);
                return this;
            }

            public boolean hasTitleDisplayed() {
                return ((C14277q) this.instance).hasTitleDisplayed();
            }

            public boolean getTitleDisplayed() {
                return ((C14277q) this.instance).getTitleDisplayed();
            }

            /* renamed from: b */
            public C14276a m54258b(boolean z) {
                copyOnWrite();
                ((C14277q) this.instance).m54270b(z);
                return this;
            }
        }

        private C14277q() {
        }

        public boolean hasCompanyId() {
            return (this.f45240a & 1) == 1;
        }

        public String getCompanyId() {
            return this.f45241b;
        }

        public ByteString getCompanyIdBytes() {
            return ByteString.copyFromUtf8(this.f45241b);
        }

        /* renamed from: a */
        private void m54264a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45240a |= 1;
            this.f45241b = str;
        }

        public boolean hasCompanyName() {
            return (this.f45240a & 2) == 2;
        }

        public String getCompanyName() {
            return this.f45242c;
        }

        public ByteString getCompanyNameBytes() {
            return ByteString.copyFromUtf8(this.f45242c);
        }

        /* renamed from: b */
        private void m54269b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45240a |= 2;
            this.f45242c = str;
        }

        public boolean hasCompanyDisplayed() {
            return (this.f45240a & 4) == 4;
        }

        public boolean getCompanyDisplayed() {
            return this.f45243d;
        }

        /* renamed from: a */
        private void m54265a(boolean z) {
            this.f45240a |= 4;
            this.f45243d = z;
        }

        public boolean hasTitleId() {
            return (this.f45240a & 8) == 8;
        }

        public String getTitleId() {
            return this.f45244e;
        }

        public ByteString getTitleIdBytes() {
            return ByteString.copyFromUtf8(this.f45244e);
        }

        /* renamed from: c */
        private void m54273c(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45240a |= 8;
            this.f45244e = str;
        }

        public boolean hasTitleName() {
            return (this.f45240a & 16) == 16;
        }

        public String getTitleName() {
            return this.f45245f;
        }

        public ByteString getTitleNameBytes() {
            return ByteString.copyFromUtf8(this.f45245f);
        }

        /* renamed from: d */
        private void m54275d(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45240a |= 16;
            this.f45245f = str;
        }

        public boolean hasTitleDisplayed() {
            return (this.f45240a & 32) == 32;
        }

        public boolean getTitleDisplayed() {
            return this.f45246g;
        }

        /* renamed from: b */
        private void m54270b(boolean z) {
            this.f45240a |= 32;
            this.f45246g = z;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45240a & 1) == 1) {
                codedOutputStream.writeString(1, getCompanyId());
            }
            if ((this.f45240a & 2) == 2) {
                codedOutputStream.writeString(2, getCompanyName());
            }
            if ((this.f45240a & 4) == 4) {
                codedOutputStream.writeBool(3, this.f45243d);
            }
            if ((this.f45240a & 8) == 8) {
                codedOutputStream.writeString(4, getTitleId());
            }
            if ((this.f45240a & 16) == 16) {
                codedOutputStream.writeString(5, getTitleName());
            }
            if ((this.f45240a & 32) == 32) {
                codedOutputStream.writeBool(6, this.f45246g);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45240a & 1) == 1) {
                i = 0 + CodedOutputStream.computeStringSize(1, getCompanyId());
            }
            if ((this.f45240a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getCompanyName());
            }
            if ((this.f45240a & 4) == 4) {
                i += CodedOutputStream.computeBoolSize(3, this.f45243d);
            }
            if ((this.f45240a & 8) == 8) {
                i += CodedOutputStream.computeStringSize(4, getTitleId());
            }
            if ((this.f45240a & 16) == 16) {
                i += CodedOutputStream.computeStringSize(5, getTitleName());
            }
            if ((this.f45240a & 32) == 32) {
                i += CodedOutputStream.computeBoolSize(6, this.f45246g);
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14276a m54261a() {
            return (C14276a) f45238i.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14277q();
                case 2:
                    methodToInvoke = this.f45247h;
                    if (methodToInvoke == 1) {
                        return f45238i;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasCompanyId() == null) {
                        if (methodToInvoke != null) {
                            this.f45247h = (byte) 0;
                        }
                        return null;
                    } else if (hasCompanyName() == null) {
                        if (methodToInvoke != null) {
                            this.f45247h = (byte) 0;
                        }
                        return null;
                    } else if (hasCompanyDisplayed() == null) {
                        if (methodToInvoke != null) {
                            this.f45247h = (byte) 0;
                        }
                        return null;
                    } else if (hasTitleId() == null) {
                        if (methodToInvoke != null) {
                            this.f45247h = (byte) 0;
                        }
                        return null;
                    } else if (hasTitleName() == null) {
                        if (methodToInvoke != null) {
                            this.f45247h = (byte) 0;
                        }
                        return null;
                    } else if (hasTitleDisplayed() == null) {
                        if (methodToInvoke != null) {
                            this.f45247h = (byte) 0;
                        }
                        return null;
                    } else {
                        if (methodToInvoke != null) {
                            this.f45247h = (byte) 1;
                        }
                        return f45238i;
                    }
                case 3:
                    return null;
                case 4:
                    return new C14276a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14277q c14277q = (C14277q) obj2;
                    this.f45241b = visitor.visitString(hasCompanyId(), this.f45241b, c14277q.hasCompanyId(), c14277q.f45241b);
                    this.f45242c = visitor.visitString(hasCompanyName(), this.f45242c, c14277q.hasCompanyName(), c14277q.f45242c);
                    this.f45243d = visitor.visitBoolean(hasCompanyDisplayed(), this.f45243d, c14277q.hasCompanyDisplayed(), c14277q.f45243d);
                    this.f45244e = visitor.visitString(hasTitleId(), this.f45244e, c14277q.hasTitleId(), c14277q.f45244e);
                    this.f45245f = visitor.visitString(hasTitleName(), this.f45245f, c14277q.hasTitleName(), c14277q.f45245f);
                    this.f45246g = visitor.visitBoolean(hasTitleDisplayed(), this.f45246g, c14277q.hasTitleDisplayed(), c14277q.f45246g);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45240a |= c14277q.f45240a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45240a |= 1;
                                    this.f45241b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45240a |= 2;
                                    this.f45242c = methodToInvoke;
                                } else if (methodToInvoke == 24) {
                                    this.f45240a |= 4;
                                    this.f45243d = codedInputStream.readBool();
                                } else if (methodToInvoke == 34) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45240a |= 8;
                                    this.f45244e = methodToInvoke;
                                } else if (methodToInvoke == 42) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45240a |= 16;
                                    this.f45245f = methodToInvoke;
                                } else if (methodToInvoke == 48) {
                                    this.f45240a |= 32;
                                    this.f45246g = codedInputStream.readBool();
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45239j == null) {
                        synchronized (C14277q.class) {
                            if (f45239j == null) {
                                f45239j = new DefaultInstanceBasedParser(f45238i);
                            }
                        }
                    }
                    return f45239j;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45238i;
        }

        static {
            f45238i.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14277q> m54266b() {
            return f45238i.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$r */
    public static final class C14279r extends GeneratedMessageLite<C14279r, C14278a> implements JobsOrBuilder {
        /* renamed from: c */
        private static final C14279r f45248c = new C14279r();
        /* renamed from: d */
        private static volatile Parser<C14279r> f45249d;
        /* renamed from: a */
        private ProtobufList<C14277q> f45250a = C14279r.emptyProtobufList();
        /* renamed from: b */
        private byte f45251b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$r$a */
        public static final class C14278a extends Builder<C14279r, C14278a> implements JobsOrBuilder {
            private C14278a() {
                super(C14279r.f45248c);
            }

            public List<C14277q> getJobsList() {
                return Collections.unmodifiableList(((C14279r) this.instance).getJobsList());
            }

            public int getJobsCount() {
                return ((C14279r) this.instance).getJobsCount();
            }

            public C14277q getJobs(int i) {
                return ((C14279r) this.instance).getJobs(i);
            }

            /* renamed from: a */
            public C14278a m54276a(C14277q c14277q) {
                copyOnWrite();
                ((C14279r) this.instance).m54279a(c14277q);
                return this;
            }
        }

        private C14279r() {
        }

        public List<C14277q> getJobsList() {
            return this.f45250a;
        }

        public int getJobsCount() {
            return this.f45250a.size();
        }

        public C14277q getJobs(int i) {
            return (C14277q) this.f45250a.get(i);
        }

        /* renamed from: c */
        private void m54282c() {
            if (!this.f45250a.isModifiable()) {
                this.f45250a = GeneratedMessageLite.mutableCopy(this.f45250a);
            }
        }

        /* renamed from: a */
        private void m54279a(C14277q c14277q) {
            if (c14277q == null) {
                throw new NullPointerException();
            }
            m54282c();
            this.f45250a.add(c14277q);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45250a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45250a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45250a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45250a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14279r m54278a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14279r) GeneratedMessageLite.parseFrom(f45248c, bArr);
        }

        /* renamed from: a */
        public static C14278a m54277a() {
            return (C14278a) f45248c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14279r();
                case 2:
                    methodToInvoke = this.f45251b;
                    if (methodToInvoke == 1) {
                        return f45248c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getJobsCount(); obj++) {
                        if (getJobs(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45251b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45251b = (byte) 1;
                    }
                    return f45248c;
                case 3:
                    this.f45250a.makeImmutable();
                    return null;
                case 4:
                    return new C14278a();
                case 5:
                    this.f45250a = ((Visitor) obj).visitList(this.f45250a, ((C14279r) obj2).f45250a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45250a.isModifiable() == null) {
                                        this.f45250a = GeneratedMessageLite.mutableCopy(this.f45250a);
                                    }
                                    this.f45250a.add(codedInputStream.readMessage(C14277q.m54266b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45249d == null) {
                        synchronized (C14279r.class) {
                            if (f45249d == null) {
                                f45249d = new DefaultInstanceBasedParser(f45248c);
                            }
                        }
                    }
                    return f45249d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45248c;
        }

        static {
            f45248c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$s */
    public static final class C14281s extends GeneratedMessageLite<C14281s, C14280a> implements PhotosOrBuilder {
        /* renamed from: c */
        private static final C14281s f45252c = new C14281s();
        /* renamed from: d */
        private static volatile Parser<C14281s> f45253d;
        /* renamed from: a */
        private ProtobufList<Photo> f45254a = C14281s.emptyProtobufList();
        /* renamed from: b */
        private byte f45255b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$s$a */
        public static final class C14280a extends Builder<C14281s, C14280a> implements PhotosOrBuilder {
            private C14280a() {
                super(C14281s.f45252c);
            }

            public List<Photo> getPhotosList() {
                return Collections.unmodifiableList(((C14281s) this.instance).getPhotosList());
            }

            public int getPhotosCount() {
                return ((C14281s) this.instance).getPhotosCount();
            }

            public Photo getPhotos(int i) {
                return ((C14281s) this.instance).getPhotos(i);
            }

            /* renamed from: a */
            public C14280a m54283a(C14241a c14241a) {
                copyOnWrite();
                ((C14281s) this.instance).m54286a(c14241a);
                return this;
            }
        }

        private C14281s() {
        }

        public List<Photo> getPhotosList() {
            return this.f45254a;
        }

        public int getPhotosCount() {
            return this.f45254a.size();
        }

        public Photo getPhotos(int i) {
            return (Photo) this.f45254a.get(i);
        }

        /* renamed from: c */
        private void m54289c() {
            if (!this.f45254a.isModifiable()) {
                this.f45254a = GeneratedMessageLite.mutableCopy(this.f45254a);
            }
        }

        /* renamed from: a */
        private void m54286a(C14241a c14241a) {
            m54289c();
            this.f45254a.add(c14241a.build());
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45254a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45254a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45254a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45254a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14281s m54285a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14281s) GeneratedMessageLite.parseFrom(f45252c, bArr);
        }

        /* renamed from: a */
        public static C14280a m54284a() {
            return (C14280a) f45252c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14281s();
                case 2:
                    methodToInvoke = this.f45255b;
                    if (methodToInvoke == 1) {
                        return f45252c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getPhotosCount(); obj++) {
                        if (getPhotos(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45255b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45255b = (byte) 1;
                    }
                    return f45252c;
                case 3:
                    this.f45254a.makeImmutable();
                    return null;
                case 4:
                    return new C14280a();
                case 5:
                    this.f45254a = ((Visitor) obj).visitList(this.f45254a, ((C14281s) obj2).f45254a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45254a.isModifiable() == null) {
                                        this.f45254a = GeneratedMessageLite.mutableCopy(this.f45254a);
                                    }
                                    this.f45254a.add(codedInputStream.readMessage(Photo.m54087b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45253d == null) {
                        synchronized (C14281s.class) {
                            if (f45253d == null) {
                                f45253d = new DefaultInstanceBasedParser(f45252c);
                            }
                        }
                    }
                    return f45253d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45252c;
        }

        static {
            f45252c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$t */
    public static final class C14283t extends GeneratedMessageLite<C14283t, C14282a> implements SchoolOrBuilder {
        /* renamed from: f */
        private static final C14283t f45256f = new C14283t();
        /* renamed from: g */
        private static volatile Parser<C14283t> f45257g;
        /* renamed from: a */
        private int f45258a;
        /* renamed from: b */
        private String f45259b = "";
        /* renamed from: c */
        private String f45260c = "";
        /* renamed from: d */
        private boolean f45261d;
        /* renamed from: e */
        private byte f45262e = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$t$a */
        public static final class C14282a extends Builder<C14283t, C14282a> implements SchoolOrBuilder {
            private C14282a() {
                super(C14283t.f45256f);
            }

            public boolean hasName() {
                return ((C14283t) this.instance).hasName();
            }

            public String getName() {
                return ((C14283t) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((C14283t) this.instance).getNameBytes();
            }

            /* renamed from: a */
            public C14282a m54290a(String str) {
                copyOnWrite();
                ((C14283t) this.instance).m54296a(str);
                return this;
            }

            public boolean hasId() {
                return ((C14283t) this.instance).hasId();
            }

            public String getId() {
                return ((C14283t) this.instance).getId();
            }

            public ByteString getIdBytes() {
                return ((C14283t) this.instance).getIdBytes();
            }

            /* renamed from: b */
            public C14282a m54292b(String str) {
                copyOnWrite();
                ((C14283t) this.instance).m54300b(str);
                return this;
            }

            public boolean hasDisplayed() {
                return ((C14283t) this.instance).hasDisplayed();
            }

            public boolean getDisplayed() {
                return ((C14283t) this.instance).getDisplayed();
            }

            /* renamed from: a */
            public C14282a m54291a(boolean z) {
                copyOnWrite();
                ((C14283t) this.instance).m54297a(z);
                return this;
            }
        }

        private C14283t() {
        }

        public boolean hasName() {
            return (this.f45258a & 1) == 1;
        }

        public String getName() {
            return this.f45259b;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.f45259b);
        }

        /* renamed from: a */
        private void m54296a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45258a |= 1;
            this.f45259b = str;
        }

        public boolean hasId() {
            return (this.f45258a & 2) == 2;
        }

        public String getId() {
            return this.f45260c;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.f45260c);
        }

        /* renamed from: b */
        private void m54300b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45258a |= 2;
            this.f45260c = str;
        }

        public boolean hasDisplayed() {
            return (this.f45258a & 4) == 4;
        }

        public boolean getDisplayed() {
            return this.f45261d;
        }

        /* renamed from: a */
        private void m54297a(boolean z) {
            this.f45258a |= 4;
            this.f45261d = z;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45258a & 1) == 1) {
                codedOutputStream.writeString(1, getName());
            }
            if ((this.f45258a & 2) == 2) {
                codedOutputStream.writeString(2, getId());
            }
            if ((this.f45258a & 4) == 4) {
                codedOutputStream.writeBool(3, this.f45261d);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45258a & 1) == 1) {
                i = 0 + CodedOutputStream.computeStringSize(1, getName());
            }
            if ((this.f45258a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getId());
            }
            if ((this.f45258a & 4) == 4) {
                i += CodedOutputStream.computeBoolSize(3, this.f45261d);
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14282a m54293a() {
            return (C14282a) f45256f.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14283t();
                case 2:
                    methodToInvoke = this.f45262e;
                    if (methodToInvoke == 1) {
                        return f45256f;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasName() == null) {
                        if (methodToInvoke != null) {
                            this.f45262e = (byte) 0;
                        }
                        return null;
                    } else if (hasId() == null) {
                        if (methodToInvoke != null) {
                            this.f45262e = (byte) 0;
                        }
                        return null;
                    } else if (hasDisplayed() == null) {
                        if (methodToInvoke != null) {
                            this.f45262e = (byte) 0;
                        }
                        return null;
                    } else {
                        if (methodToInvoke != null) {
                            this.f45262e = (byte) 1;
                        }
                        return f45256f;
                    }
                case 3:
                    return null;
                case 4:
                    return new C14282a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14283t c14283t = (C14283t) obj2;
                    this.f45259b = visitor.visitString(hasName(), this.f45259b, c14283t.hasName(), c14283t.f45259b);
                    this.f45260c = visitor.visitString(hasId(), this.f45260c, c14283t.hasId(), c14283t.f45260c);
                    this.f45261d = visitor.visitBoolean(hasDisplayed(), this.f45261d, c14283t.hasDisplayed(), c14283t.f45261d);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45258a |= c14283t.f45258a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45258a |= 1;
                                    this.f45259b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45258a |= 2;
                                    this.f45260c = methodToInvoke;
                                } else if (methodToInvoke == 24) {
                                    this.f45258a |= 4;
                                    this.f45261d = codedInputStream.readBool();
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45257g == null) {
                        synchronized (C14283t.class) {
                            if (f45257g == null) {
                                f45257g = new DefaultInstanceBasedParser(f45256f);
                            }
                        }
                    }
                    return f45257g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45256f;
        }

        static {
            f45256f.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14283t> m54298b() {
            return f45256f.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$u */
    public static final class C14285u extends GeneratedMessageLite<C14285u, C14284a> implements SchoolsOrBuilder {
        /* renamed from: c */
        private static final C14285u f45263c = new C14285u();
        /* renamed from: d */
        private static volatile Parser<C14285u> f45264d;
        /* renamed from: a */
        private ProtobufList<C14283t> f45265a = C14285u.emptyProtobufList();
        /* renamed from: b */
        private byte f45266b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$u$a */
        public static final class C14284a extends Builder<C14285u, C14284a> implements SchoolsOrBuilder {
            private C14284a() {
                super(C14285u.f45263c);
            }

            public List<C14283t> getSchoolsList() {
                return Collections.unmodifiableList(((C14285u) this.instance).getSchoolsList());
            }

            public int getSchoolsCount() {
                return ((C14285u) this.instance).getSchoolsCount();
            }

            public C14283t getSchools(int i) {
                return ((C14285u) this.instance).getSchools(i);
            }

            /* renamed from: a */
            public C14284a m54302a(C14283t c14283t) {
                copyOnWrite();
                ((C14285u) this.instance).m54305a(c14283t);
                return this;
            }
        }

        private C14285u() {
        }

        public List<C14283t> getSchoolsList() {
            return this.f45265a;
        }

        public int getSchoolsCount() {
            return this.f45265a.size();
        }

        public C14283t getSchools(int i) {
            return (C14283t) this.f45265a.get(i);
        }

        /* renamed from: c */
        private void m54308c() {
            if (!this.f45265a.isModifiable()) {
                this.f45265a = GeneratedMessageLite.mutableCopy(this.f45265a);
            }
        }

        /* renamed from: a */
        private void m54305a(C14283t c14283t) {
            if (c14283t == null) {
                throw new NullPointerException();
            }
            m54308c();
            this.f45265a.add(c14283t);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45265a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45265a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45265a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45265a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14285u m54304a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14285u) GeneratedMessageLite.parseFrom(f45263c, bArr);
        }

        /* renamed from: a */
        public static C14284a m54303a() {
            return (C14284a) f45263c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14285u();
                case 2:
                    methodToInvoke = this.f45266b;
                    if (methodToInvoke == 1) {
                        return f45263c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getSchoolsCount(); obj++) {
                        if (getSchools(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45266b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45266b = (byte) 1;
                    }
                    return f45263c;
                case 3:
                    this.f45265a.makeImmutable();
                    return null;
                case 4:
                    return new C14284a();
                case 5:
                    this.f45265a = ((Visitor) obj).visitList(this.f45265a, ((C14285u) obj2).f45265a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45265a.isModifiable() == null) {
                                        this.f45265a = GeneratedMessageLite.mutableCopy(this.f45265a);
                                    }
                                    this.f45265a.add(codedInputStream.readMessage(C14283t.m54298b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45264d == null) {
                        synchronized (C14285u.class) {
                            if (f45264d == null) {
                                f45264d = new DefaultInstanceBasedParser(f45263c);
                            }
                        }
                    }
                    return f45264d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45263c;
        }

        static {
            f45263c.makeImmutable();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$v */
    public static final class C14287v extends GeneratedMessageLite<C14287v, C14286a> implements TagOrBuilder {
        /* renamed from: f */
        private static final C14287v f45267f = new C14287v();
        /* renamed from: g */
        private static volatile Parser<C14287v> f45268g;
        /* renamed from: a */
        private int f45269a;
        /* renamed from: b */
        private String f45270b = "";
        /* renamed from: c */
        private String f45271c = "";
        /* renamed from: d */
        private String f45272d = "";
        /* renamed from: e */
        private byte f45273e = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$v$a */
        public static final class C14286a extends Builder<C14287v, C14286a> implements TagOrBuilder {
            private C14286a() {
                super(C14287v.f45267f);
            }

            public boolean hasId() {
                return ((C14287v) this.instance).hasId();
            }

            public String getId() {
                return ((C14287v) this.instance).getId();
            }

            public ByteString getIdBytes() {
                return ((C14287v) this.instance).getIdBytes();
            }

            /* renamed from: a */
            public C14286a m54309a(String str) {
                copyOnWrite();
                ((C14287v) this.instance).m54314a(str);
                return this;
            }

            public boolean hasName() {
                return ((C14287v) this.instance).hasName();
            }

            public String getName() {
                return ((C14287v) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((C14287v) this.instance).getNameBytes();
            }

            /* renamed from: b */
            public C14286a m54310b(String str) {
                copyOnWrite();
                ((C14287v) this.instance).m54317b(str);
                return this;
            }

            public boolean hasRegion() {
                return ((C14287v) this.instance).hasRegion();
            }

            public String getRegion() {
                return ((C14287v) this.instance).getRegion();
            }

            public ByteString getRegionBytes() {
                return ((C14287v) this.instance).getRegionBytes();
            }

            /* renamed from: c */
            public C14286a m54311c(String str) {
                copyOnWrite();
                ((C14287v) this.instance).m54320c(str);
                return this;
            }
        }

        private C14287v() {
        }

        public boolean hasId() {
            return (this.f45269a & 1) == 1;
        }

        public String getId() {
            return this.f45270b;
        }

        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.f45270b);
        }

        /* renamed from: a */
        private void m54314a(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45269a |= 1;
            this.f45270b = str;
        }

        public boolean hasName() {
            return (this.f45269a & 2) == 2;
        }

        public String getName() {
            return this.f45271c;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.f45271c);
        }

        /* renamed from: b */
        private void m54317b(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45269a |= 2;
            this.f45271c = str;
        }

        public boolean hasRegion() {
            return (this.f45269a & 4) == 4;
        }

        public String getRegion() {
            return this.f45272d;
        }

        public ByteString getRegionBytes() {
            return ByteString.copyFromUtf8(this.f45272d);
        }

        /* renamed from: c */
        private void m54320c(String str) {
            if (str == null) {
                throw new NullPointerException();
            }
            this.f45269a |= 4;
            this.f45272d = str;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.f45269a & 1) == 1) {
                codedOutputStream.writeString(1, getId());
            }
            if ((this.f45269a & 2) == 2) {
                codedOutputStream.writeString(2, getName());
            }
            if ((this.f45269a & 4) == 4) {
                codedOutputStream.writeString(3, getRegion());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            i = 0;
            if ((this.f45269a & 1) == 1) {
                i = 0 + CodedOutputStream.computeStringSize(1, getId());
            }
            if ((this.f45269a & 2) == 2) {
                i += CodedOutputStream.computeStringSize(2, getName());
            }
            if ((this.f45269a & 4) == 4) {
                i += CodedOutputStream.computeStringSize(3, getRegion());
            }
            i += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i;
            return i;
        }

        /* renamed from: a */
        public static C14286a m54312a() {
            return (C14286a) f45267f.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14287v();
                case 2:
                    methodToInvoke = this.f45273e;
                    if (methodToInvoke == 1) {
                        return f45267f;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    if (hasId() == null) {
                        if (methodToInvoke != null) {
                            this.f45273e = (byte) 0;
                        }
                        return null;
                    } else if (hasName() == null) {
                        if (methodToInvoke != null) {
                            this.f45273e = (byte) 0;
                        }
                        return null;
                    } else if (hasRegion() == null) {
                        if (methodToInvoke != null) {
                            this.f45273e = (byte) 0;
                        }
                        return null;
                    } else {
                        if (methodToInvoke != null) {
                            this.f45273e = (byte) 1;
                        }
                        return f45267f;
                    }
                case 3:
                    return null;
                case 4:
                    return new C14286a();
                case 5:
                    Visitor visitor = (Visitor) obj;
                    C14287v c14287v = (C14287v) obj2;
                    this.f45270b = visitor.visitString(hasId(), this.f45270b, c14287v.hasId(), c14287v.f45270b);
                    this.f45271c = visitor.visitString(hasName(), this.f45271c, c14287v.hasName(), c14287v.f45271c);
                    this.f45272d = visitor.visitString(hasRegion(), this.f45272d, c14287v.hasRegion(), c14287v.f45272d);
                    if (visitor == MergeFromVisitor.INSTANCE) {
                        this.f45269a |= c14287v.f45269a;
                    }
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45269a |= 1;
                                    this.f45270b = methodToInvoke;
                                } else if (methodToInvoke == 18) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45269a |= 2;
                                    this.f45271c = methodToInvoke;
                                } else if (methodToInvoke == 26) {
                                    methodToInvoke = codedInputStream.readString();
                                    this.f45269a |= 4;
                                    this.f45272d = methodToInvoke;
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45268g == null) {
                        synchronized (C14287v.class) {
                            if (f45268g == null) {
                                f45268g = new DefaultInstanceBasedParser(f45267f);
                            }
                        }
                    }
                    return f45268g;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45267f;
        }

        static {
            f45267f.makeImmutable();
        }

        /* renamed from: b */
        public static Parser<C14287v> m54315b() {
            return f45267f.getParserForType();
        }
    }

    /* renamed from: com.tinder.data.generated.proto.TinderProto$w */
    public static final class C14289w extends GeneratedMessageLite<C14289w, C14288a> implements TagsOrBuilder {
        /* renamed from: c */
        private static final C14289w f45274c = new C14289w();
        /* renamed from: d */
        private static volatile Parser<C14289w> f45275d;
        /* renamed from: a */
        private ProtobufList<C14287v> f45276a = C14289w.emptyProtobufList();
        /* renamed from: b */
        private byte f45277b = (byte) -1;

        /* renamed from: com.tinder.data.generated.proto.TinderProto$w$a */
        public static final class C14288a extends Builder<C14289w, C14288a> implements TagsOrBuilder {
            private C14288a() {
                super(C14289w.f45274c);
            }

            public List<C14287v> getTagsList() {
                return Collections.unmodifiableList(((C14289w) this.instance).getTagsList());
            }

            public int getTagsCount() {
                return ((C14289w) this.instance).getTagsCount();
            }

            public C14287v getTags(int i) {
                return ((C14289w) this.instance).getTags(i);
            }

            /* renamed from: a */
            public C14288a m54321a(C14286a c14286a) {
                copyOnWrite();
                ((C14289w) this.instance).m54323a(c14286a);
                return this;
            }
        }

        private C14289w() {
        }

        public List<C14287v> getTagsList() {
            return this.f45276a;
        }

        /* renamed from: a */
        public List<? extends TagOrBuilder> m54328a() {
            return this.f45276a;
        }

        public int getTagsCount() {
            return this.f45276a.size();
        }

        public C14287v getTags(int i) {
            return (C14287v) this.f45276a.get(i);
        }

        /* renamed from: d */
        private void m54327d() {
            if (!this.f45276a.isModifiable()) {
                this.f45276a = GeneratedMessageLite.mutableCopy(this.f45276a);
            }
        }

        /* renamed from: a */
        private void m54323a(C14286a c14286a) {
            m54327d();
            this.f45276a.add(c14286a.build());
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.f45276a.size(); i++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f45276a.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (i = 0; i < this.f45276a.size(); i++) {
                i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f45276a.get(i));
            }
            i2 += this.unknownFields.getSerializedSize();
            this.memoizedSerializedSize = i2;
            return i2;
        }

        /* renamed from: a */
        public static C14289w m54322a(byte[] bArr) throws InvalidProtocolBufferException {
            return (C14289w) GeneratedMessageLite.parseFrom(f45274c, bArr);
        }

        /* renamed from: b */
        public static C14288a m54325b() {
            return (C14288a) f45274c.toBuilder();
        }

        protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            byte b = (byte) 0;
            switch (C86671.f30521a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C14289w();
                case 2:
                    methodToInvoke = this.f45277b;
                    if (methodToInvoke == 1) {
                        return f45274c;
                    }
                    if (methodToInvoke == null) {
                        return null;
                    }
                    methodToInvoke = ((Boolean) obj).booleanValue();
                    for (obj = null; obj < getTagsCount(); obj++) {
                        if (getTags(obj).isInitialized() == null) {
                            if (methodToInvoke != null) {
                                this.f45277b = (byte) 0;
                            }
                            return null;
                        }
                    }
                    if (methodToInvoke != null) {
                        this.f45277b = (byte) 1;
                    }
                    return f45274c;
                case 3:
                    this.f45276a.makeImmutable();
                    return null;
                case 4:
                    return new C14288a();
                case 5:
                    this.f45276a = ((Visitor) obj).visitList(this.f45276a, ((C14289w) obj2).f45276a);
                    methodToInvoke = MergeFromVisitor.INSTANCE;
                    return this;
                case 6:
                    CodedInputStream codedInputStream = (CodedInputStream) obj;
                    ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                    while (b == (byte) 0) {
                        try {
                            methodToInvoke = codedInputStream.readTag();
                            if (methodToInvoke != null) {
                                if (methodToInvoke == 10) {
                                    if (this.f45276a.isModifiable() == null) {
                                        this.f45276a = GeneratedMessageLite.mutableCopy(this.f45276a);
                                    }
                                    this.f45276a.add(codedInputStream.readMessage(C14287v.m54315b(), extensionRegistryLite));
                                } else if (parseUnknownField(methodToInvoke, codedInputStream) == null) {
                                }
                            }
                            b = (byte) 1;
                        } catch (MethodToInvoke methodToInvoke2) {
                            throw new RuntimeException(methodToInvoke2.setUnfinishedMessage(this));
                        } catch (MethodToInvoke methodToInvoke22) {
                            throw new RuntimeException(new InvalidProtocolBufferException(methodToInvoke22.getMessage()).setUnfinishedMessage(this));
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (f45275d == null) {
                        synchronized (C14289w.class) {
                            if (f45275d == null) {
                                f45275d = new DefaultInstanceBasedParser(f45274c);
                            }
                        }
                    }
                    return f45275d;
                default:
                    throw new UnsupportedOperationException();
            }
            return f45274c;
        }

        static {
            f45274c.makeImmutable();
        }
    }
}
