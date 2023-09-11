package org.victoria_3_modify_homelands_creator.creators

import utils.format
import utils.printFile
import utils.readFileAsText

fun createRemoveHomelandEvent(cultureList: List<String>) {
    val textOfFile = readFileAsText("src/main/resources/templates/genericRemoveHomelandEventTemplate.txt")

    var text = textOfFile

    val allBlock = createRemoveHomelandEventBlockAll(cultureList)

    val percentageBlockOne = createRemoveHomelandEventBlockPercentages(cultureList, "0.1")
    val percentageBlockTwo = createRemoveHomelandEventBlockPercentages(cultureList, "0.2")
    val percentageBlockThree = createRemoveHomelandEventBlockPercentages(cultureList, "0.35")
    val percentageBlockFour = createRemoveHomelandEventBlockPercentages(cultureList, "0.5")

    text = text.replace("<cultures_check_block_no_percentages>", allBlock)
    text = text.replace("<cultures_check_block_tier_1_percentages>", percentageBlockOne)
    text = text.replace("<cultures_check_block_tier_2_percentages>", percentageBlockTwo)
    text = text.replace("<cultures_check_block_tier_3_percentages>", percentageBlockThree)
    text = text.replace("<cultures_check_block_tier_4_percentages>", percentageBlockFour)


    printFile("events/", "_removeNonPrimaryHomelands.txt", text)
}

fun createRemoveHomelandEventBlockAll(cultureList: List<String>): String {
    val textOfFile = readFileAsText("src/main/resources/templates/genericRemoveHomelandEventTemplateCultureCheckBlockAll.txt")

    var templateText = textOfFile

    var blockText = ""

    cultureList.forEach { culture ->
        blockText += templateText.replace("<cultureName>", culture) + "\n"
    }

    return blockText
}

fun createRemoveHomelandEventBlockPercentages(cultureList: List<String>, percentageThreshold: String): String {
    val textOfFile = readFileAsText("src/main/resources/templates/genericRemoveHomelandEventTemplateCultureCheckBlockPercentage.txt")

    var templateText = textOfFile

    var blockText = ""

    cultureList.forEach { culture ->
        blockText += templateText
            .replace("<cultureName>", culture)
            .replace("<percentageThreshold>", percentageThreshold)
            .plus("\n")
    }

    return blockText
}

