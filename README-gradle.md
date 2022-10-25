# PeekDatabase-V2

lanjutan dari ini [Ini](https://github.com/gzeinnumer/EasyOptionMenu/tree/gradle) [Source](https://www.youtube.com/watch?v=Y7_x8FdFFuA&ab_channel=InfoBookTech)

- build.gradle(Module:MyLib)
```gradle
plugins {
    id 'com.android.library'
    id 'maven-publish'
}

...
afterEvaluate {
    publishing{
        publications{
            reslease(MavenPublication){
                from components.release
                groupId = 'com.gzeinnumer'
                artifactId = 'pdb'
                version = '1.0'
            }
        }
    }
}
```