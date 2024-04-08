plugins {
    alias(libs.plugins.run.paper)
    alias(libs.plugins.shadow)
}

val mcVersion = libs.versions.bundle.get()

dependencies {
    paperweight.paperDevBundle(mcVersion)

    implementation(libs.config.me)

    implementation(libs.metrics)

    implementation(libs.vital)

    compileOnly(libs.placeholder.api)

    compileOnly(libs.vault) {
        exclude("org.bukkit", "bukkit")
    }
}

tasks {
    runServer {
        jvmArgs("-Dnet.kyori.ansi.colorLevel=truecolor")

        defaultCharacterEncoding = Charsets.UTF_8.name()

        minecraftVersion("1.20.4")

        downloadPlugins {
            url("https://download.luckperms.net/1534/bukkit/loader/LuckPerms-Bukkit-5.4.121.jar")

            hangar("PlaceholderAPI", "2.11.5")
        }
    }

    assemble {
        dependsOn(reobfJar)
    }

    reobfJar {
        outputJar = rootProject.layout.buildDirectory.file("$rootDir/jars/paper/${rootProject.name.lowercase()}-${rootProject.version}.jar")
    }

    shadowJar {
        listOf(
            "org.bstats",
            "ch.jalu"
        ).forEach {
            relocate(it, "libs.$it")
        }
    }

    processResources {
        val props = mapOf(
            "name" to rootProject.name,
            "version" to rootProject.version,
            "group" to rootProject.group,
            "description" to rootProject.description,
            "apiVersion" to "1.20"
        )

        filesMatching("paper-plugin.yml") {
            expand(props)
        }
    }
}