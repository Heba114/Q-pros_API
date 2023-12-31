# API REST assurred Project with Junit Framework

## Overview

This project contains automated test cases for CRUD operations on USER endpoints built using REST assurred and Junit framework

----------------------------------------------

## Setup

Clone the repository:
git clone https://github.com/Heba114/Q-pros_API

Import the project into your IDE as a Maven project.


-----------------------------------------------

## Project Structure

src/
├── test/
│   └── java/
│       └── Data/
│           ├── User/   # Page object classes for user data
│       └── Test/
│           ├── GET_User_Data/   # Test scenario for get user data
│           ├── POST_New_User/   # Test scenario for add new user
│           ├── DELETE_User/     # Test scenario for delete user
│           ├── PUT_User_Data/   # Test scenario for update user data
│           ├── POST_ListOfUser/ # Test scenario for adding list of users using one endpoint
│           ├── Setup/           # Setup for RequestSpec & ResponseSpec
