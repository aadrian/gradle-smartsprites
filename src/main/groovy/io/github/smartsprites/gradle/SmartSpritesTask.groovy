package io.github.smartsprites.gradle

import org.carrot2.labs.smartsprites.SmartSprites
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SmartSpritesTask extends DefaultTask {
    @TaskAction
    def sprites() {
        String rootDirPath = project.spriteConf.rootDirPath
        String outputDirPath = project.spriteConf.outputDirPath
        String cssFiles = project.spriteConf.cssFiles
        String documentRootDirPath = project.spriteConf.documentRootDirPath
        String spritePngDepth = project.spriteConf.spritePngDepth
        String spritePngIe6 = project.spriteConf.spritePngIe6
        String cssFileEncoding = project.spriteConf.cssFileEncoding
        String cssFileSuffix = project.spriteConf.cssFileSuffix
        String noCssFileSuffix = project.spriteConf.noCssFileSuffix
        String logLevel = project.spriteConf.logLevel

        println "----------SpriteConfig:-------------"
        println "rootDirPath="+  rootDirPath
        println "outputDirPath="+  outputDirPath
        println "cssFiles="+  cssFiles
        println "documentRootDirPath="+  documentRootDirPath
        println "spritePngDepth="+  spritePngDepth
        println "spritePngIe6="+  spritePngIe6
        println "cssFileEncoding="+  cssFileEncoding
        println "cssFileSuffix="+  cssFileSuffix
        println "noCssFileSuffix="+  noCssFileSuffix
        println "logLevel="+  logLevel

        List<String> args = new LinkedList<String>();

        args.add("--root-dir-path");
        args.add(rootDirPath?:"${project.projectDir}${File.separator}src${File.separator}main${File.separator}webapp".toString())

        args.add("--output-dir-path");
        args.add(outputDirPath?:"${project.buildDir}${File.separator}${project.name}".toString());

        if (logLevel != null) {
            args.add("--log-level");
            args.add(logLevel);
        }

        if (cssFiles != null) {
            args.add("--css-files");
            args.add(cssFiles);
        }

        if("true".equals(noCssFileSuffix)) {
            args.add("--css-file-suffix");
            args.add("");
        } else {
            if (cssFileSuffix != null) {
                args.add("--css-file-suffix");
                args.add(cssFileSuffix);
            }
        }

        if (cssFileEncoding != null) {
            args.add("--css-file-encoding");
            args.add(cssFileEncoding);
        }

        if (documentRootDirPath != null) {
            args.add("--document-root-dir-path");
            args.add(documentRootDirPath);
        }

        if (spritePngDepth != null) {
            args.add("--sprite-png-depth");
            args.add(spritePngDepth);
        }

        if (spritePngIe6 != null) {
            args.add("--sprite-png-ie6");
            args.add(spritePngIe6);
        }

        // println "Call SmartSprties with args = $args"
        SmartSprites.main(args.toArray(new String[0]));
    }
}
