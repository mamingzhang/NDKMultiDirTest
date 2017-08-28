//
// Created by mamingzhang on 2017/8/28.
//

#include <jni.h>
#include <string>

jstring getModelName(JNIEnv *env, jobject obj) {
    return env->NewStringUTF("Model-4");
}

static JNINativeMethod NativeMethods[] = {
        {"getModelName", "()Ljava/lang/String;", (void *)getModelName},
};

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    JNIEnv *env = NULL;

    if (vm->GetEnv((void**) &env, JNI_VERSION_1_4) != JNI_OK) {
        return JNI_ERR;
    }

    jclass cls = env->FindClass("com/horsege/ndkmultidirtest/Model4");
    if (cls == NULL) {
        return JNI_ERR;
    }

    int len = sizeof(NativeMethods) / sizeof(NativeMethods[0]);
    if (env->RegisterNatives(cls, NativeMethods, len) < 0) {
        return JNI_ERR;
    }

    return JNI_VERSION_1_4;
}