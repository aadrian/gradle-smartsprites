# gradle-smartsprites
Gradle Plug-in for [SmartSprites](http://csssprites.org/).

### Usage
See: https://plugins.gradle.org/plugin/io.github.smartsprites

Specify at the beginning of your `build.gradle`:
```groovy
plugins {
  id "io.github.smartsprites" version "1.1"
}
```

than configure it. 
```groovy
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