package org.victoria_3_modify_homelands_creator

import org.victoria_3_modify_homelands_creator.creators.*
import org.victoria_3_modify_homelands_creator.parsers.getCultureListConfiguration

fun main(args: Array<String>) {

    var cultureNameListConfiguration = getCultureListConfiguration()

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