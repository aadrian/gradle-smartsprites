# gradle-smartsprites
Gradle Plug-in for SmartSprites

### Usage
Specify in your `build.gradle`:
```groovy
buildscript {
    repositories {
	    jcenter()
        maven {
            url uri('../repo')
        }
    }
    dependencies {
        classpath group: 'io.github.smartsprites.gradle',
                  name: 'gradle-smartsprites',
                  version: '1.1-SNAPSHOT'
    }
}

apply plugin: 'smartsprites'

spriteConf {
    cssFileEncoding = "UTF-8"
    cssFileSuffix = "-v${version}"
	logLevel = "INFO"
	spritePngDepth = "AUTO"
	spritePngIe6 = "false"
}
```

Than just call ```gradle sprites``` to generate the sprites.