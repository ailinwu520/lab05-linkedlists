# lab05-linkedlists
# Lab-05-LinkedList

- Part A: Create linked list

Create your own linked list data structure using your own custom Node. The data structure should have a constructor and the following functions, add, reverse, and remove.

```
**Add**
Add 5
Linked list: 1->2->3->4->NULL
result: 1->2->3->4->5->NULL

**Add(with position)**
Add 3 at position 2
Linked list: 1->2->4->NULL
result: 1->2->3->4->NULL 
(now 3 is at index 2, 4 was index 2 -> now 3)

**Remove(with position)**
Remove element at position 1
Linked list: 4->2->1->7->NULL
result: 4->1->7->NULL

**Reverse**
Linked list: 1->2->3->4->NULL
result: 4->3->2->1->NULL

```

- Part B: Palindrome linked list

Palindrome is the sequence that reads the same backward as forward. Given the head of the singly linked list, determine the linked list whether it is palindrome or not. Return true if it is.

[Hint]You can use your reverse() function

```
Examples

Input: head = [2,0,1,1,2,0]
Output: false
Input: head = [1,2,1]
Output: true
Input: head = [1,0]
Output: false
Input: head = [1]
Output: true
```
- Part C: Convert Binary to Integer from LL

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.

Here are some examples
```
Input: head = [1,0,1]
Output: 5
Explanation: (101) in binary is = 5

Input: head = [1]
Output: 1

Input: head = [0]
Output: 0
	
Input: head = [0,0]
Output: 0
	
Input: head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
Output: 18880
```
