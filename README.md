# VoteDataProvider

This library provides a simple interface for pulling generated election data

# How to use

To use this library, simply paste this line in the (Project's) settings.gradle file in the block under *dependencyResolutionManagement*
  ```
    repositories {
        jcenter() // Warning: this repository is going to shut down soon
        maven { url "https://jitpack.io" }
    }
  ```
  
  as well as pasting this line  the (App's) gradle.build dependencies block, 
  ```    
  dependencies {
    implementation 'com.github.info4482021-au21:VoteDataProvider:v1.6'
  }
  ```

# Documentation

## StateResult

`StateResult` is a data model class that contains information about each State's (and DC) current election results as shown below


  ```
  data class StateResult (
    val state: String,
    val demVote: Int,
    val repVote:Int,
    val totalVote:Int
): Parcelable
  ```
  
Note: This `StateResult` data class is Parcelable meaning it can be passed through Intents

## VoteDataProvider.getAllResults(): List<StateResult>

Use VoteDataProvider.getAllResults() to get current election results as a List of `StateResult` objects
