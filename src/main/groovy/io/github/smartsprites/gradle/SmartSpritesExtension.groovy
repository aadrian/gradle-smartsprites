package io.github.smartsprites.gradle

class SmartSpritesExtension {
    // String rootDirPath = "${projectDir}/src/main/webapp"  // maven
    String rootDirPath
    // String outputDirPath = "${project.build.directory}/${project.artifactId}" // maven
    String outputDirPath
    String cssFiles
    String documentRootDirPath
    String spritePngDepth
    String spritePngIe6
    String cssFileEncoding
    String cssFileSuffix
    String noCssFileSuffix = "false"
    String logLevel = "WARN"

    // FileCollection
    def source
}
