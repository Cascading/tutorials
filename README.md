# A collection of tutorials from the cascading eco system.

This is a collection of tutorials for working with cascading and its related
projects. In contains the following tutorials right now:

* Pattern

The project is meant to make it simple to add new tutorials, without dealing
with the setup of asciidoctor too much. All common parts like the CSS and the
eruby template for the html page and such are in the rooproject in
`src/site/stylesheets` and `src/templates`. Each subproject for a specific
tutorial contains only the actual content, namely the asciidoc
(`<subproject>/src/asciidoc`) and the images (`<subproject>/src/site/images`).

# Building

To render all projects do this:

    > gradle docDist

This will render all tutorials, put them in the
`<rootproject>/build/documentation/` directory. Each tutorial has its own
subdirectory, which also contains a zip archive containing the tutorial.


To upload the documentation into an S3 bucket do this:

    > gradle s3Upload -Daws.properties=/path/to/aws.properties

