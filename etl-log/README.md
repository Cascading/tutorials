## Java Developer's Guide to ETL

Welcome to the Java Developer's Guide to ETL, a tutorial that will take you 
through implementing the commonly-operated ETL tasks with Cascading. 

The coding examples in each part refers to a commonly-used operation in ETL, 
and can be referred directly; you do not need to complete previous parts to 
use a given example. 

Also, while we give references to [Cascading Users Guide](http://docs.cascading.org/cascading/3.0/userguide/) 
for the APIs used to implement the ETL tasks, this tutorial is not intended to 
serve as an introduction to Cascading. For that, we recommend that you follow
the [Cascading for the Impatient](http://docs.cascading.org/impatient) tutorial.

If you have a question or run into any problems send an email to 
the [cascading-user-list](https://groups.google.com/forum/#!forum/cascading-user).

### Introduction
* Discusses key evaluation criteria for deciding your ETL strategy
* Explains basic Cascading concepts
* Evaluates Cascading and Driven as a framework for implementing ETL applications

### Prerequisites
* Installing Driven, gradle, IDE and other software for running the tutorial

### File copy
* Simplest ETL application that copies a file from one location to another
* Filters data to exclude it from processing (bad data)
* Specifies output format (tab delimited)
* Bins data based on date ranges

### Filters
* Separate unwanted data and store it to a different file for separate analysis
* Implement in-line data quality checks
* Perform different processing logic based on content

### Merge
* Merge records from multiple input files (using MultiSourceTap)

### Count
* Count number of unique records
* Report "Top xx" occurences

### Moving averages
* Implement advanced aggregation techniques using Cascading GroupBy()

### Joins
* Split pipe into different branches based on data content
* Perform different processing on each branch
* Join the branches using Cascading's HashJoin()
 
