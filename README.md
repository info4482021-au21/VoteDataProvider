# VoteDataProvider

This library provides a simple interface for pulling randomly generated election data

# How to use

To use this library, simply paste this implementation line to the (App's) gradle.build dependencies block. 

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
