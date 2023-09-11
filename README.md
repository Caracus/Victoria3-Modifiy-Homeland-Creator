# Victoria 3 Homeland Modification Creator

<!-- ABOUT THE PROJECT -->
### What does this do?
## Automates the creation of Homeland Modification creation
####aswell as the needed events and decisions based on a namelist to recreate it for mods with different culture with a single click


### Built With
- Kotlin
- Maven
- IntelliJ IDEA (any other compatible IDEA will do just fine)

## How to use it
1. Start under src/main/kotlin/./CreateHomelandModifier.kt which orchestrates all the main functions
2. Pressing the green icon or starting it will launch the program and create the mod files under target/generated-mod-files
3. Adjust the culture list (VanillaCulturesConfiguration.json as a reference) for your mod and press run
4. Copy over the generated files

### Why might this be interesting for other modders?
If you are playing with a mod that uses different cultures you will have to adjust the cultures to get 100% culture coverage, this does it with a simple click

### How to set it up
1. I suggest using the IntelliJ IDEA which has a free community edition.
2. Checkout the latest version via git or download it. (If you want to contribute directly you need git anyway)
3. Import the project into the IDEA via the pom.xml as a new project (File/Open/..) which will then be used to automatically build the project.

### Background/Mod philosophy
Should be on the [Mod Page](pending)

### How to contribute
If you know your way around git. Then create a branch and open a pull request with the desired changes.
Otherwise let me know via Steam via comment.
