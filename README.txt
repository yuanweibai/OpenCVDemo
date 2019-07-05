1. opencv 3.4.6:
   ndk 版本r17
   defaultConfig {
       externalNativeBuild {
           cmake {
              cppFlags "-std=c++11 -frtti -fexceptions"

                  //必须配置此项
                  arguments '-DANDROID_STL=gnustl_shared'

                  abiFilters "armeabi-v7a", "arm64-v8a"
              }
           }

        ndk {
            abiFilters 'armeabi-v7a', "arm64-v8a"
        }
   }


2. opencv 4.1.0:
   ndk 版本最新，如r20
   defaultConfig {

       //此minSdkVersion最低为21
       minSdkVersion 21

       externalNativeBuild {
           cmake {
              cppFlags "-std=c++11 -frtti -fexceptions"

                  //必须配置此项
                  arguments '-DANDROID_STL=c++_shared'

                  abiFilters "armeabi-v7a", "arm64-v8a"
              }
           }

        ndk {
            abiFilters 'armeabi-v7a', "arm64-v8a"
        }
   }