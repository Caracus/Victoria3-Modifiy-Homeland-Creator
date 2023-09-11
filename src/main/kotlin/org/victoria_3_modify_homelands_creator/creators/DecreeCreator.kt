package org.victoria_3_modify_homelands_creator.creators


import utils.printFile
import utils.readFileAsText

fun createDecree() {
    val textOfFile = readFileAsText("src/main/resources/templates/genericDecree.txt")

    printFile("common/decrees/", "01_modify_homelands_decree.txt", textOfFile)
}
