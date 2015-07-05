# Tutorials For the Cascading Ecosystem.

This is a collection of tutorials about working with cascading and its related
projects. In contains the following tutorials right now:

* Pattern
* Lingual-HBase
* Lingual-Oracle
* Cascading-Teradata
* Cascading-Hive
* Cascading-Copybook
* Cascading-AWS
* ETL-Log
* Scalding

This project is meant to make it simple to add new tutorials without dealing
with the setup of asciidoctor too much. All common parts such as CSS and the
eRuby template for the html page are in the root project under
`src/site/stylesheets` and `src/templates`. Each subproject contains only
the specific content for that tutorial, i.e. the asciidoc
(`<subproject>/src/asciidoc`) and the images (`<subproject>/src/site/images`).


# Clone the Release Tag

You should first clone the source as follows

```
git clone https://github.com/Cascading/tutorials.git
```

If you are having trouble cloning from GitHub, check out
[GitHub Help](https://help.github.com/articles/which-remote-url-should-i-use).

# Building
The Cascading Tutorials project uses Gradle for builds.

Verify that your system is setup right. It should look something like this when you run. Make sure the JVM is > 1.7.x

    $ cd tutorials
    $ ./gradlew --version
    
    ------------------------------------------------------------
    Gradle 2.2
    ------------------------------------------------------------

    Build time:   2014-11-10 13:31:44 UTC
    Build number: none
    Revision:     aab8521f1fd9a3484cac18123a72bcfdeb7006ec
    
    Groovy:       2.3.6
    Ant:          Apache Ant(TM) version 1.9.3 compiled on December 23 2013
    JVM:          1.7.0_76 (Oracle Corporation 24.76-b04)
    OS:           Linux 3.14.42-31.38.amzn1.x86_64 amd64

Build the tutorials

    $ ./gradlew docDist

A successful build should have something like this at the end

    BUILD SUCCESSFUL

    Total time: 41.485 secs

This will render all tutorials and put them in the
`<rootproject>/build/documentation/` directory. Each tutorial has its own
subdirectory, which also contains a zip archive of the tutorial.
