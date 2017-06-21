package io.github.smartsprites.gradle

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

class SmartSpritesPluginTest {
    @Test public void applyPlugin() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'smartsprites'
        assertTrue(project.tasks.sprites instanceof SmartSpritesTask)
    }
}
