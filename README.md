# Top Trumps Game

## Plan

We are creating a Top Trumps game which allows users to race cars and compare who has the best car. Within the game users will also be able to tune their car to increase its statistics to give it a better chance of winning and coming out on top. 
- Users will be able to enter their name and select the car they would like to use. 
- 3 different car manufacturers with 2 models for each one and different stats for each model.
- Different methods to change stats for each manufacturer

### Intended output or results
We intend for users to be able to compete with each other in one stat to try and beat the opponent's car.
Stats:
- Top speed
- Engine size
- Acceleration
- Price
- Horsepower

## Current functionality

Currently we have:

- both users can enter their name
- both users can choose a car
- a user can choose a category for the users to battle in
- the stats of the users' chosen cars are compared depending on which category they choose
- the winning car is printed to the console

## Testing

- The TopTrumpsChallenge.java file contains the main program
- The Cars.java file contains the main Cars class and the Audi, BMW and Mercedes subclasses

### Variables

- strings user1, user2 store the names of user 1 and user 2 respectively
- strings user1car (and user2car) store the string user 1 (and user 2) enters when they input their choice of car
- string category stores the stat the user chooses to compete with the other user in  
  
| category valid inputs | associated method |
| --- | --- |
| acceleration | acceleration() |
| top speed | topSpeed() |
| engine size | engineSize() |
| horsepower | horsePower() |
| price | price() |








