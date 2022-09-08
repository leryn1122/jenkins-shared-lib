#!/usr/bin/env groovy

def detectProjectType() {
    def projectMappings = new Properties()
    new File("resources/detection.properties").withInputStream {
        stream -> projectMappings.load(stream)
    }
    projectMappings.each { entry ->
        if (new File(entry.getValue() as String).exists()) {
            println "This is project organized by: [ " + entry.getKey() + " ]"
        }
    }
}