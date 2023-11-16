package org.victoria_3_modify_homelands_creator.parsers

import com.fasterxml.jackson.module.kotlin.jsonMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

fun getCultureListConfiguration(configName: String): List<String> {
    val mapper = jsonMapper {
        addModule(kotlinModule())
    }

    val text = File("src/main/resources/configuration/$configName.json").readText(Charsets.UTF_8)

    val cultureListFromJson: List<String> = mapper.readValue(text)

    return cultureListFromJson

}
