Collection and generics

there are three primary types of collection 

list
map
set

-- it doesnt allow storing primitive data type but only an obj
- primitive type must be store in appropriate wrapper class 
- -like integar for int 
- its automatically wrapped in wrapper classes when we add them in collection

List

- sequence of obj
- can grow and shrink auto
- arraylist 
- Stack - LIFO - push - pop -peek
- LikedList - chain

Maps
- collection of key-value pairs
- Hashmap - covert keys unordered hash values for fast lookup 
- LinkedHashMap - liek hashmap - obj are ordered by insertion 
- TreeMap - are naturally order

Sets
- no duplicats
- HashSet - unique key value pair with no duplicate
- LinkedHashSet - like LinkedHashMap contains unique insertion ordered element - order of the element stays in the same order as they inserted 
- TreeSet - naturally ordered




Lists - are great for managing ordered sequence of element 

Maps - are perfect for storing and retrieving data using key value pairs 

Sets - excel at ensuring that no duplicate elements are stored 

Generics ensure type safety in collection 


Flexibility,variable data - choose arraylist

Efficiency,fixed data - choose array



Stacks

infix notation - operators are between operands

postfix notation - operators follow operands


Queues 

FIFO - first in first out

- Enqueue - add  to the rear to the end
- Dequeue - remove element from the front 


HashMap

- they are not ordered
- they are designed for quick retrievals

when to use

- fast lookups
- dynamic data sets
- low colision rate


Choosing the right data structure

hashmap - for speed 

treemap-linkedlist-arraylist -- sequence and sorting

linkedlist - arraylist -- memory constraint

hashmap is ideal to use for caching counting frequencies and quick lookup


Tree Map 

works like linked hash map 

- automatically sorts key value pairs 
- alphabetically a to z 
- numerically 0 to 9
- string and number ascending order

Comparator

for types that donot have natural ordering in java use a pluggable ordering object called a coparaotr including those you define yourself 

a comparator is any class that implements the java until comparator interface 


Performance: 

Due to its tree-based structure, TreeMap operations (put(), get(), remove()) have O(log n) complexity, which is slower than HashMap's O(1) for the same operations. TreeMap operations typically have O(log n) time complexity, while HashMap operations average O(1), but can degrade to O(n) in the worst-case scenario. This distinction is important when discussing the performance implications of each data structure.


comparing hashmap and treemap

speed 

- hashmap - faster with array and hash indexing 
- treemap slower due to linked entries

hashmap uses less memory

order

- hashmap doesnot maintain order
- treemap maintain natural order and custom order - comparaotr

navigation 

- treemap sophisticated navigation access by sort order
- hashmap cant access sort order















































