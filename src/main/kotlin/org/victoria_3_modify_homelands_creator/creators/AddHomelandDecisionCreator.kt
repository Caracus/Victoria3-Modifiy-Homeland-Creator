package org.victoria_3_modify_homelands_creator.creators

import utils.printFile
import utils.readFileAsText

fun createAddHomelandDecision(cultureList: List<String>) {
    val textOfFile = readFileAsText("src/main/resources/templates/genericAddHomelandDecisionTemplate.txt")

    cultureList.forEach {
        createAddHomelandDecisionForCulture(textOfFile, it)
    }
}

private fun createAddHomelandDecisionForCulture(templateText: String, culture: String) {
    val finishedText = templateText.replace("<cultureName>", culture)
    printFile("common/decisions/", "add_${culture}_homelands_decision.txt", finishedText)
}
