#include <jni.h>
#include <string>

//using namespace cv;

extern "C" JNIEXPORT jstring JNICALL
Java_com_rango_tool_opencvdemo_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT void JNICALL
Java_com_rango_tool_opencvdemo_MainActivity_getEdge(JNIEnv *env, jobject instance, jobject bitmap) {

    // TODO

}