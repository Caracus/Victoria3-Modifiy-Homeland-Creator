package org.victoria_3_modify_homelands_creator

import org.victoria_3_modify_homelands_creator.creators.*
import org.victoria_3_modify_homelands_creator.parsers.getCultureListConfiguration

fun main(args: Array<String>) {

    //val configFileName = "VanillaCulturesConfiguration"
    val configFileName = "SyncreticCulturesConfiguration"

    var cultureNameListConfiguration = getCultureListConfiguration(configFileName)

    //variable
    createRemoveHomelandEvent(cultureNameListConfiguration)
    createAddHomelandEvent(cultureNameListConfiguration)
    createLocalization(cultureNameListConfiguration)

    //static
    createRemoveHomelandDecision()
    createAddHomelandDecision(cultureNameListConfiguration)
    createDecree()

    println("Done")

}