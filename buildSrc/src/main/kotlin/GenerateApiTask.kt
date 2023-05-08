import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.named
import org.gradle.kotlin.dsl.register

open class GenerateApiTask : DefaultTask() {
    init {
        group = "DictionaryApi"
        description = "Generates Web module using open api generator."
    }
}
fun Project.declareGenerateApiTask() = tasks.register<GenerateApiTask>("generateApi") {
    dependsOn("openApiGenerate")
    finalizedBy("spotlessApply")
}
val Project.generateApi: TaskProvider<GenerateApiTask>
    get() = tasks.named<GenerateApiTask>("generateApi")