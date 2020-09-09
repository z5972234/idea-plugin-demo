package com.github.z5972234.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.z5972234.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
