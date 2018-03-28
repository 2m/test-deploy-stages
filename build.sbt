organization := "lt.dvim.test"
name := "test-deploy-stages"

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))
homepage := Some(url("https://github.com/2m/test-deploy-stages"))
scmInfo := Some(ScmInfo(url("https://github.com/2m/test-deploy-stages"), "git@github.com:2m/test-deploy-stages.git"))
developers += Developer("contributors",
                        "Contributors",
                        "https://gitter.im/2m/test-deploy-stages",
                        url("https://github.com/2m/test-deploy-stages/graphs/contributors"))

bintrayOrganization := Some("2m")

sbtPlugin := true
crossSbtVersions := List("0.13.16", "1.0.0")
