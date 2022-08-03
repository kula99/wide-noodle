package com.github.kula99.widenoodle.services

import com.intellij.openapi.project.Project
import com.github.kula99.widenoodle.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
