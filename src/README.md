Collection and generics

there are three primary types of collection 

list
map
set

-- it doesnt allow storing rimitive data type but only an obj
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