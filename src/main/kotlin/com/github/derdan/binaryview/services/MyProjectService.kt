package com.github.derdan.binaryview.services

import com.github.derdan.binaryview.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
