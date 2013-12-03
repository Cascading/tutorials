# Tutorials For the Cascading Ecosystem.

This is a collection of tutorials about working with cascading and its related
projects. In contains the following tutorials right now:

* Pattern
* Lingual-HBase
* Lingual-Oracle

This project is meant to make it simple to add new tutorials without dealing
with the setup of asciidoctor too much. All common parts such as CSS and the
eRuby template for the html page are in the root project under
`src/site/stylesheets` and `src/templates`. Each subproject contains only
the specific content for that tutorial, i.e. the asciidoc
(`<subproject>/src/asciidoc`) and the images (`<subproject>/src/site/images`).

# Building

The command line to produce all tutorials is:

    > gradle docDist

This will render all tutorials and put them in the
`<rootproject>/build/documentation/` directory. Each tutorial has its own
subdirectory, which also contains a zip archive of the tutorial.
