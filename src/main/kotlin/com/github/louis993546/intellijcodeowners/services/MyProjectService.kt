package com.github.louis993546.intellijcodeowners.services

import com.github.louis993546.intellijcodeowners.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
