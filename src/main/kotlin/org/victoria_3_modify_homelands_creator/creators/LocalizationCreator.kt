package org.victoria_3_modify_homelands_creator.creators

import utils.format
import utils.printFileWithoutBom
import utils.readFileAsText

fun createLocalization(cultureList: List<String>) {
        val textOfFile = readFileAsText("src/main/resources/templates/GenericLocalization.yml")

        val localizations = listOf("braz_por", "english", "french", "german", "japanese", "korean", "polish", "russian", "simp_chinese", "spanish", "turkish")

        localizations.forEach { localization ->
                var text = textOfFile
                text = text.replace("<localization_key>", localization)

                cultureList.forEach { culture ->
                        text += format(0, " add_${culture}_homelands_decision:0 \"Expand the Idea of \$$culture\$ Homelands\"", 1)
                        text += format(0, " add_${culture}_homelands_decision_desc:0 \"Borders are ever changing and so is our understanding of what rightfully belongs to our people. We should formalize what we already know in spirit!\"", 1)
                        text += format(0, " add_${culture}_primary_homelands.1.t:0 \"The Idea of What Belongs to our People\"", 1)
                        text += format(0, " add_${culture}_primary_homelands.1.f:0 \"Through conquest, history, peaceful migration or other means the idea of what rightfully belongs to our people has changed over time. We should formalize what is indirectly true. What criteria shall we apply before the proclaim the extension of our people?\"", 1)
                        text += format(0, " add_${culture}_primary_homelands.1.a:0 \"All that is controlled by us!\"", 1)
                        text += format(0, " add_${culture}_primary_homelands.1.b:0 \"Where more than 10% of our people live!\"", 1)
                        text += format(0, " add_${culture}_primary_homelands.1.c:0 \"Where more than 20% of our people live!\"", 1)
                        text += format(0, " add_${culture}_primary_homelands.1.d:0 \"Where more than 35% of our people live!\"", 1)
                        text += format(0, " add_${culture}_primary_homelands.1.e:0 \"Where more than 50% of our people live!\"", 1)
                }

                printFileWithoutBom("/localization/$localization/", "modify_homelands_l_" + localization + ".yml", text)
        }
    }
