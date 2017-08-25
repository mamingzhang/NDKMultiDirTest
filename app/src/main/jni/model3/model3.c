/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
#include <string.h>
#include <jni.h>
#include <android/log.h>

jstring getModelName(JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "Model-2");
}

static JNINativeMethod NativeMethods[] = {
        {"getModelName", "()Ljava/lang/String;", (void *)getModelName},
};

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM *vm, void *reserved) {
    JNIEnv *env = NULL;

    if ((*vm)->GetEnv(vm, (void**) &env, JNI_VERSION_1_4) != JNI_OK) {
        return JNI_ERR;
    }

    jclass cls = (*env)->FindClass(env, "com/horsege/ndkmultidirtest/Model3");
    if (cls == NULL) {
        return JNI_ERR;
    }

    int len = sizeof(NativeMethods) / sizeof(NativeMethods[0]);
    if ((*env)->RegisterNatives(env, cls, NativeMethods, len) < 0) {
        return JNI_ERR;
    }

    return JNI_VERSION_1_4;
}
