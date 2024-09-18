sealed trait VersionRegistry {
  final lazy val scalatest = "3.2.16"
  final lazy val mockito = "3.2.19.0"
  final lazy val pekko = "1.0.2"
}

object VersionRegistry extends VersionRegistry
