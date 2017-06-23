# gradle-smartsprites
Gradle Plug-in for [SmartSprites](http://csssprites.org/).

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

One can also specify the CSS file to process:
 - ```cssFiles = "${webAppDir}/css/my_style.css"``` in case of using the 'war' plug-in
 - or a list of files with ```source = fileTree(dir: "${webAppDir}", include: '**/*.css')```
 
Than just call ```gradle sprites``` to generate the sprites.