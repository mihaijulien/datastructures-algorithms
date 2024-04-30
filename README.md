## Datastructures And Algorithms
Most popular data structures and algorithms

![Build Status](https://travis-ci.com/mihaijulien/datastructures-algorithms.svg?branch=main)
![Coverage](https://img.shields.io/codecov/c/github/mihaijulien/datastructures-algorithms)
![MIT](https://img.shields.io/github/license/mihaijulien/datastructures-algorithms)
![GitHub release](https://img.shields.io/github/v/release/mihaijulien/datastructures-algorithms)
![Maven](https://img.shields.io/maven-central/v/io.github.mihaijulien/ds-and-algo)

## Data Structures

| Data Structure                                                                                                                                                    | Methods                                                                                                                                                                                                                                |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [Linked List](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/LinkedList.java)              | ```pushFront()``` - O(1), ```popFront()``` - O(1), ```pushBack()``` - O(1), ```popBack()``` - O(1), ```getHead()``` - O(1), ```getSize()``` - O(1), ```contains()``` - O(n)                                                            |
| [Stack](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/Stack.java)                         | ```push()``` - O(1), ```pop()``` - O(1), ```isEmpty()``` - O(1), ```getSize()``` - O(1), ```peek()``` - O(1)                                                                                                                           |
| [Queue](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/Queue.java)                         | ```enqueue()``` - O(1), ```dequeue()``` - O(1), ```isEmpty()``` - O(1), ```getSize()``` - O(1) ```isFull()``` - O(1)                                                                                                                   |
| [Deque](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/Deque.java)                         | ```enqueueFront()``` - O(1), ```enqueueRear()``` - O(1), ```dequeueFront()``` - O(1), ```dequeueRear()``` - O(1), ```isEmpty()``` - O(1), ```getSize()``` - O(1) ```peekFront()``` - O(1), ```peekRear``` - O(1)                       |
| [Map](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/Map.java)                             | ```put()``` - O(n), ```remove()``` - O(n), ```get()``` - O(n), ```getSize()``` - O(1), ```containsValue()``` - O(n), ```containsKey()``` - O(n)                                                                                        |
| [MinHeap](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/MinHeap.java)                     | ```insert()``` - O(logn), ```remove()``` - O(logn), ```heapify()``` - O(logn)                                                                                                                                                          |
| [Binary Search Tree](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/BinarySearchTree.java) | ```insert()``` - O(n), ```find()``` - O(n), ```delete()``` - O(n), ```size()``` - Θ(1), ```findMin()``` - O(n), ```getTreeHeight()``` - O(n), ```preOrderVisit()``` - O(n), ```inOrderVisit()``` - O(n), ```postOrderVisit()``` - O(n) |
| [Trie](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/Trie.java)                           | ```insert()``` - O(\|s\|), ```search()``` - O(\|s\|)                                                                                                                                                                                   |
| [Graph](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/datastructures/Graph.java)                         |                                                                                                                                                                                                                                        |

## Algorithms
### Sorting
| Algorithm                                                                                                                                                     | Worst-case time complexity | Average-case time complexity | Best-case time complexity |
|:--------------------------------------------------------------------------------------------------------------------------------------------------------------|:---------------------------|:-----------------------------|:--------------------------|
| [BubbleSort](https://github.com/mihaijulien/datastructures-algorithms/tree/main/src/main/java/io/github/mihaijulien/algorithms/sorting/BubbleSort.java)       | O(n^2)                     | O(n^2)                       | O(n)                      |
| [InsertionSort](https://github.com/mihaijulien/datastructures-algorithms/tree/main/src/main/java/io/github/mihaijulien/algorithms/sorting/InsertionSort.java) | O(n^2)                     | O(n^2)                       | O(n)                      |
| [QuickSort](https://github.com/mihaijulien/datastructures-algorithms/tree/main/src/main/java/io/github/mihaijulien/algorithms/sorting/QuickSort.java)         | O(n^2)                     | O(nlogn)                     | O(nlogn)                  |
| [SelectionSort](https://github.com/mihaijulien/datastructures-algorithms/tree/main/src/main/java/io/github/mihaijulien/algorithms/sorting/SelectionSort.java) | O(n^2)                     | O(n^2)                       | O(n^2)                    |
| [MergeSort](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/sorting/MergeSort.java)         | O(nlogn)                   | O(nlogn)                     | O(nlogn)                  |
| [HeapSort](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/sorting/HeapSort.java)           | O(nlogn)                   | O(nlogn)                     | O(nlogn)                  |
### Strings
* [PalindromeChecker](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/strings/PalindromeChecker.java)
* [PermutationMatch](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/strings/PermutationMatch.java)
* [Reverser](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/strings/Reverser.java)
* [UniqueCharacters](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/strings/UniqueCharacters.java)

### Arrays
* [Check if array is sorted](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/arrays/ArraySorted.java)

### Stacks
* [MinStack](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/stacks/MinStack.java)
* [BalancedBrackets](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/stacks/BalancedBrackets.java)

### Lists
* [FindKthToLast](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/lists/FindKthToLast.java)
* [RemoveListDuplicates](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/lists/RemoveListDuplicates.java)
* [FloydCycleDetection](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/lists/FloydCycleDetection.java)
* [List Intersection](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/lists/ListIntersection.java)

### Trees
* [Invert tree](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/trees/InvertTree.java)
* [Left View](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/trees/LeftView.java)
* [Right View](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/trees/RightView.java)
* [Serialize/Deserialize BST to String](https://github.com/mihaijulien/datastructures-algorithms/blob/main/src/main/java/io/github/mihaijulien/algorithms/trees/Codec.java)

## Dependency

To add a dependency using Maven:
```xml
<dependency>
  <groupId>io.github.mihaijulien</groupId>
  <artifactId>ds-and-algo</artifactId>
  <version>2.0.0</version>
</dependency>
```

To add a dependency using Gradle:
```groovy
implementation 'io.github.mihaijulien:ds-and-algo:2.0.0'
```

#### Build

`mvn clean install`

#### Generate Changelog
`git-chglog`

### License

Licensed under [MIT](https://github.com/mihaijulien/datastructures-algorithms/blob/main/LICENSE).