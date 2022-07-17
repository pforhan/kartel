# cupid
Swapping match game logic in Kotlin

Used for something like a match-3 swaping game, where you swap two gems to make one or two matches.

# Models

## Board

Two dimensional grid of gems.

* width
* height
* _swap(x, y, direction)_
* gravity
* matcher
* spigot

## Matcher

Determines whether 

* minimumMatchSize
* _isMatch(gem[])_

## MineShaft

* _nextGem()_

