sbt-jumpstart
=============

VERY simple SBT directory template to get you going with SBT and Scala.

    <yourprojectname>
    ├── build.sbt
    ├── lib
    ├── project
    │   ├── Build.scala
    │   └── plugins.sbt
    ├── README.md
    └── src
       ├── main
       │   ├── java
       │   ├── resources
       │   └── scala
       └── test
           ├── java
           ├── resources
           └── scala

To get this, just do:
> git clone git://github.com/jacobus/sbt-jumpstart <your-project-name>

This may save you five minutes of your life. Everytime you use it, you can: take a leak, eat a chocolate, drink cocao or stare out the window.

Note: If you own a Scala repository, please send me the content I should add to the build files (or send a pull request) so that it can become part of the template. It will be commented out be default, but will allow new users to get started.

Requirements
------------

Scala and sbt-extras should in installed.

For Ubuntu:
> sudo apt-get install sbt

This installs the sbt-extras script under /usr/bin/sbt and will also put the sbt-launch.jar file in some mystical place on your system.

Step 1:
-------

git clone git://github.com/jacobus/sbt-jumpstart <your-project-name>

Step 2:
-------

Open build.sbt and set your project name, company name and version

Step 3 (Optional):
-----------------

If you are using Scala IDE, then run:
> sbt eclipse

Now you can use 'import existing project' in Eclipse. Keep in mind that you need to do this again if you change external dependancies and then refresh your project in Eclipse.

Done
----

First run:

> sbt

Stuff should happen.

