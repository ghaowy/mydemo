package com.github.ghaowy.mydemo.services

import com.intellij.openapi.project.Project
import com.github.ghaowy.mydemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
