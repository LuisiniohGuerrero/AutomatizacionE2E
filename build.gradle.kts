plugins {
    id 'java'
    id 'io.github.serenity-bdd.serenity-gradle-plugin' version '2.4.34'
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'net.serenity-bdd:serenity-core:2.4.34'
    testImplementation 'net.serenity-bdd:serenity-junit:2.4.34'
    testImplementation 'net.serenity-bdd:serenity-screenplay:2.4.34'
    testImplementation 'net.serenity-bdd:serenity-screenplay-webdriver:2.4.34'
    testImplementation 'org.seleniumhq.selenium:selenium-java:3.141.59'
    testImplementation 'junit:junit:4.13.2'
}

test {
    useJUnitPlatform()
}
