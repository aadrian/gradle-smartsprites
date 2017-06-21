package io.github.smartsprites.gradle

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*
        
class SmartSpritesTaskTest {
    @Test public void generateTask() {
        Project project = ProjectBuilder.builder().build()
        def task = project.task('sprites', type: SmartSpritesTask)
        assertTrue(task instanceof SmartSpritesTask)
    }
}
