// Module script for production
import kotlin.modules.*
fun project() {
    module("com.osintegrators.kotlinGranny") {
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/Application.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/routes/Home.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/styles/DefaultStyles.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/jdbc/PreparedStatements.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/jdbc/DataSource.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/jdbc/Statements.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/jdbc/Connections.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/jdbc/ResultSets.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/views/DefaultLayout.kt"
        sources += "/home/lpinto/Documents/training/kotlinGranny/src/com/osintegrators/kotlinGranny/views/home/IndexView.kt"
        // Classpath
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/jce.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/management-agent.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/javaws.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/resources.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/plugin.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/jsse.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/charsets.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/deploy.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/rt.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/ext/dnsns.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/ext/sunpkcs11.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/ext/localedata.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/ext/sunjce_provider.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/ext/sunec.jar"
        classpath += "/usr/lib/jvm/jdk1.7.0_02/jre/lib/ext/zipfs.jar"
        // Output directory, commented out
        //         classpath += "/home/lpinto/Documents/training/kotlinGranny/bin"
        classpath += "/home/lpinto/Documents/training/kotlinGranny/lib/kotlin-runtime.jar"
        classpath += "/home/lpinto/Downloads/kara-30/modules/core/KaraLib.jar"
        classpath += "/home/lpinto/Downloads/postgresql-9.2-1002.jdbc4.jar"
        classpath += "/home/lpinto/Downloads/h2-1.3.170.jar"
        // Java Source Roots
        classpath += "/home/lpinto/Documents/training/kotlinGranny/src"
        // External annotations
        annotationsPath += "/home/lpinto/idea-IC-123.155/lib/jdkAnnotations.jar"
        annotationsPath += "/home/lpinto/.IdeaIC12/config/plugins/Kotlin/kotlinc/lib/kotlin-jdk-annotations.jar"
    }
}
