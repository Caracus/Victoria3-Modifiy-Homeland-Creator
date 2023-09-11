package org.victoria_3_modify_homelands_creator.creators

import utils.printFile
import utils.readFileAsText

fun createAddHomelandEvent(cultureList: List<String>) {
    val textOfFile = readFileAsText("src/main/resources/templates/genericAddHomelandEventTemplate.txt")

    cultureList.forEach {
        createAddHomelandEventForCulture(textOfFile, it)
    }
}

private fun createAddHomelandEventForCulture(templateText: String, culture: String) {
    val finishedText = templateText.replace("<cultureName>", culture)
    printFile("events/", "add_${culture}_primary_homelands.txt", finishedText)
}
