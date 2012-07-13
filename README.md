sbt-jumpstart
=============

VERY simple SBT directory template to get you going with new versions of SBT and Scala.

    <yourprojectname>
    ├── build.sbt            <-- Basics and Scala version
    ├── README.md            <-- The file you are reading
    ├── .gitignore           <-- Stuff you don't want in git
    │
    ├── lib
    ├── project
    │   ├── build.properties <-- You can set the SBT version here
    │   ├── Build.scala      <-- More advanced config
    │   └── plugins.sbt      <-- SBT plugins like sbteclipse
    └── src
       ├── main
       │   ├── java          <-- Java source files - if you are a dinosaur
       │   ├── resources     <-- Stuff that must be added to the jar
       │   └── scala         <-- Scala source files - here you profit
       └── test
           ├── java
           ├── resources
           └── scala

To get this, just do:

    git clone git://github.com/jacobus/sbt-jumpstart <your-project-name>

This may save you five minutes of your life. Everytime you use it, you can: take a leak, eat a chocolate, drink cocao or stare out the window.

Requirements
------------

Scala and sbt-extras should in installed.

For Ubuntu:

    sudo apt-get install sbt

This installs the sbt-extras script under /usr/bin/sbt and will also put the sbt-launch.jar file in some mystical place on your system.

Step 1:
-------

If you haven't done this already, clone the git repository into a new directory.

    git clone git://github.com/jacobus/sbt-jumpstart <your-project-name>

Step 2:
-------

Open build.sbt and set your project name, company name and version

Step 3 (Option 1):
-----------------

If you are using Scala IDE, then run:
    sbt eclipse

Now you can use 'import existing project' in Eclipse. Keep in mind that you need to do this again if you change external dependancies and then refresh your project in Eclipse.

Step 3 (Option 2):
-----------------

Just run:

    sbt

Stuff should happen.

