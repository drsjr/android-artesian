pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "android-artisan"
include(":app")
include (":arch:core")
include (":data")
include (":data:base")
include(":data:cards")
include(":domain:base")
include(":domain:cards")
include(":feature:home")
include(":arch:designsystem")
include(":data:pokedex")
include(":domain:pokedex")
