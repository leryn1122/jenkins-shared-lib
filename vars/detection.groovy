#!/usr/bin/env groovy

import java.nio.file.Paths

def detectProjectType() {
  def projectMappings = new Properties()
//  new File("resources/io/github/leryn/detection.properties").withInputStream {
//    stream -> projectMappings.load(stream)
//  }
  projectMappings.putAll([
        "maven": "pom.xml",
        "gradle": "settings.gradle",
        "npm": "package.json",
        "rust": "Cargo.toml",
        "cmake": "CMakeList.txt",
        "helm": "Chart.yaml",
        "golang": "go.module", 
        "pip": "requirements.txt", 
  ])

  projectMappings.each { entry ->
    File f = Paths.get(entry.getValue() as String).toFile()
    if (f.exists()) {
      println "This is project organized by: [ " + entry.getKey() + " ]"
    } else {
      println f.getName() + " does not exist."
    }
  }
}