import sbtcrossproject.{crossProject, CrossType}

lazy val bar = crossProject(JSPlatform, JVMPlatform, NativePlatform)
  .settings(scalaVersion := "2.11.8")
  .nativeSettings(nativeMode := "release")

lazy val barJS     = bar.js
lazy val barJVM    = bar.jvm
lazy val barNative = bar.native
