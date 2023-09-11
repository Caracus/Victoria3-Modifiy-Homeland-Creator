package org.victoria_3_modify_homelands_creator.creators


import utils.printFile
import utils.readFileAsText

fun createRemoveHomelandDecision() {
    val textOfFile = readFileAsText("src/main/resources/templates/genericRemoveHomelandDecision.txt")

    printFile("common/decisions/", "removeHomelandsDecision.txt", textOfFile)
}
