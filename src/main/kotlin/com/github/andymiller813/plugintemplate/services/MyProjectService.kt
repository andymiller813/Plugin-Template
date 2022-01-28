package com.github.andymiller813.plugintemplate.services

import com.intellij.openapi.project.Project
import com.github.andymiller813.plugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
