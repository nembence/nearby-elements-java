# Nearby elements

## Story

Probably you know of that classic addictive puzzle game called: [Tetris](https://tetris.com/play-tetris). The Tetris® game requires players to strategically rotate, move, and drop a procession of Tetriminos that fall into the rectangular Matrix at increasing speeds. Players attempt to clear as many lines as possible by completing horizontal rows of blocks without empty space, but if the Tetriminos surpass the Skyline the game is over!

Take the following example:

<img src="https://storage.needpix.com/rsynced_images/tetris-297656_1280.png" alt="Tetris example" width="200"/>

The map itself is a N*M area, a matrix, where one cell store information about it has a certain color block element or not.
In this situation we have to define that how can the falling T shape element's bottom cell fit into the already semi-occupied rows. In order to achieve this game logic gathering a cell's nearby elements is a crucial information.
Now we have a class with this two-dimensional array which represents the game area. Your mission is to write the proper algorithm to find the cell's adjecent elements.

**Warning** you have to implement the solution only using pure arrays and not ArrayList!

The project contains tests as well which can help you validate and verify your implementation.

You can run tests in your IDE easily as follows:

![Run tests in your IDE](https://learn.code.cool/media/java/run-tests.gif)

> You don't need to modify the test files. Later this topic will be covered in detail. Now it is enough to run them and check your work.

## What are you going to learn?

You'll have to:

- work in a new programming language
- get accustomed to a new IDE
- use arrays, data structures with a pre-defined size
- avoid exceptions
- running tests

## Tasks


1. The `NearbyElementsChecker` class is initialized with an array. Implement the `getNearbyElements()` method that looks for a given target at position `(row, col)` in that array and picks its nearby elements, the ones that surround the target within a given range.

    - The target element is never included in the result array.
    - When the target element and its range is within the limits of the row, the numbers within the range are returned. Example: for the array `[
    [10, 11, 12],
    [20, 21, 22, 23]
]` the nearby elements within a `range` of `2` for the target at `(1, 2)` (which is `22`) would be `[20, 21, 23]`.
    - When the target element is within the limits of the row, but its `range`-sized neighborhood not, the returned array is shorter accordingly.
    - When the target element is outside the limits of the row but is virtual neighborhood within the distance of `range` is overlapping with the array, the intersection is returned.
    - When the target element and its `range`-sized neighborhood are outside the limits of the row, an array of length `0` is returned. Example: `[
    [10, 11, 12],
    [20, 21, 22, 23]
]` For the off-the-edge position `(1, -1)` would be `[20, 21]`, while the result for `(5, 3)` would be `null`.
    - When the target `row` number is not found in the array, `null` is returned.

2. Implement the `prettyPrint()` method in `NearbyElementsChecker` that prints the array with numbers in the same column aligned together. Example: the result for array `[
    [1, 1111, 11],
    [2, 22, -22, 22]
]` should have a column width of 5 and return `"....1.1111...11\n....2...22..-22...22"` (here `.` stands for a space).

    - The numbers in the array are all printed.
    - The width of every column is determined by the globally longest element. Each column in the table should be one character longer than the longest element in the array. Watch out: the length of a number includes its sign.
    - The numbers are space-separated and aligned to the right.


## General requirements


 - All tests result is green.

## Hints


- Check the included assertions (expressions required to hold in a correct implementation) that test for the expected results for different arguments.
- Always perform index validation when accessing array elements
  otherwise you might run into an `ArrayIndexOutOfBounds` exception.


## Starting repository

Follow [this link](https://journey.code.cool/v2/project/solo/blueprint/nearby-elements/java) to create your project repository.

## Background materials

- :exclamation: [Arrays](https://learn.code.cool/full-stack/#/../pages/java/arrays)
- :exclamation: [Code style](https://learn.code.cool/full-stack/#/../pages/java/code-style)
- :exclamation: [Creating objects](https://learn.code.cool/full-stack/#/../pages/java/creating-objects)
- :exclamation: [Methods](https://learn.code.cool/full-stack/#/../pages/java/methods)
- :exclamation: [Running application](https://learn.code.cool/full-stack/#/../pages/java/running-application)

