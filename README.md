# kartel
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
* mine

## Matcher

Determines whether a set of gems makes a match

* minimumMatchSize
* _isMatch(gem[])_

## Mineshaft

* _nextGem()_

## Direction
UP, DOWN, LEFT, RIGHT