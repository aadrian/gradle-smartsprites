package io.github.smartsprites.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class SmartSpritesPlugin implements Plugin<Project> {
    def void apply(Project project) {
        project.extensions.create("spriteConf", SmartSpritesExtension)

        // define the task named sprites of type SmartSpritesTask
        project.task('sprites', type: SmartSpritesTask)
    }
}
